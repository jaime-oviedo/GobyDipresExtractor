/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.map;

import com.ingenium.goby.budget.extractor.injection.CsvFileSystemInjector;
import com.ingenium.goby.budget.extractor.model.BudgetExecution;
import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
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

  private final Logger log = Logger
      .getLogger(ListStringToExecutionMapperTest.class.getCanonicalName());

  /**
   * Test method for
   * {@link com.ingenium.goby.budget.extractor.map.ExecutionToListStringMapper#map(com.ingenium.goby.budget.extractor.model.BudgetExecution)}.
   */
  @Test
  public final void testMap() {
    final String s = File.separator;

    final String source = new StringBuilder("test").append(s).append("com")
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
      this.log.severe(new StringBuilder("Unable to read execution files:")
          .append(e.getMessage()).toString());
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (final IOException e) {
        this.log.warning(new StringBuilder("Unable to close CSVReader:")
            .append(e.getMessage()).toString());
      }
      try {
        if (fi != null) {
          fi.close();
        }
      } catch (final IOException e) {
        this.log.warning(new StringBuilder("Unable to close FileInputStream:")
            .append(e.getMessage()).toString());
      }
    }

    // ugly hack because RSA cannot model collections of arrays
    final List<List<String>> mappedLines = new ArrayList<>();

    for (final String[] line : lines) {
      final List<String> mappedLine = new ArrayList<>();
      for (final String lineElement : line) {
        mappedLine.add(lineElement);
      }
      mappedLines.add(mappedLine);
    }

    final BudgetExecution execution = ListStringToExecutionMapper
        .map(mappedLines);

    System.out.println(execution.toString());
    // now let's turn this back

    final List<List<String>> executionLines = ExecutionToListStringMapper
        .map(execution, true, true);

    for (final List<String> line : executionLines) {
      for (final String lineItem : line) {
        System.out.print(lineItem);
        System.out.print(";");
      }
      System.out.print("\n");
    }
    final String destinationDirectory = new StringBuilder("test").append(s)
        .append("com").append(s).append("ingenium").append(s).append("goby")
        .append(s).append("budget").append(s).append("extractor").append(s)
        .append("map").append(s).append("out").toString();
    final String destinationFile = "execution.csv";

    CsvFileSystemInjector.inject(executionLines, destinationFile,
        destinationDirectory, Charset.forName("CP1250"));
    Assert.assertTrue(true);

  }

}
