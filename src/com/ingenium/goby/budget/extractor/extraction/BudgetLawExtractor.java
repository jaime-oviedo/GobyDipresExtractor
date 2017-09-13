/**
 *
 */

package com.ingenium.goby.budget.extractor.extraction;

import com.ingenium.goby.budget.extractor.BudgetLaw;
import com.ingenium.goby.budget.extractor.ClassifiersCatalog;
import com.ingenium.goby.budget.extractor.ClassifiersCatalogFactory;
import com.ingenium.goby.budget.extractor.InstitutionsCatalog;
import com.ingenium.goby.budget.extractor.InstitutionsCatalogFactory;
import com.ingenium.goby.budget.extractor.elements.Assignment;
import com.ingenium.goby.budget.extractor.elements.Batch;
import com.ingenium.goby.budget.extractor.elements.BudgetElementType;
import com.ingenium.goby.budget.extractor.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.extractor.elements.Chapter;
import com.ingenium.goby.budget.extractor.elements.CompositeBudgetElement;
import com.ingenium.goby.budget.extractor.elements.Item;
import com.ingenium.goby.budget.extractor.elements.Program;
import com.ingenium.goby.budget.extractor.elements.Subtitle;
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
 * Esta&nbsp;clase&nbsp;extrae&nbsp;toda&nbsp;la&nbsp;Ley&nbsp;de&nbsp;Presupuestos&nbsp;desde&nbsp;el&nbsp;sitio&nbsp;de&nbsp;la&nbsp;DIPRES.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_UautoEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UautoEquEeeJsdrfgQXeQw"
 */
