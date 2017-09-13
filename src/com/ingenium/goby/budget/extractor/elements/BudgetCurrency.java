/**
 *
 */

package com.ingenium.goby.budget.extractor.elements;

/**
 * <!-- begin-UML-doc -->
 * <p>
 * Enumeration of all valid currency options
 * </p>
 * <!-- end-UML-doc -->
 *
 * @author Jaime Oviedo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_pXE6AE1GEeekuqvl4T6tsg"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_pXE6AE1GEeekuqvl4T6tsg?DATATYPE"
 */
public enum BudgetCurrency {
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_rFKMcE1GEeekuqvl4T6tsg"
   */
  PESO,
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_sS8OME1GEeekuqvl4T6tsg"
   */
  DOLLAR,
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_nkhZcE1VEeekuqvl4T6tsg"
   */
  MIXED,
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oyC8gE1VEeekuqvl4T6tsg"
   */
  NONE;

  @Override
  public String toString() {
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
  }

}