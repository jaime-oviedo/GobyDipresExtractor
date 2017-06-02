/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.ley;

import java.util.Collection;
import java.util.Collections;

/**
 * Clase que representa un subtitulo presupuestario.
 *
 * @author JaimeRodrigo
 */
final class SubtituloPresupuesto extends ElementoPresupuestoCompuesto {

  /**
   * Crea una nueva instancia de la clase SubtituloPresupuesto.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   * @param itemPresupuestos
   *          el valor del campo items
   */
  public SubtituloPresupuesto(int numero, String nombre, String descripcion,
      Collection<ItemPresupuesto> itemPresupuestos) {
    super(numero, nombre, descripcion, itemPresupuestos);
  }

  /**
   * Devuelve el valor del campo items.
   *
   * @return el valor del campo items
   */
  public final Collection<ItemPresupuesto> getItems() {
    @SuppressWarnings("unchecked")
    Collection<ItemPresupuesto> a = (Collection<ItemPresupuesto>) Collections
        .unmodifiableCollection(getSubElementos());
    return a;
  }

}