public class BudgetLawExtractor {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author Jaime Oviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_lSO08FhREeeLhanfOp3nJA"
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lSO08FhREeeLhanfOp3nJA"
  */
  public class BudgetLawImpl extends CompositeBudgetElement
      implements BudgetLaw {
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * Creates a new instance of the class BudgetLawImpl.
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_KnOqkFhUEeeLhanfOp3nJA"
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
    * @param batchNumber
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_CXBu8FhUEeeLhanfOp3nJA"
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
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_CXBH4FhUEeeLhanfOp3nJA"
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
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_wErB4FejEeeJT_eFoT-0rA"
  */
  private static final Logger log = Logger
      .getLogger("com.ingenium.goby.extractors.BudgetLawExtractor");
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Mqu6wFhREeeLhanfOp3nJA"
  */
  private final String source;
  
  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;BudgetLawExtractor.
  * <!-- end-UML-doc -->
  * Creates a new instance of the class BudgetLawExtractor.
  * @param source
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UjFYYEquEeeJsdrfgQXeQw"
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
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UjH0oEquEeeJsdrfgQXeQw"
  */
  public BudgetLaw extract() throws ExtractionException {
    // begin-user-code
    FileInputStream fi = null;
    try {
      fi = new FileInputStream(source);
    } catch (final FileNotFoundException e) {
      e.printStackTrace();
      throw new ExtractionException("Source file not found");
    }
    CSVReader reader = null;
    
    final BudgetLawImpl law = new BudgetLawImpl();
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
        } catch (final Exception e) {
          throw new ExtractionException("Unable to extract batch number.");
        }
        
        int chapterNumber = 0;
        s = line[1];
        if (s != null) {
          try {
            chapterNumber = Integer.parseInt(s);
          } catch (final NumberFormatException e) {
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
          } catch (final NumberFormatException e) {
            BudgetLawExtractor.log.finest("Unable to extact program number.");
          }
        }
        
        int subtitleNumber = 0;
        s = line[3];
        if (s != null) {
          try {
            subtitleNumber = Integer.parseInt(s);
          } catch (final NumberFormatException e) {
            BudgetLawExtractor.log.finest("Unable to extact program number.");
          }
        }
        
        int itemNumber = 0;
        s = line[4];
        if ((s != null) && !"".equals(s)) {
          try {
            itemNumber = Integer.parseInt(s);
          } catch (final NumberFormatException e) {
            BudgetLawExtractor.log.finest("Unable to extact program number.");
          }
        }
        
        int assignmentNumber = 0;
        s = line[5];
        if ((s != null) && !"".equals(s)) {
          try {
            assignmentNumber = Integer.parseInt(s);
          } catch (final NumberFormatException e) {
            BudgetLawExtractor.log.finest("Unable to extact program number.");
          }
        }
        
        String name = "";
        s = line[6];
        if (s != null) {
          name = s;
        } else {
          throw new ExtractionException(
              new StringBuilder("Unable to obtain name for element:")
                  .append(batchNumber).append(",").append(chapterNumber)
                  .append(",").append(programNumber).toString());
        }
        
        // The french use comma for separating decimals, we'll use that locale.
        BigInteger budgetNumber = BigInteger.ZERO;
        s = line[7];
        if (s != null) {
          budgetNumber = BigInteger.valueOf(NumberFormat
              .getNumberInstance(Locale.FRANCE).parse(s).longValue());
        }
        
        BigInteger dollarBudgetNumber = BigInteger.ZERO;
        s = line[8];
        if (s != null) {
          dollarBudgetNumber = BigInteger.valueOf(NumberFormat
              .getNumberInstance(Locale.FRANCE).parse(s).longValue());
        }
        
        final ClassifiersCatalog cc = ClassifiersCatalogFactory.getInstance()
            .getClassifiersCatalog();
        final InstitutionsCatalog ic = InstitutionsCatalogFactory.getInstance()
            .getInstitutionsCatalog();
        
        final Batch catBatch = ic.getBatch(batchNumber);
        Chapter catChapter = null;
        if (catBatch != null) {
          catChapter = catBatch.getChapter(chapterNumber);
        }
        Program catProgram = null;
        if (catChapter != null) {
          catProgram = catChapter.getProgram(programNumber);
        }
        final Subtitle catSubtitle = cc.getSubtitle(subtitleNumber);
        
        if (catSubtitle == null) {
          // not interested.
          continue;
        }
        
        if ((catBatch == null) || (catChapter == null)
            || (catProgram == null)) {
          throw new ExtractionException(new StringBuilder(
              "Malformed input file. Can't find batch, chapter, program or subtitle in tuple (")
                  .append(batchNumber).append(",").append(chapterNumber)
                  .append(",").append(programNumber).append(",")
                  .append(subtitleNumber).append(")").toString());
        }
        
        if ((itemNumber == 0) && (assignmentNumber != 0)) {
          throw new ExtractionException(
              new StringBuilder("Malformed input file. Received assignment ")
                  .append(assignmentNumber)
                  .append(" with no item number. See budget row (")
                  .append(batchNumber).append(",").append(chapterNumber)
                  .append(",").append(programNumber).append(",")
                  .append(subtitleNumber).append(")").toString());
        }
        
        // No malformed entry, let's create the tree structure as needed
        
        Batch lawBatch = law.getBatch(batchNumber);
        if (lawBatch == null) {
          lawBatch = new Batch(catBatch.getNumber(), catBatch.getName(),
              catBatch.getDescription(), BudgetElementType.BUDGET);
          law.addSubelement(lawBatch);
        }
        
        Chapter lawChapter = lawBatch.getChapter(chapterNumber);
        if (lawChapter == null) {
          lawChapter = new Chapter(catChapter.getNumber(), catChapter.getName(),
              catChapter.getDescription(), BudgetElementType.BUDGET);
          lawBatch.addChapter(lawChapter);
        }
        
        Program lawProgram = lawChapter.getProgram(programNumber);
        if (lawProgram == null) {
          lawProgram = new Program(catProgram.getNumber(), catProgram.getName(),
              catProgram.getDescription(), BudgetElementType.BUDGET);
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
          lawSubtitle.setInitialBudget(budgetNumber);
          lawSubtitle.setActualBudget(budgetNumber);
          lawSubtitle.setInitialDollarBudget(dollarBudgetNumber);
          lawSubtitle.setActualDollarBudget(dollarBudgetNumber);
          continue;
        }
        
        Item lawItem = lawSubtitle.getItem(subtitleNumber);
        final Item catItem = catSubtitle.getItem(itemNumber);
        if (lawItem == null) {
          lawItem = new Item(catItem.getNumber(), name,
              catItem.getDescription(), BudgetElementType.BUDGET);
          final String catItemName = catItem.getName();
          if (!name.equals(catItemName)) {
            BudgetLawExtractor.log.fine(
                new StringBuilder("Name read from budget file:").append(name)
                    .append(" differs from name found in classifiers catalog:")
                    .append(catItemName).append(". Using budget file name.")
                    .toString());
          }
          lawSubtitle.addItem(lawItem);
        }
        
        if (assignmentNumber == 0) {
          lawItem.setInitialBudget(budgetNumber);
          lawItem.setActualBudget(budgetNumber);
          lawItem.setInitialDollarBudget(dollarBudgetNumber);
          lawItem.setActualDollarBudget(dollarBudgetNumber);
          continue;
        }
        
        Assignment catAssignment = catItem.getAssignment(assignmentNumber);
        if (catAssignment == null) {
          BudgetLawExtractor.log.warning(
              new StringBuilder("Found assignment ").append(assignmentNumber)
                  .append(
                      " not contained in base classifiers catalog for the (subtitle,item):(")
                  .append(subtitleNumber).append(",").append(itemNumber)
                  .append(
                      "). It will be added to the catalog for extraction purposes but there could be something wrong with the input files.")
                  .toString());
          catAssignment = new Assignment(assignmentNumber, name, "",
              BudgetElementType.BUDGETARY_CLASSIFICATION);
          catItem.addAssignment(catAssignment);
        }
        
        final Assignment lawAssignment = new Assignment(
            catAssignment.getNumber(), name, catAssignment.getDescription(),
            BudgetElementType.BUDGET);
        final String catAssignmentName = catAssignment.getName();
        if (!name.equals(catAssignmentName)) {
          
          BudgetLawExtractor.log.fine(
              new StringBuilder("Name read from budget file:").append(name)
                  .append(" differs from name found in classifiers catalog:")
                  .append(catAssignmentName).append(". Using budget file name.")
                  .toString());
        }
        lawAssignment.setInitialBudget(budgetNumber);
        lawAssignment.setActualBudget(budgetNumber);
        lawAssignment.setInitialDollarBudget(dollarBudgetNumber);
        lawAssignment.setActualDollarBudget(dollarBudgetNumber);
        lawItem.addAssignment(lawAssignment);
        
      }
      reader.close();
    } catch (final IOException e) {
      throw new ExtractionException(
          "Unable to create input stream or csv reader");
    } catch (final ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (final IOException e) {
        e.printStackTrace();
      }
      try {
        fi.close();
      } catch (final IOException e) {
        e.printStackTrace();
      }
    }
    
    return law;
    // end-user-code
  }
}