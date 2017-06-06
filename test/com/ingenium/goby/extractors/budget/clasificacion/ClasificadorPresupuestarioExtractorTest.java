/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.clasificacion;

import com.ingenium.goby.extractors.ExtractionException;

import org.junit.Assert;
import org.junit.Test;

/**
 * Conjunto de pruebas para la clase BudgetClassifiersExtractor.
 *
 * @author JaimeRodrigo
 */
public class ClasificadorPresupuestarioExtractorTest {

  /**
   * Metodo de prueba para BudgetClassifiersExtractor#extract().
   *
   */
  @Test
  public final void testExtract() {
    BudgetClassifiersExtractor bce = new BudgetClassifiersExtractor();
    try {
      bce.extract();
    } catch (ExtractionException e) {
      Assert.fail();
      e.printStackTrace();
    }
    Assert.assertTrue(true);
  }

  /**
   * Metodo de prueba para extractClasificadores.
   */
  // @Test
  public final void testExtractClasificadores() {
    BudgetClassifiersExtractor bce = new BudgetClassifiersExtractor();
    try {

      BudgetClassifiersCatalog clasificadores = bce.extractBudgetClassifiers();
      System.out.println(clasificadores.toJsonString(0));
    } catch (ExtractionException e) {
      Assert.fail();
      e.printStackTrace();
    }
    Assert.assertTrue(true);
  }

}
