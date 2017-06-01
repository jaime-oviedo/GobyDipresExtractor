/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import java.util.Collection;
import java.util.Collections;

/**
 * Clase que representa un programa presupuestario.
 *
 * @author JaimeRodrigo
 */
final class Programa extends ElementoPresupuestario {

  /**
   * Crea una nueva instancia de la clase Programa.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   * @param subtitulos
   *          el valor del campo subtitulos
   */
  public Programa(int numero, String nombre, String descripcion, Collection<Subtitulo> subtitulos) {
    super(numero, nombre, descripcion, subtitulos);
  }

  /**
   * Devuelve el valor del campo subtitulos.
   *
   * @return el valor del campo subtitulos
   */
  @SuppressWarnings("unchecked")
  public final Collection<Subtitulo> getSubtitulos() {
    return ((Collection<Subtitulo>) Collections.unmodifiableCollection(this.getSubElementos()));
  }

}
