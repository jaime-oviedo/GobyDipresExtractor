/**
 *
 */

package com.ingenium.goby.budget.extraction;

import com.ingenium.goby.budget.BudgetLaw;
import com.ingenium.goby.budget.elements.Batch;
import com.ingenium.goby.budget.elements.BudgetElementType;
import com.ingenium.goby.budget.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.elements.Chapter;
import com.ingenium.goby.budget.elements.CompositeBudgetElement;
import com.ingenium.goby.budget.elements.Program;
import com.opencsv.CSVReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
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

        int budgetNumber = 0;
        s = line[7];
        if (s != null) {
          try {
            budgetNumber = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            BudgetLawExtractor.log.finest("Unable to extact program number.");
          }
        }

        int dollarBudgetNumber = 0;
        s = line[8];
        if (s != null) {
          try {
            dollarBudgetNumber = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            BudgetLawExtractor.log.finest("Unable to extact program number.");
          }
        }

        if (programNumber != 0) {
          Batch batch = law.getBatch(batchNumber);
          if (batch != null) {
            batch.addProgram(chapterNumber,
                new Program(programNumber, name, "", BudgetElementType.BUDGET));
            continue;
          }
        }

        if (chapterNumber != 0)

        {
          Batch batch = law.getBatch(batchNumber);
          if (batch != null) {
            batch.addChapter(
                new Chapter(chapterNumber, name, "", BudgetElementType.BUDGET));
            continue;
          }
        }

        if (batchNumber != 0) {
          Batch batch = new Batch(batchNumber, name, "",
              BudgetElementType.BUDGET);
          law.addSubelement(batch);
          continue;
        }

        throw new ExtractionException(
            "Malformed csv file, found budgetary items (chapter or program) without previously created parent");

      }

      reader.close();
    } catch (Exception e) {
      throw new ExtractionException(
          "Unable to create input stream or csv reader");
    } finally {
      try {
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
