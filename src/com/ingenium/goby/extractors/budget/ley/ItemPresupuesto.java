/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.ley;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;que&nbsp;representa&nbsp;un&nbsp;item&nbsp;presupuestario.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UXP70EquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UXP70EquEeeJsdrfgQXeQw"
 */
class ItemPresupuesto extends ElementoPresupuestarioCompuesto {

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;ItemPresupuesto.<br><br>@param&nbsp;numero<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>@param&nbsp;nombre<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>@param&nbsp;presupuesto<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;presupuesto
  * <!-- end-UML-doc -->
  * @param numero
  * @param nombre
  * @param descripcion
  * @param presupuesto
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UeOtkEquEeeJsdrfgQXeQw"
  */
  public ItemPresupuesto(int numero, String nombre, String descripcion,
      BigInteger presupuesto) {
    // begin-user-code
    super(numero, nombre, descripcion, presupuesto);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;ItemPresupuesto.<br><br>@param&nbsp;numero<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>@param&nbsp;nombre<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>@param&nbsp;asignaciones<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;asignaciones
  * <!-- end-UML-doc -->
  * @param numero
  * @param nombre
  * @param descripcion
  * @param asignaciones
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UeRw4EquEeeJsdrfgQXeQw"
  */
  public ItemPresupuesto(int numero, String nombre, String descripcion,
      Collection<AsignacionPresupuestaria> asignaciones) {
    // begin-user-code
    super(numero, nombre, descripcion, asignaciones);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;asignaciones.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;asignaciones
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UeU0MEquEeeJsdrfgQXeQw"
  */
  public final Collection<AsignacionPresupuestaria> getAsignaciones() {
    // begin-user-code
    @SuppressWarnings("unchecked")
    Collection<AsignacionPresupuestaria> a = (Collection<AsignacionPresupuestaria>) Collections
        .unmodifiableCollection(getSubElementos());
    return a;
    // end-user-code
  }

}
