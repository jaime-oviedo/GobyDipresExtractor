/**
 *
 */

package com.ingenium.goby.extractors.budget;

import com.ingenium.commons.util.FormattedWebPageDownloader;
import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.Extractor;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;que&nbsp;descarga&nbsp;los&nbsp;archivos&nbsp;de&nbsp;la&nbsp;Ley&nbsp;de&nbsp;Presupuestos,&nbsp;o&nbsp;los&nbsp;de&nbsp;su<br>ejecución.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UTAVAEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UTAVAEquEeeJsdrfgQXeQw"
 */
class BudgetWebPageExtractor implements Extractor {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ua-lQEquEeeJsdrfgQXeQw"
  */
  private final String extractionSource;

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UbEE0EquEeeJsdrfgQXeQw"
  */
  private final String extractionDestination;

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase.
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UbF6AEquEeeJsdrfgQXeQw"
  */
  public BudgetWebPageExtractor() {
    // begin-user-code
    extractionSource = Messages.getString("BudgetWebPageExtractor.sourceUrl"); //$NON-NLS-1$
    extractionDestination = Messages
        .getString("BudgetWebPageExtractor.destinationUrl"); //$NON-NLS-1$
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
        extractionSource, extractionDestination);
    downloader.download();

    // end-user-code
  }

  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#getExtractionDestination()
   */
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UbRgMEquEeeJsdrfgQXeQw"
  */
  @Override
  public String getExtractionDestination() {
    // begin-user-code
    return extractionDestination;
    // end-user-code
  }

  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#getExtractionSource()
   */
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UbVxoEquEeeJsdrfgQXeQw"
  */
  @Override
  public String getExtractionSource() {
    // begin-user-code
    return extractionSource;
    // end-user-code
  }

}
