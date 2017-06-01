/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Clase que representa un item presupuestario.
 *
 * @author JaimeRodrigo
 */
final class Item {
  private final int numero;
  private final String nombre;
  private final Collection<Asignacion> asignaciones;
  private final BigInteger presupuesto;

  /**
   * Crea una nueva instancia de la clase Item.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param presupuesto
   *          el valor del campo presupuesto
   */
  public Item(int numero, String nombre, BigInteger presupuesto) {
    super();
    this.numero = numero;
    this.nombre = nombre;
    asignaciones = new ArrayList<>();
    this.presupuesto = presupuesto;
  }

  /**
   * Crea una nueva instancia de la clase Item.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param asignaciones
   *          el valor del campo asignaciones
   */
  public Item(int numero, String nombre, Collection<Asignacion> asignaciones) {
    super();
    this.numero = numero;
    this.nombre = nombre;
    this.asignaciones = asignaciones;
    Iterator<Asignacion> a = asignaciones.iterator();
    BigInteger pres = BigInteger.ZERO;
    while (a.hasNext()) {
      pres = pres.add(a.next().getPresupuesto());
    }
    presupuesto = pres;
  }

  /**
   * Devuelve el valor del campo asignaciones.
   *
   * @return el valor del campo asignaciones
   */
  public final Collection<Asignacion> getAsignaciones() {
    return asignaciones;
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
