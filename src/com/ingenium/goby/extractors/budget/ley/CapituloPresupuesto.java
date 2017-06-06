/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.ley;

import java.util.Collection;
import java.util.Collections;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;que&nbsp;representa&nbsp;un&nbsp;capitulo&nbsp;presupuestario.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UanY4EquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UanY4EquEeeJsdrfgQXeQw"
 */
final class CapituloPresupuesto extends ElementoPresupuestarioCompuesto {

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;CapituloPresupuesto.<br><br>@param&nbsp;numero<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>@param&nbsp;nombre<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>@param&nbsp;descripcion<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion<br>@param&nbsp;programaPresupuestos<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;programas
  * <!-- end-UML-doc -->
  * @param numero
  * @param nombre
  * @param descripcion
  * @param programaPresupuestos
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UiT8UEquEeeJsdrfgQXeQw"
  */
  public CapituloPresupuesto(int numero, String nombre, String descripcion,
      Collection<ProgramaPresupuesto> programaPresupuestos) {
    // begin-user-code
    super(numero, nombre, descripcion, programaPresupuestos);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;programas.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;programas
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UiW_oEquEeeJsdrfgQXeQw"
  */
  @SuppressWarnings("unchecked")
  public final Collection<ProgramaPresupuesto> getProgramas() {
    // begin-user-code
    return ((Collection<ProgramaPresupuesto>) Collections
        .unmodifiableCollection(getSubElementos()));
    // end-user-code
  }

}
