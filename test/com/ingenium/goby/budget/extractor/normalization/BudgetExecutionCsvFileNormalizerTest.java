/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.normalization;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author JaimeRodrigo
 *
 */
public class BudgetExecutionCsvFileNormalizerTest {

  /**
   * Test method for
   * {@link com.ingenium.goby.budget.extractor.normalization.BudgetExecutionCsvFileNormalizer#normalize(java.lang.String, java.lang.String)}.
   *
   * @throws IOException
   */
  @Test
  public final void testNormalizeStringString() throws IOException {
    final String s = File.separator;

    final String source = new StringBuilder("test").append(s).append("com")
        .append(s).append("ingenium").append(s).append("goby").append(s)
        .append("budget").append(s).append("extractor").append(s)
        .append("normalization").append(s).append("fixture").append(s)
        .append("execution-raw.csv").toString();
    final String objective = new StringBuilder("test").append(s).append("com")
        .append(s).append("ingenium").append(s).append("goby").append(s)
        .append("budget").append(s).append("extractor").append(s)
        .append("normalization").append(s).append("fixture").append(s)
        .append("execution-normalized.csv").toString();

    final String destination = new StringBuilder("stage").append(s)
        .append("test").append(s).append("execution-out.csv").toString();

    BudgetExecutionCsvFileNormalizer.normalize(source, destination);
    File destinationFile = new File(destination);
    File objectiveFile = new File(objective);
    Assert.assertTrue(FileUtils.contentEqualsIgnoreEOL(destinationFile,
        objectiveFile, "CP1250"));

    destinationFile.delete();
  }

}
