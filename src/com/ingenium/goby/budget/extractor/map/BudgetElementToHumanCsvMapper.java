/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.map;

import com.ingenium.goby.budget.extractor.BudgetExecution;
import com.ingenium.goby.budget.extractor.elements.Assignment;
import com.ingenium.goby.budget.extractor.elements.Batch;
import com.ingenium.goby.budget.extractor.elements.BudgetElement;
import com.ingenium.goby.budget.extractor.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.extractor.elements.CompositeBudgetElement;
import com.ingenium.goby.budget.extractor.elements.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author Jaime Oviedo
 *
 */
public class BudgetElementToHumanCsvMapper {

  private static Logger log = Logger
      .getLogger(BudgetElementToHumanCsvMapper.class.getCanonicalName());

  /**
   * Creates a new instance of the class BudgetElementToHumanCsvMapper.
   */
  public BudgetElementToHumanCsvMapper() {
    // TODO Auto-generated constructor stub
  }

  public String map(final BudgetExecution execution) {
    final Collection<Batch> batches = execution.getBatches();
    final List<MappedElement> mappedElements = new ArrayList<>();
    for (final Batch batch : batches) {
      mappedElements.addAll(this.map(batch));
    }
    final StringBuilder sb = new StringBuilder();
    final String s = ";";
    sb.append(
        "# partida;Partida;# capítulo;Capítulo;#programa;Programa;#subtítulo;Subtítulo;#item;Item;#asigación;Asignación;Moneda;Presupuesto inicial; Presupuesto Vigente; Ejecución; % ejecucion;\n");
    for (final MappedElement mappedElement : mappedElements) {
      sb.append(mappedElement.getBatchNumber()).append(s)
          .append(mappedElement.getBatchName()).append(s);
      sb.append(mappedElement.getChapterNumber()).append(s)
          .append(mappedElement.getChapterName()).append(s);
      sb.append(mappedElement.getProgramNumber()).append(s)
          .append(mappedElement.getProgramName()).append(s);
      sb.append(mappedElement.getSubtitleNumber()).append(s)
          .append(mappedElement.getSubtitleName()).append(s);
      sb.append(mappedElement.getItemNumber()).append(s)
          .append(mappedElement.getItemName()).append(s);
      sb.append(mappedElement.getAssignmentNumber()).append(s)
          .append(mappedElement.getAssignmentName()).append(s);
      final String currency = mappedElement.getCurrency();
      sb.append(currency);
      final String initialBudget;
      final String actualBudget;
      final String exec;
      final String executionPercent;
      switch (currency) {
      case "Peso":
        initialBudget = mappedElement.getInitialBudget();
        actualBudget = mappedElement.getActualBudget();
        /**************** TODO Quedé aquí con este método *************/
      case "Dolar":

      default:

      }

    }
    return sb.toString();
  }

