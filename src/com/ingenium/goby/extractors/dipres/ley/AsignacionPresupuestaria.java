/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.ley;

import java.math.BigInteger;

/**
 * Clase que representa el presupuesto de una asignación presupuestaria.
 *
 * @author JaimeRodrigo
 */
final class AsignacionPresupuestaria extends ElementoPresupuestario {

  /**
   * Crea una nueva instancia de la clase AsignacionPresupuestaria.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param presupuesto
   *          el valor del campo presupuesto
   */
  public AsignacionPresupuestaria(int numero, String nombre, String descripcion,
      BigInteger presupuesto) {
    super(numero, nombre, descripcion, presupuesto);
  }

}
