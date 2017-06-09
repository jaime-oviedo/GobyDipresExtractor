/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.elements;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * <!-- begin-UML-doc -->
 * Clase&nbsp;base&nbsp;que&nbsp;representa&nbsp;un&nbsp;clasificador&nbsp;presupuestario&nbsp;que&nbsp;puede&nbsp;componerse<br>
 * internamente&nbsp;de&nbsp;otros&nbsp;subelementos&nbsp;de&nbsp;clasificación.<br>
 * <br>
 * 
 * @author&nbsp;JaimeRodrigo <!-- end-UML-doc -->
 * 
 * @author joviedo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UaAU4EquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UaAU4EquEeeJsdrfgQXeQw"
 */
public class CompositeBudgetElement extends BudgetElement {

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgPfwEquEeeJsdrfgQXeQw"
   */
  private Map<Integer, BudgetElement> subElements;

  /**
   * <!-- begin-UML-doc -->
   * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;ClasificadorCompuesto.<br>
   * <br>
   * @param&nbsp;numero<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>
   * @param&nbsp;nombre<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>
   * @param&nbsp;descripcion<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion
   *                               <!-- end-UML-doc -->
   * 
   * @param number
   * @param name
   * @param description
   * @param type
   * @param level
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgRU8EquEeeJsdrfgQXeQw"
   */

  public CompositeBudgetElement(int number, String name, String description,
      BudgetElementType type, BudgetHierarchyLevel level) {
    // begin-user-code
    super(number, name, description, type, level);
    subElements = new HashMap<>();
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @param subelement
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgTxMEquEeeJsdrfgQXeQw"
   */
  public void addSubelement(BudgetElement subelement) {
    // begin-user-code
    subElements.put(subelement.getNumber(), subelement);
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @param number
   * @return
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgU_UEquEeeJsdrfgQXeQw"
   */
  public BudgetElement getSubelement(Integer number) {
    // begin-user-code
    return subElements.get(number);
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos.<br>
   * <br>
   * 
   * @return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos <!-- end-UML-doc -->
   * 
   * @return
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgW0gEquEeeJsdrfgQXeQw"
   */
  public Map<Integer, BudgetElement> getSubelements() {
    // begin-user-code
    return subElements;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> Establece&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos.<br>
   * <br>
   * @param&nbsp;clasificadores<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos
   *                                  <!-- end-UML-doc -->
   * 
   * @param budgetElements
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgZQwEquEeeJsdrfgQXeQw"
   */
  public void setSubelements(Collection<BudgetElement> budgetElements) {
    // begin-user-code
    subElements.clear();
    Iterator<BudgetElement> it = budgetElements.iterator();
    while (it.hasNext()) {
      BudgetElement budgetElement = it.next();
      subElements.put(budgetElement.getNumber(), budgetElement);
    }

    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Returns the element's budget as was established in the budgetary law
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @return
   *         <p>
   *         the element's budget as was established in the budgetary law
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_XZwwIE1XEeekuqvl4T6tsg"
   */
  @Override
  public BigInteger getInitialBudget() {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Returns the current budget for the element.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @return
   *         <p>
   *         the current budget for the element
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_XZx-QE1XEeekuqvl4T6tsg"
   */
  @Override
  public BigInteger getActualBudget() {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Sets the element's budget as was established in the budgetary law.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @param budget
   *          <p>
   *          the element's budget as was established in the budgetary law
   *          </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_XZylUE1XEeekuqvl4T6tsg"
   */
  @Override
  public void setInitialBudget(BigInteger budget) {
    // begin-user-code
    // TODO Auto-generated method stub

    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Returns the budget element's currency.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @return
   *         <p>
   *         the budget element's currency
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_XZylVE1XEeekuqvl4T6tsg"
   */
  @Override
  public BudgetCurrency getCurrency() {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Sets the current budget for the element.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @param budget
   *          <p>
   *          the new current budget for the element
   *          </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_XZzMYE1XEeekuqvl4T6tsg"
   */
  @Override
  public void setActualBudget(BigInteger budget) {
    // begin-user-code
    // TODO Auto-generated method stub

    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Returns the amount of the element's budget that has been spent.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @return
   *         <p>
   *         the amount of the element's budget that has been spent
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_XZzzcE1XEeekuqvl4T6tsg"
   */
  @Override
  public BigInteger getCumulativeExecution() {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Sets the amount of the element's budget that has been spent.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @param execution
   *          <p>
   *          the new amount of the element's budget that has been spent
   *          </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_XZ0agE1XEeekuqvl4T6tsg"
   */
  @Override
  public void setCumulativeExecution(BigInteger execution) {
    // begin-user-code
    // TODO Auto-generated method stub

    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Returns the current dollar budget for the element.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @return
   *         <p>
   *         the current dollar budget for the element.
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_XZ0ahE1XEeekuqvl4T6tsg"
   */
  @Override
  public BigInteger getActualDollarBudget() {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Sets the current dollar budget for the element.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @param budget
   *          <p>
   *          Sets the current dollar budget for the element.
   *          </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_XZ1Bk01XEeekuqvl4T6tsg"
   */
  @Override
  public void setActualDollarBudget(BigInteger budget) {
    // begin-user-code
    // TODO Auto-generated method stub

    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Returns the element's dollar budget as was established in the budgetary law
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @return
   *         <p>
   *         Returns the element's dollar budget as was established in the budgetary law
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_XZ1ooE1XEeekuqvl4T6tsg"
   */
  @Override
  public BigInteger getInitialDollarBudget() {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Sets the element's dollar budget as was established in the budgetary law.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @param budget
   *          <p>
   *          the element's dollar budget as was established in the budgetary law.
   *          </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_XZ2PsE1XEeekuqvl4T6tsg"
   */
  @Override
  public void setInitialDollarBudget(BigInteger budget) {
    // begin-user-code
    // TODO Auto-generated method stub

    // end-user-code
  }

  // /**
  // * <!-- begin-UML-doc --> <!-- end-UML-doc -->
  // *
  // * @param subelement
  // * @return
  // * @generated
  // "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_YIBkUE1XEeekuqvl4T6tsg"
  // */
  // private Collection<BigInteger> recalculate(BudgetElement element) {
  // // begin-user-code
  // Collection<BigInteger> elementVector = new ArrayList<>();
  // if (element instanceof CompositeBudgetElement) {
  // CompositeBudgetElement compositeElement = (CompositeBudgetElement) element;
  // if(compositeElement.subElements.size()>0){
  // for()
  // Collection<BigInteger> subElementVector=recalculate
  // }
  // }
  //
  // return BigInteger.ZERO;
  // // end-user-code
  // }

}
