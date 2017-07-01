package com.ingenium.goby.budget.extractor.extraction.merge;

import static org.junit.Assert.fail;

import com.ingenium.commons.util.BulkCsvFilesMerger;

import java.io.File;

import org.junit.Test;

public class BudgetFilesMergeTest {

  @Test
  public void testMerge() {
    String s = File.separator;
    String souceDirectory = "test" + s + "com" + s + "ingenium" + s + "goby" + s
        + "extractors" + s + "budget" + s + "fixture" + s + "lawfiles";
    String destinationDirectory = "tmp";
    String destinationFilename = "budgetLaw.csv";

    BulkCsvFilesMerger.merge(souceDirectory, destinationDirectory,
        destinationFilename, 1);
    fail("Not yet implemented");
  }

}
