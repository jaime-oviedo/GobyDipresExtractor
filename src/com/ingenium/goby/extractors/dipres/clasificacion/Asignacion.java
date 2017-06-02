/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.clasificacion;

/**
 * Clase que representa la clasificación de una asignación presupuestaria.
 *
 * @author JaimeRodrigo
 */
public final class Asignacion extends Clasificador {

  /**
   * Crea una nueva instancia de la clase Asignacion.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   */
  public Asignacion(int numero, String nombre, String descripcion) {
    super(numero, nombre, descripcion);
  }

}
