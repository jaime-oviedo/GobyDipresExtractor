/**
 *
 */

package com.ingenium.goby.budget.extraction;

import com.ingenium.goby.extractors.ExtractionException;

import org.junit.Assert;
import org.junit.Test;

/**
 * Pruebas para la clase BudgetFileExtractor.
 *
 * @author JaimeRodrigo
 */
public class BudgetLawCsvFilesDownloaderTest {

  /**
   * Test method for {@link com.ingenium.goby.budget.extraction.BudgetFileExtractor#extract()}.
   */
  @Test
  public final void testExtract() {
    BudgetLawCsvFilesDownloader bfe = new BudgetLawCsvFilesDownloader();
    try {
      bfe.extract();
    } catch (ExtractionException e) {
      Assert.fail();
      e.printStackTrace();
    }
    Assert.assertTrue(true);
  }

}
