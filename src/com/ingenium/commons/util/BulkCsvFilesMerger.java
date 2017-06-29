/**
 *
 */

package com.ingenium.commons.util;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author JaimeRodrigo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_CARQ8FwnEee6qYx77erG2w"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_CARQ8FwnEee6qYx77erG2w"
 */
public class BulkCsvFilesMerger {
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @param souceDirectory
   * @param destinationDirectory
   * @param destinationFileName
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_GXM08FwnEee6qYx77erG2w"
   */
  public static void merge(String souceDirectory, String destinationDirectory,
      String destinationFileName) {
    // begin-user-code
    BulkCsvFilesMerger.merge(souceDirectory, destinationDirectory,
        destinationFileName, 0);

    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @param souceDirectory
   * @param destinationDirectory
   * @param destinationFileName
   * @param linesToSkip
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_1ELjEFwoEee6qYx77erG2w"
   */
  public static void merge(String souceDirectory, String destinationDirectory,
      String destinationFileName, int linesToSkip) {
    // begin-user-code
    String destination = destinationDirectory + File.separator
        + destinationFileName;
    File dir = new File(souceDirectory);
    File[] sources = dir.listFiles();
    if (sources == null) {
      return;
    }
    List<String[]> csvEntries = new ArrayList<>(100);

    for (File source : sources) {

      FileInputStream is = null;

      try {
        is = new FileInputStream(source);
      } catch (FileNotFoundException e1) {
        e1.printStackTrace();
        continue;
      }
      InputStreamReader isr = null;

      try {
        isr = new InputStreamReader(is, "CP1250");
      } catch (UnsupportedEncodingException e1) {
        if (is != null) {
          try {
            is.close();
          } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
        e1.printStackTrace();
        continue;
      }

      BufferedReader buffReader = new BufferedReader(isr);

      CSVReader reader = null;
      reader = new CSVReader(buffReader, ';', '"', linesToSkip);

      try {
        csvEntries.addAll(reader.readAll());
      } catch (IOException e) {
        e.printStackTrace();
      }

      try {
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    File destinationFile = new File(destination);
    destinationFile.delete();
    CSVWriter writer = null;
    try {
      writer = new CSVWriter(new FileWriter(destinationFile), ';',
          CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(csvEntries);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (writer != null) {
        try {
          writer.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

    }

    // end-user-code
  }
}