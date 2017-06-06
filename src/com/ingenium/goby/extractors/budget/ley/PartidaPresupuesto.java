/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.ley;

import java.util.Collection;
import java.util.Collections;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;que&nbsp;representa&nbsp;una&nbsp;partida&nbsp;presupuestaria.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UZqWoEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UZqWoEquEeeJsdrfgQXeQw"
 */
final class PartidaPresupuesto extends ElementoPresupuestarioCompuesto {

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;PartidaPresupuesto.<br><br>@param&nbsp;numero<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>@param&nbsp;nombre<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>@param&nbsp;descripcion<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion<br>@param&nbsp;capituloPresupuestos<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;capitulos
  * <!-- end-UML-doc -->
  * @param numero
  * @param nombre
  * @param descripcion
  * @param capituloPresupuestos
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UecI8EquEeeJsdrfgQXeQw"
  */
  public PartidaPresupuesto(int numero, String nombre, String descripcion,
      Collection<CapituloPresupuesto> capituloPresupuestos) {
    // begin-user-code
    super(numero, nombre, descripcion, capituloPresupuestos);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;capitulos.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;capitulos
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UefzUEquEeeJsdrfgQXeQw"
  */
  @SuppressWarnings("unchecked")
  public final Collection<CapituloPresupuesto> getCapitulos() {
    // begin-user-code
    return ((Collection<CapituloPresupuesto>) Collections
        .unmodifiableCollection(getSubElementos()));
    // end-user-code
  }

}
