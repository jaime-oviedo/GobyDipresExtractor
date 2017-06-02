/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import com.ingenium.goby.extractors.ExtractionException;

import org.junit.Assert;
import org.junit.Test;

/**
 * Conjunto de pruebas para la clase ClasificadorPresupuestarioExtractor.
 *
 * @author JaimeRodrigo
 */
public class ClasificadorPresupuestarioExtractorTest {

  /**
   * Metodo de prueba para
   * {@link com.ingenium.goby.extractors.dipres.ClasificadorPresupuestarioExtractor#extract()}.
   */
  @Test
  public final void testExtract() {
    ClasificadorPresupuestarioExtractor bce = new ClasificadorPresupuestarioExtractor();
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
  @Test
  public final void testExtractClasificadores() {
    // ClasificadorPresupuestarioExtractor bce = new
    // ClasificadorPresupuestarioExtractor();
    // try {
    //
    // Collection<ClasificadorPresupuestario> clasificadores = bce
    // .extractClasificadoresPresupuestarios();
    // Iterator<ClasificadorPresupuestario> i = clasificadores.iterator();
    // while (i.hasNext()) {
    // System.out.println(i.next().toString());
    // }
    // } catch (ExtractionException e) {
    // Assert.fail();
    // e.printStackTrace();
    // }
    // Assert.assertTrue(true);
  }

}
