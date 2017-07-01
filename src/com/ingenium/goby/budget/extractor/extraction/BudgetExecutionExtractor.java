/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extraction;

import com.ingenium.goby.budget.BudgetExecution;
import com.ingenium.goby.budget.ClassifiersCatalog;
import com.ingenium.goby.budget.ClassifiersCatalogFactory;
import com.ingenium.goby.budget.InstitutionsCatalog;
import com.ingenium.goby.budget.InstitutionsCatalogFactory;
import com.ingenium.goby.budget.elements.Assignment;
import com.ingenium.goby.budget.elements.Batch;
import com.ingenium.goby.budget.elements.BudgetCurrency;
import com.ingenium.goby.budget.elements.BudgetElementType;
import com.ingenium.goby.budget.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.elements.Chapter;
import com.ingenium.goby.budget.elements.CompositeBudgetElement;
import com.ingenium.goby.budget.elements.Item;
import com.ingenium.goby.budget.elements.Program;
import com.ingenium.goby.budget.elements.Subtitle;
import com.opencsv.CSVReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;
import java.util.logging.Logger;

/**
 * <!-- begin-UML-doc -->
 * Esta&nbsp;clase&nbsp;extrae&nbsp;toda&nbsp;la&nbsp;Ley&nbsp;de&nbsp;Presupuestos&nbsp;desde&nbsp;el&nbsp;sitio&nbsp;de&nbsp;la&nbsp;DIPRES.<br>
 * <br>
 *
 * @author&nbsp;JaimeRodrigo <!-- end-UML-doc -->
 *
 * @author JaimeRodrigo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_Fe6LEF0kEeez8bHvvwz5bA"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Fe6LEF0kEeez8bHvvwz5bA"
 */
public class BudgetExecutionExtractor {
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @author JaimeRodrigo
   * @uml.annotations derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_Fe6LFV0kEeez8bHvvwz5bA"
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Fe6LFV0kEeez8bHvvwz5bA"
   */
  public class BudgetExecutionImpl extends CompositeBudgetElement
      implements BudgetExecution {
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @return
     * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Fe6LGF0kEeez8bHvvwz5bA"
     */
    @SuppressWarnings("unchecked")
    @Override
    public Collection<Batch> getBatches() {
      // begin-user-code
      return (Collection<Batch>) getSubelements().values();
      // end-user-code
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @param batchNumber
     * @return
     * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Fe6LHF0kEeez8bHvvwz5bA"
     */
    @Override
    public Batch getBatch(int batchNumber) {
      // begin-user-code
      return (Batch) getSubelement(batchNumber);
      // end-user-code
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc --> Crea una nueva instancia de la clase
     * BudgetExecutionImpl.
     *
     * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Fe6LH10kEeez8bHvvwz5bA"
     */
    public BudgetExecutionImpl() {
      // begin-user-code
      super(0, "Ejecución Presupuestaria", "", BudgetElementType.NONE,
          BudgetHierarchyLevel.ROOT);
      // end-user-code
    }
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Fe6LEl0kEeez8bHvvwz5bA"
   */
  private static final Logger log = Logger
      .getLogger("com.ingenium.goby.extractors.BudgetExecutionExtractor");
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Fe6LFF0kEeez8bHvvwz5bA"
   */
  private final String source;

  /**
   * <!-- begin-UML-doc -->
   * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;BudgetExecutionExtractor.
   * <!-- end-UML-doc --> Crea una nueva instancia de la clase BudgetExecutionExtractor.
   *
   * @param newSource
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Fe6LIF0kEeez8bHvvwz5bA"
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
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Fe6LI10kEeez8bHvvwz5bA"
   */
  public BudgetExecution extract() throws ExtractionException {
    // begin-user-code
    FileInputStream fi = null;
    try {
      fi = new FileInputStream(source);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      throw new ExtractionException("Source file not found");
    }
    CSVReader reader = null;

    BudgetExecutionImpl execution = new BudgetExecutionImpl();
    try {
      String line[] = null;
      reader = new CSVReader(new InputStreamReader(fi, "UTF-8"), ';', '"', 1);
      while ((line = reader.readNext()) != null) {

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
                new StringBuffer("Unable to obtain currency for element:")
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
                .warning(new StringBuffer("Unable to obtain name for element:")
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
            BudgetExecutionExtractor.log.warning(new StringBuffer(
                "Malformed input file. Can't find batch, chapter, program or subtitle in tuple (")
                    .append(batchNumber).append(",").append(chapterNumber)
                    .append(",").append(programNumber).append(",")
                    .append(subtitleNumber).append(")").toString());
          }

          if ((itemNumber == 0) && (assignmentNumber != 0)) {
            BudgetExecutionExtractor.log.warning(
                new StringBuffer("Malformed input file. Received assignment ")
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
                  new StringBuffer("Name read from budget file:").append(name)
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
                new StringBuffer("Found assignment ").append(assignmentNumber)
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
                new StringBuffer("Name read from budget file:").append(name)
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
        reader.close();
      }

    } catch (IOException e) {
      throw new ExtractionException(
          "Unable to create input stream or csv reader");
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        fi.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return execution;
    // end-user-code
  }
}