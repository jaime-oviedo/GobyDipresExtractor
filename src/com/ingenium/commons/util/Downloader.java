/**
 *
 */

package com.ingenium.commons.util;

import java.io.IOException;

/** 
 * <!-- begin-UML-doc -->
 * Las&nbsp;clases&nbsp;que&nbsp;implementan&nbsp;la&nbsp;interfaz&nbsp;Downloader&nbsp;tienen&nbsp;la&nbsp;capacidad&nbsp;de<br>descargar&nbsp;archivos&nbsp;desde&nbsp;una&nbsp;URL.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/util.efx#_UXNfkEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/util.efx#_UXNfkEquEeeJsdrfgQXeQw"
 */
public interface Downloader {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param source
  * @param destination
  * @throws IOException
  * @generated "sourceid:platform:/resource/goby-design/util.efx#_UeKcIEquEeeJsdrfgQXeQw"
  */
  public void download(String source, String destination) throws IOException;

}
