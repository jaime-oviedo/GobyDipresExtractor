/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extraction.download;

import com.ingenium.goby.extractors.ExtractorImpl;
import java.util.logging.Logger;
import java.util.Collection;
import com.ingenium.goby.extractors.ExtractionException;

/** 
 * <!-- begin-UML-doc -->
 * <p>This class extracts budget-related files from the Chilean Budget Directorate's website.</p>
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UaW6MEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UaW6MEquEeeJsdrfgQXeQw"
 */
class BudgetLawCsvFilesDownloader extends ExtractorImpl {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uhom4EquEeeJsdrfgQXeQw"
  */
  private static final Logger log = Logger.getLogger(
      "com.ingenium.goby.budget.extraction.BudgetLawCsvFilesDownloader");
  /** 
  * <!-- begin-UML-doc -->
  * <p>The URL where the files are stored.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhrqMEquEeeJsdrfgQXeQw"
  */
  private String documentsSource;
  /** 
  * <!-- begin-UML-doc -->
  * <p>A list of strings holding the name of the files to be downloaded.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uhv7oEquEeeJsdrfgQXeQw"
  */
  private Collection<String> budgetFileList;
  /** 
  * <!-- begin-UML-doc -->
  * <p>This flag indicates if a timestamp will be added to the base destination directory for each download batch.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_ZoXkIExDEeeo2IEzB8X7BA"
  */
  private boolean useTimestamp = new Boolean(true);
  /** 
  * <!-- begin-UML-doc -->
  * <p>A time stamp used to create the destination directory for the downloaded files.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_yNL2YExGEeeo2IEzB8X7BA"
  */
  private String tstamp;
  /** 
  * <!-- begin-UML-doc -->
  * <p>A list of files that were successfully downloaded by the extraction.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_qxM7EExIEeeo2IEzB8X7BA"
  */
  private Collection<String> downloadedFiles;
  /** 
  * <!-- begin-UML-doc -->
  * <p>A list of files that could not be downloaded.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_CGN5sExJEeeo2IEzB8X7BA"
  */
  private Collection<String> failedFiles;
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Creates a new file extractor that uses parameters obtained from a properties file.</p>
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase BudgetLawCsvFilesDownloader.
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_X82S8ExCEeeo2IEzB8X7BA"
  */
  public BudgetLawCsvFilesDownloader() {
    // begin-user-code
    // TODO Auto-generated constructor stub
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Creates a new file extractor that uses the given parameters as a source and destination.</p>
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase BudgetLawCsvFilesDownloader.
  * @param listSource <p>The location of the file that contains the list of CSVs to be downoladed.</p>
  * @param documentsSource <p>The URL of the files to be downloaded</p>
  * @param destinationFolder <p>the destination folder for the downloaded files</p>
  * @param useTimestamp <p>a flag to indicate if a time stamp should be appended to the destination folder</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uhxw0EquEeeJsdrfgQXeQw"
  */
  public BudgetLawCsvFilesDownloader(String listSource, String documentsSource,
      String destinationFolder, boolean useTimestamp) {
    // begin-user-code
    // TODO Auto-generated constructor stub
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Perform the extraction of the budget files.</p>
  * <!-- end-UML-doc -->
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhzmAEquEeeJsdrfgQXeQw"
  */
  public void extract() throws ExtractionException {
    // begin-user-code
    // TODO Auto-generated method stub
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the value of the timestamp usage flag.</p>
  * <!-- end-UML-doc -->
  * @return <p>true if a timestamp is to be appended to the base download directory, false otherwise</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_d_3v4ExDEeeo2IEzB8X7BA"
  */
  public boolean useTimestamp() {
    // begin-user-code
    // TODO Auto-generated method stub
    return false;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the value of the timestamp usage flag.</p>
  * <!-- end-UML-doc -->
  * @param flag <p>true if a timestamp is to be appended to the base download directory, false otherwise</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_i_kkEExDEeeo2IEzB8X7BA"
  */
  public void useTimestamp(boolean flag) {
    // begin-user-code
    // TODO Auto-generated method stub
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the URL of the files to be downloaded.</p>
  * <!-- end-UML-doc -->
  * @return <p>the URL of the files to be downloaded</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_kYkP8ExGEeeo2IEzB8X7BA"
  */
  public String getDocumentsSource() {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the URL where the files will be stored.</p>
  * <!-- end-UML-doc -->
  * @param documentsSource <p>the URL where the files will be stored.</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_lpoPMExGEeeo2IEzB8X7BA"
  */
  public void setDocumentsSource(String documentsSource) {
    // begin-user-code
    // TODO Auto-generated method stub
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the time stamp used to create the destination directory for the downloaded files.</p>
  * <!-- end-UML-doc -->
  * @return <p>time stamp used to create the destination directory for the downloaded files.</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_1ZJcEExGEeeo2IEzB8X7BA"
  */
  public String getTimestamp() {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the list of files that were successfully downloaded by the extraction.</p>
  * <!-- end-UML-doc -->
  * @return <p>the list of files that were successfully downloaded by the extraction.</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Hw49gExJEeeo2IEzB8X7BA"
  */
  public Collection<String> getDownloadedFiles() {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the list of files that could not be downloaded.</p>
  * <!-- end-UML-doc -->
  * @return <p>the list of files that could not be downloaded</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_JUnaEExJEeeo2IEzB8X7BA"
  */
  public Collection<String> getFailedFiles() {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }
}