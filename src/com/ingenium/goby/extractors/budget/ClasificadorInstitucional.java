/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;que&nbsp;representa&nbsp;un&nbsp;clasificador&nbsp;institucional&nbsp;de&nbsp;la&nbsp;Ley&nbsp;de&nbsp;Presupuestos.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_Uap1IEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uap1IEquEeeJsdrfgQXeQw"
 */
final class ClasificadorInstitucional {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UicfMEquEeeJsdrfgQXeQw"
  */
  private final int partida;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UieUYEquEeeJsdrfgQXeQw"
  */
  private final int capitulo;

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UifigEquEeeJsdrfgQXeQw"
  */
  private final int programa;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UigwoEquEeeJsdrfgQXeQw"
  */
  private final String nombre;

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;ClasificadorInstitucional.<br><br>@param&nbsp;partida<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;partida<br>@param&nbsp;capitulo<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;capitulo<br>@param&nbsp;programa<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;programa
  * <!-- end-UML-doc -->
  * @param partida
  * @param capitulo
  * @param programa
  * @param nombre
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uiil0EquEeeJsdrfgQXeQw"
  */
  public ClasificadorInstitucional(int partida, int capitulo, int programa,
      String nombre) {
    // begin-user-code
    super();
    this.partida = partida;
    this.capitulo = capitulo;
    this.programa = programa;
    this.nombre = nombre;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;capitulo.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;capitulo
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UilpIEquEeeJsdrfgQXeQw"
  */
  public int getCapitulo() {
    // begin-user-code
    return capitulo;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UioFYEquEeeJsdrfgQXeQw"
  */
  public final String getNombre() {
    // begin-user-code
    return nombre;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;partida.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;partida
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uip6kEquEeeJsdrfgQXeQw"
  */
  public int getPartida() {
    // begin-user-code
    return partida;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;programa.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;programa
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UirvwEquEeeJsdrfgQXeQw"
  */
  public int getPrograma() {
    // begin-user-code
    return programa;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uitk8EquEeeJsdrfgQXeQw"
  */
  @Override
  public String toString() {
    // begin-user-code
    StringBuilder sb = new StringBuilder();
    sb.append(String.valueOf(partida)).append("")
        .append(String.valueOf(capitulo)).append(";")
        .append(String.valueOf(programa)).append(";").append(nombre)
        .append(";");
    return sb.toString();
    // end-user-code
  }
}