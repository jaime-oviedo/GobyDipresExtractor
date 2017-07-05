package com.ingenium.goby.budget.extractor;

import com.ingenium.goby.budget.extractor.elements.BudgetElementType;
import com.ingenium.goby.budget.extractor.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.extractor.elements.CompositeBudgetElement;
import com.ingenium.goby.budget.extractor.map.BudgetElementToJsonMapper;

import org.junit.Test;

import junit.framework.Assert;

public class BudgetExtractorFactoryTest {

  @Test
  public void testGetBudgetExtractor() {
    BudgetExtractorFactory factory = BudgetExtractorFactory.getInstance();
    BudgetExtractor extractor = factory.getBudgetExtractor();
    BudgetExecution execution = extractor
        .extractBudgetExecution(ExecutionPeriod.APRIL);
    final CompositeBudgetElement executionElement = new CompositeBudgetElement(
        0, "Ejecución Presupuestaria", "", BudgetElementType.EXECUTION,
        BudgetHierarchyLevel.ROOT);
    executionElement.setSubelements(execution.getBatches());
    String jsonExecution = BudgetElementToJsonMapper.map(executionElement, 0);
    System.out.println(jsonExecution);
    Assert.assertTrue(true);
  }

}
