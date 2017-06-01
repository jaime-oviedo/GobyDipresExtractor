/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;

/**
 * Clase que representa un item presupuestario.
 *
 * @author JaimeRodrigo
 */
final class Item extends ElementoPresupuestario {

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
  public Item(int numero, String nombre, String descripcion, BigInteger presupuesto) {
    super(numero, nombre, descripcion, presupuesto);
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
  public Item(int numero, String nombre, String descripcion, Collection<Asignacion> asignaciones) {
    super(numero, nombre, descripcion, asignaciones);
  }

  /**
   * Devuelve el valor del campo asignaciones.
   *
   * @return el valor del campo asignaciones
   */
  public final Collection<Asignacion> getAsignaciones() {
    @SuppressWarnings("unchecked")
    Collection<Asignacion> a = (Collection<Asignacion>) Collections
        .unmodifiableCollection(this.getSubElementos());
    return a;
  }

}
