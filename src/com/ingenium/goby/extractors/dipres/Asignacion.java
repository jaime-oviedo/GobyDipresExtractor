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
final class Asignacion {

  private final int numero;
  private final String nombre;
  private final BigInteger presupuesto;

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
  public Asignacion(int numero, String nombre, BigInteger presupuesto) {
    super();
    this.numero = numero;
    this.nombre = nombre;
    this.presupuesto = presupuesto;
  }

  /**
   * Devuelve el valor del campo nombre.
   *
   * @return el valor del campo nombre
   */
  public final String getNombre() {
    return nombre;
  }

  /**
   * Devuelve el valor del campo numero.
   *
   * @return el valor del campo numero
   */
  public final int getNumero() {
    return numero;
  }

  /**
   * Devuelve el valor del campo presupuesto.
   *
   * @return el valor del campo presupuesto
   */
  public final BigInteger getPresupuesto() {
    return presupuesto;
  }

}
