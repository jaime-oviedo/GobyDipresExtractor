/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor;

import com.ingenium.goby.budget.extractor.elements.Batch;

import java.util.Collection;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_bm8IkFH0Eee-AoOzRlyylA"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_bm8IkFH0Eee-AoOzRlyylA"
 */
public interface BudgetLaw {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param batchNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_wAQRYFeiEeeJT_eFoT-0rA"
  */
  public Batch getBatch(int batchNumber);

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_wAQ4cFeiEeeJT_eFoT-0rA"
  */
  public Collection<Batch> getBatches();
}