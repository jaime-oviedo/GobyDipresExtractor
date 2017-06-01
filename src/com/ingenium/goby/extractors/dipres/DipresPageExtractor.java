/**
 *
 */

package com.ingenium.goby.extractors.dipres;

import com.ingenium.commons.util.FormattedWebPageDownloader;
import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.Extractor;

/**
 * Clase que descarga los archivos de la Ley de Presupuestos, o los de su
 * ejecución.
 *
 * @author JaimeRodrigo
 */
class DipresPageExtractor implements Extractor {
  
  private final String extractionSource;
  
  private final String extractionDestination;
  
  /**
   * Crea una nueva instancia de la clase.
   */
  public DipresPageExtractor() {
    extractionSource = Messages.getString("DipresPageExtractor.sourceUrl"); //$NON-NLS-1$
    extractionDestination = Messages
        .getString("DipresPageExtractor.destinationUrl"); //$NON-NLS-1$
  }
  
  @Override
  public void extract() throws ExtractionException {
    FormattedWebPageDownloader downloader = new FormattedWebPageDownloader(
        extractionSource, extractionDestination);
    downloader.download();
    
  }
  
  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#getExtractionDestination()
   */
  @Override
  public String getExtractionDestination() {
    return extractionDestination;
  }
  
  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#getExtractionSource()
   */
  @Override
  public String getExtractionSource() {
    return extractionSource;
  }
  
}
