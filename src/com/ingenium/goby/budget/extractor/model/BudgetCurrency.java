/**
 *
 */

package com.ingenium.goby.budget.extractor.model;

/** 
 * <!-- begin-UML-doc -->
 * <p>Enumeration of all valid currency options</p>
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
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
  PESO("PESO", null),
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_sS8OME1GEeekuqvl4T6tsg"
  */
  DOLLAR("DOLLAR", null),
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_nkhZcE1VEeekuqvl4T6tsg"
  */
  MIXED("MIXED", null),
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oyC8gE1VEeekuqvl4T6tsg"
  */
  NONE("NONE", null);
  
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
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qRtzspmtEeeAWKInz3apng"
  */
  private String name;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qRuawJmtEeeAWKInz3apng"
  */
  private Object value;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class BudgetCurrency.
  * @param enumName
  * @param enumValue
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qR29oJmtEeeAWKInz3apng"
  */
  BudgetCurrency(String enumName, Object enumValue) {
    // begin-user-code
    // TODO Auto-generated constructor stub
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qR4LwZmtEeeAWKInz3apng"
  */
  public String getName() {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qR4y0JmtEeeAWKInz3apng"
  */
  public Object getValue() {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param enumValue
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qR5Z4JmtEeeAWKInz3apng"
  */
  public static BudgetCurrency getEnumByValue(Object enumValue) {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param enumName
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qR6A8pmtEeeAWKInz3apng"
  */
  public static BudgetCurrency getEnumByName(String enumName) {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }
  
}