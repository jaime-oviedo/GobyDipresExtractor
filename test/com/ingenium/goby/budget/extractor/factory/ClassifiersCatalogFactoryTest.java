/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.factory;

import com.ingenium.goby.budget.extractor.injection.FileSystemInjector;
import com.ingenium.goby.budget.extractor.map.BudgetElementToJsonMapper;
import com.ingenium.goby.budget.extractor.model.BudgetElementType;
import com.ingenium.goby.budget.extractor.model.BudgetHierarchyLevel;
import com.ingenium.goby.budget.extractor.model.ClassifiersCatalog;
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
public class ClassifiersCatalogFactoryTest {

  /**
   * Tests the correct extraction of a json budget classifier catalog from a csv.
   */
  @Test
  public final void testExtractClasificadores() {
    final String s = File.separator;
    final String source = new StringBuilder("test").append(s).append("com")
        .append(s).append("ingenium").append(s).append("goby").append(s)
        .append("budget").append(s).append("extractor").append(s)
        .append("fixture").append(s).append("classifiers.csv").toString();

    final ClassifiersCatalogFactory factory = ClassifiersCatalogFactory
        .getInstance();
    factory.setSource(source);
    final ClassifiersCatalog catalog = factory.getClassifiersCatalog(true);

    final CompositeBudgetElement b = new CompositeBudgetElement(0,
        "Catalogo de clasificadores presupuestarios",
        "Estructura jerárquica de los clasificadores por objeto del gasto usados en el presupuesto",
        BudgetElementType.BUDGETARY_CLASSIFICATION, BudgetHierarchyLevel.ROOT);
    b.setSubelements(catalog.getSubtitles());

    final String jsonCatalog = BudgetElementToJsonMapper.map(b, 0);
    final String destination = "tmp" + s + "classifiers.json";

    try {
      FileSystemInjector.inject(destination, jsonCatalog);
      final File file1 = new File(destination);
      final String objective = new StringBuilder("test").append(s).append("com")
          .append(s).append("ingenium").append(s).append("goby").append(s)
          .append("budget").append(s).append("extractor").append(s)
          .append("fixture").append(s).append("classifiers.json").toString();
      final File file2 = new File(objective);
      Assert.assertTrue(FileUtils.contentEquals(file1, file2));
    } catch (final Exception e) {
      Assert.fail("Injection failed or unexpected extracted file contents.");
      e.printStackTrace();
    }

  }
}
