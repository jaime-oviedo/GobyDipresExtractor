/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.clasificacion;

import java.util.Collection;

/**
 * Clase base que representa un clasificador presupuestario que puede componerse
 * internamente de otros subelementos de clasificación.
 *
 * @author JaimeRodrigo
 */
public class ElementoClasificacionCompuesto extends ElementoClasificacion {
  
  protected final Collection<? extends ElementoClasificacion> subElementos;

  /**
   * Crea una nueva instancia de la clase ElementoClasificacionCompuesto.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   * @param subElementos
   *          el valor del campo subElementos
   */
  public ElementoClasificacionCompuesto(int numero, String nombre,
      String descripcion,
      Collection<? extends ElementoClasificacion> subElementos) {
    super(numero, nombre, descripcion);
    this.subElementos = subElementos;
  }

  /**
   * Devuelve el valor del campo subElementos.
   *
   * @return el valor del campo subElementos
   */
  public final Collection<? extends ElementoClasificacion> getSubElementos() {
    return subElementos;
  }

}
