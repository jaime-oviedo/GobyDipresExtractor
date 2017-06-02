/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.clasificacion;

/**
 * Clase que representa un elemento de clasificación presupuestaria simple, que
 * no puede ser extendido.
 * 
 * @author JaimeRodrigo
 */
public final class ClasificadorSimple extends Clasificador {

  /**
   * Crea una nueva instancia de la clase ClasificadorSimple.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   */
  public ClasificadorSimple(int numero, String nombre,
      String descripcion) {
    super(numero, nombre, descripcion);
  }

}
