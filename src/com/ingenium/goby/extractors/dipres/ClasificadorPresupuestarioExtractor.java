/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.dipres;

import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.Extractor;
import com.opencsv.CSVReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

/**
 * Esta clase lee un archivo separado por comas con la información de la ley de
 * presupuestos y lo extrae a un archivo Jason destino.
 *
 * @author JaimeRodrigo
 */
public class ClasificadorPresupuestarioExtractor implements Extractor {

  private static final Logger log = Logger.getLogger(
      "com.ingenium.goby.extractors.dipres.ClasificadorPresupuestarioExtractor");

  private final String extractionSource;

  private final String extractionDestination;

  /**
   * Crea una nueva instancia de la clase BudgetClassifierCVStoJSONParser.
   */
  public ClasificadorPresupuestarioExtractor() {
    extractionSource = Messages
        .getString("ClasificadorPresupuestarioExtractor.sourceUrl"); //$NON-NLS-1$
    extractionDestination = Messages
        .getString("ClasificadorPresupuestarioExtractor.destinationUrl"); //$NON-NLS-1$
  }

  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#extract()
   */
  @Override
  public void extract() throws ExtractionException {
    FileInputStream fi;
    try {
      fi = new FileInputStream(extractionSource);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      throw new ExtractionException("Archivo de origen no encontrado");
    }
    CSVReader reader = null;
    try {
      reader = new CSVReader(new InputStreamReader(fi, "UTF-8"), ';');
    } catch (UnsupportedEncodingException e1) {
      e1.printStackTrace();
      try {
        fi.close();
      } catch (IOException e) {
        ClasificadorPresupuestarioExtractor.log
            .fine("Error al cerrar los streams de lectura");
        e.printStackTrace();
      }
      throw new ExtractionException("Error de codificación del archivo fuente");
    }
    
    ClasificadorPresupuestarioExtractor.log.fine("Comenzando la extracción");

    String[] line;
    try {
      while ((line = reader.readNext()) != null) {
        StringBuilder stb = new StringBuilder(400);
        for (String element : line) {
          stb.append(element);
          stb.append("\t");
        }
        System.out.println(stb);
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
