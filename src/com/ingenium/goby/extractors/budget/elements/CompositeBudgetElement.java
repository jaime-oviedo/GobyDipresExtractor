/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.elements;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;base&nbsp;que&nbsp;representa&nbsp;un&nbsp;clasificador&nbsp;presupuestario&nbsp;que&nbsp;puede&nbsp;componerse<br>internamente&nbsp;de&nbsp;otros&nbsp;subelementos&nbsp;de&nbsp;clasificación.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/elements.efx#_UaAU4EquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/elements.efx#_UaAU4EquEeeJsdrfgQXeQw"
 */
public class CompositeBudgetElement extends BudgetElement {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author joviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/elements.efx#_ohbmwFD8EeeDDreW7cLBoA"
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_ohbmwFD8EeeDDreW7cLBoA?DATATYPE"
  */
  public enum ChangeType {
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/elements.efx#_pv92cFD8EeeDDreW7cLBoA"
    */
    INITIAL_BUDGET,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/elements.efx#_q_0UwFD8EeeDDreW7cLBoA"
    */
    INITIAL_DOLLAR_BUDGET,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/elements.efx#_sF82YFD8EeeDDreW7cLBoA"
    */
    ACTUAL_BUDGET,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/elements.efx#_s9ap4FD8EeeDDreW7cLBoA"
    */
    ACTUAL_DOLLAR_BUDGET,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/elements.efx#_uGw3kFD8EeeDDreW7cLBoA"
    */
    CUMULATIVE_EXECUTION,
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/elements.efx#_voGugFD8EeeDDreW7cLBoA"
    */
    CUMULATIVE_DOLLAR_EXECUTION
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_UgPfwEquEeeJsdrfgQXeQw"
  */
  private Map<Integer, BudgetElement> subElements;

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_tegaMFD7EeeDDreW7cLBoA"
  */
  private static final Logger log = Logger
      .getLogger("com.ingenium.goby.extractors.CompositeBudgetElement");

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;ClasificadorCompuesto.<br><br>@param&nbsp;numero<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>@param&nbsp;nombre<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>@param&nbsp;descripcion<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion
  * <!-- end-UML-doc -->
  * @param number
  * @param name
  * @param description
  * @param type
  * @param level
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_UgRU8EquEeeJsdrfgQXeQw"
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
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_UgTxMEquEeeJsdrfgQXeQw"
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
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_UgU_UEquEeeJsdrfgQXeQw"
  */
  public BudgetElement getSubelement(Integer number) {
    // begin-user-code
    return subElements.get(number);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_UgW0gEquEeeJsdrfgQXeQw"
  */
  public Map<Integer, BudgetElement> getSubelements() {
    // begin-user-code
    return subElements;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Establece&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos.<br><br>@param&nbsp;clasificadores<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos
  * <!-- end-UML-doc -->
  * @param budgetElements
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_UgZQwEquEeeJsdrfgQXeQw"
  */
  public void setSubelements(Collection<BudgetElement> budgetElements) {
    // begin-user-code
    subElements.clear();
    Iterator<BudgetElement> it = budgetElements.iterator();
    while (it.hasNext()) {
      BudgetElement budgetElement = it.next();
      subElements.put(budgetElement.getNumber(), budgetElement);
    }
    recalculate();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_YIBkUE1XEeekuqvl4T6tsg"
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
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_xh0CIFD8EeeDDreW7cLBoA"
  */
  private BigInteger recalculate(ChangeType changeType) {
    // begin-user-code

    BigInteger actualValue = BigInteger.ZERO;
    switch (changeType) {
    case ACTUAL_BUDGET:
      actualValue = this.getActualBudget();
      break;
    case ACTUAL_DOLLAR_BUDGET:
      actualValue = this.getActualDollarBudget();
      break;
    case INITIAL_BUDGET:
      actualValue = this.getInitialBudget();
      break;
    case INITIAL_DOLLAR_BUDGET:
      actualValue = this.getInitialDollarBudget();
      break;
    case CUMULATIVE_EXECUTION:
      actualValue = this.getCumulativeExecution();
      break;
    case CUMULATIVE_DOLLAR_EXECUTION:
      actualValue = this.getCumulativeDollarExecution();
      break;
    }

    BigInteger recalculatedValue = actualValue;
    Collection<BudgetElement> se = this.getSubelements().values();
    for (BudgetElement be : se) {
      if (be instanceof CompositeBudgetElement) {
        CompositeBudgetElement cbe = (CompositeBudgetElement) be;
        if (cbe.getSubelements().values().size() > 0)
          cbe.recalculate(changeType);
      }
      BigInteger subelementValue = BigInteger.ZERO;
      switch (changeType) {
      case ACTUAL_BUDGET:
        subelementValue = be.getActualBudget();
        break;
      case ACTUAL_DOLLAR_BUDGET:
        subelementValue = be.getActualDollarBudget();
        break;
      case INITIAL_BUDGET:
        subelementValue = be.getInitialBudget();
        break;
      case INITIAL_DOLLAR_BUDGET:
        subelementValue = be.getInitialDollarBudget();
        break;
      case CUMULATIVE_EXECUTION:
        subelementValue = be.getCumulativeExecution();
        break;
      case CUMULATIVE_DOLLAR_EXECUTION:
        subelementValue = be.getCumulativeDollarExecution();
        break;
      }
      recalculatedValue = recalculatedValue.add(subelementValue);
    }
    return recalculatedValue;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param execution
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_0K-RMFEGEeeDDreW7cLBoA"
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
  * <p>Sets the element's budget as was established in the budgetary law.</p>
  * <!-- end-UML-doc -->
  * @param budget <p>the element's budget as was established in the budgetary law</p>
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_XZylUE1XEeekuqvl4T6tsg"
  */
  @Override
  public void setInitialBudget(BigInteger budget) {
    // begin-user-code
    super.setInitialBudget(budget);
    if (subElements.size() > 0) {
      CompositeBudgetElement.log
          .warning("Trying to set the initial budget of the composite element "
              + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
    recalculate(ChangeType.INITIAL_BUDGET);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the current budget for the element.</p>
  * <!-- end-UML-doc -->
  * @param budget <p>the new current budget for the element</p>
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_XZzMYE1XEeekuqvl4T6tsg"
  */
  @Override
  public void setActualBudget(BigInteger budget) {
    // begin-user-code
    super.setActualBudget(budget);
    if (subElements.size() > 0) {
      CompositeBudgetElement.log
          .warning("Trying to set the actual budget of the composite element "
              + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
    recalculate(ChangeType.ACTUAL_BUDGET);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the amount of the element's budget that has been spent.</p>
  * <!-- end-UML-doc -->
  * @param execution <p>the new amount of the element's budget that has been spent</p>
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_XZ0agE1XEeekuqvl4T6tsg"
  */
  @Override
  public void setCumulativeExecution(BigInteger execution) {
    // begin-user-code
    super.setCumulativeExecution(execution);
    if (subElements.size() > 0) {
      CompositeBudgetElement.log.warning(
          "Trying to set the cumulative execution of the composite element "
              + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
    recalculate(ChangeType.CUMULATIVE_EXECUTION);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the current dollar budget for the element.</p>
  * <!-- end-UML-doc -->
  * @param budget <p>Sets the current dollar budget for the element.</p>
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_XZ1Bk01XEeekuqvl4T6tsg"
  */
  @Override
  public void setActualDollarBudget(BigInteger budget) {
    // begin-user-code
    super.setActualDollarBudget(budget);
    if (subElements.size() > 0) {
      CompositeBudgetElement.log.warning(
          "Trying to set the actual dollar budget of the composite element "
              + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
    recalculate(ChangeType.ACTUAL_DOLLAR_BUDGET);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the element's dollar budget as was established in the budgetary law.</p>
  * <!-- end-UML-doc -->
  * @param budget <p>the element's dollar budget as was established in the budgetary law.</p>
  * @generated "sourceid:platform:/resource/goby-design/elements.efx#_XZ2PsE1XEeekuqvl4T6tsg"
  */
  @Override
  public void setInitialDollarBudget(BigInteger budget) {
    // begin-user-code
    super.setInitialDollarBudget(budget);
    if (subElements.size() > 0) {
      CompositeBudgetElement.log.warning(
          "Trying to set the initial dollar budget of the composite element "
              + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
    recalculate(ChangeType.INITIAL_DOLLAR_BUDGET);
    // end-user-code
  }

}
