/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.elements;

import java.math.BigInteger;

/** 
 * <!-- begin-UML-doc -->
 * <p>Base element for the budget classifier's hierarchy.</p><p>@author JaimeOviedo</p>
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UZ4ZEEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UZ4ZEEquEeeJsdrfgQXeQw"
 */
public class BudgetElement {

  /** 
  * <!-- begin-UML-doc -->
  * <p>The number that identifies the element within his hierarchical level.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfkKUEquEeeJsdrfgQXeQw"
  */
  private Integer number;
  /** 
  * <!-- begin-UML-doc -->
  * <p>The name of the element.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ufl_gEquEeeJsdrfgQXeQw"
  */
  private String name;
  /** 
  * <!-- begin-UML-doc -->
  * <p>Describes the detailed intended usage of the element.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ufn0sEquEeeJsdrfgQXeQw"
  */
  private String description;

  /** 
  * <!-- begin-UML-doc -->
  * <p>The type of the element: CLASSIFIER, BUDGET or EXECUTION.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_W7HikEq1EeeJsdrfgQXeQw"
  */
  private final BudgetElementType type;
  /** 
  * <!-- begin-UML-doc -->
  * <p>The level of the element in the budgetary classifier's hierarchy. The hierarchy is: BATCH, CHAPTER, PROGRAM, SUBTITLE, ITEM and ASSIGNMENT. The latter being the deepest leaf level.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_eL3MUEq1EeeJsdrfgQXeQw"
  */
  private final BudgetHierarchyLevel level;

  /** 
  * <!-- begin-UML-doc -->
  * <p>The element's budget as was established in the budgetary law.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Gg-6kEymEeekuqvl4T6tsg"
  */
  private BigInteger initialBudget;
  /** 
  * <!-- begin-UML-doc -->
  * <p>The current budget for the element.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_uEqDcE1GEeekuqvl4T6tsg"
  */
  private BigInteger actualBudget;
  /** 
  * <!-- begin-UML-doc -->
  * <p>The budget element's currency. Only composite elements can have mixed currencies.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_xndb0E1GEeekuqvl4T6tsg"
  */
  private BudgetCurrency currency;
  /** 
  * <!-- begin-UML-doc -->
  * <p>The amount of the element's budget that has been spent.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_ym_UQE1IEeekuqvl4T6tsg"
  */
  private BigInteger cumulativeExecution;

