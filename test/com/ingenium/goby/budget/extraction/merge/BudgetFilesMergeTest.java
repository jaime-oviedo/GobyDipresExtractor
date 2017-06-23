package com.ingenium.goby.budget.extraction.merge;

import static org.junit.Assert.fail;

import com.ingenium.commons.util.BulkFileMerger;

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

    BulkFileMerger.merge(souceDirectory, destinationDirectory,
        destinationFilename);
    fail("Not yet implemented");
  }

}