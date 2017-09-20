/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.factory;

import com.ingenium.goby.budget.extractor.extraction.BudgetExtractor;
import com.ingenium.goby.budget.extractor.model.ExecutionPeriod;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_iHsHgJ2dEee9jdUag7Rsng"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_iHsHgJ2dEee9jdUag7Rsng"
 */
@SuppressWarnings("rawtypes")
abstract class AbstractBudgetExtractor implements BudgetExtractor {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author Jaime Oviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_8NEDAJ2fEee9jdUag7Rsng"
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDAJ2fEee9jdUag7Rsng"
  */
  public static final class Builder {
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDBZ2fEee9jdUag7Rsng"
    */
    private boolean preserveDownloadedFiles;
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDCZ2fEee9jdUag7Rsng"
    */
    private ExecutionPeriod month = ExecutionPeriod.getCurrentPeriod();
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDC52fEee9jdUag7Rsng"
    */
    private int year = ExecutionPeriod.getCurrentYear();
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDDZ2fEee9jdUag7Rsng"
    */
    private boolean forceLocalProcessing;
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDEp2fEee9jdUag7Rsng"
    */
    private String localStageDirectory;
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDE52fEee9jdUag7Rsng"
    */
    private String localSourceDirectory;
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDFJ2fEee9jdUag7Rsng"
    */
    private boolean forceDownload;
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDFp2fEee9jdUag7Rsng"
    */
    private String inputEncoding = "UTF-8";
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * Creates a new instance of the class Builder.
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDIJ2fEee9jdUag7Rsng"
    */
    public Builder() {
      // begin-user-code
      final String yms = new StringBuilder(this.month.toString()).append("-")
          .append(String.valueOf(this.year)).append("-").toString();
      this.localStageDirectory = new StringBuilder(yms).append("stage")
          .toString();
      this.localSourceDirectory = new StringBuilder(yms).append("stage")
          .toString(); // Source is the same as stage so by default, a local extraction points to
                                                                                    // any previously existing stage of the same period
                                                                                        // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gHa8cJ3rEee9jdUag7Rsng"
    */
    public Builder forceDownload(final boolean val) {
      // begin-user-code
      this.forceDownload = val;
      return this;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gHbjg53rEee9jdUag7Rsng"
    */
    public Builder forceLocalProcessing(final boolean val) {
      // begin-user-code
      this.forceLocalProcessing = val;
      return this;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gHcKk53rEee9jdUag7Rsng"
    */
    public Builder inputEncoding(final String val) {
      // begin-user-code
      this.inputEncoding = val;
      return this;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gHcxo53rEee9jdUag7Rsng"
    */
    public Builder localSourceDirectory(final String val) {
      // begin-user-code
      this.localSourceDirectory = val;
      return this;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gHdYs53rEee9jdUag7Rsng"
    */
    public Builder localStageDirectory(final String val) {
      // begin-user-code
      this.localStageDirectory = val;
      return this;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gHem0J3rEee9jdUag7Rsng"
    */
    public Builder month(final ExecutionPeriod val) {
      // begin-user-code
      this.month = val;
      return this;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gHfN4p3rEee9jdUag7Rsng"
    */
    public Builder preserveDownloadedFiles(final boolean val) {
      // begin-user-code
      this.preserveDownloadedFiles = val;
      return this;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ogF3kJ3rEee9jdUag7Rsng"
    */
    public Builder year(final int val) {
      // begin-user-code
      this.year = val;
      return this;
      // end-user-code
    }
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29lZ2dEee9jdUag7Rsng"
  */
  private final boolean preserveDownloadedFiles;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29mZ2dEee9jdUag7Rsng"
  */
  private final ExecutionPeriod month;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29m52dEee9jdUag7Rsng"
  */
  private final int year;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29nZ2dEee9jdUag7Rsng"
  */
  private final boolean forceLocalProcessing;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29op2dEee9jdUag7Rsng"
  */
  private final String localStageDirectory;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29o52dEee9jdUag7Rsng"
  */
  private final String localSourceDirectory;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29pJ2dEee9jdUag7Rsng"
  */
  private final boolean forceDownload;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29pp2dEee9jdUag7Rsng"
  */
  private final String inputEncoding;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxo8sJ3nEee9jdUag7Rsng"
  */
  public boolean isPreserveDownloadedFiles() {
    // begin-user-code
    return this.preserveDownloadedFiles;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;month.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;month
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxqK0J3nEee9jdUag7Rsng"
  */
  public ExecutionPeriod getMonth() {
    // begin-user-code
    return this.month;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;year.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;year
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxqx4J3nEee9jdUag7Rsng"
  */
  public int getYear() {
    // begin-user-code
    return this.year;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;forceLocalProcessing.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;forceLocalProcessing
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxrY8p3nEee9jdUag7Rsng"
  */
  public boolean isForceLocalProcessing() {
    // begin-user-code
    return this.forceLocalProcessing;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;localStageDirectory.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;localStageDirectory
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxsnEJ3nEee9jdUag7Rsng"
  */
  public String getLocalStageDirectory() {
    // begin-user-code
    return this.localStageDirectory;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;localSourceDirectory.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;localSourceDirectory
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxtOIJ3nEee9jdUag7Rsng"
  */
  public String getLocalSourceDirectory() {
    // begin-user-code
    return this.localSourceDirectory;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;forceDownload.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;forceDownload
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxt1MZ3nEee9jdUag7Rsng"
  */
  public boolean isForceDownload() {
    // begin-user-code
    return this.forceDownload;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;inputEncoding.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;inputEncoding
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxucQp3nEee9jdUag7Rsng"
  */
  public String getInputEncoding() {
    // begin-user-code
    return this.inputEncoding;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class AbstractBudgetExtractor.
  * @param builder
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Liy24J2gEee9jdUag7Rsng"
  */
  public AbstractBudgetExtractor(final Builder builder) {
    // begin-user-code
    this.localStageDirectory = builder.localStageDirectory;
    this.forceDownload = builder.forceDownload;
    this.forceLocalProcessing = builder.forceLocalProcessing;
    this.inputEncoding = builder.inputEncoding;
    this.localSourceDirectory = builder.localSourceDirectory;
    this.month = builder.month;
    this.year = builder.year;
    this.preserveDownloadedFiles = builder.preserveDownloadedFiles;
    // end-user-code
  }
}