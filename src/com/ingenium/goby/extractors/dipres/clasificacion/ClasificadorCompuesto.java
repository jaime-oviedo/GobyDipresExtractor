/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.clasificacion;

import java.util.Map;

/**
 * Clase base que representa un clasificador presupuestario que puede componerse internamente de
 * otros subelementos de clasificación.
 *
 * @author JaimeRodrigo
 */
public class ClasificadorCompuesto extends Clasificador {

  private Map<Integer, ? extends Clasificador> subElementos;

  /**
   * Crea una nueva instancia de la clase ClasificadorCompuesto.
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
  public ClasificadorCompuesto(int numero, String nombre, String descripcion,
      Map<Integer, ? extends Clasificador> subElementos) {
    super(numero, nombre, descripcion);
    this.subElementos = subElementos;
  }

  /**
   * Devuelve el valor del campo subElementos.
   *
   * @return el valor del campo subElementos
   */
  protected final Map<Integer, ? extends Clasificador> getSubElementos() {
    return subElementos;
  }

  /**
   * Establece el valor del campo subElementos.
   * 
   * @param subElementos
   *          el valor del campo subElementos
   */
  public final void setSubElementos(
      Map<Integer, ? extends Clasificador> subElementos) {
    this.subElementos = subElementos;
  }

}
