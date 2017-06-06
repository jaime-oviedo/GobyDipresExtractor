/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.clasificacion;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;base&nbsp;que&nbsp;representa&nbsp;un&nbsp;clasificador&nbsp;presupuestario&nbsp;que&nbsp;puede&nbsp;componerse<br>internamente&nbsp;de&nbsp;otros&nbsp;subelementos&nbsp;de&nbsp;clasificación.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UaAU4EquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UaAU4EquEeeJsdrfgQXeQw"
 */
public class CompositeBudgetElement extends BudgetElement {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgPfwEquEeeJsdrfgQXeQw"
  */
  private Map<Integer, BudgetElement> subElements;

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;ClasificadorCompuesto.<br><br>@param&nbsp;numero<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>@param&nbsp;nombre<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>@param&nbsp;descripcion<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion
  * <!-- end-UML-doc -->
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
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param subelement
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgTxMEquEeeJsdrfgQXeQw"
  */
  public void addSubelement(BudgetElement subelement) {
    // begin-user-code
    subElements.put(subelement.getNumber(), subelement);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
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
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subElementos
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgW0gEquEeeJsdrfgQXeQw"
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

}
