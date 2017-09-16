/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.model;

import java.math.BigInteger;

/** 
 * <!-- begin-UML-doc -->
 * <p><br>Base&nbsp;element&nbsp;for&nbsp;the&nbsp;budget&nbsp;classifier's&nbsp;hierarchy.<br></p><br><p><br>@author&nbsp;JaimeOviedo<br></p>
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_UZ4ZEEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UZ4ZEEquEeeJsdrfgQXeQw"
 */
public class BudgetElement {
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>The&nbsp;number&nbsp;that&nbsp;identifies&nbsp;the&nbsp;element&nbsp;within&nbsp;his&nbsp;hierarchical&nbsp;level.<br></p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UfkKUEquEeeJsdrfgQXeQw"
  */
  private Integer number;
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>The&nbsp;name&nbsp;of&nbsp;the&nbsp;element.<br></p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Ufl_gEquEeeJsdrfgQXeQw"
  */
  private String name;
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Describes&nbsp;the&nbsp;detailed&nbsp;intended&nbsp;usage&nbsp;of&nbsp;the&nbsp;element.<br></p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Ufn0sEquEeeJsdrfgQXeQw"
  */
  private String description;
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>The&nbsp;type&nbsp;of&nbsp;the&nbsp;element:&nbsp;CLASSIFIER,&nbsp;BUDGET&nbsp;or&nbsp;EXECUTION.<br></p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_W7HikEq1EeeJsdrfgQXeQw"
  */
  private final BudgetElementType type;
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>The&nbsp;level&nbsp;of&nbsp;the&nbsp;element&nbsp;in&nbsp;the&nbsp;budgetary&nbsp;classifier's&nbsp;hierarchy.&nbsp;The&nbsp;hierarchy&nbsp;is:&nbsp;BATCH,<br>CHAPTER,&nbsp;PROGRAM,&nbsp;SUBTITLE,&nbsp;ITEM&nbsp;and&nbsp;ASSIGNMENT.&nbsp;The&nbsp;latter&nbsp;being&nbsp;the&nbsp;deepest&nbsp;leaf&nbsp;level.<br></p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_eL3MUEq1EeeJsdrfgQXeQw"
  */
  private final BudgetHierarchyLevel level;
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>The&nbsp;element's&nbsp;budget&nbsp;as&nbsp;was&nbsp;established&nbsp;in&nbsp;the&nbsp;budgetary&nbsp;law.<br></p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Gg-6kEymEeekuqvl4T6tsg"
  */
  private BigInteger initialBudget;
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>The&nbsp;current&nbsp;budget&nbsp;for&nbsp;the&nbsp;element.<br></p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_uEqDcE1GEeekuqvl4T6tsg"
  */
  private BigInteger actualBudget;
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>The&nbsp;budget&nbsp;element's&nbsp;currency.&nbsp;Only&nbsp;composite&nbsp;elements&nbsp;can&nbsp;have&nbsp;mixed&nbsp;currencies.<br></p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_xndb0E1GEeekuqvl4T6tsg"
  */
  private BudgetCurrency currency;
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>The&nbsp;amount&nbsp;of&nbsp;the&nbsp;element's&nbsp;budget&nbsp;that&nbsp;has&nbsp;been&nbsp;spent.<br></p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ym_UQE1IEeekuqvl4T6tsg"
  */
  private BigInteger cumulativeExecution;
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>The&nbsp;current&nbsp;dollar&nbsp;budget&nbsp;for&nbsp;the&nbsp;element.<br></p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_fUkVcE1VEeekuqvl4T6tsg"
  */
  private BigInteger actualDollarBudget;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_jKbzwE1VEeekuqvl4T6tsg"
  */
  private BigInteger cumulativeDollarExecution;
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>The&nbsp;element's&nbsp;dollar&nbsp;budget&nbsp;as&nbsp;was&nbsp;established&nbsp;in&nbsp;the&nbsp;budgetary&nbsp;law.<br></p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_sdc3QE1VEeekuqvl4T6tsg"
  */
  private BigInteger initialDollarBudget;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class BudgetElement.
  * @param element
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ZHA9sFxhEee8GZGMCONk9w"
  */
  public BudgetElement(BudgetElement element) {
    // begin-user-code
    this(element.getNumber(), element.getName(), element.getDescription(),
        element.getType(), element.getLevel());
    currency = element.getCurrency();
    initialBudget = element.getInitialBudget();
    initialDollarBudget = element.getInitialDollarBudget();
    actualBudget = element.getActualBudget();
    actualDollarBudget = element.getActualDollarBudget();
    cumulativeExecution = element.getCumulativeExecution();
    cumulativeDollarExecution = element.getCumulativeDollarExecution();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Creates&nbsp;a&nbsp;new&nbsp;Budget&nbsp;Element.<br></p>
  * <!-- end-UML-doc -->
  * Creates a new instance of the class BudgetElement.
  * @param number <p>the number that identifies the element within his hierarchical level</p>
  * @param name <p>the name of the element</p>
  * @param description <p>the detailed intended usage of the element</p>
  * @param type <p>the type of the element</p>
  * @param level <p>the level of the element in the budgetary classifier's hierarchy</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UfqQ8EquEeeJsdrfgQXeQw"
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
    currency = BudgetCurrency.NONE;
    actualBudget = BigInteger.ZERO;
    actualDollarBudget = BigInteger.ZERO;
    cumulativeExecution = BigInteger.ZERO;
    cumulativeDollarExecution = BigInteger.ZERO;
    initialBudget = BigInteger.ZERO;
    initialDollarBudget = BigInteger.ZERO;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Returns&nbsp;the&nbsp;current&nbsp;budget&nbsp;for&nbsp;the&nbsp;element.<br></p>
  * <!-- end-UML-doc -->
  * @return <p>the current budget for the element</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_SESI8E1GEeekuqvl4T6tsg"
  */
  public BigInteger getActualBudget() {
    // begin-user-code
    return actualBudget;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Returns&nbsp;the&nbsp;current&nbsp;dollar&nbsp;budget&nbsp;for&nbsp;the&nbsp;element.<br></p>
  * <!-- end-UML-doc -->
  * @return <p>the current dollar budget for the element.</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_2Fsj4E1VEeekuqvl4T6tsg"
  */
  public BigInteger getActualDollarBudget() {
    // begin-user-code
    return actualDollarBudget;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kKAlcFD6EeeDDreW7cLBoA"
  */
  public BigInteger getCumulativeDollarExecution() {
    // begin-user-code
    return cumulativeDollarExecution;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Returns&nbsp;the&nbsp;amount&nbsp;of&nbsp;the&nbsp;element's&nbsp;budget&nbsp;that&nbsp;has&nbsp;been&nbsp;spent.<br></p>
  * <!-- end-UML-doc -->
  * @return <p>the amount of the element's budget that has been spent</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_2TUcEE1IEeekuqvl4T6tsg"
  */
  public BigInteger getCumulativeExecution() {
    // begin-user-code
    return cumulativeExecution;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Returns&nbsp;the&nbsp;budget&nbsp;element's&nbsp;currency.<br></p>
  * <!-- end-UML-doc -->
  * @return <p>the budget element's currency</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_030ZUE1GEeekuqvl4T6tsg"
  */
  public BudgetCurrency getCurrency() {
    // begin-user-code
    return currency;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;description&nbsp;field.<br></p>
  * <!-- end-UML-doc -->
  * @return <p>the value of the description field</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UftUQEquEeeJsdrfgQXeQw"
  */
  public final String getDescription() {
    // begin-user-code
    return description;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Returns&nbsp;the&nbsp;element's&nbsp;budget&nbsp;as&nbsp;was&nbsp;established&nbsp;in&nbsp;the&nbsp;budgetary&nbsp;law<br></p>
  * <!-- end-UML-doc -->
  * @return <p>the element's budget as was established in the budgetary law</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_NLNW4EymEeekuqvl4T6tsg"
  */
  public BigInteger getInitialBudget() {
    // begin-user-code
    return initialBudget;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Returns&nbsp;the&nbsp;element's&nbsp;dollar&nbsp;budget&nbsp;as&nbsp;was&nbsp;established&nbsp;in&nbsp;the&nbsp;budgetary&nbsp;law<br></p>
  * <!-- end-UML-doc -->
  * @return <p>Returns the element's dollar budget as was established in the budgetary law</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_PC2lAE1WEeekuqvl4T6tsg"
  */
  public BigInteger getInitialDollarBudget() {
    // begin-user-code
    return initialDollarBudget;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;level&nbsp;field.<br></p>
  * <!-- end-UML-doc -->
  * @return <p>the value of the description field</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_cuRLIErwEeeJsdrfgQXeQw"
  */
  public final BudgetHierarchyLevel getLevel() {
    // begin-user-code
    return level;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;name&nbsp;field.<br></p>
  * <!-- end-UML-doc -->
  * @return <p>the value of the description field</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UfwXkEquEeeJsdrfgQXeQw"
  */
  public final String getName() {
    // begin-user-code
    return name;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;number&nbsp;field<br></p>
  * <!-- end-UML-doc -->
  * @return <p>the value of the number field</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Ufyz0EquEeeJsdrfgQXeQw"
  */
  public final int getNumber() {
    // begin-user-code
    return number;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;type&nbsp;field<br></p>
  * <!-- end-UML-doc -->
  * @return <p>the value of the type field</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_cuAscErwEeeJsdrfgQXeQw"
  */
  public final BudgetElementType getType() {
    // begin-user-code
    return type;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Sets&nbsp;the&nbsp;current&nbsp;budget&nbsp;for&nbsp;the&nbsp;element.<br></p>
  * <!-- end-UML-doc -->
  * @param budget <p>the new current budget for the element</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_YKLeQE1IEeekuqvl4T6tsg"
  */
  public void setActualBudget(BigInteger budget) {
    // begin-user-code
    actualBudget = budget;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Sets&nbsp;the&nbsp;current&nbsp;dollar&nbsp;budget&nbsp;for&nbsp;the&nbsp;element.<br></p>
  * <!-- end-UML-doc -->
  * @param budget <p>Sets the current dollar budget for the element.</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_JOpxwE1WEeekuqvl4T6tsg"
  */
  public void setActualDollarBudget(BigInteger budget) {
    // begin-user-code
    actualDollarBudget = budget;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param execution
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_teVQgFD6EeeDDreW7cLBoA"
  */
  public void setCumulativeDollarExecution(BigInteger execution) {
    // begin-user-code
    cumulativeDollarExecution = execution;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Sets&nbsp;the&nbsp;amount&nbsp;of&nbsp;the&nbsp;element's&nbsp;budget&nbsp;that&nbsp;has&nbsp;been&nbsp;spent.<br></p>
  * <!-- end-UML-doc -->
  * @param execution <p>the new amount of the element's budget that has been spent</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_4It3cE1IEeekuqvl4T6tsg"
  */
  public void setCumulativeExecution(BigInteger execution) {
    // begin-user-code
    cumulativeExecution = execution;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Sets&nbsp;the&nbsp;budget&nbsp;element's&nbsp;currency.<br></p>
  * <!-- end-UML-doc -->
  * @param currency <p>the new budget element's currency</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_y2sPEE1GEeekuqvl4T6tsg"
  */
  public void setCurrency(BudgetCurrency currency) {
    // begin-user-code
    this.currency = currency;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;description&nbsp;field.<br></p>
  * <!-- end-UML-doc -->
  * @param description <p>the value of the description field</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Uf1QEEquEeeJsdrfgQXeQw"
  */
  public final void setDescription(String description) {
    // begin-user-code
    this.description = description;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Sets&nbsp;the&nbsp;element's&nbsp;budget&nbsp;as&nbsp;was&nbsp;established&nbsp;in&nbsp;the&nbsp;budgetary&nbsp;law.<br></p>
  * <!-- end-UML-doc -->
  * @param budget <p>the element's budget as was established in the budgetary law</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ZeWGwE1GEeekuqvl4T6tsg"
  */
  public void setInitialBudget(BigInteger budget) {
    // begin-user-code
    initialBudget = budget;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Sets&nbsp;the&nbsp;element's&nbsp;dollar&nbsp;budget&nbsp;as&nbsp;was&nbsp;established&nbsp;in&nbsp;the&nbsp;budgetary&nbsp;law.<br></p>
  * <!-- end-UML-doc -->
  * @param budget <p>the element's dollar budget as was established in the budgetary law.</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_R7HyoE1WEeekuqvl4T6tsg"
  */
  public void setInitialDollarBudget(BigInteger budget) {
    // begin-user-code
    initialDollarBudget = budget;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;name&nbsp;field.<br></p>
  * <!-- end-UML-doc -->
  * @param name <p>the value of the name field</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Uf3sUEquEeeJsdrfgQXeQw"
  */
  public final void setName(String name) {
    // begin-user-code
    this.name = name;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p><br>Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;number&nbsp;field.<br></p>
  * <!-- end-UML-doc -->
  * @param number <p>the value of the number field</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Uf6IkEquEeeJsdrfgQXeQw"
  */
  public final void setNumber(int number) {
    // begin-user-code
    this.number = number;
    // end-user-code
  }
  
}
