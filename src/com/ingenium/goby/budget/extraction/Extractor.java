/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extraction;

import java.util.Collection;
import com.ingenium.goby.budget.elements.BudgetElement;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_MC9IQFYQEeeKVoBZn1AqUw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_MC9IQFYQEeeKVoBZn1AqUw"
 */
public interface Extractor {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_NfLOoFYQEeeKVoBZn1AqUw"
  */
  public Collection<? extends BudgetElement> extract()
      throws ExtractionException;
}