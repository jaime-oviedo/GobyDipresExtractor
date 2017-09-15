/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.model;

import java.util.Collection;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_Fe6LFV0kEeez8bHvvwz5bA"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Fe6LFV0kEeez8bHvvwz5bA"
 */
public class BudgetExecutionImpl extends CompositeBudgetElement
    implements BudgetExecution {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class BudgetExecutionImpl.
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Fe6LH10kEeez8bHvvwz5bA"
  */
  public BudgetExecutionImpl() {
    // begin-user-code
    super(0, "Ejecución Presupuestaria", "", BudgetElementType.NONE,
        BudgetHierarchyLevel.ROOT);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param batchNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Fe6LHF0kEeez8bHvvwz5bA"
  */
  @Override
  public Batch getBatch(final int batchNumber) {
    // begin-user-code
    return (Batch) this.getSubelement(batchNumber);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Fe6LGF0kEeez8bHvvwz5bA"
  */
  @SuppressWarnings("unchecked")
  @Override
  public Collection<Batch> getBatches() {
    // begin-user-code
    return (Collection<Batch>) this.getSubelements().values();
    // end-user-code
  }
}