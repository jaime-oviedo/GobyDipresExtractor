/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.clasificacion;

import java.util.Map;

/**
 * Clase que representa el clasificador de item presupuestario.
 *
 * @author JaimeRodrigo
 */
public final class Item extends ClasificadorCompuesto {

  /**
   * Crea una nueva instancia de la clase Item.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   * @param subElementos
   *          el valor del campo subElementos
   */
  public Item(int numero, String nombre, String descripcion,
      Map<Integer, Asignacion> subElementos) {
    super(numero, nombre, descripcion, subElementos);
  }

  @SuppressWarnings("unchecked")
  public Map<Integer, Asignacion> getAsignaciones() {
    return (Map<Integer, Asignacion>) getSubElementos();
  }

  public void setAsignaciones(Map<Integer, Asignacion> asignaciones) {
    super.setSubElementos(asignaciones);
  }
}
