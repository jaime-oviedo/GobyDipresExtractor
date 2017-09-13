package com.ingenium.goby.budget.extractor;

import com.ingenium.goby.budget.extractor.elements.BudgetElementType;
import com.ingenium.goby.budget.extractor.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.extractor.elements.CompositeBudgetElement;
import com.ingenium.goby.budget.extractor.map.BudgetElementToJsonMapper;

import org.junit.Assert;
import org.junit.Test;

public class BudgetExtractorFactoryTest {

  @Test
  public void testGetBudgetExtractor() {
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
    System.out.println(jsonExecution);
    Assert.assertTrue(true);
  }

}
