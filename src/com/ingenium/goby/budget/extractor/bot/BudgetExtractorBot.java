/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.bot;

import com.ingenium.goby.budget.extractor.extraction.BudgetExtractor;
import com.ingenium.goby.budget.extractor.extraction.ExtractionException;
import com.ingenium.goby.budget.extractor.factory.BudgetExtractorFactory;
import com.ingenium.goby.budget.extractor.injection.BudgetInjector;
import com.ingenium.goby.budget.extractor.injection.InjectionException;
import com.ingenium.goby.budget.extractor.model.BudgetElement;
import com.ingenium.goby.budget.extractor.model.ExecutionPeriod;

import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_NpjAgJVnEeevpubR7V73Yw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_NpjAgJVnEeevpubR7V73Yw"
 */
public class BudgetExtractorBot implements BudgetExtractor {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author Jaime Oviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_9ZIhkJv_EeeKKp-m4AD7KQ"
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_9ZIhkJv_EeeKKp-m4AD7KQ"
  */
  public static final class Builder {
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_TsFXgJwGEeeKKp-m4AD7KQ"
    */
    private ExtractionType extractionType = ExtractionType.EXECUTION;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_TsFXgZwGEeeKKp-m4AD7KQ"
    */
    private boolean preserveDownloadedFiles;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_TsFXgpwGEeeKKp-m4AD7KQ"
    */
    private OuputFormat outputFormat = OuputFormat.HUMAN;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_TsF-kJwGEeeKKp-m4AD7KQ"
    */
    private String outputFileName;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_TsF-kZwGEeeKKp-m4AD7KQ"
    */
    private String outputDirectory;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_TsGloJwGEeeKKp-m4AD7KQ"
    */
    private boolean verbose = new Boolean(false);
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_TsGloZwGEeeKKp-m4AD7KQ"
    */
    private ExecutionPeriod month = ExecutionPeriod.getCurrentPeriod();
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_TsGlopwGEeeKKp-m4AD7KQ"
    */
    private int year = ExecutionPeriod.getCurrentYear();
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_TsHMsJwGEeeKKp-m4AD7KQ"
    */
    private boolean forceLocalProcessing = new Boolean(false);
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_GuIzAJwJEeeKKp-m4AD7KQ"
    */
    private final BudgetExtractor budgetExtractor;
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_q16VoJwNEeeKKp-m4AD7KQ"
    */
    private String localStageDirectory;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_q168sJwNEeeKKp-m4AD7KQ"
    */
    private String localSourceDirectory;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_q168sZwNEeeKKp-m4AD7KQ"
    */
    private boolean forceDownload = new Boolean(false);
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_0N-nMJ2MEee9jdUag7Rsng"
    */
    private String inputEncoding = "UTF-8";
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_VqIlUJwWEeeKKp-m4AD7KQ"
    */
    private String outputEncoding = "UTF-8";
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * Creates a new instance of the class Builder.
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_eYZX8JwAEeeKKp-m4AD7KQ"
    */
    public Builder() {
      // begin-user-code
      final BudgetExtractorFactory bef = BudgetExtractorFactory.getInstance();
      final String yms = new StringBuilder(this.month.toString()).append("-")
          .append(String.valueOf(this.year)).append("-").toString();
      this.outputFileName = new StringBuilder(this.outputFormat.toString())
          .append("-").append(yms).append(this.outputFormat.getFileExtension())
          .toString();
      this.outputDirectory = new StringBuilder(yms).append("out").toString();
      this.localStageDirectory = new StringBuilder(yms).append("stage")
          .toString();
      this.localSourceDirectory = new StringBuilder(yms).append("stage")
          .toString(); // Source is the same as stage so by default, a local extraction points to
                                                                                    // any previously existing stage of the same period
      this.budgetExtractor = null; // TODO FIX this
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kxV3AJwAEeeKKp-m4AD7KQ"
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
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_skK6IJwAEeeKKp-m4AD7KQ"
    */
    public Builder outputformat(final OuputFormat val) {
      // begin-user-code
      this.outputFormat = val;
      return this;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yGHfwJwAEeeKKp-m4AD7KQ"
    */
    public Builder outputFileName(final String val) {
      // begin-user-code
      this.outputFileName = val;
      return this;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_2R1SQJwAEeeKKp-m4AD7KQ"
    */
    public Builder outputDirectory(final String val) {
      // begin-user-code
      this.outputDirectory = val;
      return this;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_5OURgJwAEeeKKp-m4AD7KQ"
    */
    public Builder verbose(final boolean val) {
      // begin-user-code
      this.verbose = val;
      return this;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8KknQJwAEeeKKp-m4AD7KQ"
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
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#__RAzwJwAEeeKKp-m4AD7KQ"
    */
    public Builder year(final int val) {
      // begin-user-code
      this.year = val;
      return this;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_AzR3wJwBEeeKKp-m4AD7KQ"
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
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Dc4XQJwBEeeKKp-m4AD7KQ"
    */
    public BudgetExtractorBot build() {
      // begin-user-code
      return new BudgetExtractorBot(this);
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lB0pYJwIEeeKKp-m4AD7KQ"
    */
    public Builder extractionType(final ExtractionType val) {
      // begin-user-code
      this.extractionType = val;
      return this;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_uXatgJwNEeeKKp-m4AD7KQ"
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
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_xGoFwJwNEeeKKp-m4AD7KQ"
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
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_zOd8AJwNEeeKKp-m4AD7KQ"
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
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_WvGCQJwWEeeKKp-m4AD7KQ"
    */
    public Builder outputEncoding(final String val) {
      // begin-user-code
      this.outputEncoding = val;
      return this;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param val
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_S6CE0J2NEee9jdUag7Rsng"
    */
    public Builder inputEncoding(final String val) {
      // begin-user-code
      this.inputEncoding = val;
      return this;
      // end-user-code
    }
  }
  
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
    BUDGETARY_CATALOG,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kzj-gZWzEeevpubR7V73Yw"
    */
    INSTITUTIONAL_CATALOG,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kzklkJWzEeevpubR7V73Yw"
    */
    LAW,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kzklkZWzEeevpubR7V73Yw"
    */
    EXECUTION;
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_EhqToJ3mEee9jdUag7Rsng"
    */
    @Override
    public String toString() {
      // begin-user-code
      String stringRep = super.toString();
      switch (this) {
        case BUDGETARY_CATALOG:
          stringRep = "catalogo_presupuestario";
          break;
        case INSTITUTIONAL_CATALOG:
          stringRep = "catalogo_institucional";
          break;
        case LAW:
          stringRep = "ley";
          break;
        case EXECUTION:
          stringRep = "ejecución";
          break;
      }
      return stringRep;
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
    HUMAN,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kvhzEJWzEeevpubR7V73Yw"
    */
    CSV,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kvhzEZWzEeevpubR7V73Yw"
    */
    JSON;
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_EddJEJ3mEee9jdUag7Rsng"
    */
    public String getFileExtension() {
      // begin-user-code
      switch (this) {
        case JSON:
          return ".json";
        default:
          return ".csv";
      }
      // end-user-code
    }
    
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_xI3gkJWuEeevpubR7V73Yw"
  */
  private static final Logger log = Logger
      .getLogger(BudgetExtractorBot.class.getCanonicalName());
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_fyB6IJW6EeevpubR7V73Yw"
  */
  private static final Logger out = Logger
      .getLogger(BudgetExtractorBot.class.getCanonicalName());
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Ig-iIJ2UEee9jdUag7Rsng"
  */
  private BudgetInjector budgetInjector;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_I_axoJ2UEee9jdUag7Rsng"
  */
  private BudgetExtractor budgetExtractor;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_X6d-cJWuEeevpubR7V73Yw"
  */
  private final boolean verbose;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class BudgetExtractorBot.
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_k0UzgJWzEeevpubR7V73Yw"
  */
  private BudgetExtractorBot() {
    // begin-user-code
    this(new Builder());
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class BudgetExtractorBot.
  * @param builder
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lcTGQJwFEeeKKp-m4AD7KQ"
  */
  public BudgetExtractorBot(final Builder builder) {
    // begin-user-code
    this.verbose = builder.verbose;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_WVYJUZ2YEee9jdUag7Rsng"
  */
  @Override
  public BudgetElement extract() throws ExtractionException {
    // begin-user-code
    final BudgetElement extractedElement = this.budgetExtractor.extract();
    try {
      this.budgetInjector.inject(extractedElement);
    } catch (final InjectionException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return extractedElement;
    // end-user-code
  }
  
}