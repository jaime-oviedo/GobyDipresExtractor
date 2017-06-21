/**
 *
 */

package com.ingenium.goby.budget.extraction;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

/**
 * Pruebas de la clase BudgetLawCsvFilesListExtractorTest.
 *
 * @author JaimeRodrigo
 */
public class BudgetLawCsvFilesListExtractorTest {

  /**
   * Test method for {@link com.ingenium.goby.budget.extraction.BudgetFileListExtractor#extract()}.
   */
  @Test
  public void testExtract() {
    final BudgetLawCsvFilesListExtractor extractor = new BudgetLawCsvFilesListExtractor();
    try {
      extractor.download();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.fail("extraction failed");
    }

    final File f = new File(extractor.getDestination());
    Assert.assertTrue(f.exists() && !f.isDirectory());
  }

}
