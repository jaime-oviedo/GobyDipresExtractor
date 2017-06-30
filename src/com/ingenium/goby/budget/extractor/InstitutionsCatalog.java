/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor;

import com.ingenium.goby.budget.extractor.elements.Batch;

import java.util.Collection;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author joviedo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_XSi7MFH0Eee-AoOzRlyylA"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_XSi7MFH0Eee-AoOzRlyylA"
 */
public interface InstitutionsCatalog {

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @param batchNumber
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qOnm4FYWEeeKVoBZn1AqUw"
   */
  public Batch getBatch(int batchNumber);

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_wuWDYFYWEeeKVoBZn1AqUw"
   */
  public Collection<Batch> getBatches();
}