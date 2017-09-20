/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.factory;

import com.ingenium.goby.budget.extractor.extraction.ExtractionException;
import com.ingenium.goby.budget.extractor.model.BudgetElement;
import com.ingenium.goby.budget.extractor.model.BudgetLaw;
import com.ingenium.goby.budget.extractor.model.ExecutionPeriod;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 *
 * @author Jaime Oviedo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_RCTT4J2dEee9jdUag7Rsng"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_RCTT4J2dEee9jdUag7Rsng"
 */
class BudgetLawExtractorImpl extends AbstractBudgetExtractor {

  public static class Builder extends AbstractBudgetExtractor.Builder {

    public BudgetLawExtractorImpl build() {
      return new BudgetLawExtractorImpl(this);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ingenium.goby.budget.extractor.factory.AbstractBudgetExtractor.Builder#forceDownload(
     * boolean)
     */
    @Override
    public Builder forceDownload(boolean val) {
      return (Builder) super.forceDownload(val);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ingenium.goby.budget.extractor.factory.AbstractBudgetExtractor.Builder#
     * forceLocalProcessing(boolean)
     */
    @Override
    public Builder forceLocalProcessing(boolean val) {
      return (Builder) super.forceLocalProcessing(val);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ingenium.goby.budget.extractor.factory.AbstractBudgetExtractor.Builder#inputEncoding(java
     * .lang.String)
     */
    @Override
    public Builder inputEncoding(String val) {
      return (Builder) super.inputEncoding(val);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ingenium.goby.budget.extractor.factory.AbstractBudgetExtractor.Builder#
     * localSourceDirectory(java.lang.String)
     */
    @Override
    public Builder localSourceDirectory(String val) {
      return (Builder) super.localSourceDirectory(val);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ingenium.goby.budget.extractor.factory.AbstractBudgetExtractor.Builder#
     * localStageDirectory(java.lang.String)
     */
    @Override
    public Builder localStageDirectory(String val) {
      return (Builder) super.localStageDirectory(val);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ingenium.goby.budget.extractor.factory.AbstractBudgetExtractor.Builder#month(com.ingenium
     * .goby.budget.extractor.model.ExecutionPeriod)
     */
    @Override
    public Builder month(ExecutionPeriod val) {
      return (Builder) super.month(val);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ingenium.goby.budget.extractor.factory.AbstractBudgetExtractor.Builder#
     * preserveDownloadedFiles(boolean)
     */
    @Override
    public Builder preserveDownloadedFiles(boolean val) {
      return (Builder) super.preserveDownloadedFiles(val);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.ingenium.goby.budget.extractor.factory.AbstractBudgetExtractor.Builder#year(int)
     */
    @Override
    public Builder year(int val) {
      return (Builder) super.year(val);
    }

  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Hd42kGEREeeMhLKRNTgRlA"
   */
  private BudgetLaw budgetLaw;

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc --> Creates a new instance of the class
   * BudgetLawExtractorImpl.
   *
   * @param builder
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_VRkJoJ2dEee9jdUag7Rsng"
   */
  public BudgetLawExtractorImpl(final Builder builder) {
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
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @return
   * @throws ExtractionException
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_X6g6gZ3tEee9jdUag7Rsng"
   */
  @Override
  public BudgetElement extract() throws ExtractionException {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kgCZIGD7EeemUqxRur9fjQ"
   */
  public BudgetLaw extractBudgetLaw() {
    // begin-user-code
    if (budgetLaw == null) {
      budgetLaw = this.extractBudgetLaw(true);
      ;
    }

    return budgetLaw;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @param force
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kgCZIWD7EeemUqxRur9fjQ"
   */
  public BudgetLaw extractBudgetLaw(final boolean force) {
    // begin-user-code
    final BudgetLawFactory blf = BudgetLawFactory.getInstance();
    budgetLaw = blf.getBudgetLaw(force);
    return budgetLaw;

    // end-user-code
  }

}