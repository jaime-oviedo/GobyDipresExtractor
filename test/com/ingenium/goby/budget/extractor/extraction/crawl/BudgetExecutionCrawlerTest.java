/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.extraction.crawl;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author JaimeRodrigo
 *
 */
public class BudgetExecutionCrawlerTest {

  @BeforeClass
  public static void beforeClass() {
    System.setProperty("java.util.logging.config.file",
        ClassLoader.getSystemResource("logging.properties").getPath());
  }

  /**
   * Test method for
   * {@link com.ingenium.goby.budget.extractor.extraction.crawl.BudgetExecutionCrawler#findExecutionFIles()}.
   */
  @Test
  public final void testFindExecutionFIles() {
    BudgetExecutionCrawler crawler = new BudgetExecutionCrawler();
    Handler finestHandler = new ConsoleHandler();
    finestHandler.setLevel(Level.FINEST);
    BudgetExecutionCrawler.log.addHandler(finestHandler);
    crawler.findExecutionFiles(2017);
    Assert.fail("Not yet implemented"); // TODO
  }

}
