/**
 *
 */

package com.ingenium.goby.budget.extractor.factory;

import com.ingenium.goby.budget.extractor.bot.BudgetExtractorBot.ExtractionType;
import com.ingenium.goby.budget.extractor.extraction.BudgetExtractor;
import com.ingenium.goby.budget.extractor.model.ExecutionPeriod;

import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_lgK9QGD3EeemUqxRur9fjQ"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lgK9QGD3EeemUqxRur9fjQ"
 */
public class BudgetExtractorFactory {
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
  * Creates a new instance of the class BudgetExtractorFactory.
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_PznhgGEIEeemUqxRur9fjQ"
  */
  private BudgetExtractorFactory() {
    // begin-user-code
    super();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param type
  * @param month
  * @param year
  * @param stageDirectory
  * @param localSourceDirectory
  * @param inputEncoding
  * @param forceLocalProcessing
  * @param forceDownload
  * @param preserveDownloadedFiles
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_V21BIGEIEeemUqxRur9fjQ"
  */
  public BudgetExtractor getExtractor(final ExtractionType type,
      final ExecutionPeriod month, final int year, final String stageDirectory,
      final String localSourceDirectory, final String inputEncoding,
      final boolean forceLocalProcessing, final boolean forceDownload,
      final boolean preserveDownloadedFiles) {
    // begin-user-code
    BudgetExtractor budgetExtractor = null;
    switch (type) {
      case LAW:
        budgetExtractor = new BudgetLawExtractorImpl(
            new AbstractBudgetExtractor.Builder());
    }
    return budgetExtractor;
    // end-user-code
  }
  
}