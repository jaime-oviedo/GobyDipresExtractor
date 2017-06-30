/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor;

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
public class BudgetLawFactoryTest {

  /**
   * Tests the correct extraction of a json budget law from a csv.
   */
  @Test
  public final void testExtractBudgetLaw() {
    String s = File.separator;
    String source = "test" + s + "com" + s + "ingenium" + s + "goby" + s
        + "extractors" + s + "budget" + s + "fixture" + s + "budgetLaw.csv";

    BudgetLawFactory factory = BudgetLawFactory.getInstance();
    factory.setSource(source);
    BudgetLaw catalog = factory.getBudgetLaw(true);

    CompositeBudgetElement law = new CompositeBudgetElement(0,
        "Ley de Presupuestos", "", BudgetElementType.BUDGET,
        BudgetHierarchyLevel.ROOT);
    law.setSubelements(catalog.getBatches());

    String jsonCatalog = BudgetElementToJsonMapper.map(law, 0);
    String destination = "tmp" + s + "budgetLaw.json";
    FileSystemInjector fsi = new FileSystemInjector(destination, jsonCatalog);
    try {
      fsi.inject();
      File file1 = new File(destination);
      String objective = "test" + s + "com" + s + "ingenium" + s + "goby" + s
          + "extractors" + s + "budget" + s + "fixture" + s + "budgetLaw.json";
      File file2 = new File(objective);
      Assert.assertTrue(FileUtils.contentEquals(file1, file2));
    } catch (Exception e) {
      Assert.fail("Injection failed or unexpected extracted file contents.");
      e.printStackTrace();
    }

  }
}
