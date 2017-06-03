/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres.clasificacion;

import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.dipres.clasificacion.CatalogoClasificadoresPresupuestarios;
import com.ingenium.goby.extractors.dipres.clasificacion.ClasificadorPresupuestarioExtractor;

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
   * {@link com.ingenium.goby.extractors.dipres.clasificacion.ClasificadorPresupuestarioExtractor#extract()}.
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
  // @Test
  public final void testExtractClasificadores() {
    ClasificadorPresupuestarioExtractor bce = new ClasificadorPresupuestarioExtractor();
    try {
      
      CatalogoClasificadoresPresupuestarios clasificadores = bce
          .extractClasificadoresPresupuestarios();
      System.out.println(clasificadores.toJsonString(0));
    } catch (ExtractionException e) {
      Assert.fail();
      e.printStackTrace();
    }
    Assert.assertTrue(true);
  }
  
}
