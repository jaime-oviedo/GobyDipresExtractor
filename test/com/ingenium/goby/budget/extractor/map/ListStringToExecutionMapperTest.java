/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.map;

import com.ingenium.goby.budget.extractor.injection.FileSystemInjector;
import com.ingenium.goby.budget.extractor.injection.InjectionException;
import com.ingenium.goby.budget.extractor.model.BudgetExecution;
import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Jaime Oviedo
 *
 */
public class ListStringToExecutionMapperTest {

  private Logger log = Logger
      .getLogger(ListStringToExecutionMapperTest.class.getCanonicalName());

  /**
   * Test method for
   * {@link com.ingenium.goby.budget.extractor.map.ExecutionToListStringMapper#map(com.ingenium.goby.budget.extractor.model.BudgetExecution)}.
   */
  @Test
  public final void testMap() {
    final String s = File.separator;

    final String source = new StringBuffer("test").append(s).append("com")
        .append(s).append("ingenium").append(s).append("goby").append(s)
        .append("budget").append(s).append("extractor").append(s).append("map")
        .append(s).append("fixture").append(s).append("execution.csv")
        .toString();

    FileInputStream fi = null;
    CSVReader reader = null;
    List<String[]> lines = new ArrayList<>(300);
    try {
      fi = new FileInputStream(source);
      reader = new CSVReader(new InputStreamReader(fi, "UTF-8"), ';', '"', 1);
      lines = reader.readAll();
    } catch (final IOException e) {
      log.severe(new StringBuilder("Unable to read execution files:")
          .append(e.getMessage()).toString());
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (final IOException e) {
        log.warning(new StringBuilder("Unable to close CSVReader:")
            .append(e.getMessage()).toString());
      }
      try {
        if (fi != null) {
          fi.close();
        }
      } catch (final IOException e) {
        log.warning(new StringBuilder("Unable to close FileInputStream:")
            .append(e.getMessage()).toString());
      }
    }

    // ugly hack because RSA cannot model collections of arrays
    List<List<String>> mappedLines = new ArrayList<>();

    for (final String[] line : lines) {
      List<String> mappedLine = new ArrayList<>();
      for (final String lineElement : line) {
        mappedLine.add(lineElement);
      }
      mappedLines.add(mappedLine);
    }

    BudgetExecution execution = ListStringToExecutionMapper.map(mappedLines);

    System.out.println(execution.toString());
    // now let's turn this back

    List<List<String>> executionLines = ExecutionToListStringMapper
        .map(execution, true, true);

    for (List<String> line : executionLines) {
      for (String lineItem : line) {
        System.out.print(lineItem);
        System.out.print(";");
      }
      System.out.print("\n");
    }
    final String destination = new StringBuffer("test").append(s).append("com")
        .append(s).append("ingenium").append(s).append("goby").append(s)
        .append("budget").append(s).append("extractor").append(s).append("map")
        .append(s).append("out").append(s).append("execution.csv").toString();
    try {
      FileSystemInjector.inject(executionLines, destination);
      Assert.assertTrue(true);
    } catch (InjectionException e) {
      Assert.fail("Unable to write file");
    }

  }

}
