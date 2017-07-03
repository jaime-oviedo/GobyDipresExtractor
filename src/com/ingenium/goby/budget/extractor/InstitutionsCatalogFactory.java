/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor;

import com.ingenium.goby.budget.extractor.extraction.ExtractionException;
import com.ingenium.goby.budget.extractor.extraction.InstitutionsCatalogExtractor;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_I5RIgFH0Eee-AoOzRlyylA"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_I5RIgFH0Eee-AoOzRlyylA"
 */
public class InstitutionsCatalogFactory {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_6YiYMFLeEeeyIrnvp3X3kA"
  */
  private static InstitutionsCatalogFactory instance = null;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_neproFLfEeeyIrnvp3X3kA"
  */
  private InstitutionsCatalog institutionsCatalog;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yYKl0FajEeen0bP8VRV_UQ"
  */
  private boolean extract;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_KqcogFalEeen0bP8VRV_UQ"
  */
  private String source;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_xUpTUFajEeen0bP8VRV_UQ"
  */
  public synchronized static InstitutionsCatalogFactory getInstance() {
    // begin-user-code
    if (InstitutionsCatalogFactory.instance == null) {
      InstitutionsCatalogFactory.instance = new InstitutionsCatalogFactory();
      instance.setSource(
          Messages.getString("InstitutionsCatalogFactory.sourceUrl")); //$NON-NLS-1$
    }
    return InstitutionsCatalogFactory.instance;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_xUuy4FajEeen0bP8VRV_UQ"
  */
  public InstitutionsCatalog getInstitutionsCatalog() {
    // begin-user-code
    if (extract) {
      InstitutionsCatalogExtractor extractor = new InstitutionsCatalogExtractor(
          source);
      try {
        institutionsCatalog = extractor.extract();
        extract = false;
      } catch (ExtractionException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    return institutionsCatalog;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param forceExtraction
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_xUuy4lajEeen0bP8VRV_UQ"
  */
  public InstitutionsCatalog getInstitutionsCatalog(boolean forceExtraction) {
    // begin-user-code
    extract = forceExtraction;
    return getInstitutionsCatalog();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_hPBMMFamEeen0bP8VRV_UQ"
  */
  String getSource() {
    // begin-user-code
    return source;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param source
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_jSaAQFamEeen0bP8VRV_UQ"
  */
  void setSource(String source) {
    // begin-user-code
    this.source = source;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase InstitutionsCatalogFactory.
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_0ctToFanEeen0bP8VRV_UQ"
  */
  private InstitutionsCatalogFactory() {
    // begin-user-code
    super();
    extract = true;
    // end-user-code
  }
}