  public Collection<MappedElement> map(final BudgetElement element) {

    final List<MappedElement> mappedElements = new ArrayList<>();
    if (!(element instanceof CompositeBudgetElement)) {
      // we should have an assignment here or it is malformed
      if (!(element instanceof Assignment)) {
        BudgetElementToHumanCsvMapper.log.warning(
            new StringBuffer("Malformed element, expected an Assignment, got:")
                .append(element.getClass().getName()).toString());
      } else {
        final Assignment assignment = (Assignment) element;
        final MappedElement mappedElement = new MappedElement();
        mappedElement
            .setAssignmentNumber(String.valueOf(assignment.getNumber()));
        mappedElement.setAssignmentName(assignment.getName());
        mappedElement.setCurrency(assignment.getCurrency().toString());
        mappedElement
            .setInitialBudget(assignment.getInitialBudget().toString());
        mappedElement.setActualBudget(assignment.getActualBudget().toString());
        mappedElement.setInitialDollarBudget(
            assignment.getInitialDollarBudget().toString());
        mappedElement.setActualDollarBudget(
            assignment.getActualDollarBudget().toString());
        mappedElement.setCumulativeExecution(
            assignment.getCumulativeExecution().toString());
        mappedElement.setCumulativeDollarExecution(
            assignment.getCumulativeDollarExecution().toString());
        mappedElements.add(mappedElement);
      }
    } else {
      final CompositeBudgetElement ce = (CompositeBudgetElement) element;
      final Collection<? extends BudgetElement> subelements = ce
          .getSubelements().values();
      final int numberOfSubelements = subelements.size();
      if (numberOfSubelements == 0) {
        // we should have an item with no assignments or it is malformed
        if (!(ce instanceof Item)) {
          BudgetElementToHumanCsvMapper.log.warning(
              new StringBuffer("Malformed element, expected an Item, got:")
                  .append(element.getClass().getName()).toString());
        } else {
          final Item item = (Item) ce;
          final MappedElement mappedElement = new MappedElement();
          mappedElement.setAssignmentNumber("");
          mappedElement.setAssignmentName("");
          mappedElement.setItemNumber(String.valueOf(item.getNumber()));
          mappedElement.setItemName(item.getName());
          mappedElement.setCurrency(item.getCurrency().toString());
          mappedElement.setInitialBudget(item.getInitialBudget().toString());
          mappedElement.setActualBudget(item.getActualBudget().toString());
          mappedElement
              .setInitialDollarBudget(item.getInitialDollarBudget().toString());
          mappedElement
              .setActualDollarBudget(item.getActualDollarBudget().toString());
          mappedElement
              .setCumulativeExecution(item.getCumulativeExecution().toString());
          mappedElement.setCumulativeDollarExecution(
              item.getCumulativeDollarExecution().toString());
          mappedElements.add(mappedElement);
        }
      } else {
        // If we reach this point, we are not in a leaf of the hierarchy
        for (final BudgetElement subElement : subelements) {
          mappedElements.addAll(this.map(subElement));
        }
        final BudgetHierarchyLevel level = ce.getLevel();
        for (final MappedElement mappedElement : mappedElements) {
          switch (level) {
          case BATCH:
            mappedElement.setBatchNumber(String.valueOf(ce.getNumber()));
            mappedElement.setBatchName(ce.getName());
            break;
          case CHAPTER:
            mappedElement.setChapterNumber(String.valueOf(ce.getNumber()));
            mappedElement.setChapterName(ce.getName());
            break;
          case PROGRAM:
            mappedElement.setProgramNumber(String.valueOf(ce.getNumber()));
            mappedElement.setProgramName(ce.getName());
            break;
          case SUBTITLE:
            mappedElement.setSubtitleNumber(String.valueOf(ce.getNumber()));
            mappedElement.setSubtitleName(ce.getName());
            break;
          case ITEM:
            mappedElement.setItemNumber(String.valueOf(ce.getNumber()));
            mappedElement.setItemName(ce.getName());
            break;
          default:
            BudgetElementToHumanCsvMapper.log.warning(new StringBuffer(
                "Malformed element, expected batch, chapter, program,")
                    .append(
                        " subtitle or an item with no assignments, but got:")
                    .append(element.getClass().getName()).toString());
          }
        }
      }
    }

    return mappedElements;

  }

  private class MappedElement {
    private String batchNumber;
    private String batchName;
    private String chapterNumber;
    private String chapterName;
    private String programNumber;
    private String programName;
    private String subtitleNumber;
    private String subtitleName;
    private String itemNumber;
    private String itemName;
    private String assignmentNumber;
    private String assignmentName;
    private String initialBudget;
    private String actualBudget;
    private String currency;
    private String cumulativeExecution;
    private String actualDollarBudget;
    private String cumulativeDollarExecution;
    private String initialDollarBudget;

    /**
     * Returns the value of the field batchNumber.
     *
     * @return the value of field batchNumber
     */
    public String getBatchNumber() {
      return this.batchNumber;
    }