  /** 
  * <!-- begin-UML-doc -->
  * <p>The current dollar budget for the element.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_fUkVcE1VEeekuqvl4T6tsg"
  */
  private BigInteger actualDollarBudget;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_jKbzwE1VEeekuqvl4T6tsg"
  */
  private BigInteger cummulativeDollarExecution;
  /** 
  * <!-- begin-UML-doc -->
  * <p>The element's dollar budget as was established in the budgetary law.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_sdc3QE1VEeekuqvl4T6tsg"
  */
  private BigInteger initialDollarBudget;

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the value of the type field</p>
  * <!-- end-UML-doc -->
  * @return <p>the value of the type field</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_cuAscErwEeeJsdrfgQXeQw"
  */
  public final BudgetElementType getType() {
    // begin-user-code
    return type;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the value of the level field.</p>
  * <!-- end-UML-doc -->
  * @return <p>the value of the description field</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_cuRLIErwEeeJsdrfgQXeQw"
  */
  public final BudgetHierarchyLevel getLevel() {
    // begin-user-code
    return level;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Creates a new Budget Element.</p>
  * <!-- end-UML-doc -->
  * @param number <p>the number that identifies the element within his hierarchical level</p>
  * @param name <p>the name of the element</p>
  * @param description <p>the detailed intended usage of the element</p>
  * @param type <p>the type of the element</p>
  * @param level <p>the level of the element in the budgetary classifier's hierarchy</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfqQ8EquEeeJsdrfgQXeQw"
  */
  public BudgetElement(int number, String name, String description,
      BudgetElementType type, BudgetHierarchyLevel level) {
    // begin-user-code
    super();
    this.number = number;
    this.name = name;
    this.description = description;
    this.type = type;
    this.level = level;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the value of the description field.</p>
  * <!-- end-UML-doc -->
  * @return <p>the value of the description field</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UftUQEquEeeJsdrfgQXeQw"
  */
  public final String getDescription() {
    // begin-user-code
    return description;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the value of the name field.</p>
  * <!-- end-UML-doc -->
  * @return <p>the value of the description field</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfwXkEquEeeJsdrfgQXeQw"
  */
  public final String getName() {
    // begin-user-code
    return name;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the value of the number field</p>
  * <!-- end-UML-doc -->
  * @return <p>the value of the number field</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ufyz0EquEeeJsdrfgQXeQw"
  */
  public final int getNumber() {
    // begin-user-code
    return number;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the value of the description field.</p>
  * <!-- end-UML-doc -->
  * @param description <p>the value of the description field</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uf1QEEquEeeJsdrfgQXeQw"
  */
  public final void setDescription(String description) {
    // begin-user-code
    this.description = description;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the value of the name field.</p>
  * <!-- end-UML-doc -->
  * @param name <p>the value of the name field</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uf3sUEquEeeJsdrfgQXeQw"
  */
  public final void setName(String name) {
    // begin-user-code
    this.name = name;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the value of the number field.</p>
  * <!-- end-UML-doc -->
  * @param number <p>the value of the number field</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uf6IkEquEeeJsdrfgQXeQw"
  */
  public final void setNumber(int number) {
    // begin-user-code
    this.number = number;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the element's budget as was established in the budgetary law</p>
  * <!-- end-UML-doc -->
  * @return <p>the element's budget as was established in the budgetary law</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_NLNW4EymEeekuqvl4T6tsg"
  */
  public BigInteger getInitialBudget() {
    // begin-user-code
    return initialBudget;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the current budget for the element.</p>
  * <!-- end-UML-doc -->
  * @return <p>the current budget for the element</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_SESI8E1GEeekuqvl4T6tsg"
  */
  public BigInteger getActualBudget() {
    // begin-user-code
    return actualBudget;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the element's budget as was established in the budgetary law.</p>
  * <!-- end-UML-doc -->
  * @param budget <p>the element's budget as was established in the budgetary law</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_ZeWGwE1GEeekuqvl4T6tsg"
  */
  public void setInitialBudget(BigInteger budget) {
    // begin-user-code
    initialBudget = budget;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the budget element's currency.</p>
  * <!-- end-UML-doc -->
  * @return <p>the budget element's currency</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_030ZUE1GEeekuqvl4T6tsg"
  */
  public BudgetCurrency getCurrency() {
    // begin-user-code
    return currency;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the current budget for the element.</p>
  * <!-- end-UML-doc -->
  * @param budget <p>the new current budget for the element</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_YKLeQE1IEeekuqvl4T6tsg"
  */
  public void setActualBudget(BigInteger budget) {
    // begin-user-code
    actualBudget = budget;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the amount of the element's budget that has been spent.</p>
  * <!-- end-UML-doc -->
  * @return <p>the amount of the element's budget that has been spent</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_2TUcEE1IEeekuqvl4T6tsg"
  */
  public BigInteger getCumulativeExecution() {
    // begin-user-code
    return cumulativeExecution;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the amount of the element's budget that has been spent.</p>
  * <!-- end-UML-doc -->
  * @param execution <p>the new amount of the element's budget that has been spent</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_4It3cE1IEeekuqvl4T6tsg"
  */
  public void setCumulativeExecution(BigInteger execution) {
    // begin-user-code
    cumulativeExecution = execution;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the current dollar budget for the element.</p>
  * <!-- end-UML-doc -->
  * @return <p>the current dollar budget for the element.</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_2Fsj4E1VEeekuqvl4T6tsg"
  */
  public BigInteger getActualDollarBudget() {
    // begin-user-code
    return actualDollarBudget;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the current dollar budget for the element.</p>
  * <!-- end-UML-doc -->
  * @param budget <p>Sets the current dollar budget for the element.</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_JOpxwE1WEeekuqvl4T6tsg"
  */
  public void setActualDollarBudget(BigInteger budget) {
    // begin-user-code
    actualDollarBudget = budget;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the element's dollar budget as was established in the budgetary law</p>
  * <!-- end-UML-doc -->
  * @return <p>Returns the element's dollar budget as was established in the budgetary law</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_PC2lAE1WEeekuqvl4T6tsg"
  */
  public BigInteger getInitialDollarBudget() {
    // begin-user-code
    return initialDollarBudget;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the element's dollar budget as was established in the budgetary law.</p>
  * <!-- end-UML-doc -->
  * @param budget <p>the element's dollar budget as was established in the budgetary law.</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_R7HyoE1WEeekuqvl4T6tsg"
  */
  public void setInitialDollarBudget(BigInteger budget) {
    // begin-user-code
    initialDollarBudget = budget;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_kKAlcFD6EeeDDreW7cLBoA"
  */
  public BigInteger getCumulativeDollarExecution() {
    // begin-user-code
    return this.cummulativeDollarExecution;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param execution
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_teVQgFD6EeeDDreW7cLBoA"
  */
  public void setCumulativeDollarExecution(BigInteger execution) {
    // begin-user-code
    this.cummulativeDollarExecution = execution;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the budget element's currency.</p>
  * <!-- end-UML-doc -->
  * @param currency <p>the new budget element's currency</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_y2sPEE1GEeekuqvl4T6tsg"
  */
  public void setCurrency(BudgetCurrency currency) {
    // begin-user-code
    this.currency = currency;
    // end-user-code
  }

}
