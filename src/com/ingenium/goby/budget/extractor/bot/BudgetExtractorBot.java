/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.bot;

import com.ingenium.goby.budget.extractor.model.ExecutionPeriod;

import java.util.Calendar;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_NpjAgJVnEeevpubR7V73Yw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_NpjAgJVnEeevpubR7V73Yw"
 */
public class BudgetExtractorBot {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author Jaime Oviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_kvFuMZWzEeevpubR7V73Yw"
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kvFuMZWzEeevpubR7V73Yw?DATATYPE"
  */
  public enum ExtractionType {
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kzj-gJWzEeevpubR7V73Yw"
    */
    BUDGETARY_CATALOG("BUDGETARY_CATALOG", null),
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kzj-gZWzEeevpubR7V73Yw"
    */
    INSTITUTIONAL_CATALOG("INSTITUTIONAL_CATALOG", null),
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kzklkJWzEeevpubR7V73Yw"
    */
    LAW("LAW", null),
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kzklkZWzEeevpubR7V73Yw"
    */
    EXECUTION("EXECUTION", null);
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qNnW0JmtEeeAWKInz3apng"
    */
    private String name;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qNn94JmtEeeAWKInz3apng"
    */
    private Object value;
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * Creates a new instance of the class ExtractionType.
    * @param enumName
    * @param enumValue
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qNuEgJmtEeeAWKInz3apng"
    */
    ExtractionType(String enumName, Object enumValue) {
      // begin-user-code
      // TODO Auto-generated constructor stub
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qNvSoJmtEeeAWKInz3apng"
    */
    public String getName() {
      // begin-user-code
      // TODO Auto-generated method stub
      return null;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qNv5sJmtEeeAWKInz3apng"
    */
    public Object getValue() {
      // begin-user-code
      // TODO Auto-generated method stub
      return null;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param enumValue
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qNwgwJmtEeeAWKInz3apng"
    */
    public static ExtractionType getEnumByValue(Object enumValue) {
      // begin-user-code
      // TODO Auto-generated method stub
      return null;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param enumName
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qNxH0ZmtEeeAWKInz3apng"
    */
    public static ExtractionType getEnumByName(String enumName) {
      // begin-user-code
      // TODO Auto-generated method stub
      return null;
      // end-user-code
    }
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author Jaime Oviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_ku1PgJWzEeevpubR7V73Yw"
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ku1PgJWzEeevpubR7V73Yw?DATATYPE"
  */
  public enum OuputFormat {
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kvhMAZWzEeevpubR7V73Yw"
    */
    HUMAN("HUMAN", null),
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kvhzEJWzEeevpubR7V73Yw"
    */
    CSV("CSV", null),
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kvhzEZWzEeevpubR7V73Yw"
    */
    JSON("JSON", null);
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qIrMcJmtEeeAWKInz3apng"
    */
    private String name;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qIrzgJmtEeeAWKInz3apng"
    */
    private Object value;
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * Creates a new instance of the class OuputFormat.
    * @param enumName
    * @param enumValue
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qIyhMJmtEeeAWKInz3apng"
    */
    OuputFormat(String enumName, Object enumValue) {
      // begin-user-code
      // TODO Auto-generated constructor stub
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qIzvUJmtEeeAWKInz3apng"
    */
    public String getName() {
      // begin-user-code
      // TODO Auto-generated method stub
      return null;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qI0WYJmtEeeAWKInz3apng"
    */
    public Object getValue() {
      // begin-user-code
      // TODO Auto-generated method stub
      return null;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param enumValue
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qI09cJmtEeeAWKInz3apng"
    */
    public static OuputFormat getEnumByValue(Object enumValue) {
      // begin-user-code
      // TODO Auto-generated method stub
      return null;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param enumName
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qI1kgZmtEeeAWKInz3apng"
    */
    public static OuputFormat getEnumByName(String enumName) {
      // begin-user-code
      // TODO Auto-generated method stub
      return null;
      // end-user-code
    }
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_xI3gkJWuEeevpubR7V73Yw"
  */
  private static Logger log = Logger
      .getLogger("com.ingenium.goby.budget.extractor.bot.BudgetExtractorBot");
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_fyB6IJW6EeevpubR7V73Yw"
  */
  private static Logger out = Logger
      .getLogger("com.ingenium.goby.budget.extractor.bot.BudgetExtractorBot");
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_LJY4oJWuEeevpubR7V73Yw"
  */
  private ExtractionType extractionType;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_NVSIcJWuEeevpubR7V73Yw"
  */
  private boolean preserveDownloaded;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Q29fcJWuEeevpubR7V73Yw"
  */
  private OuputFormat format;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_SSx9MJWuEeevpubR7V73Yw"
  */
  private String fileName;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_VwahsJWuEeevpubR7V73Yw"
  */
  private String directory;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_X6d-cJWuEeevpubR7V73Yw"
  */
  private boolean verbose;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_aRuJsJWuEeevpubR7V73Yw"
  */
  private ExecutionPeriod month;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_b_M_MJWuEeevpubR7V73Yw"
  */
  private int year;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_iTGmMJWuEeevpubR7V73Yw"
  */
  private boolean processLocal;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class BudgetExtractorBot.
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_k0UzgJWzEeevpubR7V73Yw"
  */
  public BudgetExtractorBot() {
    // begin-user-code
    extractionType = ExtractionType.EXECUTION;
    preserveDownloaded = false;
    format = OuputFormat.HUMAN;
    verbose = false;
    month = ExecutionPeriod.getCurrentPeriod();
    year = ExecutionPeriod.getCurrentYear();
    directory = "out";
    fileName = new StringBuilder("extractionResults-")
        .append(Calendar.getInstance().get(Calendar.DAY_OF_MONTH))
        .append(ExecutionPeriod.asInt(month)).append("-").append(year)
        .toString();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_uME-U5W5EeevpubR7V73Yw"
  */
  public void extract() {
    // begin-user-code
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_uMFlYZW5EeevpubR7V73Yw"
  */
  private void extractBudgetaryCatalog() {
    // begin-user-code
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_uME-VJW5EeevpubR7V73Yw"
  */
  private void extractExecution() {
    // begin-user-code
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_uMGMcJW5EeevpubR7V73Yw"
  */
  private void extractInstitutionalCatalog() {
    // begin-user-code
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_uMFlYJW5EeevpubR7V73Yw"
  */
  private void extractLaw() {
    // begin-user-code
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;directory.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;directory
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_k0cIQ5WzEeevpubR7V73Yw"
  */
  public String getDirectory() {
    // begin-user-code
    return directory;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Devuelve el valor del campo extractionType.</p>
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_k0VakJWzEeevpubR7V73Yw"
  */
  public ExtractionType getExtractionType() {
    // begin-user-code
    return extractionType;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;fileName.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;fileName
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_k0a6IJWzEeevpubR7V73Yw"
  */
  public String getFileName() {
    // begin-user-code
    return fileName;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Devuelve el valor del campo format.</p>
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_k0ZE8pWzEeevpubR7V73Yw"
  */
  public OuputFormat getFormat() {
    // begin-user-code
    return format;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;month.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;month
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_k0gZsJWzEeevpubR7V73Yw"
  */
  public ExecutionPeriod getMonth() {
    // begin-user-code
    return month;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;year.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;year
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_k0hn05WzEeevpubR7V73Yw"
  */
  public int getYear() {
    // begin-user-code
    return year;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Devuelve el valor del campo preserveDownloaded.</p>
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_k0XPwJWzEeevpubR7V73Yw"
  */
  public boolean isPreserveDownloaded() {
    // begin-user-code
    return preserveDownloaded;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;processLocal.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;processLocal
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_k0jdA5WzEeevpubR7V73Yw"
  */
  public boolean isProcessLocal() {
    // begin-user-code
    return processLocal;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;verbose.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;verbose
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_k0ekgpWzEeevpubR7V73Yw"
  */
  public boolean isVerbose() {
    // begin-user-code
    return verbose;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Establece&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;directory.<br><br>@param&nbsp;directory<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;nuevo&nbsp;valor&nbsp;del&nbsp;campo&nbsp;directory.
  * <!-- end-UML-doc -->
  * @param directory
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_k0dWYZWzEeevpubR7V73Yw"
  */
  public void setDirectory(final String directory) {
    // begin-user-code
    this.directory = directory;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Establece el valor del campo extractionType.</p>
  * <!-- end-UML-doc -->
  * @param extractionType
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_09BoUJWmEeevpubR7V73Yw"
  */
  public void setExtractionType(final ExtractionType extractionType) {
    // begin-user-code
    this.extractionType = extractionType;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Establece&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;fileName.<br><br>@param&nbsp;fileName<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;nuevo&nbsp;valor&nbsp;del&nbsp;campo&nbsp;fileName.
  * <!-- end-UML-doc -->
  * @param fileName
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_6YtN4JWmEeevpubR7V73Yw"
  */
  public void setFileName(final String fileName) {
    // begin-user-code
    this.fileName = fileName;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Establece&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;format.<br><br>@param&nbsp;format<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;nuevo&nbsp;valor&nbsp;del&nbsp;campo&nbsp;format.
  * <!-- end-UML-doc -->
  * @param format
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_3t3_UJWmEeevpubR7V73Yw"
  */
  public void setFormat(final OuputFormat format) {
    // begin-user-code
    this.format = format;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Establece&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;month.<br><br>@param&nbsp;month<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;nuevo&nbsp;valor&nbsp;del&nbsp;campo&nbsp;month.
  * <!-- end-UML-doc -->
  * @param month
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_DWDjYJWnEeevpubR7V73Yw"
  */
  public void setMonth(final ExecutionPeriod month) {
    // begin-user-code
    this.month = month;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Establece el valor del campo preserveDownloaded.</p>
  * <!-- end-UML-doc -->
  * @param preserveDownloaded
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_k0X20JWzEeevpubR7V73Yw"
  */
  public void setPreserveDownloaded(final boolean preserveDownloaded) {
    // begin-user-code
    this.preserveDownloaded = preserveDownloaded;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Establece&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;processLocal.<br><br>@param&nbsp;processLocal<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;nuevo&nbsp;valor&nbsp;del&nbsp;campo&nbsp;processLocal.
  * <!-- end-UML-doc -->
  * @param processLocal
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Emsr4JWnEeevpubR7V73Yw"
  */
  public void setProcessLocal(final boolean processLocal) {
    // begin-user-code
    this.processLocal = processLocal;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Establece&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;verbose.<br><br>@param&nbsp;verbose<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;nuevo&nbsp;valor&nbsp;del&nbsp;campo&nbsp;verbose.
  * <!-- end-UML-doc -->
  * @param verbose
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_AT4y4JWnEeevpubR7V73Yw"
  */
  public void setVerbose(final boolean verbose) {
    // begin-user-code
    this.verbose = verbose;
    // end-user-code
  };
  
  /** 
  * <!-- begin-UML-doc -->
  * Establece&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;year.<br><br>@param&nbsp;year<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;nuevo&nbsp;valor&nbsp;del&nbsp;campo&nbsp;year.
  * <!-- end-UML-doc -->
  * @param year
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ECnHYJWnEeevpubR7V73Yw"
  */
  public void setYear(final int year) {
    // begin-user-code
    this.year = year;
    // end-user-code
  };
}