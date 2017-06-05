/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.clasificacion;

/**
 * Clase base para la jerarquía de elementos de clasificación presupuestaria.
 *
 * @author JaimeRodrigo
 */
public class Clasificador {

  private Integer numero;
  private String nombre;
  private String descripcion;

  /**
   * Crea una nueva instancia de la clase Clasificador.
   *
   * @param numero
   *          el valor del campo numero
   * @param nombre
   *          el valor del campo nombre
   * @param descripcion
   *          el valor del campo descripcion
   */
  public Clasificador(Integer numero, String nombre, String descripcion) {
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
  public final Integer getNumero() {
    return numero;
  }

  public final void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public final void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public final void setNumero(Integer numero) {
    this.numero = numero;
  }

  /**
   * Convierte el clasificador en un string Json
   *
   * @param nestingLevel
   *          el número basico de identaciones. Resulta útil al anidar transformaciones a Json.
   * @return la representación del clasificador en un objeto Json
   */
  public String toJsonString(int nestingLevel) {
    StringBuilder nesting = new StringBuilder();
    for (int i = 0; i < nestingLevel; i++) {
      nesting.append("  ");
    }

    StringBuilder sb = new StringBuilder(nesting);
    sb.append("{\n");
    nesting.append("  ");
    String q = "\"";
    sb.append(nesting).append(q + "numero" + q + ":" + getNumero() + ",\n");
    sb.append(nesting)
        .append(q + "nombre" + q + ":" + q + getNombre() + q + ",\n");
    sb.append(nesting)
        .append(q + "descripcion" + q + ":" + q + getDescripcion() + q + "\n");
    nesting.delete(nesting.length() - 2, nesting.length());
    sb.append(nesting).append("}");
    return sb.toString();
  }

}
