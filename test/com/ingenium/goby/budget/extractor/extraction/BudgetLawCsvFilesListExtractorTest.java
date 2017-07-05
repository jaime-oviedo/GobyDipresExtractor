/**
 *
 */

package com.ingenium.goby.budget.extractor.extraction;

import com.ingenium.goby.budget.extractor.download.BudgetLawCsvFilesListDownloader;

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
   * Test method for
   * {@link com.ingenium.goby.budget.extractor.extraction.BudgetFileListExtractor#extract()}.
   */
  @Test
  public void testExtract() {
    final BudgetLawCsvFilesListDownloader extractor = new BudgetLawCsvFilesListDownloader();
    try {
      extractor.download();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.fail("Download failed");
    }

    final File f = new File(extractor.getDestination());
    Assert.assertTrue(f.exists() && !f.isDirectory());
  }

}
