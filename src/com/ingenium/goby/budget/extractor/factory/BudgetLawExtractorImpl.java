/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.factory;

import com.ingenium.goby.budget.extractor.extraction.ExtractionException;
import com.ingenium.goby.budget.extractor.model.BudgetElement;
import com.ingenium.goby.budget.extractor.model.BudgetLaw;
import com.ingenium.goby.budget.extractor.factory.AbstractBudgetExtractor.Builder;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_RCTT4J2dEee9jdUag7Rsng"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_RCTT4J2dEee9jdUag7Rsng"
 */
class BudgetLawExtractorImpl extends AbstractBudgetExtractor {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Hd42kGEREeeMhLKRNTgRlA"
  */
  private BudgetLaw budgetLaw;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kgCZIGD7EeemUqxRur9fjQ"
  */
  public BudgetLaw extractBudgetLaw() {
    // begin-user-code
    if (this.budgetLaw == null) {
      this.budgetLaw = this.extractBudgetLaw(true);
      ;
    }
    
    return this.budgetLaw;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param force
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kgCZIWD7EeemUqxRur9fjQ"
  */
  public BudgetLaw extractBudgetLaw(final boolean force) {
    // begin-user-code
    final BudgetLawFactory blf = BudgetLawFactory.getInstance();
    this.budgetLaw = blf.getBudgetLaw(force);
    return this.budgetLaw;
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class BudgetLawExtractorImpl.
  * @param builder
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_VRkJoJ2dEee9jdUag7Rsng"
  */
  public BudgetLawExtractorImpl(final Builder builder) {
    // begin-user-code
    super(builder);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_X6g6gZ3tEee9jdUag7Rsng"
  */
  @Override
  public BudgetElement extract() throws ExtractionException {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }
  
}