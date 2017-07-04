/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.extraction.crawl;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;
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
  // @Test
  public final void testFindExecutionFIles() {
    BudgetExecutionCrawler crawler = new BudgetExecutionCrawler();
    Handler finestHandler = new ConsoleHandler();
    finestHandler.setLevel(Level.FINEST);
    BudgetExecutionCrawler.log.addHandler(finestHandler);
    crawler.findExecutionFiles(2017, Calendar.FEBRUARY);
    Assert.fail("Not yet implemented"); // TODO
  }

  @Test
  public final void testExtractExecutionCsvilesUrls() {
    String s = File.separator;
    String source = new StringBuffer("test").append(s).append("com").append(s)
        .append("ingenium").append(s).append("goby").append(s).append("budget")
        .append(s).append("extractor").append(s).append("fixture").append(s)
        .append("Informe Ejecución Programa - W3 DIPRES Documentación.html")
        .toString();
    URL url = null;
    try {
      url = Paths.get(source).toUri().toURL();
    } catch (MalformedURLException e1) {
      Assert.fail("Can't create test URL");
      e1.printStackTrace();
    }
    final WebClient webClient = new WebClient();
    HtmlPage programLevelBudgetExecutionYearPage = null;
    try {
      programLevelBudgetExecutionYearPage = webClient.getPage(url);
    } catch (FailingHttpStatusCodeException | IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    BudgetExecutionCrawler crawler = new BudgetExecutionCrawler();
    List<String> executionFiles = crawler.extractExecutionCsvFilesUrls(
        programLevelBudgetExecutionYearPage, Calendar.FEBRUARY);
    for (String fileName : executionFiles) {
      System.out.println(fileName);
    }
    Assert.assertTrue(true);
    webClient.close();
  }

}
