/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.ley;

import com.ingenium.goby.extractors.dipres.clasificacion.ClasificadorSimple;

import java.math.BigInteger;

/**
 * Clase base para la construcción de elementos presupuestarios.
 *
 * @author JaimeRodrigo
 */
public class ElementoPresupuestario {

  protected final ClasificadorSimple clasificador;

  protected final BigInteger presupuesto;

  /**
   * Crea una nueva instancia de la clase ElementoPresupuestario.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   * @param presupuesto
   *          el valor del campo presupuesto
   */
  public ElementoPresupuestario(int numero, String nombre, String descripcion,
      BigInteger presupuesto) {
    super();
    clasificador = new ClasificadorSimple(numero, nombre, descripcion);
    this.presupuesto = presupuesto;
  }

  /**
   * Devuelve el valor del campo descripcion.
   *
   * @return el valor del campo descripcion
   */
  public String getDescripcion() {
    return clasificador.getDescripcion();
  }

  /**
   * Devuelve el valor del campo nombre.
   *
   * @return el valor del campo nombre
   */
  public final String getNombre() {
    return clasificador.getNombre();
  }

  /**
   * Devuelve el valor del campo numero.
   *
   * @return el valor del campo numero
   */
  public final int getNumero() {
    return clasificador.getNumero();
  }

  /**
   * Devuelve el valor del campo presupuesto.
   *
   * @return el valor del campo presupuesto
   */
  public final BigInteger getPresupuesto() {
    return presupuesto;
  }

  public final void setNombre(String nombre) {
    this.clasificador.setNombre(nombre);
  }
}