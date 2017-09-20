/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.factory;

import com.ingenium.goby.budget.extractor.Messages;
import com.ingenium.goby.budget.extractor.extraction.BudgetLawExtractor;
import com.ingenium.goby.budget.extractor.extraction.ExtractionException;
import com.ingenium.goby.budget.extractor.model.BudgetLaw;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_KP91sFH0Eee-AoOzRlyylA"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_KP91sFH0Eee-AoOzRlyylA"
 */
class BudgetLawFactory {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_jfJa8FH0Eee-AoOzRlyylA"
  */
  private static BudgetLawFactory instance = null;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_0BE38FehEeeJT_eFoT-0rA"
  */
  public synchronized static BudgetLawFactory getInstance() {
    // begin-user-code
    if (BudgetLawFactory.instance == null) {
      BudgetLawFactory.instance = new BudgetLawFactory();
      BudgetLawFactory.instance
          .setSource(Messages.getString("BudgetLawFactory.sourceUrl")); //$NON-NLS-1$
    }
    return BudgetLawFactory.instance;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_hwZvYFLfEeeyIrnvp3X3kA"
  */
  private BudgetLaw budgetLaw;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lUUvoFehEeeJT_eFoT-0rA"
  */
  private boolean extract;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_nndP4FehEeeJT_eFoT-0rA"
  */
  private String source;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class BudgetLawFactory.
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_uR02IFehEeeJT_eFoT-0rA"
  */
  private BudgetLawFactory() {
    // begin-user-code
    super();
    budgetLaw = null;
    source = null;
    extract = true;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Ft3CwFeiEeeJT_eFoT-0rA"
  */
  public BudgetLaw getBudgetLaw() {
    // begin-user-code
    if (extract) {
      BudgetLawExtractor extractor = new BudgetLawExtractor(source);
      try {
        budgetLaw = extractor.extract();
      } catch (ExtractionException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      extract = false;
    }
    return budgetLaw;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param forceExtraction
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_6qT1wFehEeeJT_eFoT-0rA"
  */
  public BudgetLaw getBudgetLaw(boolean forceExtraction) {
    // begin-user-code
    extract = forceExtraction;
    return getBudgetLaw();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_3vWggFehEeeJT_eFoT-0rA"
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
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_3vWgglehEeeJT_eFoT-0rA"
  */
  void setSource(String source) {
    // begin-user-code
    this.source = source;
    
    // end-user-code
  }
}