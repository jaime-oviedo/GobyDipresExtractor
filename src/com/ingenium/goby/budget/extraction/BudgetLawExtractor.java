/**
 *
 */

package com.ingenium.goby.budget.extraction;

import com.ingenium.goby.budget.BudgetLaw;
import com.ingenium.goby.budget.extraction.download.BudgetLawCsvFilesDownloader;
import com.ingenium.goby.budget.extraction.download.BudgetLawWebPageDownloader;
import com.ingenium.goby.extractors.DownloadException;

import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * Esta&nbsp;clase&nbsp;extrae&nbsp;toda&nbsp;la&nbsp;Ley&nbsp;de&nbsp;Presupuestos&nbsp;desde&nbsp;el&nbsp;sitio&nbsp;de&nbsp;la&nbsp;DIPRES.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UautoEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UautoEquEeeJsdrfgQXeQw"
 */
public class BudgetLawExtractor {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjBG8EquEeeJsdrfgQXeQw"
  */
  private final BudgetLawWebPageDownloader dpe;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjCVEEquEeeJsdrfgQXeQw"
  */
  private final BudgetLawCsvFilesListExtractor bfle;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjDjMEquEeeJsdrfgQXeQw"
  */
  private final BudgetLawCsvFilesDownloader bfe;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_wErB4FejEeeJT_eFoT-0rA"
  */
  private static final Logger log = Logger
      .getLogger("com.ingenium.goby.extractors.InstitutionsCatalogExtractor");
  
  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;BudgetLawExtractor.
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase BudgetLawExtractor.
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjFYYEquEeeJsdrfgQXeQw"
  */
  public BudgetLawExtractor() {
    // begin-user-code
    dpe = new BudgetLawWebPageDownloader();
    bfle = new BudgetLawCsvFilesListExtractor();
    bfe = new BudgetLawCsvFilesDownloader();
    // end-user-code
  }
  
  /*
   * (non-Javadoc)
   *
   * @see com.ingenium.goby.extractors.Extractor#extract()
   */
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @throws DownloadException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjH0oEquEeeJsdrfgQXeQw"
  */
  public void extract() throws DownloadException {
    // begin-user-code
    dpe.download();
    bfle.download();
    bfe.download();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_d-CzsFejEeeJT_eFoT-0rA"
  */
  public BudgetLaw getExtractedBudgetLaw() {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }
  
}
