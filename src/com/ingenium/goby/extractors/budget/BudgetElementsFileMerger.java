/**
 * 
 */
package com.ingenium.goby.extractors.budget;

import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.Extractor;
import com.ingenium.goby.extractors.ExtractorImpl;
import com.ingenium.goby.extractors.budget.elements.BudgetElement;
import com.ingenium.goby.extractors.budget.elements.BudgetElementType;
import com.ingenium.goby.extractors.budget.elements.BudgetHierarchyLevel;
import com.ingenium.goby.extractors.budget.elements.CompositeBudgetElement;
import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_xiP9AEyIEeekuqvl4T6tsg"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_xiP9AEyIEeekuqvl4T6tsg"
 */
public class BudgetElementsFileMerger extends ExtractorImpl {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_P727kEyQEeekuqvl4T6tsg"
  */
  private static final Logger log = Logger
      .getLogger("com.ingenium.goby.extractors.BudgetElementsFileMerger");
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
  private BudgetElementType mergedElementsType;

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_g8otQEyWEeekuqvl4T6tsg"
  */
  private CompositeBudgetElement budgetElementRoot;

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_-Y8QsEyKEeekuqvl4T6tsg"
  */
  public void BudgetElementFileMerger() {
    // begin-user-code
    setSource(Messages.getString("BudgetFileExtractor.destinationBasePath"));
    setDestination(
        Messages.getString("BudgetFileExtractor.destinationBasePath"));
    mergedElementsType = BudgetElementType.BUDGETARY_CLASSIFICATION;
    budgetElementRoot = null;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param sourceDirectory
  * @param outputFile
  * @param mergedElementsType
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_PGKRYEyKEeekuqvl4T6tsg"
  */
  public BudgetElementsFileMerger(String sourceDirectory, String outputFile,
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
    String sourcePath = this.getSource();
    File dir = new File(sourcePath);
    File[] directoryListing = dir.listFiles();

    if (directoryListing == null) {
      log.severe("The provided source URI does not point to a directory:"
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
      log.severe(
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
        log.warning("Unable to read file contents");
        notMergedFiles.add(child.getName());
        e.printStackTrace();
        break;
      }

      switch (mergedElementsType) {
      case BUDGETARY_CLASSIFICATION:
        extractBudgetaryClassifiers(lines);
        break;
      case INSTITUTIONAL_CLASSIFICATION:
        extractInstitutionalClassifiers(lines);
        break;
      case BUDGET:
        extractBudgetLaw(lines);
        break;
      case EXECUTION:
        extractBudgetExecution(lines);
        break;
      default:
        log.severe(
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

  private void extractBudgetExecution(List<String[]> lines) {
    // TODO Auto-generated method stub

  }

  private void extractBudgetLaw(List<String[]> lines) {
    // TODO Auto-generated method stub

  }

  private void extractInstitutionalClassifiers(List<String[]> lines) {
    for (String[] line : lines) {
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

      if (program == 0 && chapter != 0) {
        CompositeBudgetElement ch = new CompositeBudgetElement(chapter, name,
            description, mergedElementsType, BudgetHierarchyLevel.CHAPTER);
        CompositeBudgetElement b = (CompositeBudgetElement) budgetElementRoot
            .getSubelement(batch);
        b.addSubelement(ch);
        break;
      }

      if (batch != 0) {
        budgetElementRoot.addSubelement(new CompositeBudgetElement(batch, name,
            description, mergedElementsType, BudgetHierarchyLevel.BATCH));
      } else {
        log.warning("Unable to process line:" + line.toString()
            + " while extracting institutional classifiers.");
      }
    }

  }

  private void extractBudgetaryClassifiers(List<String[]> lines) {
    for (String[] line : lines) {
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

      if (assignment == 0 && item != 0) {
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
        log.warning("Unable to process line:" + line.toString()
            + " while extracting budgetary classifiers.");
      }
    }

  }

  private CSVReader getReader(File child) {
    FileInputStream fi = null;
    try {
      fi = new FileInputStream(child);
    } catch (FileNotFoundException e) {
      log.warning("Unable to download file" + child.getName());
      notMergedFiles.add(child.getName());
      e.printStackTrace();
      return null;
    }
    CSVReader reader = new CSVReader(new InputStreamReader(fi), ';', '"', 1);
    return reader;
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
  * @param type
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_71Fy4EyVEeekuqvl4T6tsg"
  */
  public void setMergedElementsType(BudgetElementType type) {
    // begin-user-code
    this.mergedElementsType = type;

    // end-user-code
  }

  /** 
  * (non-Javadoc)
  * @see Extractor#extract()
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfdcoEquEeeJsdrfgQXeQw?INHERITED"
  */
  @Override
  public void extract() throws ExtractionException {
    // begin-user-code
    merge();

    // end-user-code
  }
}