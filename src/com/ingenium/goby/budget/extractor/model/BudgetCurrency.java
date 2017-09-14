/**
 *
 */

package com.ingenium.goby.budget.extractor.model;

/** 
 * <!-- begin-UML-doc -->
 * <p>Enumeration of all valid currency options</p>
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_pXE6AE1GEeekuqvl4T6tsg"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_pXE6AE1GEeekuqvl4T6tsg?DATATYPE"
 */
public enum BudgetCurrency {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_rFKMcE1GEeekuqvl4T6tsg"
  */
  PESO,
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_sS8OME1GEeekuqvl4T6tsg"
  */
  DOLLAR,
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_nkhZcE1VEeekuqvl4T6tsg"
  */
  MIXED,
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oyC8gE1VEeekuqvl4T6tsg"
  */
  NONE;

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_f9ESgJlJEeeN7K_s3Iv6cQ"
  */
  @Override
  public String toString() {
    // begin-user-code
    String value;
    switch (this) {
    case PESO:
      value = "Peso";
      break;
    case DOLLAR:
      value = "Dolar";
      break;
    case MIXED:
      value = "Mixta";
      break;
    default:
      value = "";
      break;
    }
    return value;
    // end-user-code
  }

}