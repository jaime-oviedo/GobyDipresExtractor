/**
 *
 */

package com.ingenium.goby.budget.extraction;

import com.ingenium.goby.budget.extraction.download.BudgetLawCsvFilesDownloader;
import com.ingenium.goby.extractors.DownloadException;

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
      bfe.download();
    } catch (DownloadException e) {
      Assert.fail();
      e.printStackTrace();
    }
    Assert.assertTrue(true);
  }

}