    /**
     * Sets the value of the field batchNumber.
     *
     * @param batchNumber
     *          the new value of the field batchNumber.
     */
    public void setBatchNumber(final String batchNumber) {
      this.batchNumber = batchNumber;
    }

    /**
     * Returns the value of the field batchName.
     *
     * @return the value of field batchName
     */
    public String getBatchName() {
      return this.batchName;
    }

    /**
     * Sets the value of the field batchName.
     *
     * @param batchName
     *          the new value of the field batchName.
     */
    public void setBatchName(final String batchName) {
      this.batchName = batchName;
    }

    /**
     * Returns the value of the field chapterNumber.
     *
     * @return the value of field chapterNumber
     */
    public String getChapterNumber() {
      return this.chapterNumber;
    }

    /**
     * Sets the value of the field chapterNumber.
     *
     * @param chapterNumber
     *          the new value of the field chapterNumber.
     */
    public void setChapterNumber(final String chapterNumber) {
      this.chapterNumber = chapterNumber;
    }

    /**
     * Returns the value of the field chapterName.
     *
     * @return the value of field chapterName
     */
    public String getChapterName() {
      return this.chapterName;
    }

    /**
     * Sets the value of the field chapterName.
     *
     * @param chapterName
     *          the new value of the field chapterName.
     */
    public void setChapterName(final String chapterName) {
      this.chapterName = chapterName;
    }

    /**
     * Returns the value of the field programNumber.
     *
     * @return the value of field programNumber
     */
    public String getProgramNumber() {
      return this.programNumber;
    }

    /**
     * Sets the value of the field programNumber.
     *
     * @param programNumber
     *          the new value of the field programNumber.
     */
    public void setProgramNumber(final String programNumber) {
      this.programNumber = programNumber;
    }

    /**
     * Returns the value of the field programName.
     *
     * @return the value of field programName
     */
    public String getProgramName() {
      return this.programName;
    }

    /**
     * Sets the value of the field programName.
     *
     * @param programName
     *          the new value of the field programName.
     */
    public void setProgramName(final String programName) {
      this.programName = programName;
    }

    /**
     * Returns the value of the field subtitleNumber.
     *
     * @return the value of field subtitleNumber
     */
    public String getSubtitleNumber() {
      return this.subtitleNumber;
    }

    /**
     * Sets the value of the field subtitleNumber.
     *
     * @param subtitleNumber
     *          the new value of the field subtitleNumber.
     */
    public void setSubtitleNumber(final String subtitleNumber) {
      this.subtitleNumber = subtitleNumber;
    }

    /**
     * Returns the value of the field subtitleName.
     *
     * @return the value of field subtitleName
     */
    public String getSubtitleName() {
      return this.subtitleName;
    }

    /**
     * Sets the value of the field subtitleName.
     *
     * @param subtitleName
     *          the new value of the field subtitleName.
     */
    public void setSubtitleName(final String subtitleName) {
      this.subtitleName = subtitleName;
    }

    /**
     * Returns the value of the field itemNumber.
     *
     * @return the value of field itemNumber
     */
    public String getItemNumber() {
      return this.itemNumber;
    }

    /**
     * Sets the value of the field itemNumber.
     *
     * @param itemNumber
     *          the new value of the field itemNumber.
     */
    public void setItemNumber(final String itemNumber) {
      this.itemNumber = itemNumber;
    }

    /**
     * Returns the value of the field itemName.
     *
     * @return the value of field itemName
     */
    public String getItemName() {
      return this.itemName;
    }

    /**
     * Sets the value of the field itemName.
     *
     * @param itemName
     *          the new value of the field itemName.
     */
    public void setItemName(final String itemName) {
      this.itemName = itemName;
    }

    /**
     * Returns the value of the field assignmentNumber.
     *
     * @return the value of field assignmentNumber
     */
    public String getAssignmentNumber() {
      return this.assignmentNumber;
    }

