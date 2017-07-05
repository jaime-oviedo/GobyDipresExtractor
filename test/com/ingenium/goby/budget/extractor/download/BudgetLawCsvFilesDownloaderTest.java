/**
 *
 */

package com.ingenium.goby.budget.extractor.download;

import com.ingenium.commons.util.DownloadException;
import com.ingenium.goby.budget.extractor.download.BudgetLawCsvFilesDownloader;

import org.junit.Assert;
import org.junit.Test;

/**
 * Pruebas para la clase BudgetFileExtractor.
 *
 * @author JaimeRodrigo
 */
public class BudgetLawCsvFilesDownloaderTest {

  /**
   * Test method for
   * {@link com.ingenium.goby.budget.extractor.extraction.BudgetFileExtractor#extract()}.
   */
  @Test
  public final void testExtract() {
    final BudgetLawCsvFilesDownloader bfe = new BudgetLawCsvFilesDownloader();
    try {
      bfe.download();
    } catch (final DownloadException e) {
      Assert.fail();
      e.printStackTrace();
    }
    Assert.assertTrue(true);
  }

}
