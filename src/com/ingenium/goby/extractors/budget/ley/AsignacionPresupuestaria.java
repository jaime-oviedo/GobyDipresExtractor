/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.ley;

import java.math.BigInteger;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;que&nbsp;representa&nbsp;el&nbsp;presupuesto&nbsp;de&nbsp;una&nbsp;asignación&nbsp;presupuestaria.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UZxEUEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UZxEUEquEeeJsdrfgQXeQw"
 */
final class AsignacionPresupuestaria extends ElementoPresupuestario {

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;AsignacionPresupuestaria.<br><br>@param&nbsp;numero<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>@param&nbsp;nombre<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>@param&nbsp;presupuesto<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;presupuesto
  * <!-- end-UML-doc -->
  * @param numero
  * @param nombre
  * @param descripcion
  * @param presupuesto
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ue1KgEquEeeJsdrfgQXeQw"
  */
  public AsignacionPresupuestaria(int numero, String nombre, String descripcion,
      BigInteger presupuesto) {
    // begin-user-code
    super(numero, nombre, descripcion, presupuesto);
    // end-user-code
  }

}