    /**
     * Sets the value of the field assignmentNumber.
     *
     * @param assignmentNumber
     *          the new value of the field assignmentNumber.
     */
    public void setAssignmentNumber(final String assignmentNumber) {
      this.assignmentNumber = assignmentNumber;
    }

    /**
     * Returns the value of the field assignmentName.
     *
     * @return the value of field assignmentName
     */
    public String getAssignmentName() {
      return this.assignmentName;
    }

    /**
     * Sets the value of the field assignmentName.
     *
     * @param assignmentName
     *          the new value of the field assignmentName.
     */
    public void setAssignmentName(final String assignmentName) {
      this.assignmentName = assignmentName;
    }

    /**
     * Returns the value of the field initialBudget.
     *
     * @return the value of field initialBudget
     */
    public String getInitialBudget() {
      return this.initialBudget;
    }

    /**
     * Sets the value of the field initialBudget.
     *
     * @param initialBudget
     *          the new value of the field initialBudget.
     */
    public void setInitialBudget(final String initialBudget) {
      this.initialBudget = initialBudget;
    }

    /**
     * Returns the value of the field actualBudget.
     *
     * @return the value of field actualBudget
     */
    public String getActualBudget() {
      return this.actualBudget;
    }

    /**
     * Sets the value of the field actualBudget.
     *
     * @param actualBudget
     *          the new value of the field actualBudget.
     */
    public void setActualBudget(final String actualBudget) {
      this.actualBudget = actualBudget;
    }

    /**
     * Returns the value of the field currency.
     *
     * @return the value of field currency
     */
    public String getCurrency() {
      return this.currency;
    }

    /**
     * Sets the value of the field currency.
     *
     * @param currency
     *          the new value of the field currency.
     */
    public void setCurrency(final String currency) {
      this.currency = currency;
    }

    /**
     * Returns the value of the field cumulativeExecution.
     *
     * @return the value of field cumulativeExecution
     */
    public String getCumulativeExecution() {
      return this.cumulativeExecution;
    }

    /**
     * Sets the value of the field cumulativeExecution.
     *
     * @param cumulativeExecution
     *          the new value of the field cumulativeExecution.
     */
    public void setCumulativeExecution(final String cumulativeExecution) {
      this.cumulativeExecution = cumulativeExecution;
    }

    /**
     * Returns the value of the field actualDollarBudget.
     *
     * @return the value of field actualDollarBudget
     */
    public String getActualDollarBudget() {
      return this.actualDollarBudget;
    }

    /**
     * Sets the value of the field actualDollarBudget.
     *
     * @param actualDollarBudget
     *          the new value of the field actualDollarBudget.
     */
    public void setActualDollarBudget(final String actualDollarBudget) {
      this.actualDollarBudget = actualDollarBudget;
    }

    /**
     * Returns the value of the field cumulativeDollarExecution.
     *
     * @return the value of field cumulativeDollarExecution
     */
    public String getCumulativeDollarExecution() {
      return this.cumulativeDollarExecution;
    }

    /**
     * Sets the value of the field cumulativeDollarExecution.
     *
     * @param cumulativeDollarExecution
     *          the new value of the field cumulativeDollarExecution.
     */
    public void setCumulativeDollarExecution(
        final String cumulativeDollarExecution) {
      this.cumulativeDollarExecution = cumulativeDollarExecution;
    }

    /**
     * Returns the value of the field initialDollarBudget.
     *
     * @return the value of field initialDollarBudget
     */
    public String getInitialDollarBudget() {
      return this.initialDollarBudget;
    }

    /**
     * Sets the value of the field initialDollarBudget.
     *
     * @param initialDollarBudget
     *          the new value of the field initialDollarBudget.
     */
    public void setInitialDollarBudget(final String initialDollarBudget) {
      this.initialDollarBudget = initialDollarBudget;
    }
  }
}
