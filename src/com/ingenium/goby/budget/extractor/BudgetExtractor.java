/**
 * 
 */
package com.ingenium.goby.budget.extractor;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_bCSCEGD3EeemUqxRur9fjQ"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_bCSCEGD3EeemUqxRur9fjQ"
 */
public interface BudgetExtractor {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_3_0vcGD3EeemUqxRur9fjQ"
  */
  public BudgetLaw extractBudgetLaw();

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param force
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_zPJZQGD4EeemUqxRur9fjQ"
  */
  public BudgetLaw extractBudgetLaw(boolean force);

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_BqdBsGD4EeemUqxRur9fjQ"
  */
  public BudgetExecution extractBudgetExecution();

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param force
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_q6TOMGD4EeemUqxRur9fjQ"
  */
  public BudgetExecution extractBudgetExecution(boolean force);

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param period
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_7GZpYGD4EeemUqxRur9fjQ"
  */
  public BudgetExecution extractBudgetExecution(ExecutionPeriod period);

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param period
  * @param force
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_FyW1wGD5EeemUqxRur9fjQ"
  */
  public BudgetExecution extractBudgetExecution(ExecutionPeriod period,
      boolean force);
}