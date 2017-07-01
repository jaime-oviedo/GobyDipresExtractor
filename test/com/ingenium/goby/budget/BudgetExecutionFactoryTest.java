/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget;

import com.ingenium.goby.budget.extractor.BudgetExecution;
import com.ingenium.goby.budget.extractor.elements.BudgetElementType;
import com.ingenium.goby.budget.extractor.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.extractor.elements.CompositeBudgetElement;
import com.ingenium.goby.budget.extractor.extraction.map.BudgetElementToJsonMapper;
import com.ingenium.goby.budget.extractor.injection.FileSystemInjector;

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
    String s = File.separator;
    String source = new StringBuffer("test").append(s).append("com").append(s)
        .append("ingenium").append(s).append("goby").append(s)
        .append("extractors").append(s).append("budget").append(s)
        .append("fixture").append(s).append("budgetExecution.csv").toString();

    BudgetExecutionFactory factory = BudgetExecutionFactory.getInstance();
    factory.setSource(source);
    BudgetExecution execution = factory.getBudgetExecution(true);

    CompositeBudgetElement executionElement = new CompositeBudgetElement(0,
        "Ejecución Presupuestaria", "", BudgetElementType.EXECUTION,
        BudgetHierarchyLevel.ROOT);
    executionElement.setSubelements(execution.getBatches());

    String jsonCatalog = BudgetElementToJsonMapper.map(executionElement, 0);
    String destination = new StringBuffer("tmp").append(s)
        .append("budgetExecution.json").toString();
    FileSystemInjector fsi = new FileSystemInjector(destination, jsonCatalog);
    try {
      fsi.inject();
      File file1 = new File(destination);
      String objective = new StringBuffer("test").append(s).append("com")
          .append(s).append("ingenium").append(s).append("goby").append(s)
          .append("extractors").append(s).append("budget").append(s)
          .append("fixture").append(s).append("budgetExecution.json")
          .toString();
      File file2 = new File(objective);
      Assert.assertTrue(FileUtils.contentEquals(file1, file2));
    } catch (Exception e) {
      Assert.fail("Injection failed or unexpected extracted file contents.");
      e.printStackTrace();
    }

  }
}
