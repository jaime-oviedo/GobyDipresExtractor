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
   * Test method for
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

}
