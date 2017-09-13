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
    private String executionPercentage;
    private String dollarExecutionPercentage;

    /**
     * Returns the value of the field actualBudget.
     *
     * @return the value of field actualBudget
     */
    public String getActualBudget() {
      return actualBudget;
    }

    /**
     * Returns the value of the field actualDollarBudget.
     *
     * @return the value of field actualDollarBudget
     */
    public String getActualDollarBudget() {
      return actualDollarBudget;
    }

    /**
     * Returns the value of the field assignmentName.
     *
     * @return the value of field assignmentName
     */
    public String getAssignmentName() {
      return assignmentName;
    }

    /**
     * Returns the value of the field assignmentNumber.
     *
     * @return the value of field assignmentNumber
     */
    public String getAssignmentNumber() {
      return assignmentNumber;
    }

    /**
     * Returns the value of the field batchName.
     *
     * @return the value of field batchName
     */
    public String getBatchName() {
      return batchName;
    }

    /**
     * Returns the value of the field batchNumber.
     *
     * @return the value of field batchNumber
     */
    public String getBatchNumber() {
      return batchNumber;
    }

    /**
     * Returns the value of the field chapterName.
     *
     * @return the value of field chapterName
     */
    public String getChapterName() {
      return chapterName;
    }

    /**
     * Returns the value of the field chapterNumber.
     *
     * @return the value of field chapterNumber
     */
    public String getChapterNumber() {
      return chapterNumber;
    }

    /**
     * Returns the value of the field cumulativeDollarExecution.
     *
     * @return the value of field cumulativeDollarExecution
     */
    public String getCumulativeDollarExecution() {
      return cumulativeDollarExecution;
    }

    /**
     * Returns the value of the field cumulativeExecution.
     *
     * @return the value of field cumulativeExecution
     */
    public String getCumulativeExecution() {
      return cumulativeExecution;
    }

    /**
     * Returns the value of the field currency.
     *
     * @return the value of field currency
     */
    public String getCurrency() {
      return currency;
    }

    /**
     * @return the dollarExecutionPercentage
     */
    public final String getDollarExecutionPercentage() {
      return dollarExecutionPercentage;
    }

    /**
     * @return the executionPercentage
     */
    public final String getExecutionPercentage() {
      return executionPercentage;
    }

    /**
     * Returns the value of the field initialBudget.
     *
     * @return the value of field initialBudget
     */
    public String getInitialBudget() {
      return initialBudget;
    }

    /**
     * Returns the value of the field initialDollarBudget.
     *
     * @return the value of field initialDollarBudget
     */
    public String getInitialDollarBudget() {
      return initialDollarBudget;
    }

    /**
     * Returns the value of the field itemName.
     *
     * @return the value of field itemName
     */
    public String getItemName() {
      return itemName;
    }

    /**
     * Returns the value of the field itemNumber.
     *
     * @return the value of field itemNumber
     */
    public String getItemNumber() {
      return itemNumber;
    }

    /**
     * Returns the value of the field programName.
     *
     * @return the value of field programName
     */
    public String getProgramName() {
      return programName;
    }

    /**
     * Returns the value of the field programNumber.
     *
     * @return the value of field programNumber
     */
    public String getProgramNumber() {
      return programNumber;
    }

    /**
     * Returns the value of the field subtitleName.
     *
     * @return the value of field subtitleName
     */
    public String getSubtitleName() {
      return subtitleName;
    }

    /**
     * Returns the value of the field subtitleNumber.
     *
     * @return the value of field subtitleNumber
     */
    public String getSubtitleNumber() {
      return subtitleNumber;
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
     * Sets the value of the field actualDollarBudget.
     *
     * @param actualDollarBudget
     *          the new value of the field actualDollarBudget.
     */
    public void setActualDollarBudget(final String actualDollarBudget) {
      this.actualDollarBudget = actualDollarBudget;
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
     * Sets the value of the field assignmentNumber.
     *
     * @param assignmentNumber
     *          the new value of the field assignmentNumber.
     */
    public void setAssignmentNumber(final String assignmentNumber) {
      this.assignmentNumber = assignmentNumber;
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
     * Sets the value of the field batchNumber.
     *
     * @param batchNumber
     *          the new value of the field batchNumber.
     */
    public void setBatchNumber(final String batchNumber) {
      this.batchNumber = batchNumber;
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
     * Sets the value of the field chapterNumber.
     *
     * @param chapterNumber
     *          the new value of the field chapterNumber.
     */
    public void setChapterNumber(final String chapterNumber) {
      this.chapterNumber = chapterNumber;
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
     * Sets the value of the field cumulativeExecution.
     *
     * @param cumulativeExecution
     *          the new value of the field cumulativeExecution.
     */
    public void setCumulativeExecution(final String cumulativeExecution) {
      this.cumulativeExecution = cumulativeExecution;
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
     * @param dollarExecutionPercentage
     *          the dollarExecutionPercentage to set
     */
    public final void setDollarExecutionPercentage(
        String dollarExecutionPercentage) {
      this.dollarExecutionPercentage = dollarExecutionPercentage;
    }

    /**
     * @param executionPercentage
     *          the executionPercentage to set
     */
    public final void setExecutionPercentage(String executionPercentage) {
      this.executionPercentage = executionPercentage;
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
     * Sets the value of the field initialDollarBudget.
     *
     * @param initialDollarBudget
     *          the new value of the field initialDollarBudget.
     */
    public void setInitialDollarBudget(final String initialDollarBudget) {
      this.initialDollarBudget = initialDollarBudget;
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
     * Sets the value of the field itemNumber.
     *
     * @param itemNumber
     *          the new value of the field itemNumber.
     */
    public void setItemNumber(final String itemNumber) {
      this.itemNumber = itemNumber;
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
     * Sets the value of the field programNumber.
     *
     * @param programNumber
     *          the new value of the field programNumber.
     */
    public void setProgramNumber(final String programNumber) {
      this.programNumber = programNumber;
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
     * Sets the value of the field subtitleNumber.
     *
     * @param subtitleNumber
     *          the new value of the field subtitleNumber.
     */
    public void setSubtitleNumber(final String subtitleNumber) {
      this.subtitleNumber = subtitleNumber;
    }
  }

  private static Logger log = Logger
      .getLogger(BudgetElementToHumanCsvMapper.class.getCanonicalName());

  /**
   * Creates a new instance of the class BudgetElementToHumanCsvMapper.
   */
  public BudgetElementToHumanCsvMapper() {
    // TODO Auto-generated constructor stub
  }

  public Collection<MappedElement> map(final BudgetElement element) {

    final List<MappedElement> mappedElements = new ArrayList<>();
    boolean isAssignment = false;
    boolean isLeafItem = false;
    // determine if it is a leaf object in the hierarchy and its kind
    if (!(element instanceof CompositeBudgetElement)) {
      // we should have an assignment here or it is malformed
      if (!(element instanceof Assignment)) {
        BudgetElementToHumanCsvMapper.log.warning(
            new StringBuffer("Malformed element, expected an Assignment, got:")
                .append(element.getClass().getName()).toString());
      } else {
        isAssignment = true;
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
          isLeafItem = true;
        }
      }

      if (isAssignment || isLeafItem) {
        // Since it is a leaf element, end the recursive mapping
        String name = element.getName();
        int number = element.getNumber();
        String currency = element.getCurrency().toString();
        int initialBudget = element.getInitialBudget().intValue();
        int initialDollarBudget = element.getActualDollarBudget().intValue();
        int actualBudget = element.getInitialBudget().intValue();
        int actualDollarBudget = element.getActualDollarBudget().intValue();
        int cumulativeExecution = element.getCumulativeExecution().intValue();
        int cumulativeDollarExecution = element.getCumulativeDollarExecution()
            .intValue();
        int executionPercentage = 0;
        int dollarExecutionPercentage = 0;
        if (actualBudget > 0) {
          executionPercentage = cumulativeExecution / actualBudget * 100;
        }
        if (actualDollarBudget > 0) {
          dollarExecutionPercentage = cumulativeDollarExecution
              / actualDollarBudget * 100;
        }

        final MappedElement mappedElement = new MappedElement();
        mappedElement.setCurrency(currency);
        mappedElement.setInitialBudget(String.valueOf(initialBudget));
        mappedElement.setActualBudget(String.valueOf(actualBudget));
        mappedElement
            .setInitialDollarBudget(String.valueOf(initialDollarBudget));
        mappedElement.setActualDollarBudget(String.valueOf(actualDollarBudget));
        mappedElement
            .setCumulativeExecution(String.valueOf(cumulativeExecution));
        mappedElement.setCumulativeDollarExecution(
            String.valueOf(cumulativeDollarExecution));
        mappedElement
            .setExecutionPercentage(String.valueOf(executionPercentage));
        mappedElement.setDollarExecutionPercentage(
            String.valueOf(dollarExecutionPercentage));

        /**************** TODO Quedé aquí con este método *************/

        mappedElement.setAssignmentNumber(String.valueOf(number));
        mappedElement.setAssignmentName(name);

        mappedElements.add(mappedElement);
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
      sb.append(currency).append(s);
      final String initialBudget;
      final String actualBudget;
      final String exec;
      final String executionPercent;
      switch (currency) {
      case "Peso":
        initialBudget = mappedElement.getInitialBudget();
        actualBudget = mappedElement.getActualBudget();
        exec = mappedElement.getCumulativeExecution();
        // executionPercent=mappedElement.get
        /**************** TODO Quedé aquí con este método *************/
      case "Dolar":

      default:

      }

    }
    return sb.toString();
  }
}
