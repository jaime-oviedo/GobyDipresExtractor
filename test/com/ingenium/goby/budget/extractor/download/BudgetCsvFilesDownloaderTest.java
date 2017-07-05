/**
 *
 */

package com.ingenium.goby.budget.extractor.download;

import com.ingenium.commons.util.DownloadException;

import org.junit.Assert;
import org.junit.Test;

/**
 * Pruebas para la clase BudgetFileExtractor.
 *
 * @author JaimeRodrigo
 */
public class BudgetCsvFilesDownloaderTest {

  /**
   * Test method for
   * {@link com.ingenium.goby.budget.extractor.extraction.BudgetFileExtractor#extract()}.
   */
  @Test
  public final void testExtract() {
    final BudgetCsvFilesDownloader bfe = new BudgetCsvFilesDownloader();
    try {
      bfe.download();
    } catch (final DownloadException e) {
      Assert.fail();
      e.printStackTrace();
    }
    Assert.assertTrue(true);
  }

}
