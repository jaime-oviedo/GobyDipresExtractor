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
 * @author Jaime Oviedo
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
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_PnQM8G2fEeeXYbujNKTijw"
  */
  public static List<List<String>> normalize(final String sourceDirectory) {
    // begin-user-code
    final List<List<String>> normalizedEntries = new ArrayList<>();
    final File dir = new File(sourceDirectory);
    final File[] sources = dir.listFiles();
    if (sources == null) {
      BulkBudgetExecutionCsvFilesNormalizer.log
          .warning(new StringBuilder("Unable to retrieve directory listing at ")
              .append(sourceDirectory).toString());
      return normalizedEntries;
    }
    for (final File source : sources) {
      normalizedEntries
          .addAll(BudgetExecutionCsvFileNormalizer.normalize(source));
    }
    return normalizedEntries;
    // end-user-code
  }
  
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
    
    // Go into the provided directory and normalize the files there
    final List<List<String>> normalizedEntries = BulkBudgetExecutionCsvFilesNormalizer
        .normalize(sourceDirectory);
    
    /*
     * Because CSVWriter takes an array of strings as input, we first convert the collection of
     * lines to a String array.
     *
     */
    final List<String[]> linesAsArray = new ArrayList<>();
    for (final List<String> line : normalizedEntries) {
      int index = 0;
      final String[] lineAsArray = new String[20];
      for (final String value : line) {
        lineAsArray[index] = value;
        index++;
      }
      linesAsArray.add(lineAsArray);
    }
    
    // Before trying to write the final file, we make sure we can write to it.
    
    final File theFile = new File(destinationFile);
    theFile.getParentFile().mkdirs();
    CSVWriter writer = null;
    try {
      final FileWriter fileWriter = new FileWriter(theFile);
      writer = new CSVWriter(fileWriter, ';', CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(linesAsArray);
    } catch (final IOException e) {
      BulkBudgetExecutionCsvFilesNormalizer.log.severe(
          new StringBuilder("Unable to write normalized file to destination ")
              .append(destinationFile).toString());
      
    } finally {
      if (writer != null) {
        try {
          writer.close();
        } catch (final IOException e1) {
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
  * Creates a new instance of the class BulkBudgetExecutionCsvFilesNormalizer.
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Hx6rkG2jEeeXYbujNKTijw"
  */
  private BulkBudgetExecutionCsvFilesNormalizer() {
    // begin-user-code
    super();
    // end-user-code
  }
  
}
