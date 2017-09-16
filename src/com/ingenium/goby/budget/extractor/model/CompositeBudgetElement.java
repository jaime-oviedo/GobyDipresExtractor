/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.model;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * p><br>Base&nbsp;class&nbsp;for&nbsp;budgetary&nbsp;elements&nbsp;that&nbsp;are&nbsp;composed&nbsp;hierarchically<br></p><br><p><br><br>@author JaimeOviedo<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_UaAU4EquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UaAU4EquEeeJsdrfgQXeQw"
 */
public class CompositeBudgetElement extends BudgetElement {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author Jaime Oviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_ohbmwFD8EeeDDreW7cLBoA"
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ohbmwFD8EeeDDreW7cLBoA?DATATYPE"
  */
  public enum ChangeType {
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_pv92cFD8EeeDDreW7cLBoA"
    */
    INITIAL_BUDGET,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_q_0UwFD8EeeDDreW7cLBoA"
    */
    INITIAL_DOLLAR_BUDGET,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_sF82YFD8EeeDDreW7cLBoA"
    */
    ACTUAL_BUDGET,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_s9ap4FD8EeeDDreW7cLBoA"
    */
    ACTUAL_DOLLAR_BUDGET,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_uGw3kFD8EeeDDreW7cLBoA"
    */
    CUMULATIVE_EXECUTION,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_voGugFD8EeeDDreW7cLBoA"
    */
    CUMULATIVE_DOLLAR_EXECUTION
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_tegaMFD7EeeDDreW7cLBoA"
  */
  private static final Logger log = Logger
      .getLogger("com.ingenium.goby.extractors.CompositeBudgetElement");
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UgPfwEquEeeJsdrfgQXeQw"
  */
  private Map<Integer, BudgetElement> subElements;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class CompositeBudgetElement.
  * @param element
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_iRcs8FxhEee8GZGMCONk9w"
  */
  public CompositeBudgetElement(CompositeBudgetElement element) {
    // begin-user-code
    this(element, true);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class CompositeBudgetElement.
  * @param element
  * @param deepClone
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_mG6ioFxhEee8GZGMCONk9w"
  */
  public CompositeBudgetElement(CompositeBudgetElement element,
      boolean deepClone) {
    // begin-user-code
    this(element.getNumber(), element.getName(), element.getDescription(),
        element.getType(), element.getLevel());
    setInitialBudget(element.getInitialBudget());
    setInitialDollarBudget(element.getInitialDollarBudget());
    setActualBudget(element.getActualBudget());
    setActualDollarBudget(element.getActualDollarBudget());
    setCumulativeExecution(element.getCumulativeExecution());
    setCumulativeDollarExecution(element.getCumulativeDollarExecution());
    setCurrency(element.getCurrency());
    setSubelements(element.getSubelements().values(), deepClone);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * rea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;ClasificadorCompuesto.<br><br><br><br>@param&nbsp;numero<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br><br>@param&nbsp;nombre<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br><br>@param&nbsp;descripcion<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  * <!-- end-UML-doc -->
  * Creates a new instance of the class CompositeBudgetElement.
  * @param number
  * @param name
  * @param description
  * @param type
  * @param level
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UgRU8EquEeeJsdrfgQXeQw"
  */
  
  public CompositeBudgetElement(int number, String name, String description,
      BudgetElementType type, BudgetHierarchyLevel level) {
    // begin-user-code
    super(number, name, description, type, level);
    subElements = new HashMap<>();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param subelement
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UgTxMEquEeeJsdrfgQXeQw"
  */
  public void addSubelement(BudgetElement subelement) {
    // begin-user-code
    subElements.put(subelement.getNumber(), subelement);
    recalculate();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param number
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UgU_UEquEeeJsdrfgQXeQw"
  */
  public BudgetElement getSubelement(int number) {
    // begin-user-code
    return subElements.get(number);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * evuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos.<br><br><br><br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElemento
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UgW0gEquEeeJsdrfgQXeQw"
  */
  public Map<Integer, ? extends BudgetElement> getSubelements() {
    // begin-user-code
    return subElements;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_YIBkUE1XEeekuqvl4T6tsg"
  */
  private void recalculate() {
    // begin-user-code
    recalculate(ChangeType.ACTUAL_BUDGET);
    recalculate(ChangeType.ACTUAL_DOLLAR_BUDGET);
    recalculate(ChangeType.INITIAL_BUDGET);
    recalculate(ChangeType.INITIAL_DOLLAR_BUDGET);
    recalculate(ChangeType.CUMULATIVE_EXECUTION);
    recalculate(ChangeType.CUMULATIVE_DOLLAR_EXECUTION);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param changeType
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_xh0CIFD8EeeDDreW7cLBoA"
  */
  private BigInteger recalculate(ChangeType changeType) {
    // begin-user-code
    
    BigInteger actualValue = BigInteger.ZERO;
    switch (changeType) {
      case ACTUAL_BUDGET:
        actualValue = getActualBudget();
        break;
      case ACTUAL_DOLLAR_BUDGET:
        actualValue = getActualDollarBudget();
        break;
      case INITIAL_BUDGET:
        actualValue = getInitialBudget();
        break;
      case INITIAL_DOLLAR_BUDGET:
        actualValue = getInitialDollarBudget();
        break;
      case CUMULATIVE_EXECUTION:
        actualValue = getCumulativeExecution();
        break;
      case CUMULATIVE_DOLLAR_EXECUTION:
        actualValue = getCumulativeDollarExecution();
        break;
    }
    
    BigInteger recalculatedValue = actualValue;
    Collection<? extends BudgetElement> se = getSubelements().values();
    BigInteger subelementValue = BigInteger.ZERO;
    for (BudgetElement be : se) {
      if (be instanceof CompositeBudgetElement) {
        CompositeBudgetElement cbe = (CompositeBudgetElement) be;
        if (cbe.getSubelements().values().size() > 0) {
          subelementValue = subelementValue.add(cbe.recalculate(changeType));
        }
      }
      
      BigInteger tempBudget = BigInteger.ZERO;
      switch (changeType) {
        case ACTUAL_BUDGET:
          tempBudget = be.getActualBudget();
          if (!BigInteger.ZERO.equals(subelementValue)
              && !subelementValue.equals(tempBudget)) {
            CompositeBudgetElement.log.finest(
                new StringBuilder("Replaced directly set actual budget of ")
                    .append(tempBudget.toString())
                    .append(" with calculated budget of ")
                    .append(subelementValue.toString()).toString());
          }
          subelementValue = tempBudget;
          break;
        case ACTUAL_DOLLAR_BUDGET:
          tempBudget = be.getActualDollarBudget();
          if (!BigInteger.ZERO.equals(subelementValue)
              && !subelementValue.equals(tempBudget)) {
            CompositeBudgetElement.log.finest(new StringBuilder(
                "Replaced directly set actual dollar budget of ")
                    .append(tempBudget.toString())
                    .append(" with calculated dollar budget of ")
                    .append(subelementValue.toString()).toString());
          }
          subelementValue = tempBudget;
          break;
        case INITIAL_BUDGET:
          tempBudget = be.getInitialBudget();
          if (!BigInteger.ZERO.equals(subelementValue)
              && !subelementValue.equals(tempBudget)) {
            CompositeBudgetElement.log.finest(
                new StringBuilder("Replaced directly set initial budget of ")
                    .append(tempBudget.toString())
                    .append(" with calculated budget of ")
                    .append(subelementValue.toString()).toString());
          }
          subelementValue = tempBudget;
          break;
        case INITIAL_DOLLAR_BUDGET:
          tempBudget = be.getInitialDollarBudget();
          if (!BigInteger.ZERO.equals(subelementValue)
              && !subelementValue.equals(tempBudget)) {
            CompositeBudgetElement.log.finest(new StringBuilder(
                "Replaced directly set intitial dollar budget of ")
                    .append(tempBudget.toString())
                    .append(" with calculated budget of ")
                    .append(subelementValue.toString()).toString());
          }
          subelementValue = tempBudget;
          break;
        case CUMULATIVE_EXECUTION:
          tempBudget = be.getCumulativeExecution();
          if (!BigInteger.ZERO.equals(subelementValue)
              && !subelementValue.equals(tempBudget)) {
            CompositeBudgetElement.log.finest(new StringBuilder(
                "Replaced directly set cumulative execution of ")
                    .append(tempBudget.toString())
                    .append(" with calculated budget of ")
                    .append(subelementValue.toString()).toString());
          }
          subelementValue = tempBudget;
          break;
        case CUMULATIVE_DOLLAR_EXECUTION:
          tempBudget = be.getCumulativeDollarExecution();
          if (!BigInteger.ZERO.equals(subelementValue)
              && !tempBudget.equals(subelementValue)) {
            CompositeBudgetElement.log.finest(new StringBuilder(
                "Replaced directly set cumulative dollar execution of ")
                    .append(tempBudget.toString())
                    .append(" with calculated budget of ")
                    .append(subelementValue.toString()).toString());
          }
          subelementValue = tempBudget;
          break;
      }
      recalculatedValue = recalculatedValue.add(subelementValue);
    }
    return recalculatedValue;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * p><br>Sets&nbsp;the&nbsp;current&nbsp;budget&nbsp;for&nbsp;the&nbsp;element.<br></p
  * <!-- end-UML-doc -->
  * @param budget <p>the new current budget for the element</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_XZzMYE1XEeekuqvl4T6tsg"
  */
  @Override
  public void setActualBudget(BigInteger budget) {
    // begin-user-code
    super.setActualBudget(budget);
    if (subElements.size() > 0) {
      CompositeBudgetElement.log
          .fine("Trying to set the actual budget of the composite element "
              + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
    recalculate(ChangeType.ACTUAL_BUDGET);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * p><br>Sets&nbsp;the&nbsp;current&nbsp;dollar&nbsp;budget&nbsp;for&nbsp;the&nbsp;element.<br></p
  * <!-- end-UML-doc -->
  * @param budget <p>Sets the current dollar budget for the element.</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_XZ1Bk01XEeekuqvl4T6tsg"
  */
  @Override
  public void setActualDollarBudget(BigInteger budget) {
    // begin-user-code
    super.setActualDollarBudget(budget);
    if (subElements.size() > 0) {
      CompositeBudgetElement.log.fine(
          "Trying to set the actual dollar budget of the composite element "
              + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
    recalculate(ChangeType.ACTUAL_DOLLAR_BUDGET);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param execution
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_0K-RMFEGEeeDDreW7cLBoA"
  */
  @Override
  public void setCumulativeDollarExecution(BigInteger execution) {
    // begin-user-code
    super.setCumulativeDollarExecution(execution);
    if (subElements.size() > 0) {
      CompositeBudgetElement.log.warning(
          "Trying to set the cumulative dollar execution of the composite element "
              + getName()
              + ". This element has subelements, so the provided execution will be overriden.");
    }
    recalculate(ChangeType.CUMULATIVE_DOLLAR_EXECUTION);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * p><br>Sets&nbsp;the&nbsp;amount&nbsp;of&nbsp;the&nbsp;element's&nbsp;budget&nbsp;that&nbsp;has&nbsp;been&nbsp;spent.<br></p
  * <!-- end-UML-doc -->
  * @param execution <p>the new amount of the element's budget that has been spent</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_XZ0agE1XEeekuqvl4T6tsg"
  */
  @Override
  public void setCumulativeExecution(BigInteger execution) {
    // begin-user-code
    super.setCumulativeExecution(execution);
    if (subElements.size() > 0) {
      CompositeBudgetElement.log.fine(
          "Trying to set the cumulative execution of the composite element "
              + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
    recalculate(ChangeType.CUMULATIVE_EXECUTION);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * p><br>Sets&nbsp;the&nbsp;element's&nbsp;budget&nbsp;as&nbsp;was&nbsp;established&nbsp;in&nbsp;the&nbsp;budgetary&nbsp;law.<br></p
  * <!-- end-UML-doc -->
  * @param budget <p>the element's budget as was established in the budgetary law</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_XZylUE1XEeekuqvl4T6tsg"
  */
  @Override
  public void setInitialBudget(BigInteger budget) {
    // begin-user-code
    super.setInitialBudget(budget);
    if (subElements.size() > 0) {
      CompositeBudgetElement.log
          .fine("Trying to set the initial budget of the composite element "
              + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
    recalculate(ChangeType.INITIAL_BUDGET);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * p><br>Sets&nbsp;the&nbsp;element's&nbsp;dollar&nbsp;budget&nbsp;as&nbsp;was&nbsp;established&nbsp;in&nbsp;the&nbsp;budgetary&nbsp;law.<br></p
  * <!-- end-UML-doc -->
  * @param budget <p>the element's dollar budget as was established in the budgetary law.</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_XZ2PsE1XEeekuqvl4T6tsg"
  */
  @Override
  public void setInitialDollarBudget(BigInteger budget) {
    // begin-user-code
    super.setInitialDollarBudget(budget);
    if (subElements.size() > 0) {
      CompositeBudgetElement.log.fine(
          "Trying to set the initial dollar budget of the composite element "
              + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
    recalculate(ChangeType.INITIAL_DOLLAR_BUDGET);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * stablece&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos.<br><br><br><br>@param&nbsp;clasificadores<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  * <!-- end-UML-doc -->
  * @param budgetElements
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UgZQwEquEeeJsdrfgQXeQw"
  */
  public void setSubelements(
      Collection<? extends BudgetElement> budgetElements) {
    // begin-user-code
    setSubelements(budgetElements, true);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * stablece&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos.<br><br><br><br>@param&nbsp;clasificadores<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  * <!-- end-UML-doc -->
  * @param budgetElements
  * @param deepClone
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yI_3oFxlEee8GZGMCONk9w"
  */
  public void setSubelements(Collection<? extends BudgetElement> budgetElements,
      boolean deepClone) {
    // begin-user-code
    subElements.clear();
    for (BudgetElement element : budgetElements) {
      int elementNumber = element.getNumber();
      if (element instanceof CompositeBudgetElement) {
        CompositeBudgetElement cbe = (CompositeBudgetElement) element;
        subElements.put(elementNumber,
            new CompositeBudgetElement(cbe, deepClone));
      } else {
        subElements.put(elementNumber, new BudgetElement(element));
      }
    }
    recalculate();
    
    // end-user-code
  }
  
}
