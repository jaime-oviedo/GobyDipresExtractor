
package com.ingenium.goby.extractors.dipres;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

class Messages {
  private static final String BUNDLE_NAME = "com.ingenium.goby.extractors."
      + "dipres.extractor"; //$NON-NLS-1$

  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
      .getBundle(Messages.BUNDLE_NAME);

  /**
   * Devuelve el string asociado a una llave en un archivo de propiedades.
   *
   * @param key
   *          la llave para buscar el string
   */
  public static String getString(String key) {
    try {
      return Messages.RESOURCE_BUNDLE.getString(key);
    } catch (final MissingResourceException e) {
      return '!' + key + '!';
    }
  }

  private Messages() {
  }
}
