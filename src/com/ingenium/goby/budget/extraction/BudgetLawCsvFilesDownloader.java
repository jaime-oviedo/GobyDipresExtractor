/**
 *
 */

package com.ingenium.goby.budget.extraction;

import com.ingenium.commons.util.SimpleFileDownloader;
import com.ingenium.goby.budget.Messages;
import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.ExtractorImpl;

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
import java.util.logging.Logger;

/**
 * <!-- begin-UML-doc -->
 * <p>
 * This class extracts budget-related files from the Chilean Budget Directorate's website.
 * </p>
 * <!-- end-UML-doc -->
 * 
 * @author JaimeRodrigo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UaW6MEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UaW6MEquEeeJsdrfgQXeQw"
 */
class BudgetLawCsvFilesDownloader extends ExtractorImpl {

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uhom4EquEeeJsdrfgQXeQw"
   */
  private static final Logger log = Logger.getLogger(
      "com.ingenium.goby.budget.extraction.BudgetLawCsvFilesDownloader");

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * The URL where the files are stored.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhrqMEquEeeJsdrfgQXeQw"
   */
  private String documentsSource;

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * A list of strings holding the name of the files to be downloaded.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uhv7oEquEeeJsdrfgQXeQw"
   */
  private Collection<String> budgetFileList;

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * This flag indicates if a timestamp will be added to the base destination directory for each
   * download batch.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_ZoXkIExDEeeo2IEzB8X7BA"
   */
  private boolean useTimestamp = new Boolean(true);

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * A time stamp used to create the destination directory for the downloaded files.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_yNL2YExGEeeo2IEzB8X7BA"
   */
  private String tstamp;

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * A list of files that were successfully downloaded by the extraction.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_qxM7EExIEeeo2IEzB8X7BA"
   */
  private Collection<String> downloadedFiles;

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * A list of files that could not be downloaded.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_CGN5sExJEeeo2IEzB8X7BA"
   */
  private Collection<String> failedFiles;

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Creates a new file extractor that uses parameters obtained from a properties file.
   * </p>
   * <!-- end-UML-doc --> Crea una nueva instancia de la clase BudgetLawCsvFilesDownloader.
   * 
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_X82S8ExCEeeo2IEzB8X7BA"
   */
  public BudgetLawCsvFilesDownloader() {
    // begin-user-code
    setSource(
        Messages.getString("BudgetLawCsvFilesDownloader.extractionListFile")); //$NON-NLS-1$
    documentsSource = Messages
        .getString("BudgetLawCsvFilesDownloader.basePath"); //$NON-NLS-1$
    setDestination(
        Messages.getString("BudgetLawCsvFilesDownloader.destinationBasePath")); //$NON-NLS-1$
    budgetFileList = new ArrayList<>();
    downloadedFiles = new ArrayList<>();
    failedFiles = new ArrayList<>();
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Creates a new file extractor that uses the given parameters as a source and destination.
   * </p>
   * <!-- end-UML-doc --> Crea una nueva instancia de la clase BudgetLawCsvFilesDownloader.
   * 
   * @param listSource
   *          <p>
   *          The location of the file that contains the list of CSVs to be downoladed.
   *          </p>
   * @param documentsSource
   *          <p>
   *          The URL of the files to be downloaded
   *          </p>
   * @param destinationFolder
   *          <p>
   *          the destination folder for the downloaded files
   *          </p>
   * @param useTimestamp
   *          <p>
   *          a flag to indicate if a time stamp should be appended to the destination folder
   *          </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uhxw0EquEeeJsdrfgQXeQw"
   */
  public BudgetLawCsvFilesDownloader(String listSource, String documentsSource,
      String destinationFolder, boolean useTimestamp) {
    // begin-user-code
    setSource(listSource);
    this.documentsSource = documentsSource;
    this.useTimestamp = useTimestamp;
    setDestination(
        Messages.getString("BudgetLawCsvFilesDownloader.destinationBasePath")); //$NON-NLS-1$
    budgetFileList = new ArrayList<>();
    downloadedFiles = new ArrayList<>();
    failedFiles = new ArrayList<>();
    // end-user-code
  }

  /*
   * (non-Javadoc)
   *
   * @see com.ingenium.goby.extractors.Extractor#extract()
   */
  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Perform the extraction of the budget files.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @throws ExtractionException
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhzmAEquEeeJsdrfgQXeQw"
   */
  @Override
  public void extract() throws ExtractionException {
    // begin-user-code

    FileReader extractionListReader = null;
    try {
      extractionListReader = new FileReader(getSource());
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
        BudgetLawCsvFilesDownloader.log
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

    if (useTimestamp) {
      String baseDestination = getDestination();
      tstamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm").format(new Date());
      setDestination(baseDestination + '-' + tstamp);
    }
    String extractionDestination = getDestination();
    File destinationDirectory = new File(extractionDestination);
    BudgetLawCsvFilesDownloader.log
        .finest("Generando directorio:" + extractionDestination);
    destinationDirectory.mkdirs();

    // Ahora se descargan los documentos uno a uno
    SimpleFileDownloader downloader = new SimpleFileDownloader();
    Iterator<String> i = budgetFileList.iterator();

    downloadedFiles = new ArrayList<>();
    failedFiles = new ArrayList<>();
    while (i.hasNext()) {
      String fileName = i.next();
      String sourceFile = documentsSource + '/' + fileName;
      BudgetLawCsvFilesDownloader.log
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
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Returns the value of the timestamp usage flag.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @return
   *         <p>
   *         true if a timestamp is to be appended to the base download directory, false otherwise
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_d_3v4ExDEeeo2IEzB8X7BA"
   */
  public boolean useTimestamp() {
    // begin-user-code
    return useTimestamp;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Sets the value of the timestamp usage flag.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @param flag
   *          <p>
   *          true if a timestamp is to be appended to the base download directory, false otherwise
   *          </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_i_kkEExDEeeo2IEzB8X7BA"
   */
  public void useTimestamp(boolean flag) {
    // begin-user-code
    useTimestamp = flag;

    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Returns the URL of the files to be downloaded.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @return
   *         <p>
   *         the URL of the files to be downloaded
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_kYkP8ExGEeeo2IEzB8X7BA"
   */
  public String getDocumentsSource() {
    // begin-user-code
    return documentsSource;

    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Sets the URL where the files will be stored.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @param documentsSource
   *          <p>
   *          the URL where the files will be stored.
   *          </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_lpoPMExGEeeo2IEzB8X7BA"
   */
  public void setDocumentsSource(String documentsSource) {
    // begin-user-code
    this.documentsSource = documentsSource;

    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Returns the time stamp used to create the destination directory for the downloaded files.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @return
   *         <p>
   *         time stamp used to create the destination directory for the downloaded files.
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_1ZJcEExGEeeo2IEzB8X7BA"
   */
  public String getTimestamp() {
    // begin-user-code
    return tstamp;

    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Returns the list of files that were successfully downloaded by the extraction.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @return
   *         <p>
   *         the list of files that were successfully downloaded by the extraction.
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Hw49gExJEeeo2IEzB8X7BA"
   */
  public Collection<String> getDownloadedFiles() {
    // begin-user-code
    return downloadedFiles;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Returns the list of files that could not be downloaded.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @return
   *         <p>
   *         the list of files that could not be downloaded
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_JUnaEExJEeeo2IEzB8X7BA"
   */
  public Collection<String> getFailedFiles() {
    // begin-user-code
    return failedFiles;
    // end-user-code
  }

}
