/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.injection;

import com.ingenium.goby.budget.extractor.map.BudgetElementToJsonMapper;
import com.ingenium.goby.budget.extractor.model.BudgetElement;

import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_IycTcJwREeeKKp-m4AD7KQ"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_IycTcJwREeeKKp-m4AD7KQ"
 */
public final class JsonFileSystemInjector implements BudgetInjector {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gl86AJwTEeeKKp-m4AD7KQ"
  */
  private static final Logger log = Logger
      .getLogger(JsonFileSystemInjector.class.getCanonicalName());
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_hGhjUJzKEeeKKp-m4AD7KQ"
  */
  private final String fileName;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_hGhjUpzKEeeKKp-m4AD7KQ"
  */
  private final String directory;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_hGhjVJzKEeeKKp-m4AD7KQ"
  */
  private final String encoding;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param budgetElement
  * @throws InjectionException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_hOMnt5zBEeeKKp-m4AD7KQ"
  */
  @Override
  public void inject(final BudgetElement budgetElement)
      throws InjectionException {
    // begin-user-code
    
    final String jsonElement = BudgetElementToJsonMapper.map(budgetElement);
    FileSystemInjector.inject(jsonElement, this.fileName, this.directory,
        this.encoding);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class JsonFileSystemInjector.
  * @param fileName
  * @param directory
  * @param encoding
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_fL0_8JzEEeeKKp-m4AD7KQ"
  */
  public JsonFileSystemInjector(final String fileName, final String directory,
      final String encoding) {
    // begin-user-code
    this.fileName = fileName;
    this.directory = directory;
    this.encoding = encoding;
    // end-user-code
  }
}