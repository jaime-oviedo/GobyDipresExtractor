/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.factory;

import com.ingenium.goby.budget.extractor.Messages;
import com.ingenium.goby.budget.extractor.extraction.BudgetExecutionExtractor;
import com.ingenium.goby.budget.extractor.extraction.ExtractionException;
import com.ingenium.goby.budget.extractor.model.BudgetExecution;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_asLE8F0iEeez8bHvvwz5bA"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_asLE8F0iEeez8bHvvwz5bA"
 */
public class BudgetExecutionFactory {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_asLE8V0iEeez8bHvvwz5bA"
  */
  private static BudgetExecutionFactory instance = null;

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_asLE910iEeez8bHvvwz5bA"
  */
  public synchronized static BudgetExecutionFactory getInstance() {
    // begin-user-code
    if (BudgetExecutionFactory.instance == null) {
      BudgetExecutionFactory.instance = new BudgetExecutionFactory();
      BudgetExecutionFactory.instance
          .setSource(Messages.getString("BudgetLawFactory.sourceUrl")); //$NON-NLS-1$
    }
    return BudgetExecutionFactory.instance;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_asLE810iEeez8bHvvwz5bA"
  */
  private BudgetExecution budgetExecution;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_asLE9F0iEeez8bHvvwz5bA"
  */
  private boolean extract;

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_asLE9V0iEeez8bHvvwz5bA"
  */
  private String source;

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_asLE9l0iEeez8bHvvwz5bA"
  */
  private BudgetExecutionFactory() {
    // begin-user-code
    super();
    budgetExecution = null;
    source = null;
    extract = true;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_asLFAF0iEeez8bHvvwz5bA"
  */
  public BudgetExecution getBudgetExecution() {
    // begin-user-code
    if (extract) {
      BudgetExecutionExtractor extractor = new BudgetExecutionExtractor(source);
      try {
        budgetExecution = extractor.extract();
      } catch (ExtractionException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      extract = false;
    }
    return budgetExecution;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param forceExtraction
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_asLE_V0iEeez8bHvvwz5bA"
  */
  public BudgetExecution getBudgetExecution(boolean forceExtraction) {
    // begin-user-code
    extract = forceExtraction;
    return getBudgetExecution();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_asLE-V0iEeez8bHvvwz5bA"
  */
  String getSource() {
    // begin-user-code
    return source;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param newSource
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_asLE-10iEeez8bHvvwz5bA"
  */
  void setSource(String newSource) {
    // begin-user-code
    source = newSource;
    // end-user-code
  }
}