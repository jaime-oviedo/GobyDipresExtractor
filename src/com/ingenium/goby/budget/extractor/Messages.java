
package com.ingenium.goby.budget.extractor;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_UacZwEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UacZwEquEeeJsdrfgQXeQw"
 */
public class Messages {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Uh_zQEquEeeJsdrfgQXeQw"
  */
  private static final String BUNDLE_NAME = "com.ingenium.goby.budget.extractor.extraction.extractor";

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UiCPgEquEeeJsdrfgQXeQw"
  */
  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
      .getBundle(Messages.BUNDLE_NAME);

  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;string&nbsp;asociado&nbsp;a&nbsp;una&nbsp;llave&nbsp;en&nbsp;un&nbsp;archivo&nbsp;de&nbsp;propiedades.<br><br>@param&nbsp;key<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;la&nbsp;llave&nbsp;para&nbsp;buscar&nbsp;el&nbsp;string
  * <!-- end-UML-doc -->
  * @param key
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UiEEsEquEeeJsdrfgQXeQw"
  */
  public static String getString(String key) {
    // begin-user-code
    try {
      return Messages.RESOURCE_BUNDLE.getString(key);
    } catch (final MissingResourceException e) {
      return '!' + key + '!';
    }
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UiGg8EquEeeJsdrfgQXeQw"
  */
  private Messages() {
    // begin-user-code
    // end-user-code
  }
}
