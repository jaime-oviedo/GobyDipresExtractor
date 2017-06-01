/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

/**
 * Bean que representa un clasificador presupuestario.
 *
 * @author JaimeRodrigo
 */
class ClasificadorPresupuestario {
  
  private int partida;
  private int capitulo;
  private int programa;
  private int subTitulo;
  private int item;
  private int asignacion;
  private String nombre;
  private String descripcion;

  /**
   * Crea una nueva instancia de la clase ClasificadorPresupuestarioVO.
   */
  public ClasificadorPresupuestario() {
    partida = 0;
    capitulo = 0;
    programa = 0;
    subTitulo = 0;
    item = 0;
    asignacion = 0;
    nombre = "";
    descripcion = "";
  }

  /**
   * Devuelve el valor del campo asignacion.
   *
   * @return el valor del campo asignacion
   */
  public final int getAsignacion() {
    return asignacion;
  }

  /**
   * Devuelve el valor del campo capitulo.
   *
   * @return el valor del campo capitulo
   */
  public final int getCapitulo() {
    return capitulo;
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
   * Devuelve el valor del campo item.
   *
   * @return el valor del campo item
   */
  public final int getItem() {
    return item;
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
  public final int getPartida() {
    return partida;
  }

  /**
   * Devuelve el valor del campo programa.
   *
   * @return el valor del campo programa
   */
  public final int getPrograma() {
    return programa;
  }

  /**
   * Devuelve el valor del campo subTitulo.
   *
   * @return el valor del campo subTitulo
   */
  public final int getSubTitulo() {
    return subTitulo;
  }

  /**
   * Establece el valor del campo asignacion.
   *
   * @param asignacion
   *          el nuevo valor del campo asignacion.
   */
  public final void setAsignacion(int asignacion) {
    this.asignacion = asignacion;
  }

  /**
   * Establece el valor del campo capitulo.
   *
   * @param capitulo
   *          el nuevo valor del campo capitulo.
   */
  public final void setCapitulo(int capitulo) {
    this.capitulo = capitulo;
  }

  /**
   * Establece el valor del campo descripcion.
   *
   * @param descripcion
   *          el nuevo valor del campo descripcion.
   */
  public final void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  /**
   * Establece el valor del campo item.
   *
   * @param item
   *          el nuevo valor del campo item.
   */
  public final void setItem(int item) {
    this.item = item;
  }

  /**
   * Establece el valor del campo nombre.
   *
   * @param nombre
   *          el nuevo valor del campo nombre.
   */
  public final void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Establece el valor del campo partida.
   *
   * @param partida
   *          el nuevo valor del campo partida.
   */
  public final void setPartida(int partida) {
    this.partida = partida;
  }

  /**
   * Establece el valor del campo programa.
   *
   * @param programa
   *          el nuevo valor del campo programa.
   */
  public final void setPrograma(int programa) {
    this.programa = programa;
  }

  /**
   * Establece el valor del campo subTitulo.
   *
   * @param subTitulo
   *          el nuevo valor del campo subTitulo.
   */
  public final void setSubTitulo(int subTitulo) {
    this.subTitulo = subTitulo;
  }

}
