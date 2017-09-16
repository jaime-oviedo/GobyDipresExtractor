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

    final String sourceDirectory = new StringBuilder("test").append(s)
        .append("com").append(s).append("ingenium").append(s).append("goby")
        .append(s).append("budget").append(s).append("extractor").append(s)
        .append("normalization").append(s).append("fixture").append(s)
        .append("bulk").toString();
    final String objective = new StringBuilder("test").append(s).append("com")
        .append(s).append("ingenium").append(s).append("goby").append(s)
        .append("budget").append(s).append("extractor").append(s)
        .append("normalization").append(s).append("fixture").append(s)
        .append("bulk-execution-normalized.csv").toString();

    final String destination = new StringBuilder("stage").append(s)
        .append("test").append(s).append("bulk-execution-out.csv").toString();

    List<List<String>> normalizedEntries = BulkBudgetExecutionCsvFilesNormalizer
        .normalize(sourceDirectory, destination);
    for (List<String> line : normalizedEntries) {
      StringBuilder asString = new StringBuilder();
      for (String value : line) {
        asString.append(value).append(";");
      }
      System.out.println(asString.toString());
    }
    final File destinationFile = new File(destination);
    final File objectiveFile = new File(objective);
    Assert.assertTrue(FileUtils.contentEqualsIgnoreEOL(destinationFile,
        objectiveFile, "CP1250"));
    destinationFile.delete();
  }

}
