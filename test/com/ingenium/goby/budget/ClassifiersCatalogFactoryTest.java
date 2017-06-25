/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget;

import com.ingenium.goby.budget.elements.BudgetElementType;
import com.ingenium.goby.budget.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.elements.CompositeBudgetElement;
import com.ingenium.goby.budget.extraction.map.BudgetElementToJsonMapper;
import com.ingenium.goby.budget.injection.FileSystemInjector;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Conjunto de pruebas para la clase BudgetElementsExtractor.
 *
 * @author JaimeRodrigo
 */
public class ClassifiersCatalogFactoryTest {

  /**
   * Tests the correct extraction of a json budget classifier catalog from a csv.
   */
  @Test
  public final void testExtractClasificadores() {
    String s = File.separator;
    String source = "test" + s + "com" + s + "ingenium" + s + "goby" + s
        + "extractors" + s + "budget" + s + "fixture" + s + "classifiers.csv";

    ClassifiersCatalogFactory factory = ClassifiersCatalogFactory.getInstance();
    factory.setSource(source);
    ClassifiersCatalog catalog = factory.getClassifiersCatalog(true);
    CompositeBudgetElement b = new CompositeBudgetElement(0,
        "Catalogo de clasificadores presupuestarios",
        "Estructura jerárquica de los clasificadores por objeto del gasto usados en el presupuesto",
        BudgetElementType.INSTITUTIONAL_CLASSIFICATION,
        BudgetHierarchyLevel.ROOT);
    b.setSubelements(catalog.getSubtitles());

    String jsonCatalog = BudgetElementToJsonMapper.map(b, 0);
    String destination = "tmp" + s + "classifiers.json";
    FileSystemInjector fsi = new FileSystemInjector(destination, jsonCatalog);
    try {
      fsi.inject();
      File file1 = new File(destination);
      String objective = "test" + s + "com" + s + "ingenium" + s + "goby" + s
          + "extractors" + s + "budget" + s + "fixture" + s
          + "classifiers.json";
      File file2 = new File(objective);
      Assert.assertTrue(FileUtils.contentEquals(file1, file2));
    } catch (Exception e) {
      Assert.fail("Injection failed or unexpected extracted file contents.");
      e.printStackTrace();
    }

  }
}
