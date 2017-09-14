package com.ingenium.goby.budget.extractor.factory;

import com.ingenium.goby.budget.extractor.factory.BudgetExtractorFactory;
import com.ingenium.goby.budget.extractor.map.BudgetElementToJsonMapper;
import com.ingenium.goby.budget.extractor.model.BudgetElementType;
import com.ingenium.goby.budget.extractor.model.BudgetExecution;
import com.ingenium.goby.budget.extractor.model.BudgetExtractor;
import com.ingenium.goby.budget.extractor.model.BudgetHierarchyLevel;
import com.ingenium.goby.budget.extractor.model.CompositeBudgetElement;
import com.ingenium.goby.budget.extractor.model.ExecutionPeriod;

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
