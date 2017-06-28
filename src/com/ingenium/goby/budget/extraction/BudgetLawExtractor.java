/**
 *
 */

package com.ingenium.goby.budget.extraction;

import com.ingenium.goby.budget.BudgetLaw;
import com.ingenium.goby.budget.elements.Assignment;
import com.ingenium.goby.budget.elements.Batch;
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
import java.util.Collection;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * Esta&nbsp;clase&nbsp;extrae&nbsp;toda&nbsp;la&nbsp;Ley&nbsp;de&nbsp;Presupuestos&nbsp;desde&nbsp;el&nbsp;sitio&nbsp;de&nbsp;la&nbsp;DIPRES.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UautoEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UautoEquEeeJsdrfgQXeQw"
 */
public class BudgetLawExtractor {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author joviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_lSO08FhREeeLhanfOp3nJA"
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_lSO08FhREeeLhanfOp3nJA"
  */
  public class BudgetLawImpl extends CompositeBudgetElement
      implements BudgetLaw {

    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param batchNumber
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_CXBu8FhUEeeLhanfOp3nJA"
    */
    @Override
    public Batch getBatch(int batchNumber) {
      // begin-user-code
      return (Batch) getSubelement(batchNumber);
      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_KnOqkFhUEeeLhanfOp3nJA"
    */
    public BudgetLawImpl() {
      // begin-user-code
      super(0, "Ley de Presupuesto", "", BudgetElementType.NONE,
          BudgetHierarchyLevel.ROOT);
      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_CXBH4FhUEeeLhanfOp3nJA"
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
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_wErB4FejEeeJT_eFoT-0rA"
  */
  private static final Logger log = Logger
      .getLogger("com.ingenium.goby.extractors.BudgetLawExtractor");

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Mqu6wFhREeeLhanfOp3nJA"
  */
  private final String source;

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;BudgetLawExtractor.
  * <!-- end-UML-doc -->
  * @param source
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjFYYEquEeeJsdrfgQXeQw"
  */
  public BudgetLawExtractor(String source) {
    // begin-user-code
    this.source = source;
    // end-user-code
  }

  /*
   * (non-Javadoc)
   *
   * @see com.ingenium.goby.extractors.Extractor#extract()
   */
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjH0oEquEeeJsdrfgQXeQw"
  */
  public BudgetLaw extract() throws ExtractionException {
    // begin-user-code
    FileInputStream fi;
    try {
      fi = new FileInputStream(source);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      throw new ExtractionException("Source file not found");
    }
    CSVReader reader = null;

    BudgetLawImpl law = new BudgetLawImpl();
    try {
      String line[];
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
            BudgetLawExtractor.log.finest("Unable to extract chatper number.");
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
            BudgetLawExtractor.log.finest("Unable to extact program number.");
          }
        }

        int subtitleNumber = 0;
        s = line[3];
        if (s != null) {
          try {
            subtitleNumber = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            BudgetLawExtractor.log.finest("Unable to extact program number.");
          }
        }

        int itemNumber = 0;
        s = line[4];
        if (s != null) {
          try {
            itemNumber = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            BudgetLawExtractor.log.finest("Unable to extact program number.");
          }
        }

        int assignmentNumber = 0;
        s = line[5];
        if (s != null) {
          try {
            assignmentNumber = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            BudgetLawExtractor.log.finest("Unable to extact program number.");
          }
        }

        String name;
        s = line[6];
        if (s != null) {
          name = s;
        } else {
          throw new ExtractionException("Unable to obtain name for element:"
              + batchNumber + chapterNumber + programNumber);
        }

        String budgetNumber = "0";
        s = line[7];
        if (s != null) {
          budgetNumber = s;
        }

        String dollarBudgetNumber = "0";
        s = line[8];
        if (s != null) {
          dollarBudgetNumber = s;
        }

        Batch batch = law.getBatch(batchNumber);

        if (batch == null) {
          if ((chapterNumber + programNumber + subtitleNumber + itemNumber
              + assignmentNumber) > 0 || batchNumber == 0) {
            log.severe("Cannot obtain batch number:" + batchNumber
                + ". Malformed budget input");
            throw new ExtractionException("Cannot obtain batch number:"
                + batchNumber + ". Malformed budget input");
          } else {
            batch = new Batch(assignmentNumber, name, "",
                BudgetElementType.BUDGET);
            batch.setInitialBudget(new BigInteger(budgetNumber));
            batch.setActualBudget(new BigInteger(budgetNumber));
            batch.setInitialDollarBudget(new BigInteger(dollarBudgetNumber));
            batch.setActualDollarBudget(new BigInteger(dollarBudgetNumber));
            law.addSubelement(batch);
            continue;
          }
        }

        if (assignmentNumber != 0) {
          Assignment assignment = new Assignment(assignmentNumber, name, "",
              BudgetElementType.BUDGET);
          assignment.setInitialBudget(new BigInteger(budgetNumber));
          assignment.setActualBudget(new BigInteger(budgetNumber));
          assignment.setInitialDollarBudget(new BigInteger(dollarBudgetNumber));
          assignment.setActualDollarBudget(new BigInteger(dollarBudgetNumber));
          batch.addAssignment(chapterNumber, programNumber, subtitleNumber,
              itemNumber, assignment);
          continue;
        }

        if (itemNumber != 0) {
          Item item = new Item(assignmentNumber, name, "",
              BudgetElementType.BUDGET);
          item.setInitialBudget(new BigInteger(budgetNumber));
          item.setActualBudget(new BigInteger(budgetNumber));
          item.setInitialDollarBudget(new BigInteger(dollarBudgetNumber));
          item.setActualDollarBudget(new BigInteger(dollarBudgetNumber));
          batch.addItem(chapterNumber, programNumber, subtitleNumber, item);
          continue;
        }

        if (subtitleNumber != 0) {
          Subtitle subtitle = new Subtitle(assignmentNumber, name, "",
              BudgetElementType.BUDGET);
          subtitle.setInitialBudget(new BigInteger(budgetNumber));
          subtitle.setActualBudget(new BigInteger(budgetNumber));
          subtitle.setInitialDollarBudget(new BigInteger(dollarBudgetNumber));
          subtitle.setActualDollarBudget(new BigInteger(dollarBudgetNumber));
          batch.addSubtitle(chapterNumber, programNumber, subtitle);
          continue;
        }

        if (programNumber != 0) {
          Program program = new Program(assignmentNumber, name, "",
              BudgetElementType.BUDGET);
          program.setInitialBudget(new BigInteger(budgetNumber));
          program.setActualBudget(new BigInteger(budgetNumber));
          program.setInitialDollarBudget(new BigInteger(dollarBudgetNumber));
          program.setActualDollarBudget(new BigInteger(dollarBudgetNumber));
          batch.addProgram(chapterNumber, program);
          continue;
        }

        if (chapterNumber != 0) {
          Chapter chapter = new Chapter(assignmentNumber, name, "",
              BudgetElementType.BUDGET);
          chapter.setInitialBudget(new BigInteger(budgetNumber));
          chapter.setActualBudget(new BigInteger(budgetNumber));
          chapter.setInitialDollarBudget(new BigInteger(dollarBudgetNumber));
          chapter.setActualDollarBudget(new BigInteger(dollarBudgetNumber));
          batch.addChapter(chapter);
          continue;
        }

        throw new ExtractionException(
            "Malformed csv file, found budgetary items (chapter or program) without previously created parent");

      }
      reader.close();
    } catch (IOException e) {
      throw new ExtractionException(
          "Unable to create input stream or csv reader");
    } finally {
      try {
        if (reader != null)
          reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        fi.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return law;
    // end-user-code
  }

}
