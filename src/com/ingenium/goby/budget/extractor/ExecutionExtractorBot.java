/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor;

import com.ingenium.goby.budget.extractor.factory.BudgetExtractorFactory;
import com.ingenium.goby.budget.extractor.injection.FileSystemInjector;
import com.ingenium.goby.budget.extractor.injection.InjectionException;
import com.ingenium.goby.budget.extractor.map.BudgetElementToJsonMapper;
import com.ingenium.goby.budget.extractor.model.BudgetElementType;
import com.ingenium.goby.budget.extractor.model.BudgetExecution;
import com.ingenium.goby.budget.extractor.model.BudgetExtractor;
import com.ingenium.goby.budget.extractor.model.BudgetHierarchyLevel;
import com.ingenium.goby.budget.extractor.model.CompositeBudgetElement;
import com.ingenium.goby.budget.extractor.model.ExecutionPeriod;

import java.io.File;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_4PRPkJQOEeeyu_ZR04zubg"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_4PRPkJQOEeeyu_ZR04zubg"
 */
public class ExecutionExtractorBot {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param args
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_6XkY0JQOEeeyu_ZR04zubg"
  */
  public static void main(String[] args) {
    // begin-user-code
    final BudgetExtractorFactory factory = BudgetExtractorFactory.getInstance();
    final BudgetExtractor extractor = factory.getBudgetExtractor();
    final BudgetExecution execution = extractor
        .extractBudgetExecution(ExecutionPeriod.JULY);
    final CompositeBudgetElement executionElement = new CompositeBudgetElement(
        0, "Ejecución Presupuestaria", "", BudgetElementType.EXECUTION,
        BudgetHierarchyLevel.ROOT);
    executionElement.setSubelements(execution.getBatches());
    final String jsonExecution = BudgetElementToJsonMapper.map(executionElement,
        0);
    final String s = File.separator;
    final String destination = new StringBuffer("tmp").append(s)
        .append("budgetLaw.json").toString();
    final FileSystemInjector fsi = new FileSystemInjector(destination,
        jsonExecution);
    try {
      fsi.inject();
      System.out.println(jsonExecution);
    } catch (final InjectionException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
    
    // end-user-code
  }
}