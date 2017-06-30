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
      InputStreamReader isr = null;
      CSVReader reader = null;
      BufferedReader buffReader = null;
      try {
        is = new FileInputStream(source);
        isr = new InputStreamReader(is, "CP1250");
        buffReader = new BufferedReader(isr);
        reader = new CSVReader(buffReader, ';', '"', linesToSkip);
        csvEntries.addAll(reader.readAll());
      } catch (FileNotFoundException e1) {
        e1.printStackTrace();
        continue;
      } catch (UnsupportedEncodingException e1) {
        e1.printStackTrace();
        continue;
      } catch (IOException e) {
        e.printStackTrace();
        continue;
      } finally {
        if (reader != null) {
          try {
            reader.close();
          } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
        if (buffReader != null) {
          try {
            buffReader.close();
          } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
        if (isr != null) {
          try {
            isr.close();
          } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
        if (is != null) {
          try {
            is.close();
          } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
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