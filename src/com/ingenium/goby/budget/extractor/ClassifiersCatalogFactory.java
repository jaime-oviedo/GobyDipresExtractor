/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor;

import com.ingenium.goby.budget.extractor.extraction.ClassifiersCatalogExtractor;
import com.ingenium.goby.budget.extractor.extraction.ExtractionException;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author joviedo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_A8MkQFH0Eee-AoOzRlyylA"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_A8MkQFH0Eee-AoOzRlyylA"
 */
public class ClassifiersCatalogFactory {
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_3r-EQFLeEeeyIrnvp3X3kA"
   */
  private static ClassifiersCatalogFactory instance = null;
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_meeoEFLfEeeyIrnvp3X3kA"
   */
  private ClassifiersCatalog classifiersCatalog;

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_EhlrYFNZEeeyIrnvp3X3kA"
   */
  private boolean extract;

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_iPj4oFalEeen0bP8VRV_UQ"
   */
  private String source;

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_KwtEAFLgEeeyIrnvp3X3kA"
   */
  public synchronized static ClassifiersCatalogFactory getInstance() {
    // begin-user-code
    if (ClassifiersCatalogFactory.instance == null) {
      ClassifiersCatalogFactory.instance = new ClassifiersCatalogFactory();
      ClassifiersCatalogFactory.instance
          .setSource(Messages.getString("ClassifiersCatalogFactory.sourceUrl")); //$NON-NLS-1$
    }
    return ClassifiersCatalogFactory.instance;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_NkT0EFLgEeeyIrnvp3X3kA"
   */
  public ClassifiersCatalog getClassifiersCatalog() {
    // begin-user-code
    if (extract) {
      ClassifiersCatalogExtractor extractor = new ClassifiersCatalogExtractor(
          source);
      try {
        classifiersCatalog = extractor.extract();
      } catch (ExtractionException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      extract = false;
    }
    return classifiersCatalog;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @param forceExtraction
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_IZ718FNZEeeyIrnvp3X3kA"
   */
  public ClassifiersCatalog getClassifiersCatalog(boolean forceExtraction) {
    // begin-user-code
    extract = forceExtraction;
    return getClassifiersCatalog();

    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_GeRTIFNcEeeyIrnvp3X3kA"
   */
  private ClassifiersCatalogFactory() {
    // begin-user-code
    super();
    extract = true;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_m64i0FamEeen0bP8VRV_UQ"
   */
  String getSource() {
    // begin-user-code
    return source;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @param source
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_m65J4FamEeen0bP8VRV_UQ"
   */
  void setSource(String source) {
    // begin-user-code
    this.source = source;
    // end-user-code
  }
}