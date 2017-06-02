/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

/**
 * Clase que representa un clasificador institucional de la Ley de Presupuestos.
 *
 * @author JaimeRodrigo
 */
final class ClasificadorInstitucional {
  private final int partida;
  private final int capitulo;

  private final int programa;
  private final String nombre;

  /**
   * Crea una nueva instancia de la clase ClasificadorInstitucional.
   *
   * @param partida
   *          el valor del campo partida
   * @param capitulo
   *          el valor del campo capitulo
   * @param programa
   *          el valor del campo programa
   */
  public ClasificadorInstitucional(int partida, int capitulo, int programa,
      String nombre) {
    super();
    this.partida = partida;
    this.capitulo = capitulo;
    this.programa = programa;
    this.nombre = nombre;
  }
  
  /**
   * Devuelve el valor del campo capitulo.
   *
   * @return el valor del campo capitulo
   */
  public int getCapitulo() {
    return capitulo;
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
   * Devuelve el valor del campo partida.
   *
   * @return el valor del campo partida
   */
  public int getPartida() {
    return partida;
  }

  /**
   * Devuelve el valor del campo programa.
   *
   * @return el valor del campo programa
   */
  public int getPrograma() {
    return programa;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.valueOf(partida)).append("")
        .append(String.valueOf(capitulo)).append(";")
        .append(String.valueOf(programa)).append(";").append(nombre)
        .append(";");
    return sb.toString();
  }
}