/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.ley;

import java.util.Collection;
import java.util.Collections;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;que&nbsp;representa&nbsp;un&nbsp;programa&nbsp;presupuestario.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UaSBsEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UaSBsEquEeeJsdrfgQXeQw"
 */
final class ProgramaPresupuesto extends ElementoPresupuestarioCompuesto {

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;ProgramaPresupuesto.<br><br>@param&nbsp;numero<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>@param&nbsp;nombre<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>@param&nbsp;descripcion<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion<br>@param&nbsp;subtituloPresupuestos<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subtitulos
  * <!-- end-UML-doc -->
  * @param numero
  * @param nombre
  * @param descripcion
  * @param subtituloPresupuestos
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhdnwEquEeeJsdrfgQXeQw"
  */
  public ProgramaPresupuesto(int numero, String nombre, String descripcion,
      Collection<SubtituloPresupuesto> subtituloPresupuestos) {
    // begin-user-code
    super(numero, nombre, descripcion, subtituloPresupuestos);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subtitulos.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subtitulos
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhhSIEquEeeJsdrfgQXeQw"
  */
  @SuppressWarnings("unchecked")
  public final Collection<SubtituloPresupuesto> getSubtitulos() {
    // begin-user-code
    return ((Collection<SubtituloPresupuesto>) Collections
        .unmodifiableCollection(getSubElementos()));
    // end-user-code
  }

}
