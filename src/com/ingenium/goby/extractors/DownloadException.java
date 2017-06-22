/**
 *
 */

package com.ingenium.goby.extractors;

/** 
 * <!-- begin-UML-doc -->
 * Excepción&nbsp;que&nbsp;captura&nbsp;problemas&nbsp;que&nbsp;impiden&nbsp;la&nbsp;extracción&nbsp;de&nbsp;información.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UaL7EEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UaL7EEquEeeJsdrfgQXeQw"
 */
public class DownloadException extends Exception {

  /** 
  * <!-- begin-UML-doc -->
  * Identificador&nbsp;de&nbsp;serie&nbsp;de&nbsp;la&nbsp;clase.
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgkP4EquEeeJsdrfgQXeQw"
  */
  private static final long serialVersionUID = 1797242167551088990L;

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;ExtractionException.
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgmFEEquEeeJsdrfgQXeQw"
  */
  public DownloadException() {
    // begin-user-code
    super();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;ExtractionException&nbsp;usando&nbsp;un&nbsp;mensaje&nbsp;de<br>explicación.
  * <!-- end-UML-doc -->
  * @param message
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgnTMEquEeeJsdrfgQXeQw"
  */
  public DownloadException(String message) {
    // begin-user-code
    super(message);
    // end-user-code
  }

}
