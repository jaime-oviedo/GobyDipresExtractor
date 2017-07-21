/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.normalization;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_NENBYG2fEeeXYbujNKTijw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_NENBYG2fEeeXYbujNKTijw"
 */
public class BulkBudgetExecutionCsvFilesNormalizer {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_PnPl4G2fEeeXYbujNKTijw"
  */
  private static final Logger log = Logger.getLogger(
      "com.ingenium.goby.budget.extractor.normalization.BulkBudgetExecutionCsvFilesNormalizer");
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param sourceDirectory
  * @param destinationFile
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_PnPl4m2fEeeXYbujNKTijw"
  */
  public static List<List<String>> normalize(final String sourceDirectory,
      final String destinationFile) {
    // begin-user-code
    List<List<String>> normalizedEntries = BulkBudgetExecutionCsvFilesNormalizer
        .normalize(sourceDirectory);
    List<String[]> linesAsArray = new ArrayList<>();
    for (List<String> line : normalizedEntries) {
      String[] lineAsArray = (String[]) line.toArray();
      linesAsArray.add(lineAsArray);
    }
    CSVWriter writer = null;
    try {
      writer = new CSVWriter(new FileWriter(destinationFile), ';',
          CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(linesAsArray);
    } catch (IOException e) {
      BulkBudgetExecutionCsvFilesNormalizer.log.severe(
          new StringBuffer("Unable to write normalized file to destination ")
              .append(destinationFile).toString());
      
    } finally {
      if (writer != null) {
        try {
          writer.close();
        } catch (IOException e1) {
          BulkBudgetExecutionCsvFilesNormalizer.log
              .warning("Unable to close csv file writer");
        }
      }
    }
    
    return normalizedEntries;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param sourceDirectory
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_PnQM8G2fEeeXYbujNKTijw"
  */
  public static List<List<String>> normalize(final String sourceDirectory) {
    // begin-user-code
    List<List<String>> normalizedEntries = new ArrayList<>();
    File dir = new File(sourceDirectory);
    File[] sources = dir.listFiles();
    if (sources == null) {
      BulkBudgetExecutionCsvFilesNormalizer.log
          .warning(new StringBuffer("Unable to retrieve directory listing at ")
              .append(sourceDirectory).toString());
      return normalizedEntries;
    }
    for (File source : sources) {
      normalizedEntries
          .addAll(BudgetExecutionCsvFileNormalizer.normalize(source));
    }
    return normalizedEntries;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase BulkBudgetExecutionCsvFilesNormalizer.
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Hx6rkG2jEeeXYbujNKTijw"
  */
  private BulkBudgetExecutionCsvFilesNormalizer() {
    // begin-user-code
    super();
    // end-user-code
  }
  
}
