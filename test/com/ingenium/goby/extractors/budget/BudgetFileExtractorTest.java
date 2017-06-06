/**
 *
 */

package com.ingenium.goby.extractors.budget;

import com.ingenium.goby.extractors.ExtractionException;

import org.junit.Assert;
import org.junit.Test;

/**
 * Pruebas para la clase BudgetFileExtractor.
 * 
 * @author JaimeRodrigo
 */
public class BudgetFileExtractorTest {
  
  /**
   * Test method for
   * {@link com.ingenium.goby.extractors.budget.BudgetFileExtractor#extract()}.
   */
  @Test
  public final void testExtract() {
    BudgetFileExtractor bfe = new BudgetFileExtractor();
    try {
      bfe.extract();
    } catch (ExtractionException e) {
      Assert.fail();
      e.printStackTrace();
    }
    Assert.assertTrue(true);
  }
  
}
