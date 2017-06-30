/**
 *
 */

package com.ingenium.goby.budget.extraction;

import com.ingenium.goby.budget.extraction.download.BudgetLawCsvFilesListDownloader;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

/**
 * Pruebas de la clase BudgetLawCsvFilesListDownloaderTest.
 *
 * @author JaimeRodrigo
 */
public class BudgetLawCsvFilesListDownloaderTest {

  /**
   * Test method for {@link com.ingenium.goby.budget.extraction.BudgetFileListExtractor#extract()}.
   */
  @Test
  public void testExtract() {
    final BudgetLawCsvFilesListDownloader downloader = new BudgetLawCsvFilesListDownloader();
    try {
      downloader.download();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.fail("extraction failed");
    }

    final File f = new File(downloader.getDestination());
    Assert.assertTrue(f.exists() && !f.isDirectory());
  }

}
