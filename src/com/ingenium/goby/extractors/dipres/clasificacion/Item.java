/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.clasificacion;

import java.util.Collection;

/**
 * Clase que representa el clasificador de item presupuestario.
 *
 * @author JaimeRodrigo
 */
public class Item extends ElementoClasificacionCompuesto {
  
  /**
   * Crea una nueva instancia de la clase Item.
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
  public Item(int numero, String nombre, String descripcion,
      Collection<? extends ElementoClasificacion> subElementos) {
    super(numero, nombre, descripcion, subElementos);
  }
}
