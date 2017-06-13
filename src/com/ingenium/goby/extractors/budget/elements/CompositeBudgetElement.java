/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.elements;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * <!-- begin-UML-doc -->
 * <p>
 * This class represents a budget elements that can be composed of other subelements in a
 * hierarchical structure.
 * </p>
 * <p>
 * @author JaimeOviedo
 * </p>
 * <p>
 * </p>
 * <!-- end-UML-doc -->
 * 
 * @author JaimeRodrigo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UaAU4EquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UaAU4EquEeeJsdrfgQXeQw"
 */
public class CompositeBudgetElement extends BudgetElement
    implements BudgetElementChangeListener {

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgPfwEquEeeJsdrfgQXeQw"
   */
  private Map<Integer, BudgetElement> subElements;

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_9E_bkE31EeeKMIXalYEMgg"
   */
  private boolean isDirty = false;

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_2wZmIE33EeeKMIXalYEMgg"
   */
  private static final Logger log = Logger.getLogger(
      "com.ingenium.goby.extractors.elements.CompositeBudgetElement");

  /**
   * <!-- begin-UML-doc -->
   * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;ClasificadorCompuesto.<br>
   * <br>
   * @param&nbsp;numero<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>
   * @param&nbsp;nombre<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>
   * @param&nbsp;descripcion<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion
   * <!-- end-UML-doc --> Crea una nueva instancia de la clase CompositeBudgetElement.
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
    isDirty = true;
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
    if (isDirty) {
      recalculate(this);
    }
    return subElements.get(number);
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos.<br>
   * <br>
   * @return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos <!-- end-UML-doc -->
   * 
   * @return
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgW0gEquEeeJsdrfgQXeQw"
   */
  public Map<Integer, BudgetElement> getSubelements() {
    // begin-user-code
    if (isDirty) {
      recalculate(this);
    }
    return subElements;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> Establece&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos.<br>
   * <br>
   * @param&nbsp;clasificadores<br>
   * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos
   * <!-- end-UML-doc -->
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
    isDirty = true;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @param subelement
   * @return
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_YIBkUE1XEeekuqvl4T6tsg"
   */
  private List<BigInteger> recalculate(BudgetElement subelement) {
    // begin-user-code
    List<BigInteger> baseValues = new ArrayList<>();
    BigInteger iBudget = subelement.getInitialBudget();
    baseValues.add(0, iBudget);

    BigInteger idBudget = subelement.getInitialDollarBudget();
    baseValues.add(1, idBudget);

    BigInteger aBudget = subelement.getActualBudget();
    baseValues.add(2, aBudget);

    BigInteger adBudget = subelement.getActualDollarBudget();
    baseValues.add(3, adBudget);

    BigInteger cExecution = subelement.getCumulativeExecution();
    baseValues.add(4, cExecution);

    BigInteger cdExecution = subelement.getCumulativeDollarExecution();
    baseValues.add(5, cdExecution);

    long currencyLong;
    if (subelement.getCurrency().equals(BudgetCurrency.PESO)) {
      currencyLong = 1;
    } else {
      if (subelement.getCurrency().equals(BudgetCurrency.DOLLAR)) {
        currencyLong = 2;
      } else {
        currencyLong = 3;
      }
    }
    baseValues.add(6, BigInteger.valueOf(currencyLong));

    if (!(subelement instanceof CompositeBudgetElement)) {
      return baseValues;
    }

    CompositeBudgetElement cbe = (CompositeBudgetElement) subelement;
    Collection<BudgetElement> sse = cbe.getSubelements().values();

    if (sse.size() == 0) {
      return baseValues;
    }

    boolean mixedCurrency = false;
    for (BudgetElement e : sse) {
      List<BigInteger> additionalValues = recalculate(e);
      iBudget = iBudget.add(additionalValues.get(0));
      idBudget = idBudget.add(additionalValues.get(1));
      aBudget = aBudget.add(additionalValues.get(2));
      adBudget = adBudget.add(additionalValues.get(3));
      cExecution = cExecution.add(additionalValues.get(4));
      long additionalCurrencyLong;
      if (e.getCurrency().equals(BudgetCurrency.PESO)) {
        additionalCurrencyLong = 1;
      } else {
        if (e.getCurrency().equals(BudgetCurrency.DOLLAR)) {
          additionalCurrencyLong = 2;
        } else {
          additionalCurrencyLong = 3;
        }
      }
      if (currencyLong != additionalCurrencyLong) {
        mixedCurrency = true;
      }
    }

    setInitialBudget(iBudget);
    setInitialDollarBudget(idBudget);
    setActualBudget(aBudget);
    setActualDollarBudget(adBudget);
    setCumulativeExecution(cExecution);
    setCumulativeDollarExecution(cdExecution);
    if (mixedCurrency) {
      setCurrency(BudgetCurrency.MIXED);
      currencyLong = 3;
    } else {
      if (currencyLong == 1) {
        setCurrency(BudgetCurrency.PESO);
      } else if (currencyLong == 2) {
        setCurrency(BudgetCurrency.DOLLAR);
      }
    }
    baseValues.clear();
    baseValues.add(0, iBudget);
    baseValues.add(1, idBudget);
    baseValues.add(2, aBudget);
    baseValues.add(3, adBudget);
    baseValues.add(4, cExecution);
    baseValues.add(5, cdExecution);
    baseValues.add(6, BigInteger.valueOf(currencyLong));

    return baseValues;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Retunrs he amount of the element's dollar budget that has been spent.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @return
   *         <p>
   *         the amount of the element's dollar budget that has been spent
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0dxRoE32EeeKMIXalYEMgg"
   */
  @Override
  public BigInteger getCumulativeDollarExecution() {
    // begin-user-code
    if (isDirty) {
      recalculate(this);
    }
    return super.getCumulativeDollarExecution();
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
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0dyfwE32EeeKMIXalYEMgg"
   */
  @Override
  public BigInteger getInitialBudget() {
    // begin-user-code
    if (isDirty) {
      recalculate(this);
    }
    return super.getInitialBudget();
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
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0dzG0E32EeeKMIXalYEMgg"
   */
  @Override
  public BigInteger getActualBudget() {
    // begin-user-code
    if (isDirty) {
      recalculate(this);
    }
    return super.getActualBudget();
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
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0dzG1E32EeeKMIXalYEMgg"
   */
  @Override
  public void setInitialBudget(BigInteger budget) {
    // begin-user-code
    super.setInitialBudget(budget);
    isDirty = true;
    if (subElements.size() > 0) {
      CompositeBudgetElement.log.warning(
          "Trying to set the budget of the composite element " + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Sets the budget element's currency.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @param currency
   *          <p>
   *          the new budget element's currency
   *          </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0dzt4E32EeeKMIXalYEMgg"
   */
  @Override
  public void setCurrency(BudgetCurrency currency) {
    // begin-user-code
    super.setCurrency(currency);
    isDirty = true;
    if (subElements.size() > 0) {
      CompositeBudgetElement.log.warning(
          "Trying to set the currency of the composite element " + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
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
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0d0U8E32EeeKMIXalYEMgg"
   */
  @Override
  public BudgetCurrency getCurrency() {
    // begin-user-code
    if (isDirty) {
      recalculate(this);
    }
    return super.getCurrency();
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
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0d08AE32EeeKMIXalYEMgg"
   */
  @Override
  public void setActualBudget(BigInteger budget) {
    // begin-user-code
    super.setActualBudget(budget);
    isDirty = true;
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
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0d1jEE32EeeKMIXalYEMgg"
   */
  @Override
  public BigInteger getCumulativeExecution() {
    // begin-user-code
    if (isDirty) {
      recalculate(this);
    }
    return super.getCumulativeExecution();

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
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0d2KIE32EeeKMIXalYEMgg"
   */
  @Override
  public void setCumulativeExecution(BigInteger execution) {
    // begin-user-code
    super.setCumulativeExecution(execution);
    isDirty = true;
    if (subElements.size() > 0) {
      CompositeBudgetElement.log.warning(
          "Trying to set the execution of the composite element " + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
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
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0d2xME32EeeKMIXalYEMgg"
   */
  @Override
  public BigInteger getActualDollarBudget() {
    // begin-user-code
    if (isDirty) {
      recalculate(this);
    }
    return super.getActualDollarBudget();

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
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0d3YQE32EeeKMIXalYEMgg"
   */
  @Override
  public void setActualDollarBudget(BigInteger budget) {
    // begin-user-code
    super.setActualDollarBudget(budget);
    isDirty = true;
    if (subElements.size() > 0) {
      CompositeBudgetElement.log.warning(
          "Trying to set the budget of the composite element " + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
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
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0d3_UE32EeeKMIXalYEMgg"
   */
  @Override
  public BigInteger getInitialDollarBudget() {
    // begin-user-code
    if (isDirty) {
      recalculate(this);
    }
    return super.getInitialDollarBudget();

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
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0d4mYE32EeeKMIXalYEMgg"
   */
  @Override
  public void setInitialDollarBudget(BigInteger budget) {
    // begin-user-code
    super.setInitialDollarBudget(budget);
    isDirty = true;
    if (subElements.size() > 0) {
      CompositeBudgetElement.log.warning(
          "Trying to set the budget of the composite element " + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Sets the amount of the element's dollar budget that has been spent.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @param execution
   *          <p>
   *          the amount of the element's dollar budget that has been spent
   *          </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0d5NcE32EeeKMIXalYEMgg"
   */
  @Override
  public void setCumulativeDollarExecution(BigInteger execution) {
    // begin-user-code
    super.setCumulativeDollarExecution(execution);
    isDirty = true;
    if (subElements.size() > 0) {
      CompositeBudgetElement.log.warning(
          "Trying to set the execution of the composite element " + getName()
              + ". This element has subelements, so the provided budget will be overriden.");
    }
    // end-user-code
  }

  /**
   * (non-Javadoc)
   * 
   * @see BudgetElementChangeListener#elementChanged(BudgetElement element)
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_EmcokE37EeeKMIXalYEMgg?INHERITED"
   */
  @Override
  public void elementChanged(BudgetElement element) {
    // begin-user-code
    isDirty = true;

    // end-user-code
  }

}
