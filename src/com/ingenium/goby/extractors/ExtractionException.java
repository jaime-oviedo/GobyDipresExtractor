/**
 *
 */

package com.ingenium.goby.extractors;

/**
 * Excepción que captura problemas que impiden la extracción de información.
 *
 * @author JaimeRodrigo
 */
public class ExtractionException extends Exception {

  /**
   * Identificador de serie de la clase.
   */
  private static final long serialVersionUID = 1797242167551088990L;

  /**
   * Crea una nueva instancia de ExtractionException.
   */
  public ExtractionException() {
    super();
  }

  /**
   * Crea una nueva instancia de ExtractionException usando un mensaje de
   * explicación.
   */
  public ExtractionException(String message) {
    super(message);
  }

}
