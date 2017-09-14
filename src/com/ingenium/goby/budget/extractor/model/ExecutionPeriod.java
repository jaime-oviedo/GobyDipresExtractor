/**
 *
 */

package com.ingenium.goby.budget.extractor.model;

import java.util.Calendar;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_S4b_gF9qEeeRDb5hxZnsBw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_S4b_gF9qEeeRDb5hxZnsBw?DATATYPE"
 */
public enum ExecutionPeriod {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oyxI0F9qEeeRDb5hxZnsBw"
  */
  JANUARY,
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qb9UMF9qEeeRDb5hxZnsBw"
  */
  FEBRUARY,
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_jw5U8F9rEeeRDb5hxZnsBw"
  */
  FIRST_TRIMESTER,
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lWKpoF9rEeeRDb5hxZnsBw"
  */
  APRIL,
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_mk5GkF9rEeeRDb5hxZnsBw"
  */
  MAY,
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_nU5nMF9rEeeRDb5hxZnsBw"
  */
  SECOND_TRIMESTER,
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_o0HXMF9rEeeRDb5hxZnsBw"
  */
  JULY,
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_p7BU4F9rEeeRDb5hxZnsBw"
  */
  AUGUST,
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qpkc8F9rEeeRDb5hxZnsBw"
  */
  THIRD_TRIMESTER,
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_rnrD8F9rEeeRDb5hxZnsBw"
  */
  OCTOBER,
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_tCLTEF9rEeeRDb5hxZnsBw"
  */
  NOVEMBER,
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_uj6yoF9rEeeRDb5hxZnsBw"
  */
  FOURTH_TRIMESTER;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param period
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oGqIcGElEeeMhLKRNTgRlA"
  */
  public static ExecutionPeriod matchExecutionPeriod(final int period) {
    // begin-user-code
    ExecutionPeriod p;
    switch (period) {
    case 1:
      p = JANUARY;
      break;
    case 2:
      p = FEBRUARY;
      break;
    case 3:
      p = FIRST_TRIMESTER;
      break;
    case 4:
      p = APRIL;
      break;
    case 5:
      p = MAY;
      break;
    case 6:
      p = SECOND_TRIMESTER;
      break;
    case 7:
      p = JULY;
      break;
    case 8:
      p = AUGUST;
      break;
    case 9:
      p = THIRD_TRIMESTER;
      break;
    case 10:
      p = OCTOBER;
      break;
    case 11:
      p = NOVEMBER;
      break;
    default:
      p = FOURTH_TRIMESTER;
      break;
    }
    return p;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_H-Y8wGErEeeMhLKRNTgRlA"
  */
  public static ExecutionPeriod getCurrentPeriod() {
    // begin-user-code
    final int currentPeriod = Calendar.getInstance().get(Calendar.MONTH) + 1; // Calendar is
                                                                              // zero-indexed
    return ExecutionPeriod.matchExecutionPeriod(currentPeriod);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_uHmuAJW5EeevpubR7V73Yw"
  */
  public static int getCurrentYear() {
    // begin-user-code
    return Calendar.getInstance().get(Calendar.YEAR);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param period
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_uHnVEJW5EeevpubR7V73Yw"
  */
  public static int asInt(final ExecutionPeriod period) {
    // begin-user-code
    int p = -1;
    switch (period) {
    case JANUARY:
      p = 1;
      break;
    case FEBRUARY:
      p = 2;
      break;
    case FIRST_TRIMESTER:
      p = 3;
      break;
    case APRIL:
      p = 4;
      break;
    case MAY:
      p = 5;
      break;
    case SECOND_TRIMESTER:
      p = 6;
      break;
    case JULY:
      p = 7;
      break;
    case AUGUST:
      p = 8;
      break;
    case THIRD_TRIMESTER:
      p = 9;
      break;
    case OCTOBER:
      p = 10;
      break;
    case NOVEMBER:
      p = 11;
      break;
    case FOURTH_TRIMESTER:
      p = 12;
      break;
    }

    return p;
    // end-user-code
  }

}