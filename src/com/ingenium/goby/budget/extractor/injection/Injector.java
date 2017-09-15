/**
 * 
 */

package com.ingenium.goby.budget.extractor.injection;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_kNOmUFdBEee4ttLK_7FK1A"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kNOmUFdBEee4ttLK_7FK1A"
 */
public interface Injector {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @throws InjectionException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqc_kFdBEee4ttLK_7FK1A"
  */
  public void inject() throws InjectionException;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_C8tycFdCEee4ttLK_7FK1A"
  */
  public String getDestination();
}