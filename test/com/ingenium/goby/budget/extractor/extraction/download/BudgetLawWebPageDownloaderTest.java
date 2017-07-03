/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.extraction.download;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author JaimeRodrigo
 *
 */
public class BudgetLawWebPageDownloaderTest {

  /**
   * Test method for
   * {@link com.ingenium.goby.budget.extractor.extraction.download.BudgetLawWebPageDownloader#download()}.
   */
  @Test
  public final void testDownload() {
    final BudgetLawWebPageDownloader extractor = new BudgetLawWebPageDownloader();
    String destination = "tmp/budgetLaw.html";
    File destinationFile = new File(destination);
    destinationFile.delete();
    extractor.setDestination("tmp/budgetLaw.html");
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
