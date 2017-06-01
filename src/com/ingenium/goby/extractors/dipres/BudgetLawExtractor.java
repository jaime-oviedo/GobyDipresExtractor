/**
 *
 */

package com.ingenium.goby.extractors.dipres;

import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.Extractor;

/**
 * Esta clase extrae toda la Ley de Presupuestos desde el sitio de la DIPRES.
 *
 * @author JaimeRodrigo
 */
public class BudgetLawExtractor implements Extractor {
  
  private final DipresPageExtractor dpe;
  private final BudgetFileListExtractor bfle;
  private final BudgetFileExtractor bfe;
  
  /**
   * Crea una nueva instancia de la clase BudgetLawExtractor.
   */
  public BudgetLawExtractor() {
    dpe = new DipresPageExtractor();
    bfle = new BudgetFileListExtractor();
    bfe = new BudgetFileExtractor();
  }
  
  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#extract()
   */
  @Override
  public void extract() throws ExtractionException {
    dpe.extract();
    bfle.extract();
    bfe.extract();
  }
  
  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#getExtractionDestination()
   */
  @Override
  public String getExtractionDestination() {
    return bfe.getExtractionDestination();
  }
  
  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#getExtractionSource()
   */
  @Override
  public String getExtractionSource() {
    return dpe.getExtractionSource();
  }
  
}
