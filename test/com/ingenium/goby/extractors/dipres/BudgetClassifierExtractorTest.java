/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import com.ingenium.goby.extractors.ExtractionException;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author JaimeRodrigo
 */
public class BudgetClassifierExtractorTest {
  
  /**
   * Test method for
   * {@link com.ingenium.goby.extractors.dipres.BudgetClassifierExtractor#extract()}.
   */
  @Test
  public final void testExtract() {
    BudgetClassifierExtractor bce = new BudgetClassifierExtractor();
    try {
      bce.extract();
    } catch (ExtractionException e) {
      Assert.fail();
      e.printStackTrace();
    }
    Assert.assertTrue(true);
  }
  
}
