/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import java.util.Collection;
import java.util.Collections;

/**
 * Clase que representa un capitulo presupuestario.
 *
 * @author JaimeRodrigo
 */
final class Capitulo extends ElementoPresupuestario {

  /**
   * Crea una nueva instancia de la clase Capitulo.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   * @param programas
   *          el valor del campo programas
   */
  public Capitulo(int numero, String nombre, String descripcion, Collection<Programa> programas) {
    super(numero, nombre, descripcion, programas);
  }

  /**
   * Devuelve el valor del campo programas.
   *
   * @return el valor del campo programas
   */
  @SuppressWarnings("unchecked")
  public final Collection<Programa> getProgramas() {
    return ((Collection<Programa>) Collections.unmodifiableCollection(this.getSubElementos()));
  }

}
