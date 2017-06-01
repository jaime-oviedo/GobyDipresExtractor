/**
 *
 */

package com.ingenium.goby.extractors.dipres;

import com.ingenium.goby.extractors.ExtractionException;

import org.junit.Assert;
import org.junit.Test;

/**
 * Pruebas para la clase BudgetLawExtractor.
 * 
 * @author JaimeRodrigo
 */
public class BudgetLawExtractorTest {

  /**
   * Test method for
   * {@link com.ingenium.goby.extractors.dipres.BudgetLawExtractor#extract()}.
   */
  @Test
  public final void testExtract() {
    BudgetLawExtractor ble = new BudgetLawExtractor();
    try {
      ble.extract();
    } catch (ExtractionException e) {
      Assert.fail("Algo falló"); // TODO
      e.printStackTrace();
    }
    Assert.assertTrue(true);
  }

}
