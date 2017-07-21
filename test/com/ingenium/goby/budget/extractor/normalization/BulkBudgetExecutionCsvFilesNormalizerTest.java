/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.normalization;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author JaimeRodrigo
 *
 */
public class BulkBudgetExecutionCsvFilesNormalizerTest {

  /**
   * Test method for
   * {@link com.ingenium.goby.budget.extractor.normalization.BulkBudgetExecutionCsvFilesNormalizer#normalize(java.lang.String)}.
   *
   * @throws IOException
   */
  @Test
  public final void testNormalizeStringString() throws IOException {
    final String s = File.separator;

    final String sourceDirectory = new StringBuffer("test").append(s)
        .append("com").append(s).append("ingenium").append(s).append("goby")
        .append(s).append("budget").append(s).append("extractor").append(s)
        .append("normalization").append(s).append("fixture").append(s)
        .append("bulk").toString();
    final String objective = new StringBuffer("test").append(s).append("com")
        .append(s).append("ingenium").append(s).append("goby").append(s)
        .append("budget").append(s).append("extractor").append(s)
        .append("normalization").append(s).append("fixture").append(s)
        .append("bulk-execution-normalized.csv").toString();

    final String destination = new StringBuffer("stage").append(s)
        .append("test").append(s).append("bulk-execution-out.csv").toString();

    final List<List<String>> normalizedEntries = BulkBudgetExecutionCsvFilesNormalizer
        .normalize(sourceDirectory, destination);
    final File destinationFile = new File(destination);
    final File objectiveFile = new File(objective);
    Assert.assertTrue(FileUtils.contentEqualsIgnoreEOL(destinationFile,
        objectiveFile, "CP1250"));

    destinationFile.delete();

    Assert.fail("Not yet implemented"); // TODO
  }

}
