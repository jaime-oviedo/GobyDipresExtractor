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
import com.ingenium.goby.budget.extractor.normalization.BulkBudgetExecutionCsvFilesNormalizer;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 *
 * @author Jaime Oviedo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_Y1eMQGD3EeemUqxRur9fjQ"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Y1eMQGD3EeemUqxRur9fjQ"
 */
class BudgetExecutionExtractorImpl extends AbstractBudgetExtractor {

  public static class Builder extends AbstractBudgetExtractor.Builder {

    public BudgetExecutionExtractorImpl build() {
      return new BudgetExecutionExtractorImpl(this);
    }

    /*
     * (non-Javadoc)
     *
     * @see Builder#forceDownload(boolean)
     */
    @Override
    public Builder forceDownload(boolean val) {
      return (Builder) super.forceDownload(val);
    }

    /*
     * (non-Javadoc)
     *
     * @see Builder#forceLocalProcessing(boolean)
     */
    @Override
    public Builder forceLocalProcessing(boolean val) {
      return (Builder) super.forceLocalProcessing(val);
    }

    /*
     * (non-Javadoc)
     *
     * @see Builder#inputEncoding(java.lang.String)
     */
    @Override
    public Builder inputEncoding(String val) {
      return (Builder) super.inputEncoding(val);
    }

    /*
     * (non-Javadoc)
     *
     * @see Builder#localSourceDirectory(java.lang.String)
     */
    @Override
    public Builder localSourceDirectory(String val) {
      return (Builder) super.localSourceDirectory(val);
    }

    /*
     * (non-Javadoc)
     *
     * @see Builder#localStageDirectory(java.lang.String)
     */
    @Override
    public Builder localStageDirectory(String val) {
      return (Builder) super.localStageDirectory(val);
    }

    /*
     * (non-Javadoc)
     *
     * @see Builder#month(com.ingenium.goby.budget.extractor.model.ExecutionPeriod)
     */
    @Override
    public Builder month(ExecutionPeriod val) {
      return (Builder) super.month(val);
    }

    /*
     * (non-Javadoc)
     *
     * @see Builder#preserveDownloadedFiles(boolean)
     */
    @Override
    public Builder preserveDownloadedFiles(boolean val) {
      return (Builder) super.preserveDownloadedFiles(val);
    }

    /*
     * (non-Javadoc)
     *
     * @see Builder#year(int)
     */
    @Override
    public Builder year(int val) {
      return (Builder) super.year(val);
    }

  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_paqT8J2fEee9jdUag7Rsng"
   */
  private static Logger log = Logger
      .getLogger(BudgetExecutionExtractorImpl.class.getCanonicalName());

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_XjRlwGEREeeMhLKRNTgRlA"
   */
  private BudgetExecution budgetExecution;

  private BudgetExecutionExtractorImpl(final Builder builder) {
    // begin-user-code
    super();
    setForceDownload(builder.isForceDownload());
    setForceLocalProcessing(builder.isForceLocalProcessing());
    setInputEncoding(builder.getInputEncoding());
    setLocalSourceDirectory(builder.getLocalSourceDirectory());
    setLocalStageDirectory(builder.getLocalStageDirectory());
    setMonth(builder.getMonth());
    setPreserveDownloadedFiles(builder.isPreserveDownloadedFiles());
    setYear(builder.getYear());
    budgetExecution = null;
    // end-user-code
  }

  private void cleanup() {
    // Only cleanup the type of files produced here, namely cvs and json files
    File stageDirectory = new File(getLocalStageDirectory());
    File sourceDirectory = new File(getLocalSourceDirectory());
    FileUtils.deleteQuietly(sourceDirectory);
    FileUtils.deleteQuietly(stageDirectory);
  }

  private void crawlAndDownload() {
    // Get the csv files listing
    final BudgetExecutionCrawler crawler = new BudgetExecutionCrawler();
    final List<String> executionFilesList = crawler
        .crawlAndFetchExecutionFilesList(getYear(), getMonth());

    // Download all files from the fetched listing
    final BudgetCsvFilesDownloader filesDownloader = new BudgetCsvFilesDownloader();
    final String localStageDirectory = getLocalStageDirectory();
    filesDownloader.setDestination(localStageDirectory);
    filesDownloader
        .setDocumentsSource(crawler.getBudgetExecutionFilesBaseUrl());
    // filesDownloader.setUseTimestamp(true);
    try {
      filesDownloader.download(executionFilesList);
    } catch (final DownloadException e) {
      BudgetExecutionExtractorImpl.log.severe("Unable to download files");
      BudgetExecutionExtractorImpl.log.severe(e.getMessage());
    }
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @return
   * @throws ExtractionException
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_YCX2A53tEee9jdUag7Rsng"
   */
  @Override
  public BudgetElement extract() throws ExtractionException {
    // begin-user-code
    boolean forceDownload = isForceDownload();
    boolean forceLocalProcessing = isForceLocalProcessing();
    if (forceDownload && forceLocalProcessing) {
      throw new RuntimeException(
          "Conflicting directives, cannot force download and force local processing at the same time.");
    }

    if (budgetExecution == null) {
      forceDownload = true;
    }

    if (!forceDownload) {
      return (BudgetElement) budgetExecution;
    }

    // Unless there is forced local processing, delete any previously existing files
    cleanup();

    // Normalize the files. Budget Execution files have a header we don't need and a final row
    // that
    // is useless too
    /**
     * The following code assumed timestamped destinations, which were discontinued after creating
     * builders
     **/
    // final String timestampedDestination = filesDownloader
    // .getTimestampedDestination();
    // final String destinationFile = new StringBuilder(timestampedDestination)
    // .append(s).append("out").append(s).append("budget-execution-")
    // .append(getMonth()).append(getYear()).append(".csv").toString();
    // BulkBudgetExecutionCsvFilesNormalizer.normalize(timestampedDestination,
    // destinationFile);

    String mergeSourceDirectory = null;
    if (forceLocalProcessing) {
      mergeSourceDirectory = getLocalSourceDirectory();
    } else {
      crawlAndDownload();
      mergeSourceDirectory = getLocalStageDirectory();
    }

    // Merge downloaded files

    String s = File.separator;
    final String mergedFile = new StringBuilder(mergeSourceDirectory).append(s)
        .append("merged").append(s).append("merged-budget-execution-")
        .append(getMonth()).append(getYear()).append(".csv").toString();
    BulkBudgetExecutionCsvFilesNormalizer.normalize(mergeSourceDirectory,
        mergedFile);

    // Extract the budget from the merged file
    final BudgetExecutionFactory executionFactory = BudgetExecutionFactory
        .getInstance();
    executionFactory.setSource(mergedFile);
    budgetExecution = executionFactory.getBudgetExecution();

    // Cleanup
    if (!isPreserveDownloadedFiles()) {
      cleanup();
    }

    return (BudgetElement) budgetExecution;
    // end-user-code
  }
}