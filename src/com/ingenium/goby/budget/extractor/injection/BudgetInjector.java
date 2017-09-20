/**
 *
 */

package com.ingenium.goby.budget.extractor.injection;

import com.ingenium.goby.budget.extractor.model.BudgetElement;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_kNOmUFdBEee4ttLK_7FK1A"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kNOmUFdBEee4ttLK_7FK1A"
 */
public interface BudgetInjector {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param budgetElement
  * @throws InjectionException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqc_kFdBEee4ttLK_7FK1A"
  */
  public void inject(BudgetElement budgetElement) throws InjectionException;
}