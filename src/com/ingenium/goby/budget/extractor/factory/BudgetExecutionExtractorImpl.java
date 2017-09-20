/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.factory;

import com.ingenium.commons.util.DownloadException;
import com.ingenium.goby.budget.extractor.crawl.BudgetExecutionCrawler;
import com.ingenium.goby.budget.extractor.download.BudgetCsvFilesDownloader;
import com.ingenium.goby.budget.extractor.extraction.ExtractionException;
import com.ingenium.goby.budget.extractor.model.BudgetElement;
import com.ingenium.goby.budget.extractor.model.BudgetExecution;
import com.ingenium.goby.budget.extractor.model.ExecutionPeriod;
import com.ingenium.goby.budget.extractor.factory.AbstractBudgetExtractor.Builder;
import com.ingenium.goby.budget.extractor.normalization.BulkBudgetExecutionCsvFilesNormalizer;

import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_Y1eMQGD3EeemUqxRur9fjQ"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Y1eMQGD3EeemUqxRur9fjQ"
 */
class BudgetExecutionExtractorImpl extends AbstractBudgetExtractor {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_XjRlwGEREeeMhLKRNTgRlA"
  */
  private BudgetExecution budgetExecution;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_paqT8J2fEee9jdUag7Rsng"
  */
  private static Logger log = Logger
      .getLogger(BudgetExecutionExtractorImpl.class.getCanonicalName());
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kgDnQGD7EeemUqxRur9fjQ"
  */
  public BudgetExecution extractBudgetExecution() {
    // begin-user-code
    this.budgetExecution = this
        .extractBudgetExecution(ExecutionPeriod.getCurrentPeriod(), false);
    return this.budgetExecution;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param force
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kgDnQWD7EeemUqxRur9fjQ"
  */
  public BudgetExecution extractBudgetExecution(final boolean force) {
    // begin-user-code
    this.budgetExecution = this
        .extractBudgetExecution(ExecutionPeriod.getCurrentPeriod(), force);
    return this.budgetExecution;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param period
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kgE1YGD7EeemUqxRur9fjQ"
  */
  public BudgetExecution extractBudgetExecution(final ExecutionPeriod period) {
    // begin-user-code
    this.budgetExecution = this.extractBudgetExecution(period, false);
    return this.budgetExecution;
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
    final String csvFilesDir = new StringBuilder("tmp").append(s)
        .append("execution-files").toString();
    filesDownloader.setDestination(csvFilesDir);
    filesDownloader
        .setDocumentsSource(crawler.getBudgetExecutionFilesBaseUrl());
    filesDownloader.setUseTimestamp(true);
    try {
      filesDownloader.download(executionFilesList);
    } catch (final DownloadException e) {
      BudgetExecutionExtractorImpl.log.severe("Unable to download files");
      BudgetExecutionExtractorImpl.log.severe(e.getMessage());
    }
    
    // Normalize the files. Budget Execution files have a header we don't need and a final row
    // that
    // is useless too
    final String timestampedDestination = filesDownloader
        .getTimestampedDestination();
    final String destinationFile = new StringBuilder(timestampedDestination)
        .append(s).append("out").append(s).append("budget-execution-")
        .append(period).append(this.getYear()).append(".csv").toString();
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
  * Creates a new instance of the class BudgetExecutionExtractorImpl.
  * @param builder
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_NNW60GEREeeMhLKRNTgRlA"
  */
  public BudgetExecutionExtractorImpl(final Builder builder) {
    // begin-user-code
    super(builder);
    
    this.budgetExecution = null;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_YCX2A53tEee9jdUag7Rsng"
  */
  @Override
  public BudgetElement extract() throws ExtractionException {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }
  
}