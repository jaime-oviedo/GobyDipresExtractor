/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.Extractor;
import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author JaimeRodrigo
 */
public class BudgetClassifierExtractor implements Extractor {

  private final String extractionSource;

  private final String extractionDestination;

  /**
   * Crea una nueva instancia de la clase BudgetClassifierCVStoJSONParser.
   */
  public BudgetClassifierExtractor() {
    extractionSource = Messages
        .getString("BudgetClassifierExtractor.sourceUrl"); //$NON-NLS-1$
    extractionDestination = Messages
        .getString("BudgetClassifierExtractor.destinationUrl"); //$NON-NLS-1$
  }

  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#extract()
   */
  @Override
  public void extract() throws ExtractionException {
    CSVReader reader;
    try {
      reader = new CSVReader(new FileReader(extractionSource));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      throw new ExtractionException("Archivo de origen no encontrado");

    }
    String[] nextLine;
    try {
      while ((nextLine = reader.readNext()) != null) {
        // nextLine[] is an array of values from the line
        System.out.println(nextLine[0] + nextLine[1] + "etc...");
      }
    } catch (IOException e) {
      e.printStackTrace();
      
    }

  }

  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#getExtractionDestination()
   */
  @Override
  public String getExtractionDestination() {
    return extractionDestination;
  }

  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#getExtractionSource()
   */
  @Override
  public String getExtractionSource() {
    return extractionSource;
  }

}
