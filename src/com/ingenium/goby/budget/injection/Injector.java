/**
 * 
 */

package com.ingenium.goby.budget.injection;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_kNOmUFdBEee4ttLK_7FK1A"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_kNOmUFdBEee4ttLK_7FK1A"
 */
public interface Injector {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @throws InjectionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_oqc_kFdBEee4ttLK_7FK1A"
  */
  public void inject() throws InjectionException;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_C8tycFdCEee4ttLK_7FK1A"
  */
  public String getDestination();
}