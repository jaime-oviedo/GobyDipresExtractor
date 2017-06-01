/**
 *
 */

package com.ingenium.goby.extractors;

/**
 * Esta interfaz define los métodos de las clases que extraen información desde
 * una fuente.
 *
 * @author JaimeRodrigo
 */
public interface Extractor {
  
  public void extract() throws ExtractionException;

  public String getExtractionDestination();

  public String getExtractionSource();
  
}
