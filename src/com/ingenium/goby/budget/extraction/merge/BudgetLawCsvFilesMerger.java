/**
 *
 */

package com.ingenium.goby.budget.extraction.merge;

import com.ingenium.goby.budget.elements.BudgetCurrency;
import com.ingenium.goby.budget.elements.BudgetElement;
import com.ingenium.goby.budget.elements.BudgetElementType;
import com.ingenium.goby.budget.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.elements.CompositeBudgetElement;
import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.ExtractorImpl;
import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_xiP9AEyIEeekuqvl4T6tsg"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_xiP9AEyIEeekuqvl4T6tsg"
 */
public class BudgetLawCsvFilesMerger extends ExtractorImpl {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author JaimeRodrigo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_6n5lcFETEeeJofrcP_B-sg"
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_6n5lcFETEeeJofrcP_B-sg"
  */
  public class BudgetLine {
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_8XGSMFETEeeJofrcP_B-sg"
    */
    private String[] lineContents = null;
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_NV3gcFEUEeeJofrcP_B-sg"
    */
    public String[] getLineContents() {
      // begin-user-code
      return lineContents;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * Crea una nueva instancia de la clase BudgetLine.
    * @param lineContents
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_TIPuwFEUEeeJofrcP_B-sg"
    */
    public BudgetLine(String[] lineContents) {
      // begin-user-code
      this.lineContents = lineContents;
      // end-user-code
    }
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_P727kEyQEeekuqvl4T6tsg"
  */
  private static final Logger log = Logger.getLogger(
      "com.ingenium.goby.budget.extraction.extraction.merge.BudgetLawCsvFilesMerger");
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_caJBMEyQEeekuqvl4T6tsg"
  */
  private Collection<String> mergedFiles;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_gcrCgEyQEeekuqvl4T6tsg"
  */
  private Collection<String> notMergedFiles;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_xAZhQEyVEeekuqvl4T6tsg"
  */
  private final BudgetElementType mergedElementsType;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_g8otQEyWEeekuqvl4T6tsg"
  */
  private CompositeBudgetElement budgetElementRoot;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param sourceDirectory
  * @param outputFile
  * @param mergedElementsType
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_PGKRYEyKEeekuqvl4T6tsg"
  */
  public BudgetLawCsvFilesMerger(String sourceDirectory, String outputFile,
      BudgetElementType mergedElementsType) {
    // begin-user-code
    setSource(sourceDirectory);
    setDestination(outputFile);
    this.mergedElementsType = mergedElementsType;
    budgetElementRoot = null;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_BRcu4EyLEeekuqvl4T6tsg"
  */
  public void merge() throws ExtractionException {
    // begin-user-code
    String sourcePath = getSource();
    File dir = new File(sourcePath);
    File[] directoryListing = dir.listFiles();
    
    if (directoryListing == null) {
      BudgetLawCsvFilesMerger.log
          .severe("The provided source URI does not point to a directory:"
              + getSource());
      throw new ExtractionException(
          ("The provided source URI does not point to a directory:"
              + getSource()));
    }
    
    mergedFiles = new ArrayList<>();
    notMergedFiles = new ArrayList<>();
    
    switch (mergedElementsType) {
      case BUDGETARY_CLASSIFICATION:
        budgetElementRoot = new CompositeBudgetElement(0,
            "Catalogo de clasificadores presupuestarios",
            "Catalogo que contiene la jerarquía de clasificadores presupuestarios",
            BudgetElementType.BUDGETARY_CLASSIFICATION,
            BudgetHierarchyLevel.ROOT);
        break;
      case INSTITUTIONAL_CLASSIFICATION:
        budgetElementRoot = new CompositeBudgetElement(0,
            "Catalogo de clasificadores institucionales",
            "Catalogo que contiene la jerarquía institucional del gobierno",
            BudgetElementType.INSTITUTIONAL_CLASSIFICATION,
            BudgetHierarchyLevel.ROOT);
        break;
      case BUDGET:
        budgetElementRoot = new CompositeBudgetElement(0, "Ley de Presupuestos",
            "Ley de Presupuestos", BudgetElementType.BUDGET,
            BudgetHierarchyLevel.ROOT);
        break;
      case EXECUTION:
        budgetElementRoot = new CompositeBudgetElement(0,
            "Ejecución de la Ley de Presupuestos",
            "Estructuración jerárquica de la ejecución de la ley de presupuesto de acuerdo a los clasificadores institucionales y presupuestarios.",
            BudgetElementType.EXECUTION, BudgetHierarchyLevel.ROOT);
        break;
      default:
        BudgetLawCsvFilesMerger.log.severe(
            "Can't perform the extraction because the elements' type is undefined:"
                + mergedElementsType.toString());
        throw new ExtractionException(
            "Can't perform the extraction because the elements' type is undefined:"
                + mergedElementsType.toString());
    }
    
    for (File child : directoryListing) {
      CSVReader reader = getReader(child);
      if (reader == null) {
        break;
      }
      List<String[]> lines;
      try {
        lines = reader.readAll();
      } catch (IOException e) {
        BudgetLawCsvFilesMerger.log.warning("Unable to read file contents");
        notMergedFiles.add(child.getName());
        e.printStackTrace();
        break;
      }
      List<BudgetLine> bLines = new ArrayList<>();
      for (String[] line : lines) {
        bLines.add(new BudgetLine(line));
      }
      
      switch (mergedElementsType) {
        case BUDGETARY_CLASSIFICATION:
          extractBudgetaryClassifiers(bLines);
          break;
        case INSTITUTIONAL_CLASSIFICATION:
          extractInstitutionalClassifiers(bLines);
          break;
        case BUDGET:
          extractBudgetLaw(bLines);
          break;
        case EXECUTION:
          extractBudgetExecution(bLines);
          break;
        default:
          BudgetLawCsvFilesMerger.log.severe(
              "Can't perform the extraction because the elements' type is undefined:"
                  + mergedElementsType.toString());
          throw new ExtractionException(
              "Can't perform the extraction because the elements' type is undefined:"
                  + mergedElementsType.toString());
      }
      mergedFiles.add(child.getName());
    }
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param lines
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_rqSTcFEPEeefZJp_ndvc2g"
  */
  private void extractBudgetExecution(List<BudgetLine> lines) {
    // begin-user-code
    Map<Integer, CompositeBudgetElement> institutionalClassifiers = new HashMap<>();
    // List<CompositeBuddgetElement> Institutions = getInstitutionsTree(BudgetElementType
    // mergedElementsType);
    
    for (BudgetLine bline : lines) {
      String[] line = bline.getLineContents();
      int batchNumber = 0;
      String s = line[0];
      if (s != null) {
        batchNumber = Integer.parseInt(s);
      }
      int chapterNumber = 0;
      s = line[1];
      if (s != null) {
        chapterNumber = Integer.parseInt(s);
      }
      int programNumber = 0;
      s = line[2];
      if (s != null) {
        programNumber = Integer.parseInt(s);
      }
      
      int subtitleNumber = 0;
      s = line[3];
      if (s != null) {
        subtitleNumber = Integer.parseInt(s);
      }
      
      int itemNumber = 0;
      s = line[4];
      if (s != null) {
        itemNumber = Integer.parseInt(s);
      }
      
      int assignmentNumber = 0;
      s = line[5];
      if (s != null) {
        assignmentNumber = Integer.parseInt(s);
      }
      
      String name = "";
      s = line[6];
      if (s != null) {
        name = s;
      }
      
      BigInteger initialBudget = BigInteger.ZERO;
      s = line[7];
      if (s != null) {
        initialBudget = BigInteger.valueOf(Long.valueOf(s));
      }
      
      BigInteger initialDollarBudget = BigInteger.ZERO;
      s = line[7];
      if (s != null) {
        initialDollarBudget = BigInteger.valueOf(Long.valueOf(s));
      }
      long initialBudgetLong = initialBudget.longValue();
      long initialDollarBudgetLong = initialDollarBudget.longValue();
      BudgetCurrency bc = ((initialBudgetLong >= 0)
          && (initialDollarBudgetLong == 0)) ? BudgetCurrency.PESO
              : ((initialBudgetLong == 0) && (initialDollarBudgetLong > 0))
                  ? BudgetCurrency.DOLLAR : BudgetCurrency.MIXED;
      
      CompositeBudgetElement batch = (CompositeBudgetElement) budgetElementRoot
          .getSubelement(batchNumber);
      CompositeBudgetElement chapter = (CompositeBudgetElement) batch
          .getSubelement(chapterNumber);
      CompositeBudgetElement program = (CompositeBudgetElement) chapter
          .getSubelement(programNumber);
      CompositeBudgetElement subtitle = (CompositeBudgetElement) program
          .getSubelement(subtitleNumber);
      
      if (assignmentNumber != 0) {
        CompositeBudgetElement item = (CompositeBudgetElement) subtitle
            .getSubelement(itemNumber);
        BudgetElement assignment = new BudgetElement(programNumber, name, "",
            mergedElementsType, BudgetHierarchyLevel.ASSIGNMENT);
        assignment.setCurrency(bc);
        assignment.setInitialBudget(initialBudget);
        assignment.setInitialDollarBudget(initialDollarBudget);
        item.addSubelement(assignment);
        break;
      }
      
      if ((assignmentNumber == 0) && (itemNumber != 0)) {
        
        BudgetElement item = new BudgetElement(programNumber, name, "",
            mergedElementsType, BudgetHierarchyLevel.ITEM);
        item.setInitialBudget(initialBudget);
        item.setInitialDollarBudget(initialDollarBudget);
        item.setCurrency(bc);
        subtitle.addSubelement(item);
        break;
      }
      
      if ((assignmentNumber == 0) && (itemNumber == 0)
          && (subtitleNumber != 0)) {
        subtitle.setInitialBudget(initialBudget);
        subtitle.setInitialBudget(initialDollarBudget);
        subtitle.setCurrency(bc);
        break;
      }
      
      if (batchNumber != 0) {
        budgetElementRoot.addSubelement(new CompositeBudgetElement(batchNumber,
            name, "", mergedElementsType, BudgetHierarchyLevel.BATCH));
      } else {
        BudgetLawCsvFilesMerger.log.warning("Unable to process line:"
            + line.toString() + " while extracting institutional classifiers.");
      }
    }
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param lines
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_updEwEylEeekuqvl4T6tsg"
  */
  private void extractBudgetLaw(List<BudgetLine> lines) {
    // begin-user-code
    // TODO Auto-generated method stub
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param lines
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_uprHMEylEeekuqvl4T6tsg"
  */
  private void extractInstitutionalClassifiers(List<BudgetLine> lines) {
    // begin-user-code
    Map<Integer, CompositeBudgetElement> institutionalClassifiers = new HashMap<>();
    for (BudgetLine bline : lines) {
      String[] line = bline.getLineContents();
      int batch = 0;
      String s = line[0];
      if (s != null) {
        batch = Integer.parseInt(s);
      }
      int chapter = 0;
      s = line[1];
      if (s != null) {
        chapter = Integer.parseInt(s);
      }
      int program = 0;
      s = line[2];
      if (s != null) {
        program = Integer.parseInt(s);
      }
      String name = "";
      s = line[3];
      if (s != null) {
        name = s;
      }
      String description = "";
      s = line[4];
      if (s != null) {
        description = s;
      }
      
      if (program != 0) {
        CompositeBudgetElement p = new CompositeBudgetElement(program, name,
            description, mergedElementsType, BudgetHierarchyLevel.PROGRAM);
        CompositeBudgetElement b = (CompositeBudgetElement) budgetElementRoot
            .getSubelement(batch);
        CompositeBudgetElement ch = (CompositeBudgetElement) b
            .getSubelement(chapter);
        ch.addSubelement(p);
        break;
      }
      
      if ((program == 0) && (chapter != 0)) {
        CompositeBudgetElement ch = new CompositeBudgetElement(chapter, name,
            description, mergedElementsType, BudgetHierarchyLevel.CHAPTER);
        CompositeBudgetElement b = (CompositeBudgetElement) budgetElementRoot
            .getSubelement(batch);
        b.addSubelement(ch);
        break;
      }
      
      if (batch != 0) {
        institutionalClassifiers.put(new Integer(batch),
            new CompositeBudgetElement(batch, name, description,
                mergedElementsType, BudgetHierarchyLevel.BATCH));
      } else {
        BudgetLawCsvFilesMerger.log.warning("Unable to process line:"
            + line.toString() + " while extracting institutional classifiers.");
      }
    }
    // return institutionalClassifiers.values();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param lines
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_up5wsEylEeekuqvl4T6tsg"
  */
  private void extractBudgetaryClassifiers(List<BudgetLine> lines) {
    // begin-user-code
    for (BudgetLine bline : lines) {
      String[] line = bline.getLineContents();
      int subtitle = 0;
      String s = line[0];
      if (s != null) {
        subtitle = Integer.parseInt(s);
      }
      int item = 0;
      s = line[1];
      if (s != null) {
        item = Integer.parseInt(s);
      }
      int assignment = 0;
      s = line[2];
      if (s != null) {
        assignment = Integer.parseInt(s);
      }
      String name = "";
      s = line[3];
      if (s != null) {
        name = s;
      }
      String description = "";
      s = line[4];
      if (s != null) {
        description = s;
      }
      
      if (assignment != 0) {
        BudgetElement a = new BudgetElement(assignment, name, description,
            mergedElementsType, BudgetHierarchyLevel.ASSIGNMENT);
        CompositeBudgetElement st = (CompositeBudgetElement) budgetElementRoot
            .getSubelement(subtitle);
        CompositeBudgetElement it = (CompositeBudgetElement) st
            .getSubelement(item);
        it.addSubelement(a);
        break;
      }
      
      if ((assignment == 0) && (item != 0)) {
        CompositeBudgetElement it = new CompositeBudgetElement(item, name,
            description, mergedElementsType, BudgetHierarchyLevel.ITEM);
        CompositeBudgetElement st = (CompositeBudgetElement) budgetElementRoot
            .getSubelement(subtitle);
        st.addSubelement(it);
        break;
      }
      
      if (subtitle != 0) {
        budgetElementRoot.addSubelement(
            new CompositeBudgetElement(subtitle, name, description,
                mergedElementsType, BudgetHierarchyLevel.SUBTITLE));
      } else {
        BudgetLawCsvFilesMerger.log.warning("Unable to process line:"
            + line.toString() + " while extracting budgetary classifiers.");
      }
    }
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param child
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_uqIaMEylEeekuqvl4T6tsg"
  */
  private CSVReader getReader(File child) {
    // begin-user-code
    FileInputStream fi = null;
    try {
      fi = new FileInputStream(child);
    } catch (FileNotFoundException e) {
      BudgetLawCsvFilesMerger.log
          .warning("Unable to download file" + child.getName());
      notMergedFiles.add(child.getName());
      e.printStackTrace();
      return null;
    }
    CSVReader reader = new CSVReader(new InputStreamReader(fi), ';', '"', 1);
    return reader;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_j-QS4EyQEeekuqvl4T6tsg"
  */
  public Collection<String> getMergedFiles() {
    // begin-user-code
    return mergedFiles;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_mJ0ykEyQEeekuqvl4T6tsg"
  */
  public Collection<String> getNotMergedFiles() {
    // begin-user-code
    return notMergedFiles;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_2sUiQEyVEeekuqvl4T6tsg"
  */
  public BudgetElementType getMergedElementsType() {
    // begin-user-code
    return mergedElementsType;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_sS95gFEOEeefZJp_ndvc2g"
  */
  @Override
  public void extract() throws ExtractionException {
    // begin-user-code
    merge();
    // end-user-code
  }
}