/**
 *
 */

package com.ingenium.goby.extractors;

/** 
 * <!-- begin-UML-doc -->
 * Esta&nbsp;interfaz&nbsp;define&nbsp;los&nbsp;métodos&nbsp;de&nbsp;las&nbsp;clases&nbsp;que&nbsp;extraen&nbsp;información&nbsp;desde<br>una&nbsp;fuente.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UZ180EquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UZ180EquEeeJsdrfgQXeQw"
 */
public interface Extractor {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfdcoEquEeeJsdrfgQXeQw"
  */
  public void extract() throws ExtractionException;

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfeqwEquEeeJsdrfgQXeQw"
  */
  public String getExtractionDestination();

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ufgf8EquEeeJsdrfgQXeQw"
  */
  public String getExtractionSource();

}
