/**
 *
 */

package com.ingenium.goby.extractors.dipres;

import com.ingenium.commons.util.SimpleFileDownloader;
import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.Extractor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase extrae los archivos de presupuesto desde el sitio de la DIPRES.
 *
 * @author JaimeRodrigo
 */
class BudgetFileExtractor implements Extractor {

  private static final Logger log = Logger.getLogger(
      "com.ingenium.goby.extractors.dipres.BudgetFileExtractorLogger");

  private final String extractionListSource;

  private final String extractionSource;

  private final String destinationBasePath;

  private String extractionDestination;

  private Collection<String> budgetFileList;

  /**
   * Crea una nueva instancia de la clase BudgetFileExtractor.
   */
  public BudgetFileExtractor() {
    extractionListSource = Messages
        .getString("BudgetFileExtractor.extractionListFile"); //$NON-NLS-1$
    extractionSource = Messages.getString("BudgetFileExtractor.basePath"); //$NON-NLS-1$
    destinationBasePath = Messages
        .getString("BudgetFileExtractor.destinationBasePath"); //$NON-NLS-1$
    budgetFileList = new ArrayList<>();

    BudgetFileExtractor.log.setLevel(Level.ALL);
    ConsoleHandler handler = new ConsoleHandler();
    handler.setLevel(Level.ALL);
    BudgetFileExtractor.log.addHandler(handler);

  }

  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#extract()
   */
  @Override
  public void extract() throws ExtractionException {

    FileReader extractionListReader = null;
    try {
      extractionListReader = new FileReader(extractionListSource);
    } catch (FileNotFoundException e) {
      throw (new ExtractionException(
          "No se encontró el archivo con la lista de documentos a descargar"));
    }

    // Se encontró el archivo de lista de descarga

    BufferedReader extractionListFileStream = new BufferedReader(
        extractionListReader);
    String l;

    // Primero se extrae la lista de csvs a descargar
    try {
      while ((l = extractionListFileStream.readLine()) != null) {
        budgetFileList.add(l);
        BudgetFileExtractor.log
            .finest("Archivo agregado a la lista de descarga:" + l);
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      if (extractionListFileStream != null) {
        try {
          extractionListFileStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

    // Se genera un directorio asociado al timestamp de descarga

    extractionDestination = destinationBasePath + '-'
        + new SimpleDateFormat("yyyy-MM-dd_HH-mm").format(new Date());
    ;
    File destinationDirectory = new File(extractionDestination);
    BudgetFileExtractor.log
        .finest("Generando directorio:" + extractionDestination);
    destinationDirectory.mkdirs();

    // Ahora se descargan los documentos uno a uno
    SimpleFileDownloader downloader = new SimpleFileDownloader();
    Iterator<String> i = budgetFileList.iterator();

    Collection<String> downloadedFiles = new ArrayList<>();
    Collection<String> failedFiles = new ArrayList<>();

    while (i.hasNext()) {
      String fileName = i.next();
      String sourceFile = extractionSource + '/' + fileName;
      BudgetFileExtractor.log
          .finest("Se descargará el siguiente archivo:" + sourceFile);
      try {
        downloader.download(sourceFile, extractionDestination);
        downloadedFiles.add(fileName);
      } catch (IOException e) {
        failedFiles.add(fileName);
      }
      if (failedFiles.size() > 0) {
        StringBuffer msg = new StringBuffer(
            "Fallo la descarga de los siguientes archivos:\n");
        for (String string : failedFiles) {
          msg.append(string + "\n");
        }
        throw new ExtractionException(msg.toString());
      }
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
