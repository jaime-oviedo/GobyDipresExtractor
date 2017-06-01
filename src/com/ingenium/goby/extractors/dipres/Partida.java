/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import java.util.Collection;
import java.util.Collections;

/**
 * Clase que representa una partida presupuestaria.
 *
 * @author JaimeRodrigo
 */
final class Partida extends ElementoPresupuestario {

  /**
   * Crea una nueva instancia de la clase Partida.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   * @param capitulos
   *          el valor del campo capitulos
   */
  public Partida(int numero, String nombre, String descripcion, Collection<Capitulo> capitulos) {
    super(numero, nombre, descripcion, capitulos);
  }

  /**
   * Devuelve el valor del campo capitulos.
   *
   * @return el valor del campo capitulos
   */
  @SuppressWarnings("unchecked")
  public final Collection<Capitulo> getCapitulos() {
    return ((Collection<Capitulo>) Collections.unmodifiableCollection(this.getSubElementos()));
  }

}
