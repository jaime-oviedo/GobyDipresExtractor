/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.ley;

import java.util.Collection;
import java.util.Collections;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;que&nbsp;representa&nbsp;un&nbsp;subtitulo&nbsp;presupuestario.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UZ6OQEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UZ6OQEquEeeJsdrfgQXeQw"
 */
final class SubtituloPresupuesto extends ElementoPresupuestarioCompuesto {

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;SubtituloPresupuesto.<br><br>@param&nbsp;numero<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>@param&nbsp;nombre<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>@param&nbsp;descripcion<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion<br>@param&nbsp;itemPresupuestos<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;items
  * <!-- end-UML-doc -->
  * @param numero
  * @param nombre
  * @param descripcion
  * @param itemPresupuestos
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgCEYEquEeeJsdrfgQXeQw"
  */
  public SubtituloPresupuesto(int numero, String nombre, String descripcion,
      Collection<ItemPresupuesto> itemPresupuestos) {
    // begin-user-code
    super(numero, nombre, descripcion, itemPresupuestos);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;items.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;items
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgG84EquEeeJsdrfgQXeQw"
  */
  public final Collection<ItemPresupuesto> getItems() {
    // begin-user-code
    @SuppressWarnings("unchecked")
    Collection<ItemPresupuesto> a = (Collection<ItemPresupuesto>) Collections
        .unmodifiableCollection(getSubElementos());
    return a;
    // end-user-code
  }

}
