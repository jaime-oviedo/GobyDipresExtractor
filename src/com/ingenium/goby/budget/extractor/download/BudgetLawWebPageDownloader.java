/**
 *
 */

package com.ingenium.goby.budget.extractor.download;

import com.ingenium.commons.util.AbstractDownloader;
import com.ingenium.commons.util.DownloadException;
import com.ingenium.commons.util.FormattedWebPageDownloader;
import com.ingenium.goby.budget.extractor.Messages;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;que&nbsp;descarga&nbsp;los&nbsp;archivos&nbsp;de&nbsp;la&nbsp;Ley&nbsp;de&nbsp;Presupuestos,&nbsp;o&nbsp;los&nbsp;de&nbsp;su<br>ejecución.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_UTAVAEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UTAVAEquEeeJsdrfgQXeQw"
 */
public class BudgetLawWebPageDownloader extends AbstractDownloader {
  
  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase.
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase BudgetLawWebPageDownloader.
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UbF6AEquEeeJsdrfgQXeQw"
  */
  public BudgetLawWebPageDownloader() {
    // begin-user-code
    super();
    setSource(Messages.getString("BudgetLawWebPageDownloader.sourceUrl")); //$NON-NLS-1$
    setDestination(
        Messages.getString("BudgetLawWebPageDownloader.destinationUrl")); //$NON-NLS-1$
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @throws DownloadException
  * @throws DownloadException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UbN10EquEeeJsdrfgQXeQw"
  */
  @Override
  public void download() throws DownloadException, DownloadException {
    // begin-user-code
    final FormattedWebPageDownloader downloader = new FormattedWebPageDownloader(
        getSource(), getDestination());
    downloader.download();
    
    // end-user-code
  }
  
}
