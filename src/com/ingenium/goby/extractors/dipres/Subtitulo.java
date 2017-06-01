/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import java.util.Collection;
import java.util.Collections;

/**
 * Clase que representa un subtitulo presupuestario.
 *
 * @author JaimeRodrigo
 */
final class Subtitulo extends ElementoPresupuestario {

  /**
   * Crea una nueva instancia de la clase Subtitulo.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   * @param items
   *          el valor del campo items
   */
  public Subtitulo(int numero, String nombre, String descripcion, Collection<Item> items) {
    super(numero, nombre, descripcion, items);
  }

  /**
   * Devuelve el valor del campo items.
   *
   * @return el valor del campo items
   */
  public final Collection<Item> getItems() {
    @SuppressWarnings("unchecked")
    Collection<Item> a = (Collection<Item>) Collections
        .unmodifiableCollection(this.getSubElementos());
    return a;
  }

}
