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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_95O2AGNsEeebmPnwD8r8OA"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_95O2AGNsEeebmPnwD8r8OA"
 */
public class BudgetExecutionCsvFileNormalizer {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_JDkLoGzdEeeX3cBMD4xNqQ"
  */
  private static final Logger log = Logger.getLogger(
      "com.ingenium.goby.budget.extractor.normalization.BudgetExecutionCsvFileNormalizer");

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param csvBudgetExecutionFile
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_mz_ucG2hEeeXYbujNKTijw"
  */
  public static List<List<String>> normalize(File csvBudgetExecutionFile) {
    // begin-user-code
    FileInputStream fi = null;
    InputStreamReader isr = null;
    BufferedReader buffReader = null;
    List<String[]> sourceLines = new ArrayList<>();
    CSVReader reader = null;

    try {
      fi = new FileInputStream(csvBudgetExecutionFile);
      isr = new InputStreamReader(fi, "CP1250");

      buffReader = new BufferedReader(isr);

      reader = new CSVReader(buffReader, ';', '"', 1);
      sourceLines = reader.readAll();
    } catch (IOException e) {
      BudgetExecutionCsvFileNormalizer.log
          .severe(new StringBuffer("Unable to process input file ")
              .append(csvBudgetExecutionFile).append(" for normalization")
              .toString());
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
          BudgetExecutionCsvFileNormalizer.log
              .warning("Unable to close reader");

        }
      }

    }
    List<List<String>> selectedLines = new ArrayList<>();
    for (String[] line : sourceLines) {
      boolean selected = true;
      for (String value : line) {
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
        List<String> lineAsCollection = Arrays.asList(line);
        selectedLines.add(lineAsCollection);
      }

    }

    return selectedLines;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param csvBudgetExecutionFile
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_TBCWMGNtEeebmPnwD8r8OA"
  */
  public static List<List<String>> normalize(String csvBudgetExecutionFile) {
    // begin-user-code
    return BudgetExecutionCsvFileNormalizer
        .normalize(new File(csvBudgetExecutionFile));
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param csvBudgetExecutionFile
  * @param destination
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_FYutcGNtEeebmPnwD8r8OA"
  */
  public static List<List<String>> normalize(String csvBudgetExecutionFile,
      String destination) {
    // begin-user-code

    List<List<String>> selectedLines = BudgetExecutionCsvFileNormalizer
        .normalize(csvBudgetExecutionFile);
    List<String[]> linesAsArray = new ArrayList<>();
    for (List<String> line : selectedLines) {
      int index = 0;
      String[] lineAsArray = new String[20];
      for (String value : line) {
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
    } catch (IOException e) {
      BudgetExecutionCsvFileNormalizer.log.severe(
          new StringBuffer("Unable to write normalized file to destination ")
              .append(destination).toString());

    } finally {
      if (writer != null) {
        try {
          writer.close();
        } catch (IOException e1) {
          BudgetExecutionCsvFileNormalizer.log
              .warning("Unable to close csv file writer");
        }
      }
    }

    return selectedLines;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_CU6-MGNtEeebmPnwD8r8OA"
  */
  private BudgetExecutionCsvFileNormalizer() {
    // begin-user-code
    super();
    // end-user-code
  }
}