/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.elements;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Conjunto de pruebas para la clase BudgetElementsExtractor.
 *
 * @author JaimeRodrigo
 */
public class ClasificadorPresupuestarioExtractorTest {

  /**
   * Tests the correct extraction of a json budget classifier catalog from a csv.
   */
  @Test
  public final void testExtractClasificadores() {
    BudgetElementsExtractor bce = new BudgetElementsExtractor();
    String s = File.separator;
    String source = "test" + s + "com" + s + "ingenium" + s + "goby" + s
        + "extractors" + s + "budget" + s + "fixture" + s
        + "clasificadores.csv";
    String destination = "tmp" + s + "clasificadores.json";
    String objective = "test" + s + "com" + s + "ingenium" + s + "goby" + s
        + "extractors" + s + "budget" + s + "fixture" + s
        + "clasificadores.json";
    bce.setSource(source);
    bce.setDestination(destination);
    try {
      bce.extract();
      File file1 = new File(destination);
      File file2 = new File(objective);
      Assert.assertTrue(FileUtils.contentEquals(file1, file2));
    } catch (Exception e) {
      Assert.fail();
      e.printStackTrace();
    }
  }

}
