/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.elements;

/** 
 * <!-- begin-UML-doc -->
 * <p>Class that represents a basic, non-extensible budgetary item.<br>@author JaimeOviedo</p>
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_Ua33kEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ua33kEquEeeJsdrfgQXeQw"
 */
public final class SimpleClassifier extends BudgetElement {

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;SimpleClassifier.<br><br>@param&nbsp;numero<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>@param&nbsp;nombre<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>@param&nbsp;descripcion<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion
  * <!-- end-UML-doc -->
  * @param number
  * @param name
  * @param description
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uj2NYEquEeeJsdrfgQXeQw"
  */
  public SimpleClassifier(int number, String name, String description) {
    // begin-user-code
    super(number, name, description, BudgetElementType.NONE,
        BudgetHierarchyLevel.NONE);
    // end-user-code
  }

}
