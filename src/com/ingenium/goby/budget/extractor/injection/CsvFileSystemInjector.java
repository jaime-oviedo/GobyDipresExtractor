/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.injection;

import com.ingenium.goby.budget.extractor.map.ExecutionToListStringMapper;
import com.ingenium.goby.budget.extractor.model.BudgetElement;
import com.ingenium.goby.budget.extractor.model.BudgetExecution;
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
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_JY02kJpnEee5DLgYEA7GWQ"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_JY02kJpnEee5DLgYEA7GWQ"
 */
public final class CsvFileSystemInjector implements BudgetInjector {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_MOvTwJpnEee5DLgYEA7GWQ"
  */
  private static final Logger log = Logger
      .getLogger(CsvFileSystemInjector.class.getCanonicalName());
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gctxUJzKEeeKKp-m4AD7KQ"
  */
  private final String fileName;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gcuYYJzKEeeKKp-m4AD7KQ"
  */
  private String directory;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gcuYYpzKEeeKKp-m4AD7KQ"
  */
  private String encoding;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_sO5XMJzQEee9jdUag7Rsng"
  */
  private final boolean useHeader;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_sO5-QJzQEee9jdUag7Rsng"
  */
  private final boolean extended;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param elements
  * @param fileName
  * @param directory
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_njs5wJpnEee5DLgYEA7GWQ"
  */
  public static void inject(final List<List<String>> elements, String fileName,
      final String directory) {
    // begin-user-code
    CsvFileSystemInjector.inject(elements, fileName, directory,
        Charset.forName("CP1250"));
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param elements
  * @param fileName
  * @param directory
  * @param encoding
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_sO-PspzQEee9jdUag7Rsng"
  */
  public static void inject(final List<List<String>> elements,
      final String fileName, final String directory, final Charset encoding) {
    // begin-user-code
    
    final String destination = new StringBuilder(directory)
        .append(File.separator).append(fileName).toString();
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
      CsvFileSystemInjector.log
          .warning(new StringBuilder("Unable to write csv:")
              .append(e.getMessage()).toString());
    } finally {
      if (writer != null) {
        try {
          writer.close();
        } catch (final IOException e) {
          CsvFileSystemInjector.log
              .fine(new StringBuilder("Unable to close CsvWriter:")
                  .append(e.getMessage()).toString());
        }
      }
    }
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param budgetElement
  * @throws InjectionException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_hJkmYpzBEeeKKp-m4AD7KQ"
  */
  @Override
  public void inject(BudgetElement budgetElement) throws InjectionException {
    // begin-user-code
    if (budgetElement instanceof BudgetExecution) {
      final BudgetExecution bu = (BudgetExecution) budgetElement;
      final List<List<String>> elements = ExecutionToListStringMapper.map(bu,
          this.useHeader, this.extended);
      CsvFileSystemInjector.inject(elements, this.fileName, this.directory,
          Charset.forName(this.encoding));
    } else {
      throw new InjectionException("Unsupported type for injecton");
    }
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class CsvFileSystemInjector.
  * @param fileName
  * @param directory
  * @param encoding
  * @param useHeader
  * @param extended
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kJ0j8JzEEeeKKp-m4AD7KQ"
  */
  public CsvFileSystemInjector(String fileName, String directory,
      String encoding, boolean useHeader, boolean extended) {
    // begin-user-code
    this.fileName = fileName;
    this.directory = directory;
    this.encoding = encoding;
    this.useHeader = useHeader;
    this.extended = extended;
    // end-user-code
  }
}