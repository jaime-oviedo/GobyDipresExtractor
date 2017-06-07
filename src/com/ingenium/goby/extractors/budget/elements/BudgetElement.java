/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.elements;

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
  private BudgetElementType type;
  /** 
  * <!-- begin-UML-doc -->
  * <p>The level of the element in the budgetary classifier's hierarchy. The hierarchy is: BATCH-&gt;CHAPTER-&gt;PROGRAM-&gt;SUBTITLE-&gt;ITEM-&gt;ASSIGNMENT. The latter being the deepest leaf level.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_eL3MUEq1EeeJsdrfgQXeQw"
  */
  private BudgetHierarchyLevel level;

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
  * <p>Sets the value of the type field</p>
  * <!-- end-UML-doc -->
  * @param type <p>tThe value of the type field</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_cuJPUErwEeeJsdrfgQXeQw"
  */
  public final void setType(BudgetElementType type) {
    // begin-user-code
    this.type = type;
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
  * <p>Sets the value of the level field.</p>
  * <!-- end-UML-doc -->
  * @param level <p>the value of the level field</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_cuZG8ErwEeeJsdrfgQXeQw"
  */
  public final void setLevel(BudgetHierarchyLevel level) {
    // begin-user-code
    this.level = level;
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
  public BudgetElement(Integer number, String name, String description,
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
  public final Integer getNumber() {
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
  public final void setNumber(Integer number) {
    // begin-user-code
    this.number = number;
    // end-user-code
  }

}
