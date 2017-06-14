/**
 *
 */

package com.ingenium.goby.extractors.budget;

import com.ingenium.commons.util.FormattedWebPageDownloader;
import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.ExtractorImpl;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;que&nbsp;descarga&nbsp;los&nbsp;archivos&nbsp;de&nbsp;la&nbsp;Ley&nbsp;de&nbsp;Presupuestos,&nbsp;o&nbsp;los&nbsp;de&nbsp;su<br>ejecución.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UTAVAEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UTAVAEquEeeJsdrfgQXeQw"
 */
class BudgetWebPageExtractor extends ExtractorImpl {

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase.
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UbF6AEquEeeJsdrfgQXeQw"
  */
  public BudgetWebPageExtractor() {
    // begin-user-code
    super();
    setSource(Messages.getString("BudgetWebPageExtractor.sourceUrl")); //$NON-NLS-1$
    setDestination(Messages.getString("BudgetWebPageExtractor.destinationUrl")); //$NON-NLS-1$
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UbN10EquEeeJsdrfgQXeQw"
  */
  @Override
  public void extract() throws ExtractionException {
    // begin-user-code
    FormattedWebPageDownloader downloader = new FormattedWebPageDownloader(
        getSource(), getDestination());
    downloader.download();

    // end-user-code
  }

}
