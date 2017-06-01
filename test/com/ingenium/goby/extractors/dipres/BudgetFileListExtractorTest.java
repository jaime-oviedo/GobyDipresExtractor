/**
 *
 */

package com.ingenium.goby.extractors.dipres;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

/**
 * Pruebas de la clase BudgetFileListExtractorTest.
 *
 * @author JaimeRodrigo
 */
public class BudgetFileListExtractorTest {
  
  /**
   * Test method for
   * {@link com.ingenium.goby.extractors.dipres.BudgetFileListExtractor#extract()}.
   */
  @Test
  public void testExtract() {
    final BudgetFileListExtractor extractor = new BudgetFileListExtractor();
    try {
      extractor.extract();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.fail("extraction failed");
    }

    final File f = new File(extractor.getExtractionDestination());
    Assert.assertTrue(f.exists() && !f.isDirectory());
  }
  
}
