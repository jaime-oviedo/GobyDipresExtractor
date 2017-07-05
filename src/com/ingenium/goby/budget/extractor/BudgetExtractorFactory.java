/**
 *
 */
package com.ingenium.goby.budget.extractor;

import com.ingenium.commons.util.BulkCsvFilesMerger;
import com.ingenium.commons.util.DownloadException;
import com.ingenium.goby.budget.extractor.crawl.BudgetExecutionCrawler;
import com.ingenium.goby.budget.extractor.download.BudgetCsvFilesDownloader;

import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_lgK9QGD3EeemUqxRur9fjQ"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lgK9QGD3EeemUqxRur9fjQ"
 */
public class BudgetExtractorFactory {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author joviedo
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
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_NNW60GEREeeMhLKRNTgRlA"
    */
    public BudgetExtractorImpl() {
      // begin-user-code
      super();
      budgetLaw = null;
      budgetExecution = null;
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
      return extractBudgetExecution(ExecutionPeriod.getCurrentPeriod(), false);
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
    public BudgetExecution extractBudgetExecution(boolean force) {
      // begin-user-code
      return extractBudgetExecution(ExecutionPeriod.getCurrentPeriod(), force);
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
    public BudgetExecution extractBudgetExecution(ExecutionPeriod period) {
      // begin-user-code
      return extractBudgetExecution(period, false);
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
    public BudgetExecution extractBudgetExecution(ExecutionPeriod period,
        boolean force) {
      // begin-user-code
      if (budgetExecution == null) {
        force = true;
      }

      if (!force) {
        return budgetExecution;
      }

      // Get the csv files
      final BudgetExecutionCrawler crawler = new BudgetExecutionCrawler();
      final List<String> executionFilesList = crawler.findExecutionFiles(
          Calendar.getInstance().get(Calendar.YEAR), period);
      final BudgetCsvFilesDownloader filesDownloader = new BudgetCsvFilesDownloader();
      final String csvFilesDir = new StringBuffer("tmp").append(File.separator)
          .append("execution-files").toString();
      filesDownloader.setDestination(csvFilesDir);
      filesDownloader
          .setDocumentsSource(crawler.getBudgetExecutionFilesBaseUrl());
      try {
        filesDownloader.download(executionFilesList);
      } catch (final DownloadException e) {
        log.severe("Unable to download files");
        log.severe(e.getMessage());
      }

      // Merge the files into one
      final String mergeDestinationDir = csvFilesDir + File.separator + "out";
      final String mergeDestinationFile = "budget-execution" + period + year
          + ".csv";
      BulkCsvFilesMerger.merge(csvFilesDir, mergeDestinationDir,
          mergeDestinationFile, 1);

      // Extract the budget from the merged file
      final BudgetExecutionFactory executionFactory = BudgetExecutionFactory
          .getInstance();
      final String executionSource = mergeDestinationDir + File.separator
          + mergeDestinationFile;
      executionFactory.setSource(executionSource);
      budgetExecution = executionFactory.getBudgetExecution();
      return budgetExecution;
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
      if (budgetLaw != null) {
        return budgetLaw;
      }

      return extractBudgetLaw(true);
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
    public BudgetLaw extractBudgetLaw(boolean force) {
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
    if (instance != null) {
      return instance;
    }
    instance = new BudgetExtractorFactory();
    return instance;
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
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_PznhgGEIEeemUqxRur9fjQ"
  */
  private BudgetExtractorFactory() {
    // begin-user-code
    super();
    budgetExtractor = new BudgetExtractorImpl();
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
    return budgetExtractor;
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
    return period;
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
    return year;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param newPeriod
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_FZTlIGEQEeeMhLKRNTgRlA"
  */
  public void setPeriod(ExecutionPeriod newPeriod) {
    // begin-user-code
    period = newPeriod;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param newYear
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Q7sqQGEQEeeMhLKRNTgRlA"
  */
  public void setYear(int newYear) {
    // begin-user-code
    year = newYear;
    // end-user-code
  }
}