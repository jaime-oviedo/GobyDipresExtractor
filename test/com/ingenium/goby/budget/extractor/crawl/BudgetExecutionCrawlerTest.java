/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.crawl;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.ingenium.goby.budget.extractor.model.ExecutionPeriod;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author JaimeRodrigo
 *
 */
public class BudgetExecutionCrawlerTest {

  private static final Logger log = Logger.getLogger(
      "com.ingenium.goby.budget.extractor.crawl.BudgetExecutionCrawlerTest");

  @BeforeClass
  public static void beforeClass() {
    System.setProperty("java.util.logging.config.file",
        ClassLoader.getSystemResource("logging.properties").getPath());
  }

  /**
   * Test method for
   * {@link com.ingenium.goby.budget.extractor.crawl.BudgetExecutionCrawler#findExecutionFIles()}.
   */
  @Test
  public final void testCrawlAndFetchExecutionFilesList() {
    BudgetExecutionCrawlerTest.log
        .info("Testing crawlAndFetchExecutionFilesList method");

    final BudgetExecutionCrawler crawler = new BudgetExecutionCrawler();
    final List<String> executionFiles = crawler
        .crawlAndFetchExecutionFilesList(2017, ExecutionPeriod.APRIL);
    for (final String fileName : executionFiles) {
      BudgetExecutionCrawlerTest.log
          .info(new StringBuffer("Found extractable file:").append(fileName)
              .toString());
    }
    Assert.assertTrue(true);
  }

  @Test
  public final void testExtractExecutionFilesList() {
    BudgetExecutionCrawlerTest.log
        .info("Testing extractExecutionFilesList method");
    final String s = File.separator;
    final String source = new StringBuffer("test").append(s).append("com")
        .append(s).append("ingenium").append(s).append("goby").append(s)
        .append("budget").append(s).append("extractor").append(s)
        .append("fixture").append(s)
        .append("Informe Ejecución Programa - W3 DIPRES Documentación.html")
        .toString();
    URL url = null;
    try {
      url = Paths.get(source).toUri().toURL();
    } catch (final MalformedURLException e1) {
      Assert.fail("Can't create test URL");
      e1.printStackTrace();
    }
    BudgetExecutionCrawlerTest.log.info("Starting web client");
    final WebClient webClient = new WebClient();
    HtmlPage programLevelBudgetExecutionYearPage = null;
    try {
      programLevelBudgetExecutionYearPage = webClient.getPage(url);
    } catch (FailingHttpStatusCodeException | IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    final BudgetExecutionCrawler crawler = new BudgetExecutionCrawler();

    if (programLevelBudgetExecutionYearPage != null) {
      final List<String> executionFiles = crawler.extractExecutionFilesList(
          programLevelBudgetExecutionYearPage, ExecutionPeriod.APRIL);
      for (final String fileName : executionFiles) {
        BudgetExecutionCrawlerTest.log
            .info(new StringBuffer("Found extractable file:").append(fileName)
                .toString());
      }
      Assert.assertTrue(executionFiles.size() > 0);
    } else {
      Assert.fail(
          "Unable to extract the program level buget execution page by year");
    }
    webClient.close();
  }

}
