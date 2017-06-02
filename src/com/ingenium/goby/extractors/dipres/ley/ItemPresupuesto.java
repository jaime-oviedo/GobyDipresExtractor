/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.ley;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;

/**
 * Clase que representa un item presupuestario.
 *
 * @author JaimeRodrigo
 */
final class ItemPresupuesto extends ElementoPresupuestoCompuesto {

  /**
   * Crea una nueva instancia de la clase ItemPresupuesto.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param presupuesto
   *          el valor del campo presupuesto
   */
  public ItemPresupuesto(int numero, String nombre, String descripcion,
      BigInteger presupuesto) {
    super(numero, nombre, descripcion, presupuesto);
  }

  /**
   * Crea una nueva instancia de la clase ItemPresupuesto.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param asignaciones
   *          el valor del campo asignaciones
   */
  public ItemPresupuesto(int numero, String nombre, String descripcion,
      Collection<AsignacionPresupuesto> asignaciones) {
    super(numero, nombre, descripcion, asignaciones);
  }

  /**
   * Devuelve el valor del campo asignaciones.
   *
   * @return el valor del campo asignaciones
   */
  public final Collection<AsignacionPresupuesto> getAsignaciones() {
    @SuppressWarnings("unchecked")
    Collection<AsignacionPresupuesto> a = (Collection<AsignacionPresupuesto>) Collections
        .unmodifiableCollection(getSubElementos());
    return a;
  }

}
