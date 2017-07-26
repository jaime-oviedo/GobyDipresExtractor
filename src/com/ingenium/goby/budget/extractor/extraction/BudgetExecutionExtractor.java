/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.extraction;

import com.ingenium.goby.budget.extractor.BudgetExecution;
import com.ingenium.goby.budget.extractor.ClassifiersCatalog;
import com.ingenium.goby.budget.extractor.ClassifiersCatalogFactory;
import com.ingenium.goby.budget.extractor.InstitutionsCatalog;
import com.ingenium.goby.budget.extractor.InstitutionsCatalogFactory;
import com.ingenium.goby.budget.extractor.elements.Assignment;
import com.ingenium.goby.budget.extractor.elements.Batch;
import com.ingenium.goby.budget.extractor.elements.BudgetCurrency;
import com.ingenium.goby.budget.extractor.elements.BudgetElementType;
import com.ingenium.goby.budget.extractor.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.extractor.elements.Chapter;
import com.ingenium.goby.budget.extractor.elements.CompositeBudgetElement;
import com.ingenium.goby.budget.extractor.elements.Item;
import com.ingenium.goby.budget.extractor.elements.Program;
import com.ingenium.goby.budget.extractor.elements.Subtitle;
import com.opencsv.CSVReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

/**
 * <!-- begin-UML-doc -->
 * Esta&nbsp;clase&nbsp;extrae&nbsp;toda&nbsp;la&nbsp;Ley&nbsp;de&nbsp;Presupuestos&nbsp;desde&nbsp;el&nbsp;sitio&nbsp;de&nbsp;la&nbsp;DIPRES.<br>
 * <br>
 * <br>
 * <br>
 * <br>
 *
 * @author&nbsp;JaimeRodrig <!-- end-UML-doc -->
 *
 * @author joviedo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_Fe6LEF0kEeez8bHvvwz5bA"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Fe6LEF0kEeez8bHvvwz5bA"
 */
