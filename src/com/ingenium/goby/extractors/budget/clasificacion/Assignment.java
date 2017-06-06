/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.clasificacion;

/** 
 * <!-- begin-UML-doc -->
 * lase&nbsp;que&nbsp;representa&nbsp;la&nbsp;clasificación&nbsp;de&nbsp;una&nbsp;asignación<br>presupuestaria.<br><br><br><br><br>@author&nbsp;JaimeRodrig
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UZvPIEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UZvPIEquEeeJsdrfgQXeQw"
 */
public final class Assignment extends BudgetElement {

  /** 
  * <!-- begin-UML-doc -->
  * rea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;Assignment.<br><br><br><br><br>@param&nbsp;numero<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br><br>@param&nbsp;nombre<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br><br>@param&nbsp;descripcion<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcio
  * <!-- end-UML-doc -->
  * @param numero
  * @param nombre
  * @param descripcion
  * @param type
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UewSAEquEeeJsdrfgQXeQw"
  */
  public Assignment(int numero, String nombre, String descripcion,
      BudgetElementType type) {
    // begin-user-code
    super(numero, nombre, descripcion, type, BudgetHierarchyLevel.ASSIGNMENT);
    // end-user-code
  }

}
