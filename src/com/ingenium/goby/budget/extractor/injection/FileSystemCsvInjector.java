/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.injection;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 *
 * @author Jaime Oviedo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_JY02kJpnEee5DLgYEA7GWQ"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_JY02kJpnEee5DLgYEA7GWQ"
 */
public class FileSystemCsvInjector {
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_MOvTwJpnEee5DLgYEA7GWQ"
   */
  private static final Logger log = Logger
      .getLogger(FileSystemCsvInjector.class.getCanonicalName());

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @param elements
   * @param destination
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_njs5wJpnEee5DLgYEA7GWQ"
   */
  public static void inject(final List<List<String>> elements,
      final String destination) {
    // begin-user-code
    FileSystemCsvInjector.inject(elements, destination,
        Charset.forName("CP1250"));

    // end-user-code
  }

  public static void inject(final List<List<String>> elements,
      final String destination, final Charset encoding) {
    // ugly hack because RSA cannot model collections of arrays
    final List<String[]> mappedLines = new ArrayList<>();
    for (final List<String> line : elements) {
      final int totalElements = line.size();
      int index = 0;
      final String[] mappedLine = new String[totalElements];
      for (final String lineElement : line) {
        mappedLine[index] = lineElement;
        index++;
      }
      mappedLines.add(mappedLine);
    }
    File file = null;
    File filepath = null;
    FileOutputStream os = null;
    OutputStreamWriter osw = null;
    CSVWriter writer = null;
    try {
      file = new File(destination);
      filepath = file.getParentFile();
      filepath.mkdirs();
      os = new FileOutputStream(file);
      osw = new OutputStreamWriter(os, encoding);
      writer = new CSVWriter(osw, ';', '\"', "\n");
      writer.writeAll(mappedLines);
    } catch (final IOException e) {
      FileSystemCsvInjector.log
          .warning(new StringBuilder("Unable to write csv:")
              .append(e.getMessage()).toString());
    } finally {
      if (writer != null) {
        try {
          writer.close();
        } catch (final IOException e) {
          FileSystemCsvInjector.log
              .fine(new StringBuilder("Unable to close CsvWriter:")
                  .append(e.getMessage()).toString());
        }
      }
    }
  }
}