/**
 *
 */

package com.ingenium.goby.budget.extraction.merge;

import com.ingenium.commons.util.BulkCsvFilesMerger;
import com.ingenium.commons.util.DownloadException;
import com.ingenium.goby.budget.Messages;

import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_xiP9AEyIEeekuqvl4T6tsg"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_xiP9AEyIEeekuqvl4T6tsg"
 */
public class BudgetLawCsvFilesMerger {
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
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_J4m98F0eEeez8bHvvwz5bA"
  */
  private String sourceDirectoryPath;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_MhN-8F0eEeez8bHvvwz5bA"
  */
  private String outputFileName;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_SAjVcF0eEeez8bHvvwz5bA"
  */
  private String destinationDirectoryPath;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase BudgetLawCsvFilesMerger.
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_jVGUgF0gEeez8bHvvwz5bA"
  */
  public BudgetLawCsvFilesMerger() {
    // begin-user-code
    this(Messages.getString("BudgetLawCsvFilesMerger.sourceDirectoryPath"),
        Messages.getString("BudgetLawCsvFilesMerger.destinationDirectoryPath"),
        Messages.getString("BudgetLawCsvFilesMerger.outputFileName"));
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase BudgetLawCsvFilesMerger.
  * @param newSourceDirectoryPath
  * @param newDestinationDirectoryPath
  * @param newOutputFileName
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_PGKRYEyKEeekuqvl4T6tsg"
  */
  public BudgetLawCsvFilesMerger(String newSourceDirectoryPath,
      String newDestinationDirectoryPath, String newOutputFileName) {
    // begin-user-code
    sourceDirectoryPath = newSourceDirectoryPath;
    destinationDirectoryPath = newDestinationDirectoryPath;
    outputFileName = newOutputFileName;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @throws DownloadException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_BRcu4EyLEeekuqvl4T6tsg"
  */
  public void merge() throws DownloadException {
    // begin-user-code
    BulkCsvFilesMerger.merge(sourceDirectoryPath, destinationDirectoryPath,
        outputFileName, 1);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_foz64F0eEeez8bHvvwz5bA"
  */
  public String getDestinationDirectoryPath() {
    // begin-user-code
    return destinationDirectoryPath;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_hLt4EF0eEeez8bHvvwz5bA"
  */
  public String getOutputFileName() {
    // begin-user-code
    return outputFileName;
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_tgh4oF0eEeez8bHvvwz5bA"
  */
  public String getSourceDirectoryPath() {
    // begin-user-code
    return sourceDirectoryPath;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param newPath
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_vGnssF0eEeez8bHvvwz5bA"
  */
  public void setDestinationDirectoryPath(String newPath) {
    // begin-user-code
    destinationDirectoryPath = newPath;
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param newName
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_xrA8EF0eEeez8bHvvwz5bA"
  */
  public void setOutputFileName(String newName) {
    // begin-user-code
    outputFileName = newName;
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param newPath
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0e9qYF0eEeez8bHvvwz5bA"
  */
  public void setSourceDirectoryPath(String newPath) {
    // begin-user-code
    sourceDirectoryPath = newPath;
    // end-user-code
  }
}