public class BudgetExecutionExtractor {
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @author joviedo
   * @uml.annotations derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_Fe6LFV0kEeez8bHvvwz5bA"
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Fe6LFV0kEeez8bHvvwz5bA"
   */
  public class BudgetExecutionImpl extends CompositeBudgetElement
      implements BudgetExecution {
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Fe6LH10kEeez8bHvvwz5bA"
     */
    public BudgetExecutionImpl() {
      // begin-user-code
      super(0, "Ejecución Presupuestaria", "", BudgetElementType.NONE,
          BudgetHierarchyLevel.ROOT);
      // end-user-code
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @param batchNumber
     * @return
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Fe6LHF0kEeez8bHvvwz5bA"
     */
    @Override
    public Batch getBatch(int batchNumber) {
      // begin-user-code
      return (Batch) getSubelement(batchNumber);
      // end-user-code
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @return
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Fe6LGF0kEeez8bHvvwz5bA"
     */
    @SuppressWarnings("unchecked")
    @Override
    public Collection<Batch> getBatches() {
      // begin-user-code
      return (Collection<Batch>) getSubelements().values();
      // end-user-code
    }
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Fe6LEl0kEeez8bHvvwz5bA"
   */
  private static final Logger log = Logger
      .getLogger("com.ingenium.goby.extractors.BudgetExecutionExtractor");
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Fe6LFF0kEeez8bHvvwz5bA"
   */
  private final String source;

  /**
   * <!-- begin-UML-doc -->
   * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;BudgetExecutionExtractor.
   * <!-- end-UML-doc -->
   *
   * @param newSource
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Fe6LIF0kEeez8bHvvwz5bA"
   */
  public BudgetExecutionExtractor(String newSource) {
    // begin-user-code
    source = newSource;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @return
   * @throws ExtractionException
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Fe6LI10kEeez8bHvvwz5bA"
   */
  public BudgetExecution extract() throws ExtractionException {
    // begin-user-code
    FileInputStream fi = null;
    CSVReader reader = null;
    List<String[]> lines = new ArrayList<>(300);
    try {
      fi = new FileInputStream(source);
      reader = new CSVReader(new InputStreamReader(fi, "UTF-8"), ';', '"', 1);
      lines = reader.readAll();
    } catch (IOException e) {
      log.severe(new StringBuilder("Unable to read execution files:")
          .append(e.getMessage()).toString());
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (IOException e) {
        log.warning(new StringBuilder("Unable to close CSVReader:")
            .append(e.getMessage()).toString());
      }
      try {
        if (fi != null) {
          fi.close();
        }
      } catch (IOException e) {
        log.warning(new StringBuilder("Unable to close FileInputStream:")
            .append(e.getMessage()).toString());
      }
    }
    BudgetExecutionImpl execution = new BudgetExecutionImpl();
    try {

      for (String[] line : lines) {

        int batchNumber = 0;

        String s = line[0];
        try {
          if (s != null) {
            batchNumber = Integer.parseInt(s);
          }
        } catch (Exception e) {
          throw new ExtractionException("Unable to extract batch number.");
        }

        int chapterNumber = 0;
        s = line[1];
        if (s != null) {
          try {
            chapterNumber = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            BudgetExecutionExtractor.log
                .warning("Unable to extract chatper number.");
          }
        } else {
          chapterNumber = 0;
        }

        int programNumber = 0;
        s = line[2];
        if (s != null) {
          try {
            programNumber = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            BudgetExecutionExtractor.log
                .warning("Unable to extact program number.");
          }
        }

        int subtitleNumber = 0;
        s = line[3];
        if (s != null) {
          try {
            subtitleNumber = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            BudgetExecutionExtractor.log
                .warning("Unable to extact subtitle number.");
          }
        }

        int itemNumber = 0;
        s = line[4];
        if ((s != null) && !"".equals(s)) {
          try {
            itemNumber = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            BudgetExecutionExtractor.log
                .warning("Unable to extact item number.");
          }
        }

        int assignmentNumber = 0;
        s = line[5];
        if ((s != null) && !"".equals(s)) {
          try {
            assignmentNumber = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            BudgetExecutionExtractor.log
                .warning("Unable to extact assignment number.");
          }
        }

        BudgetCurrency currency = BudgetCurrency.PESO;
        s = line[6];
        if (s != null) {
          if ("P".equals(s.toUpperCase())) {
            currency = BudgetCurrency.PESO;
          } else if ("D".equals(s.toUpperCase())) {
            currency = BudgetCurrency.DOLLAR;
          } else {
            BudgetExecutionExtractor.log.warning(
                new StringBuilder("Unable to obtain currency for element:")
                    .append(batchNumber).append(",").append(chapterNumber)
                    .append(",").append(programNumber)
                    .append(", defaulting to Peso.").toString());
          }

          String name = "";
          s = line[7];
          if (s != null) {
            name = s;
          } else {
            BudgetExecutionExtractor.log
                .warning(new StringBuilder("Unable to obtain name for element:")
                    .append(batchNumber).append(",").append(chapterNumber)
                    .append(",").append(programNumber)
                    .append(". I will try to get it from the catalog.")
                    .toString());
          }

          // The french use comma for separating decimals, we'll use that locale.
          BigInteger initialBudgetNumber = BigInteger.ZERO;
          s = line[8];
          if (s != null) {
            initialBudgetNumber = BigInteger.valueOf(NumberFormat
                .getNumberInstance(Locale.FRANCE).parse(s).longValue());
          }

          BigInteger currentBudgetNumber = BigInteger.ZERO;
          s = line[9];
          if (s != null) {
            currentBudgetNumber = BigInteger.valueOf(NumberFormat
                .getNumberInstance(Locale.FRANCE).parse(s).longValue());
          }

          BigInteger cumulativeExecution = BigInteger.ZERO;
          s = line[10];
          if (s != null) {
            cumulativeExecution = BigInteger.valueOf(NumberFormat
                .getNumberInstance(Locale.FRANCE).parse(s).longValue());
          }

          ClassifiersCatalog cc = ClassifiersCatalogFactory.getInstance()
              .getClassifiersCatalog();
          InstitutionsCatalog ic = InstitutionsCatalogFactory.getInstance()
              .getInstitutionsCatalog();

          Batch catBatch = ic.getBatch(batchNumber);
          Chapter catChapter = null;
          if (catBatch != null) {
            catChapter = catBatch.getChapter(chapterNumber);
          }
          Program catProgram = null;
          if (catChapter != null) {
            catProgram = catChapter.getProgram(programNumber);
          }
          Subtitle catSubtitle = cc.getSubtitle(subtitleNumber);

          if (catSubtitle == null) {
            // not interested.
            continue;
          }

          if ((catBatch == null) || (catChapter == null)
              || (catProgram == null)) {
            BudgetExecutionExtractor.log.warning(new StringBuilder(
                "Malformed input file. Can't find batch, chapter, program or subtitle in tuple (")
                    .append(batchNumber).append(",").append(chapterNumber)
                    .append(",").append(programNumber).append(",")
                    .append(subtitleNumber).append(")").toString());
          }

          if ((itemNumber == 0) && (assignmentNumber != 0)) {
            BudgetExecutionExtractor.log.warning(
                new StringBuilder("Malformed input file. Received assignment ")
                    .append(assignmentNumber)
                    .append(" with no item number. See budget row (")
                    .append(batchNumber).append(",").append(chapterNumber)
                    .append(",").append(programNumber).append(",")
                    .append(subtitleNumber).append(")").toString());
          }

          // No malformed entry, let's create the tree structure as needed

          Batch lawBatch = execution.getBatch(batchNumber);
          if (lawBatch == null) {
            lawBatch = new Batch(catBatch.getNumber(), catBatch.getName(),
                catBatch.getDescription(), BudgetElementType.BUDGET);
            execution.addSubelement(lawBatch);
          }

          Chapter lawChapter = lawBatch.getChapter(chapterNumber);
          if (lawChapter == null) {
            lawChapter = new Chapter(catChapter.getNumber(),
                catChapter.getName(), catChapter.getDescription(),
                BudgetElementType.BUDGET);
            lawBatch.addChapter(lawChapter);
          }

          Program lawProgram = lawChapter.getProgram(programNumber);
          if (lawProgram == null) {
            lawProgram = new Program(catProgram.getNumber(),
                catProgram.getName(), catProgram.getDescription(),
                BudgetElementType.BUDGET);
            lawChapter.addProgram(lawProgram);
          }

          Subtitle lawSubtitle = lawProgram.getSubtitle(subtitleNumber);
          if (lawSubtitle == null) {
            lawSubtitle = new Subtitle(catSubtitle.getNumber(),
                catSubtitle.getName(), catSubtitle.getDescription(),
                BudgetElementType.BUDGET);
            lawProgram.addSubtitle(lawSubtitle);
          }

          if (itemNumber == 0) {
            switch (currency) {
            case DOLLAR:
              lawSubtitle.setInitialDollarBudget(initialBudgetNumber);
              lawSubtitle.setActualDollarBudget(currentBudgetNumber);
              lawSubtitle.setCumulativeDollarExecution(cumulativeExecution);

              break;
            default:
              lawSubtitle.setInitialBudget(initialBudgetNumber);
              lawSubtitle.setActualBudget(currentBudgetNumber);
              lawSubtitle.setCumulativeExecution(cumulativeExecution);
            }
            continue;
          }

          Item lawItem = lawSubtitle.getItem(subtitleNumber);
          Item catItem = catSubtitle.getItem(itemNumber);
          if (lawItem == null) {
            lawItem = new Item(catItem.getNumber(), name,
                catItem.getDescription(), BudgetElementType.BUDGET);
            String catItemName = catItem.getName();
            if (!name.equals(catItemName)) {
              BudgetExecutionExtractor.log.fine(
                  new StringBuilder("Name read from budget file:").append(name)
                      .append(
                          " differs from name found in classifiers catalog:")
                      .append(catItemName).append(". Using budget file name.")
                      .toString());
            }
            lawSubtitle.addItem(lawItem);
          }

          if (assignmentNumber == 0) {
            switch (currency) {
            case DOLLAR:
              lawItem.setInitialDollarBudget(initialBudgetNumber);
              lawItem.setActualDollarBudget(currentBudgetNumber);
              lawItem.setCumulativeDollarExecution(cumulativeExecution);

              break;
            default:
              lawItem.setInitialBudget(initialBudgetNumber);
              lawItem.setActualBudget(currentBudgetNumber);
              lawItem.setCumulativeExecution(cumulativeExecution);
            }
            continue;
          }

          Assignment catAssignment = catItem.getAssignment(assignmentNumber);
          if (catAssignment == null) {
            BudgetExecutionExtractor.log.warning(
                new StringBuilder("Found assignment ").append(assignmentNumber)
                    .append(
                        " not contained in base classifiers catalog for the (subtitle,item):(")
                    .append(subtitleNumber).append(",").append(itemNumber)
                    .append(
                        "). It will be added to the catalog for extraction purposes ")
                    .append(
                        "but there could be something wrong with the input files.")
                    .toString());
            catAssignment = new Assignment(assignmentNumber, name, "",
                BudgetElementType.BUDGETARY_CLASSIFICATION);
            catItem.addAssignment(catAssignment);
          }

          Assignment lawAssignment = new Assignment(catAssignment.getNumber(),
              name, catAssignment.getDescription(), BudgetElementType.BUDGET);
          String catAssignmentName = catAssignment.getName();
          if (!name.equals(catAssignmentName)) {

            BudgetExecutionExtractor.log.fine(
                new StringBuilder("Name read from budget file:").append(name)
                    .append(" differs from name found in classifiers catalog:")
                    .append(catAssignmentName)
                    .append(". Using budget file name.").toString());
          }
          switch (currency) {
          case DOLLAR:
            lawAssignment.setInitialDollarBudget(initialBudgetNumber);
            lawAssignment.setActualDollarBudget(currentBudgetNumber);
            lawAssignment.setCumulativeDollarExecution(cumulativeExecution);

            break;
          default:
            lawAssignment.setInitialBudget(initialBudgetNumber);
            lawAssignment.setActualBudget(currentBudgetNumber);
            lawAssignment.setCumulativeExecution(cumulativeExecution);
          }
          lawItem.addAssignment(lawAssignment);

        }
      }

    } catch (ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return execution;
    // end-user-code
  }
}
