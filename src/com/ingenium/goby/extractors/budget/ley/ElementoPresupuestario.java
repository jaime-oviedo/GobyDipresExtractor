/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.ley;

import com.ingenium.goby.extractors.budget.clasificacion.SimpleClassifier;

import java.math.BigInteger;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;base&nbsp;para&nbsp;la&nbsp;construcción&nbsp;de&nbsp;elementos&nbsp;presupuestarios.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UZ0HoEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UZ0HoEquEeeJsdrfgQXeQw"
 */
public class ElementoPresupuestario {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfIFcEquEeeJsdrfgQXeQw"
  */
  protected final SimpleClassifier clasificador;

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfJTkEquEeeJsdrfgQXeQw"
  */
  protected final BigInteger presupuesto;

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;ElementoPresupuestario.<br><br>@param&nbsp;numero<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br>@param&nbsp;nombre<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br>@param&nbsp;descripcion<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion<br>@param&nbsp;presupuesto<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;presupuesto
  * <!-- end-UML-doc -->
  * @param numero
  * @param nombre
  * @param descripcion
  * @param presupuesto
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfLIwEquEeeJsdrfgQXeQw"
  */
  public ElementoPresupuestario(int numero, String nombre, String descripcion,
      BigInteger presupuesto) {
    // begin-user-code
    super();
    clasificador = new SimpleClassifier(numero, nombre, descripcion);
    this.presupuesto = presupuesto;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcion
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfOzIEquEeeJsdrfgQXeQw"
  */
  public String getDescripcion() {
    // begin-user-code
    return clasificador.getDescription();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfRPYEquEeeJsdrfgQXeQw"
  */
  public final String getNombre() {
    // begin-user-code
    return clasificador.getName();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfUSsEquEeeJsdrfgQXeQw"
  */
  public final int getNumero() {
    // begin-user-code
    return clasificador.getNumber();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;presupuesto.<br><br>@return&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;presupuesto
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfXWAEquEeeJsdrfgQXeQw"
  */
  public final BigInteger getPresupuesto() {
    // begin-user-code
    return presupuesto;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param nombre
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfZLMEquEeeJsdrfgQXeQw"
  */
  public final void setNombre(String nombre) {
    // begin-user-code
    this.clasificador.setName(nombre);
    // end-user-code
  }
}