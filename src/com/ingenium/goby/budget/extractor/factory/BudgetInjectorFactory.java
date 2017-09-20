/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.factory;

import com.ingenium.goby.budget.extractor.bot.BudgetExtractorBot.OuputFormat;
import com.ingenium.goby.budget.extractor.injection.BudgetInjector;
import com.ingenium.goby.budget.extractor.injection.CsvFileSystemInjector;
import com.ingenium.goby.budget.extractor.injection.JsonFileSystemInjector;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_JTK3YJwQEeeKKp-m4AD7KQ"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_JTK3YJwQEeeKKp-m4AD7KQ"
 */
public class BudgetInjectorFactory {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_uP6oQJwWEeeKKp-m4AD7KQ"
  */
  private static BudgetInjectorFactory instance;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_W6-nMJ2MEee9jdUag7Rsng"
  */
  private final BudgetInjector injector;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param fileName
  * @param directory
  * @param ouputFormat
  * @param encoding
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_t3V-8JwQEeeKKp-m4AD7KQ"
  */
  public static BudgetInjectorFactory getInstance(String fileName,
      String directory, OuputFormat ouputFormat, String encoding) {
    // begin-user-code
    if (BudgetInjectorFactory.instance == null) {
      BudgetInjectorFactory.instance = new BudgetInjectorFactory(fileName,
          directory, ouputFormat, encoding);
    }
    return BudgetInjectorFactory.instance;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_v0bvAJwWEeeKKp-m4AD7KQ"
  */
  public BudgetInjector getInjector() {
    // begin-user-code
    return this.injector;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class BudgetInjectorFactory.
  * @param fileName
  * @param directory
  * @param ouputFormat
  * @param encoding
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_W7BDcZ2MEee9jdUag7Rsng"
  */
  private BudgetInjectorFactory(final String fileName, final String directory,
      final OuputFormat ouputFormat, final String encoding) {
    // begin-user-code
    switch (ouputFormat) {
      case HUMAN:
        this.injector = new CsvFileSystemInjector(fileName, directory, encoding,
            true, true);
        break;
      case JSON:
        this.injector = new JsonFileSystemInjector(fileName, directory,
            encoding);
        break;
      default:
        this.injector = new CsvFileSystemInjector(fileName, directory, encoding,
            false, false);
        break;
      
    }
    // end-user-code
  }
}