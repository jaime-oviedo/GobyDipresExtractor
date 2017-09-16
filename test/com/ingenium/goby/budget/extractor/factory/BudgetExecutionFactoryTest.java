/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.factory;

import com.ingenium.goby.budget.extractor.factory.BudgetExecutionFactory;
import com.ingenium.goby.budget.extractor.injection.FileSystemInjector;
import com.ingenium.goby.budget.extractor.map.BudgetElementToJsonMapper;
import com.ingenium.goby.budget.extractor.model.BudgetElementType;
import com.ingenium.goby.budget.extractor.model.BudgetExecution;
import com.ingenium.goby.budget.extractor.model.BudgetHierarchyLevel;
import com.ingenium.goby.budget.extractor.model.CompositeBudgetElement;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Conjunto de pruebas para la clase BudgetElementsExtractor.
 *
 * @author JaimeRodrigo
 */
public class BudgetExecutionFactoryTest {

  /**
   * Tests the correct extraction of a json budget law from a csv.
   */
  @Test
  public final void testExtractBudgetExecution() {
    final String s = File.separator;
    final String source = new StringBuilder("test").append(s).append("com")
        .append(s).append("ingenium").append(s).append("goby").append(s)
        .append("budget").append(s).append("extractor").append(s)
        .append("fixture").append(s).append("budgetExecution.csv").toString();

    final BudgetExecutionFactory factory = BudgetExecutionFactory.getInstance();
    factory.setSource(source);
    final BudgetExecution execution = factory.getBudgetExecution(true);

    final CompositeBudgetElement executionElement = new CompositeBudgetElement(
        0, "Ejecución Presupuestaria", "", BudgetElementType.EXECUTION,
        BudgetHierarchyLevel.ROOT);
    executionElement.setSubelements(execution.getBatches());

    final String jsonCatalog = BudgetElementToJsonMapper.map(executionElement,
        0);
    final String destination = new StringBuilder("tmp").append(s)
        .append("budgetExecution.json").toString();
    
    try {
      FileSystemInjector.inject(destination,
          jsonCatalog);
      final File file1 = new File(destination);
      final String objective = new StringBuilder("test").append(s).append("com")
          .append(s).append("ingenium").append(s).append("goby").append(s)
          .append("budget").append(s).append("extractor").append(s)
          .append("fixture").append(s).append("budgetExecution.json")
          .toString();
      final File file2 = new File(objective);
      Assert.assertTrue(FileUtils.contentEquals(file1, file2));
    } catch (final Exception e) {
      Assert.fail("Injection failed or unexpected extracted file contents.");
      e.printStackTrace();
    }

  }
}
