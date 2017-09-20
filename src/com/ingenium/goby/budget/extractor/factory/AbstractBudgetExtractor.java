/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.factory;

import com.ingenium.goby.budget.extractor.extraction.BudgetExtractor;
import com.ingenium.goby.budget.extractor.model.ExecutionPeriod;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 *
 * @author Jaime Oviedo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_iHsHgJ2dEee9jdUag7Rsng"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_iHsHgJ2dEee9jdUag7Rsng"
 */
abstract class AbstractBudgetExtractor implements BudgetExtractor {

  public static class Builder {

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDBZ2fEee9jdUag7Rsng"
     */
    private boolean preserveDownloadedFiles;

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDCZ2fEee9jdUag7Rsng"
     */
    private ExecutionPeriod month = ExecutionPeriod.getCurrentPeriod();

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDC52fEee9jdUag7Rsng"
     */
    private int year = ExecutionPeriod.getCurrentYear();

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDDZ2fEee9jdUag7Rsng"
     */
    private boolean forceLocalProcessing;

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDEp2fEee9jdUag7Rsng"
     */
    private String localStageDirectory;

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDE52fEee9jdUag7Rsng"
     */
    private String localSourceDirectory;

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDFJ2fEee9jdUag7Rsng"
     */
    private boolean forceDownload;

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDFp2fEee9jdUag7Rsng"
     */
    private String inputEncoding = "UTF-8";

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc --> Creates a new instance of the class Builder.
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8NEDIJ2fEee9jdUag7Rsng"
     */
    public Builder() {
      // begin-user-code
      final String yms = new StringBuilder(month.toString()).append("-")
          .append(String.valueOf(year)).append("-").toString();
      localStageDirectory = new StringBuilder(yms).append("stage").toString();
      localSourceDirectory = new StringBuilder(yms).append("stage")
          .toString(); /**
                        * Source is the same as stage so,by default, a local extraction points to
                        * any previously existing stage of the same period
                        **/
      // end-user-code
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @param val
     * @return
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gHa8cJ3rEee9jdUag7Rsng"
     */
    public Builder forceDownload(final boolean val) {
      // begin-user-code
      forceDownload = val;
      return this;
      // end-user-code
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @param val
     * @return
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gHbjg53rEee9jdUag7Rsng"
     */
    public Builder forceLocalProcessing(final boolean val) {
      // begin-user-code
      forceLocalProcessing = val;
      return this;
      // end-user-code
    }

    /**
     * @return the inputEncoding
     */
    public final String getInputEncoding() {
      return inputEncoding;
    }

    /**
     * @return the localSourceDirectory
     */
    public final String getLocalSourceDirectory() {
      return localSourceDirectory;
    }

    /**
     * @return the localStageDirectory
     */
    public final String getLocalStageDirectory() {
      return localStageDirectory;
    }

    /**
     * @return the month
     */
    public final ExecutionPeriod getMonth() {
      return month;
    }

    /**
     * @return the year
     */
    public final int getYear() {
      return year;
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @param val
     * @return
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gHcKk53rEee9jdUag7Rsng"
     */
    public Builder inputEncoding(final String val) {
      // begin-user-code
      inputEncoding = val;
      return this;
      // end-user-code
    }

    /**
     * @return the forceDownload
     */
    public final boolean isForceDownload() {
      return forceDownload;
    }

    /**
     * @return the forceLocalProcessing
     */
    public final boolean isForceLocalProcessing() {
      return forceLocalProcessing;
    }

    /**
     * @return the preserveDownloadedFiles
     */
    public final boolean isPreserveDownloadedFiles() {
      return preserveDownloadedFiles;
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @param val
     * @return
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gHcxo53rEee9jdUag7Rsng"
     */
    public Builder localSourceDirectory(final String val) {
      // begin-user-code
      localSourceDirectory = val;
      return this;
      // end-user-code
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @param val
     * @return
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gHdYs53rEee9jdUag7Rsng"
     */
    public Builder localStageDirectory(final String val) {
      // begin-user-code
      localStageDirectory = val;
      return this;
      // end-user-code
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @param val
     * @return
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gHem0J3rEee9jdUag7Rsng"
     */
    public Builder month(final ExecutionPeriod val) {
      // begin-user-code
      month = val;
      return this;
      // end-user-code
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @param val
     * @return
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gHfN4p3rEee9jdUag7Rsng"
     */
    public Builder preserveDownloadedFiles(final boolean val) {
      // begin-user-code
      preserveDownloadedFiles = val;
      return this;
      // end-user-code
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @param val
     * @return
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ogF3kJ3rEee9jdUag7Rsng"
     */
    public Builder year(final int val) {
      // begin-user-code
      year = val;
      return this;
      // end-user-code
    }
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29lZ2dEee9jdUag7Rsng"
   */
  private boolean preserveDownloadedFiles;
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29mZ2dEee9jdUag7Rsng"
   */
  private ExecutionPeriod month;
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29m52dEee9jdUag7Rsng"
   */
  private int year;
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29nZ2dEee9jdUag7Rsng"
   */
  private boolean forceLocalProcessing;
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29op2dEee9jdUag7Rsng"
   */
  private String localStageDirectory;
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29o52dEee9jdUag7Rsng"
   */
  private String localSourceDirectory;
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29pJ2dEee9jdUag7Rsng"
   */
  private boolean forceDownload;
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lK29pp2dEee9jdUag7Rsng"
   */
  private String inputEncoding;

  /**
   * <!-- begin-UML-doc -->
   * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;inputEncoding.<br>
   * <br>
   *
   * @return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;inputEncoding <!-- end-UML-doc -->
   *
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxucQp3nEee9jdUag7Rsng"
   */
  public String getInputEncoding() {
    // begin-user-code
    return inputEncoding;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;localSourceDirectory.<br>
   * <br>
   *
   * @return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;localSourceDirectory <!-- end-UML-doc -->
   *
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxtOIJ3nEee9jdUag7Rsng"
   */
  public String getLocalSourceDirectory() {
    // begin-user-code
    return localSourceDirectory;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;localStageDirectory.<br>
   * <br>
   *
   * @return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;localStageDirectory <!-- end-UML-doc -->
   *
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxsnEJ3nEee9jdUag7Rsng"
   */
  public String getLocalStageDirectory() {
    // begin-user-code
    return localStageDirectory;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;month.<br>
   * <br>
   *
   * @return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;month <!-- end-UML-doc -->
   *
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxqK0J3nEee9jdUag7Rsng"
   */
  public ExecutionPeriod getMonth() {
    // begin-user-code
    return month;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;year.<br>
   * <br>
   *
   * @return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;year <!-- end-UML-doc -->
   *
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxqx4J3nEee9jdUag7Rsng"
   */
  public int getYear() {
    // begin-user-code
    return year;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;forceDownload.<br>
   * <br>
   *
   * @return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;forceDownload <!-- end-UML-doc -->
   *
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxt1MZ3nEee9jdUag7Rsng"
   */
  public boolean isForceDownload() {
    // begin-user-code
    return forceDownload;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;forceLocalProcessing.<br>
   * <br>
   *
   * @return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;forceLocalProcessing <!-- end-UML-doc -->
   *
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxrY8p3nEee9jdUag7Rsng"
   */
  public boolean isForceLocalProcessing() {
    // begin-user-code
    return forceLocalProcessing;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yxo8sJ3nEee9jdUag7Rsng"
   */
  public boolean isPreserveDownloadedFiles() {
    // begin-user-code
    return preserveDownloadedFiles;
    // end-user-code
  }

  /**
   * @param forceDownload
   *          the forceDownload to set
   */
  protected final void setForceDownload(boolean forceDownload) {
    this.forceDownload = forceDownload;
  }

  /**
   * @param forceLocalProcessing
   *          the forceLocalProcessing to set
   */
  protected final void setForceLocalProcessing(boolean forceLocalProcessing) {
    this.forceLocalProcessing = forceLocalProcessing;
  }

  /**
   * @param inputEncoding
   *          the inputEncoding to set
   */
  protected final void setInputEncoding(String inputEncoding) {
    this.inputEncoding = inputEncoding;
  }

  /**
   * @param localSourceDirectory
   *          the localSourceDirectory to set
   */
  protected final void setLocalSourceDirectory(String localSourceDirectory) {
    this.localSourceDirectory = localSourceDirectory;
  }

  /**
   * @param localStageDirectory
   *          the localStageDirectory to set
   */
  protected final void setLocalStageDirectory(String localStageDirectory) {
    this.localStageDirectory = localStageDirectory;
  }

  /**
   * @param month
   *          the month to set
   */
  protected final void setMonth(ExecutionPeriod month) {
    this.month = month;
  }

  /**
   * @param preserveDownloadedFiles
   *          the preserveDownloadedFiles to set
   */
  protected final void setPreserveDownloadedFiles(
      boolean preserveDownloadedFiles) {
    this.preserveDownloadedFiles = preserveDownloadedFiles;
  }

  /**
   * @param year
   *          the year to set
   */
  protected final void setYear(int year) {
    this.year = year;
  }

}