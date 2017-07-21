/**
 *
 */

package com.ingenium.goby.budget.extractor;

import com.ingenium.commons.util.DownloadException;
import com.ingenium.goby.budget.extractor.crawl.BudgetExecutionCrawler;
import com.ingenium.goby.budget.extractor.download.BudgetCsvFilesDownloader;
import com.ingenium.goby.budget.extractor.normalization.BulkBudgetExecutionCsvFilesNormalizer;

import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_lgK9QGD3EeemUqxRur9fjQ"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lgK9QGD3EeemUqxRur9fjQ"
 */
public class BudgetExtractorFactory {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author JaimeRodrigo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_Y1eMQGD3EeemUqxRur9fjQ"
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Y1eMQGD3EeemUqxRur9fjQ"
  */
  public class BudgetExtractorImpl implements BudgetExtractor {
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Hd42kGEREeeMhLKRNTgRlA"
    */
    private BudgetLaw budgetLaw;
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_XjRlwGEREeeMhLKRNTgRlA"
    */
    private BudgetExecution budgetExecution;
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * Crea una nueva instancia de la clase BudgetExtractorImpl.
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_NNW60GEREeeMhLKRNTgRlA"
    */
    public BudgetExtractorImpl() {
      // begin-user-code
      super();
      this.budgetLaw = null;
      this.budgetExecution = null;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kgDnQGD7EeemUqxRur9fjQ"
    */
    @Override
    public BudgetExecution extractBudgetExecution() {
      // begin-user-code
      return this.extractBudgetExecution(ExecutionPeriod.getCurrentPeriod(),
          false);
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param force
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kgDnQWD7EeemUqxRur9fjQ"
    */
    @Override
    public BudgetExecution extractBudgetExecution(final boolean force) {
      // begin-user-code
      return this.extractBudgetExecution(ExecutionPeriod.getCurrentPeriod(),
          force);
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param period
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kgE1YGD7EeemUqxRur9fjQ"
    */
    @Override
    public BudgetExecution extractBudgetExecution(
        final ExecutionPeriod period) {
      // begin-user-code
      return this.extractBudgetExecution(period, false);
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param period
    * @param force
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kgFccGD7EeemUqxRur9fjQ"
    */
    @Override
    public BudgetExecution extractBudgetExecution(final ExecutionPeriod period,
        final boolean force) {
      // begin-user-code
      boolean doForce = force;
      if (this.budgetExecution == null) {
        doForce = true;
      }
      
      if (!doForce) {
        return this.budgetExecution;
      }
      
      final String s = File.separator;
      // Get the csv files listing
      final BudgetExecutionCrawler crawler = new BudgetExecutionCrawler();
      final List<String> executionFilesList = crawler
          .crawlAndFetchExecutionFilesList(
              Calendar.getInstance().get(Calendar.YEAR), period);
      
      // Download all files from the fetched listing
      final BudgetCsvFilesDownloader filesDownloader = new BudgetCsvFilesDownloader();
      final String csvFilesDir = new StringBuffer("tmp").append(s)
          .append("execution-files").toString();
      filesDownloader.setDestination(csvFilesDir);
      filesDownloader
          .setDocumentsSource(crawler.getBudgetExecutionFilesBaseUrl());
      filesDownloader.setUseTimestamp(true);
      try {
        filesDownloader.download(executionFilesList);
      } catch (final DownloadException e) {
        BudgetExtractorFactory.log.severe("Unable to download files");
        BudgetExtractorFactory.log.severe(e.getMessage());
      }
      
      // Normalize the files. Budget Execution files has a header we don't need and a final row that
      // is useless too
      final String timestampedDestination = filesDownloader
          .getTimestampedDestination();
      final String destinationFile = new StringBuffer(timestampedDestination)
          .append(s).append("out").append(s).append("budget-execution-")
          .append(period).append(BudgetExtractorFactory.this.year)
          .append(".csv").toString();
      BulkBudgetExecutionCsvFilesNormalizer.normalize(timestampedDestination,
          destinationFile);
      
      // Extract the budget from the merged file
      final BudgetExecutionFactory executionFactory = BudgetExecutionFactory
          .getInstance();
      executionFactory.setSource(destinationFile);
      this.budgetExecution = executionFactory.getBudgetExecution();
      return this.budgetExecution;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kgCZIGD7EeemUqxRur9fjQ"
    */
    @Override
    public BudgetLaw extractBudgetLaw() {
      // begin-user-code
      if (this.budgetLaw != null) {
        return this.budgetLaw;
      }
      
      return this.extractBudgetLaw(true);
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param force
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kgCZIWD7EeemUqxRur9fjQ"
    */
    @Override
    public BudgetLaw extractBudgetLaw(final boolean force) {
      // begin-user-code
      final BudgetLawFactory blf = BudgetLawFactory.getInstance();
      final BudgetLaw law = blf.getBudgetLaw(force);
      return law;
      
      // end-user-code
    }
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_sd_D8GD3EeemUqxRur9fjQ"
  */
  private static BudgetExtractorFactory instance = null;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ST6wsGEsEeeMhLKRNTgRlA"
  */
  private static final Logger log = Logger
      .getLogger("com.ingenium.goby.budget.extractor.BudgetExtractorFactory");
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_eZPcMGEKEeeMhLKRNTgRlA"
  */
  public static BudgetExtractorFactory getInstance() {
    // begin-user-code
    if (BudgetExtractorFactory.instance != null) {
      return BudgetExtractorFactory.instance;
    }
    BudgetExtractorFactory.instance = new BudgetExtractorFactory();
    return BudgetExtractorFactory.instance;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Yq8ukGEIEeemUqxRur9fjQ"
  */
  private final BudgetExtractor budgetExtractor;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_39S2gGEQEeeMhLKRNTgRlA"
  */
  private int year;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_46WUoGEQEeeMhLKRNTgRlA"
  */
  private ExecutionPeriod period;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase BudgetExtractorFactory.
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_PznhgGEIEeemUqxRur9fjQ"
  */
  private BudgetExtractorFactory() {
    // begin-user-code
    super();
    this.budgetExtractor = new BudgetExtractorImpl();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_V21BIGEIEeemUqxRur9fjQ"
  */
  public BudgetExtractor getBudgetExtractor() {
    // begin-user-code
    return this.budgetExtractor;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_HNHsIGEQEeeMhLKRNTgRlA"
  */
  public ExecutionPeriod getPeriod() {
    // begin-user-code
    return this.period;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_OkHH0GEQEeeMhLKRNTgRlA"
  */
  public int getYear() {
    // begin-user-code
    return this.year;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param newPeriod
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_FZTlIGEQEeeMhLKRNTgRlA"
  */
  public void setPeriod(final ExecutionPeriod newPeriod) {
    // begin-user-code
    this.period = newPeriod;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param newYear
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Q7sqQGEQEeeMhLKRNTgRlA"
  */
  public void setYear(final int newYear) {
    // begin-user-code
    this.year = newYear;
    // end-user-code
  }
}