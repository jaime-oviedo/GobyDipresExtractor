/**
 *
 */

package com.ingenium.commons.util;

/** 
 * <!-- begin-UML-doc -->
 * Esta&nbsp;interfaz&nbsp;define&nbsp;los&nbsp;métodos&nbsp;de&nbsp;las&nbsp;clases&nbsp;que&nbsp;extraen&nbsp;información&nbsp;desde<br>una&nbsp;fuente.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UZ180EquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UZ180EquEeeJsdrfgQXeQw"
 */
public interface Downloader {
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the location of the destination file.</p>
  * <!-- end-UML-doc -->
  * @param destination <p>the new location of the destination file</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_14K9oEuGEeeV1tNCHYSKhw"
  */
  public void setDestination(String destination);
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the location of the source file.</p>
  * <!-- end-UML-doc -->
  * @param source <p>the new location of the source file</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_cFJrgEuGEeeV1tNCHYSKhw"
  */
  public void setSource(String source);
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Performs the extraction.</p>
  * <!-- end-UML-doc -->
  * @throws DownloadException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfdcoEquEeeJsdrfgQXeQw"
  */
  public void download() throws DownloadException;
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Gets the location of the destination file.</p>
  * <!-- end-UML-doc -->
  * @return <p>the location of the destination file.</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfeqwEquEeeJsdrfgQXeQw"
  */
  public String getDestination();
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Gets the location of the source file.</p>
  * <!-- end-UML-doc -->
  * @return <p>the location of the source file</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ufgf8EquEeeJsdrfgQXeQw"
  */
  public String getSource();
  
}
