/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.model;

/** 
 * <!-- begin-UML-doc -->
 * <p>Class that represents a budgetary assignment.<br>@author JaimeRodrigo</p>
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_UZvPIEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UZvPIEquEeeJsdrfgQXeQw"
 */
public final class Assignment extends BudgetElement {
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Creates a new instance of an Assignment.</p>
  * <!-- end-UML-doc -->
  * Creates a new instance of the class Assignment.
  * @param number <p>the value of the number field.</p>
  * @param name <p>the value of the name field.</p>
  * @param description <p>the value of the description field.</p>
  * @param type <p>the value of the title field.</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UewSAEquEeeJsdrfgQXeQw"
  */
  public Assignment(int number, String name, String description,
      BudgetElementType type) {
    // begin-user-code
    super(number, name, description, type, BudgetHierarchyLevel.ASSIGNMENT);
    // end-user-code
  }
  
}
