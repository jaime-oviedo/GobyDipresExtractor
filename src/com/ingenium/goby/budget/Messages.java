
package com.ingenium.goby.budget;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UacZwEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UacZwEquEeeJsdrfgQXeQw"
 */
public class Messages {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uh_zQEquEeeJsdrfgQXeQw"
  */
  private static final String BUNDLE_NAME = "com.ingenium.goby.budget.extractor";
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UiCPgEquEeeJsdrfgQXeQw"
  */
  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
      .getBundle(Messages.BUNDLE_NAME);
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the string associated to the given key in the properties archive</p>
  * <!-- end-UML-doc -->
  * @param key <p>the key that identifies the string to fetch from the properties files</p>
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UiEEsEquEeeJsdrfgQXeQw"
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
  * Crea una nueva instancia de la clase Messages.
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UiGg8EquEeeJsdrfgQXeQw"
  */
  private Messages() {
    // begin-user-code
    // end-user-code
  }
}
