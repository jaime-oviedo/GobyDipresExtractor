/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.extraction;

import com.ingenium.goby.budget.extractor.model.BudgetElement;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_MC9IQFYQEeeKVoBZn1AqUw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_MC9IQFYQEeeKVoBZn1AqUw"
 */
public interface BudgetExtractor {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_NfLOoFYQEeeKVoBZn1AqUw"
  */
  public BudgetElement extract() throws ExtractionException;
}