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
 *     derived_abstraction="platform:/resource/goby-design/extractors.efx#_UZ180EquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/extractors.efx#_UZ180EquEeeJsdrfgQXeQw"
 */
public interface Extractor {

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the location of the destination file.</p>
  * <!-- end-UML-doc -->
  * @param destination <p>the new location of the destination file</p>
  * @generated "sourceid:platform:/resource/goby-design/extractors.efx#_14K9oEuGEeeV1tNCHYSKhw"
  */
  public void setDestination(String destination);

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the location of the source file.</p>
  * <!-- end-UML-doc -->
  * @param source <p>the new location of the source file</p>
  * @generated "sourceid:platform:/resource/goby-design/extractors.efx#_cFJrgEuGEeeV1tNCHYSKhw"
  */
  public void setSource(String source);

  /** 
  * <!-- begin-UML-doc -->
  * <p>Performs the extraction.</p>
  * <!-- end-UML-doc -->
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/extractors.efx#_UfdcoEquEeeJsdrfgQXeQw"
  */
  public void extract() throws ExtractionException;

  /** 
  * <!-- begin-UML-doc -->
  * <p>Gets the location of the destination file.</p>
  * <!-- end-UML-doc -->
  * @return <p>the location of the destination file.</p>
  * @generated "sourceid:platform:/resource/goby-design/extractors.efx#_UfeqwEquEeeJsdrfgQXeQw"
  */
  public String getDestination();

  /** 
  * <!-- begin-UML-doc -->
  * <p>Gets the location of the source file.</p>
  * <!-- end-UML-doc -->
  * @return <p>the location of the source file</p>
  * @generated "sourceid:platform:/resource/goby-design/extractors.efx#_Ufgf8EquEeeJsdrfgQXeQw"
  */
  public String getSource();

}
