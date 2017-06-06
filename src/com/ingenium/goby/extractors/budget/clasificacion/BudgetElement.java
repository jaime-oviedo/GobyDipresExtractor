/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.clasificacion;

/** 
 * <!-- begin-UML-doc -->
 * lase&nbsp;base&nbsp;para&nbsp;la&nbsp;jerarquía&nbsp;de&nbsp;elementos&nbsp;de&nbsp;clasificación<br>presupuestaria.<br><br><br><br><br>@author&nbsp;JaimeRodrig
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UZ4ZEEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UZ4ZEEquEeeJsdrfgQXeQw"
 */
public class BudgetElement {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfkKUEquEeeJsdrfgQXeQw"
  */
  private Integer number;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ufl_gEquEeeJsdrfgQXeQw"
  */
  private String name;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ufn0sEquEeeJsdrfgQXeQw"
  */
  private String description;

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_W7HikEq1EeeJsdrfgQXeQw"
  */
  private BudgetElementType type;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_eL3MUEq1EeeJsdrfgQXeQw"
  */
  private BudgetHierarchyLevel level;

  /** 
  * <!-- begin-UML-doc -->
  * @return&nbsp;the&nbsp;type
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_cuAscErwEeeJsdrfgQXeQw"
  */
  public final BudgetElementType getType() {
    // begin-user-code
    return type;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * @param&nbsp;type<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;type&nbsp;to&nbsp;set
  * <!-- end-UML-doc -->
  * @param type
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_cuJPUErwEeeJsdrfgQXeQw"
  */
  public final void setType(BudgetElementType type) {
    // begin-user-code
    this.type = type;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * @return&nbsp;the&nbsp;level
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_cuRLIErwEeeJsdrfgQXeQw"
  */
  public final BudgetHierarchyLevel getLevel() {
    // begin-user-code
    return level;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * @param&nbsp;level<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;level&nbsp;to&nbsp;set
  * <!-- end-UML-doc -->
  * @param level
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_cuZG8ErwEeeJsdrfgQXeQw"
  */
  public final void setLevel(BudgetHierarchyLevel level) {
    // begin-user-code
    this.level = level;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * rea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;Clasificador.<br><br><br><br><br>@param&nbsp;numero<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br><br>@param&nbsp;nombre<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br><br>@param&nbsp;descripcion<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcio
  * <!-- end-UML-doc -->
  * @param number
  * @param name
  * @param description
  * @param type
  * @param level
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
  * evuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion.<br><br><br><br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcio
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UftUQEquEeeJsdrfgQXeQw"
  */
  public final String getDescription() {
    // begin-user-code
    return description;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * evuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre.<br><br><br><br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombr
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfwXkEquEeeJsdrfgQXeQw"
  */
  public final String getName() {
    // begin-user-code
    return name;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * evuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero.<br><br><br><br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numer
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ufyz0EquEeeJsdrfgQXeQw"
  */
  public final Integer getNumber() {
    // begin-user-code
    return number;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param description
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uf1QEEquEeeJsdrfgQXeQw"
  */
  public final void setDescription(String description) {
    // begin-user-code
    this.description = description;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param name
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uf3sUEquEeeJsdrfgQXeQw"
  */
  public final void setName(String name) {
    // begin-user-code
    this.name = name;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param number
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uf6IkEquEeeJsdrfgQXeQw"
  */
  public final void setNumber(Integer number) {
    // begin-user-code
    this.number = number;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * onvierte&nbsp;el&nbsp;clasificador&nbsp;en&nbsp;un&nbsp;string&nbsp;Json<br><br><br><br><br>@param&nbsp;nestingLevel<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;número&nbsp;basico&nbsp;de&nbsp;identaciones.&nbsp;Resulta&nbsp;útil&nbsp;al&nbsp;anidar&nbsp;transformaciones&nbsp;a&nbsp;Json.<br><br>@return&nbsp;la&nbsp;representación&nbsp;del&nbsp;clasificador&nbsp;en&nbsp;un&nbsp;objeto&nbsp;Jso
  * <!-- end-UML-doc -->
  * @param nestingLevel
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uf8k0EquEeeJsdrfgQXeQw"
  */
  public String toJsonString(int nestingLevel) {
    // begin-user-code
    StringBuilder nesting = new StringBuilder();
    for (int i = 0; i < nestingLevel; i++) {
      nesting.append("  ");
    }

    StringBuilder sb = new StringBuilder(nesting);
    sb.append("{\n");
    nesting.append("  ");
    String q = "\"";
    sb.append(nesting).append(q + "number" + q + ":" + getNumber() + ",\n");
    sb.append(nesting).append(q + "name" + q + ":" + q + getName() + q + ",\n");
    sb.append(nesting)
        .append(q + "description" + q + ":" + q + getDescription() + q + "\n");
    nesting.delete(nesting.length() - 2, nesting.length());
    sb.append(nesting).append("}");
    return sb.toString();
    // end-user-code
  }

}
