/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget;

import com.ingenium.goby.budget.extraction.ExtractionException;
import com.ingenium.goby.budget.extraction.InstitutionsCatalogExtractor;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_I5RIgFH0Eee-AoOzRlyylA"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_I5RIgFH0Eee-AoOzRlyylA"
 */
public class InstitutionsCatalogFactory {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_6YiYMFLeEeeyIrnvp3X3kA"
  */
  private static InstitutionsCatalogFactory instance;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_neproFLfEeeyIrnvp3X3kA"
  */
  private InstitutionsCatalog institutionsCatalog;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_MJkCUFbbEeeJ1LOQolUiwg"
  */
  private boolean extract = true;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ujru8FbbEeeJ1LOQolUiwg"
  */
  private String source;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Sihk8FbaEeeJ1LOQolUiwg"
  */
  public static InstitutionsCatalogFactory getInstance() {
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
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_U2rY4FbaEeeJ1LOQolUiwg"
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
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_m9plUFbaEeeJ1LOQolUiwg"
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
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_cji98FbaEeeJ1LOQolUiwg"
  */
  public String getSource() {
    // begin-user-code
    return source;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param source
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_gTW3kFbaEeeJ1LOQolUiwg"
  */
  public void setSource(String source) {
    // begin-user-code
    this.source = source;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase InstitutionsCatalogFactory.
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_h_sdkFbaEeeJ1LOQolUiwg"
  */
  private InstitutionsCatalogFactory() {
    // begin-user-code
    super();
    // end-user-code
  }
}