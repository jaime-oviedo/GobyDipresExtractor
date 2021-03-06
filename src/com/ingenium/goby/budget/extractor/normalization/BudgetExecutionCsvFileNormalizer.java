/**
 *
 */

package com.ingenium.goby.budget.extractor.normalization;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 *
 * @author Jaime Oviedo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_95O2AGNsEeebmPnwD8r8OA"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_95O2AGNsEeebmPnwD8r8OA"
 */
public class BudgetExecutionCsvFileNormalizer {
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_JDkLoGzdEeeX3cBMD4xNqQ"
   */
  private static final Logger log = Logger.getLogger(
      "com.ingenium.goby.budget.extractor.normalization.BudgetExecutionCsvFileNormalizer");

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @param csvBudgetExecutionFile
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_mz_ucG2hEeeXYbujNKTijw"
   */
  public static List<List<String>> normalize(File csvBudgetExecutionFile,
      String encoding) {
    // begin-user-code
    FileInputStream fi = null;
    InputStreamReader isr = null;
    BufferedReader buffReader = null;
    List<String[]> sourceLines = new ArrayList<>();
    CSVReader reader = null;

    try {
      fi = new FileInputStream(csvBudgetExecutionFile);
      isr = new InputStreamReader(fi, Charset.forName(encoding));

      buffReader = new BufferedReader(isr);

      reader = new CSVReader(buffReader, ';', '"', 1);
      sourceLines = reader.readAll();
    } catch (final IOException e) {
      BudgetExecutionCsvFileNormalizer.log
          .severe(new StringBuilder("Unable to process input file ")
              .append(csvBudgetExecutionFile).append(" for normalization")
              .toString());
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (final IOException e) {
          BudgetExecutionCsvFileNormalizer.log
              .warning("Unable to close reader");

        }
      }

    }
    final List<List<String>> selectedLines = new ArrayList<>();
    for (final String[] line : sourceLines) {
      boolean selected = true;
      for (final String value : line) {
        if (value == null) {
          selected = false;
          continue;
        }
        if ("RESULTADO".equals(value.toUpperCase())) {
          selected = false;
          continue;
        }
      }
      if (selected) {
        final List<String> lineAsCollection = Arrays.asList(line);
        selectedLines.add(lineAsCollection);
      }

    }

    return selectedLines;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @param csvBudgetExecutionFile
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_TBCWMGNtEeebmPnwD8r8OA"
   */
  public static List<List<String>> normalize(String csvBudgetExecutionFile,
      String encoding) {
    // begin-user-code
    return BudgetExecutionCsvFileNormalizer
        .normalize(new File(csvBudgetExecutionFile), encoding);
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @param csvBudgetExecutionFile
   * @param destination
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_FYutcGNtEeebmPnwD8r8OA"
   */
  public static List<List<String>> normalize(String csvBudgetExecutionFile,
      String destination, String encoding) {
    // begin-user-code

    final List<List<String>> selectedLines = BudgetExecutionCsvFileNormalizer
        .normalize(csvBudgetExecutionFile, encoding);
    final List<String[]> linesAsArray = new ArrayList<>();
    for (final List<String> line : selectedLines) {
      int index = 0;
      final String[] lineAsArray = new String[20];
      for (final String value : line) {
        lineAsArray[index] = value;
        index++;
      }
      linesAsArray.add(lineAsArray);
    }
    CSVWriter writer = null;
    try {
      writer = new CSVWriter(new FileWriter(destination), ';',
          CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(linesAsArray);
    } catch (final IOException e) {
      BudgetExecutionCsvFileNormalizer.log.severe(
          new StringBuilder("Unable to write normalized file to destination ")
              .append(destination).toString());

    } finally {
      if (writer != null) {
        try {
          writer.close();
        } catch (final IOException e1) {
          BudgetExecutionCsvFileNormalizer.log
              .warning("Unable to close csv file writer");
        }
      }
    }

    return selectedLines;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc --> Creates a new instance of the class
   * BudgetExecutionCsvFileNormalizer.
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_CU6-MGNtEeebmPnwD8r8OA"
   */
  private BudgetExecutionCsvFileNormalizer() {
    // begin-user-code
    super();
    // end-user-code
  }
}