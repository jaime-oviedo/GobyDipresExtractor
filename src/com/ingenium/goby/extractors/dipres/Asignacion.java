/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import java.math.BigInteger;

/**
 * Clase que representa una asignación presupuestaria.
 *
 * @author JaimeRodrigo
 */
final class Asignacion extends ElementoPresupuestario {

  /**
   * Crea una nueva instancia de la clase Asignacion.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param presupuesto
   *          el valor del campo presupuesto
   */
  public Asignacion(int numero, String nombre, String descripcion, BigInteger presupuesto) {
    super(numero, nombre, descripcion, presupuesto);
  }

}
