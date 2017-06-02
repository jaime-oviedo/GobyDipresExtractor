/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.clasificacion;

/**
 * Clase base para la jerarquía de elementos de clasificación presupuestaria.
 * 
 * @author JaimeRodrigo
 */
public abstract class ElementoClasificacion {

  protected final int numero;
  protected final String nombre;
  protected final String descripcion;
  
  /**
   * Crea una nueva instancia de la clase ElementoClasificacion.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   */
  public ElementoClasificacion(int numero, String nombre, String descripcion) {
    super();
    this.numero = numero;
    this.nombre = nombre;
    this.descripcion = descripcion;
  }
  
  /**
   * Devuelve el valor del campo descripcion.
   *
   * @return el valor del campo descripcion
   */
  public final String getDescripcion() {
    return descripcion;
  }
  
  /**
   * Devuelve el valor del campo nombre.
   *
   * @return el valor del campo nombre
   */
  public final String getNombre() {
    return nombre;
  }
  
  /**
   * Devuelve el valor del campo numero.
   *
   * @return el valor del campo numero
   */
  public final int getNumero() {
    return numero;
  }
  
}
