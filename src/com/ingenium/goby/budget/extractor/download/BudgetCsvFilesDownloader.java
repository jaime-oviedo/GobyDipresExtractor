/**
 *
 */

package com.ingenium.goby.budget.extractor.download;

import com.ingenium.commons.util.AbstractDownloader;
import com.ingenium.commons.util.DownloadException;
import com.ingenium.commons.util.SimpleFileDownloader;
import com.ingenium.goby.budget.extractor.Messages;

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
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;

/** 
 * <!-- begin-UML-doc -->
 * <p>This class extracts budget-related files from the Chilean Budget Directorate's website.</p>
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_UaW6MEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UaW6MEquEeeJsdrfgQXeQw"
 */
public class BudgetCsvFilesDownloader extends AbstractDownloader {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Uhom4EquEeeJsdrfgQXeQw"
  */
  private static final Logger log = Logger.getLogger(
      "com.ingenium.goby.budget.extractor.download.BudgetLawCsvFilesDownloader");

  /** 
  * <!-- begin-UML-doc -->
  * <p>The URL where the files are stored.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UhrqMEquEeeJsdrfgQXeQw"
  */
  private String documentsSource;

  /** 
  * <!-- begin-UML-doc -->
  * <p>A list of strings holding the name of the files to be downloaded.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Uhv7oEquEeeJsdrfgQXeQw"
  */
  private List<String> budgetFileList;

  /** 
  * <!-- begin-UML-doc -->
  * <p>This flag indicates if a timestamp will be added to the base destination directory for each download batch.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ZoXkIExDEeeo2IEzB8X7BA"
  */
  private boolean useTimestamp;

  /** 
  * <!-- begin-UML-doc -->
  * <p>A time stamp used to create the destination directory for the downloaded files.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yNL2YExGEeeo2IEzB8X7BA"
  */
  private String tstamp;

  /** 
  * <!-- begin-UML-doc -->
  * <p>A list of files that were successfully downloaded by the extraction.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qxM7EExIEeeo2IEzB8X7BA"
  */
  private Collection<String> downloadedFiles;

  /** 
  * <!-- begin-UML-doc -->
  * <p>A list of files that could not be downloaded.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_CGN5sExJEeeo2IEzB8X7BA"
  */
  private Collection<String> failedFiles;

  /** 
  * <!-- begin-UML-doc -->
  * <p>Creates a new file extractor that uses parameters obtained from a properties file.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_X82S8ExCEeeo2IEzB8X7BA"
  */
  public BudgetCsvFilesDownloader() {
    // begin-user-code
    this(Messages.getString("BudgetCsvFilesDownloader.extractionListFile"),
        Messages.getString("BudgetCsvFilesDownloader.basePath"),
        Messages.getString("BudgetCsvFilesDownloader.destinationBasePath"),
        true);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Creates a new file extractor that uses the given parameters as a source and destination.</p>
  * <!-- end-UML-doc -->
  * @param listSource <p>The location of the file that contains the list of CSVs to be downoladed.</p>
  * @param documentsSource <p>The URL of the files to be downloaded</p>
  * @param destinationFolder <p>the destination folder for the downloaded files</p>
  * @param useTimestamp <p>a flag to indicate if a time stamp should be appended to the destination folder</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Uhxw0EquEeeJsdrfgQXeQw"
  */
  public BudgetCsvFilesDownloader(final String listSource,
      final String documentsSource, final String destinationFolder,
      final boolean useTimestamp) {
    // begin-user-code
    this.setSource(listSource);
    this.documentsSource = documentsSource;
    this.useTimestamp = useTimestamp;
    this.setDestination(destinationFolder);
    this.budgetFileList = new ArrayList<>(400);
    this.downloadedFiles = new ArrayList<>(400);
    this.failedFiles = new ArrayList<>(10);
    this.tstamp = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    // end-user-code
  }

  /*
   * (non-Javadoc)
   *
   * @see com.ingenium.goby.extractors.Extractor#extract()
   */
  /** 
  * <!-- begin-UML-doc -->
  * <p>Perform the extraction of the budget files.</p>
  * <!-- end-UML-doc -->
  * @throws DownloadException
  * @throws DownloadException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UhzmAEquEeeJsdrfgQXeQw"
  */
  @Override
  public void download() throws DownloadException, DownloadException {
    // begin-user-code

    this.budgetFileList = this.readFileList();

    // Se genera un directorio asociado al timestamp de descarga

    this.download(this.budgetFileList);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * @throws&nbsp;DownloadException
  * <!-- end-UML-doc -->
  * @param budgetFileList
  * @throws DownloadException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Ne0gcGEgEeeMhLKRNTgRlA"
  */
  public void download(final List<String> budgetFileList)
      throws DownloadException {
    // begin-user-code
    String extractionDestination = null;
    if (this.useTimestamp) {
      extractionDestination = new StringBuffer(this.getDestination())
          .append("-").append(this.tstamp).toString();
    } else {
      extractionDestination = this.getDestination();
    }
    final File destinationDirectory = new File(extractionDestination);
    BudgetCsvFilesDownloader.log
        .finest(new StringBuffer("Generando directorio:")
            .append(extractionDestination).toString());
    try {
      FileUtils.deleteDirectory(destinationDirectory);
    } catch (final IOException e1) {
      BudgetCsvFilesDownloader.log
          .finest(new StringBuffer("Unable to delete directory:")
              .append(destinationDirectory.toString()).toString());
    }
    destinationDirectory.mkdirs();

    // Ahora se descargan los documentos uno a uno
    final SimpleFileDownloader downloader = new SimpleFileDownloader();
    final Iterator<String> i = budgetFileList.iterator();

    this.downloadedFiles = new ArrayList<>(400);
    this.failedFiles = new ArrayList<>(10);
    while (i.hasNext()) {
      final String fileName = i.next();
      final String sourceFile = this.documentsSource + '/' + fileName;
      BudgetCsvFilesDownloader.log
          .finest("Se descargará el siguiente archivo:" + sourceFile);
      try {
        downloader.download(sourceFile, extractionDestination);
        this.downloadedFiles.add(fileName);
      } catch (final IOException e) {
        this.failedFiles.add(fileName);
      }
      if (this.failedFiles.size() > 0) {
        final StringBuffer msg = new StringBuffer(
            "Fallo la descarga de los siguientes archivos:\n");
        for (final String string : this.failedFiles) {
          msg.append(string + "\n");
        }
        throw new DownloadException(msg.toString());
      }
    }
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the URL of the files to be downloaded.</p>
  * <!-- end-UML-doc -->
  * @return <p>the URL of the files to be downloaded</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_kYkP8ExGEeeo2IEzB8X7BA"
  */
  public String getDocumentsSource() {
    // begin-user-code
    return this.documentsSource;

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the list of files that were successfully downloaded by the extraction.</p>
  * <!-- end-UML-doc -->
  * @return <p>the list of files that were successfully downloaded by the extraction.</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Hw49gExJEeeo2IEzB8X7BA"
  */
  public Collection<String> getDownloadedFiles() {
    // begin-user-code
    return this.downloadedFiles;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the list of files that could not be downloaded.</p>
  * <!-- end-UML-doc -->
  * @return <p>the list of files that could not be downloaded</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_JUnaEExJEeeo2IEzB8X7BA"
  */
  public Collection<String> getFailedFiles() {
    // begin-user-code
    return this.failedFiles;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the time stamp used to create the destination directory for the downloaded files.</p>
  * <!-- end-UML-doc -->
  * @return <p>time stamp used to create the destination directory for the downloaded files.</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_1ZJcEExGEeeo2IEzB8X7BA"
  */
  public String getTimestamp() {
    // begin-user-code
    return this.tstamp;

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_t7jPIGNdEeebmPnwD8r8OA"
  */
  public String getTimestampedDestination() {
    // begin-user-code
    return new StringBuffer(this.getDestination()).append("-")
        .append(this.tstamp).toString();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Returns the value of the timestamp usage flag.</p>
  * <!-- end-UML-doc -->
  * @return <p>true if a timestamp is to be appended to the base download directory, false otherwise</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_d_3v4ExDEeeo2IEzB8X7BA"
  */
  public boolean getUseTimestamp() {
    // begin-user-code
    return this.useTimestamp;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * @return<br>@throws&nbsp;DownloadException
  * <!-- end-UML-doc -->
  * @return
  * @throws DownloadException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Ne8cQGEgEeeMhLKRNTgRlA"
  */
  public List<String> readFileList() throws DownloadException {
    // begin-user-code
    FileReader extractionListReader = null;
    try {
      extractionListReader = new FileReader(this.getSource());
    } catch (final FileNotFoundException e) {
      throw (new DownloadException(
          "No se encontró el archivo con la lista de documentos a descargar"));
    } finally {
      if (extractionListReader != null) {
        try {
          extractionListReader.close();
        } catch (final IOException e) {
          BudgetCsvFilesDownloader.log.warning("Unable to close reader");
        }
      }
    }

    // Se encontró el archivo de lista de descarga

    final BufferedReader extractionListFileStream = new BufferedReader(
        extractionListReader);
    String l = "";

    // Primero se extrae la lista de csvs a descargar
    final List<String> fileList = new ArrayList<>();
    try {
      while ((l = extractionListFileStream.readLine()) != null) {
        fileList.add(l);
        BudgetCsvFilesDownloader.log.fine("Added file to list:" + l);
      }
    } catch (final IOException e) {
      BudgetCsvFilesDownloader.log.severe("Unable to extract file list");
      BudgetCsvFilesDownloader.log.severe(e.getMessage());
    } finally {
      if (extractionListFileStream != null) {
        try {
          extractionListFileStream.close();
        } catch (final IOException e) {
          BudgetCsvFilesDownloader.log.fine(e.getMessage());
        }
      }
    }
    return fileList;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the URL where the files will be stored.</p>
  * <!-- end-UML-doc -->
  * @param documentsSource <p>the URL where the files will be stored.</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lpoPMExGEeeo2IEzB8X7BA"
  */
  public void setDocumentsSource(final String documentsSource) {
    // begin-user-code
    this.documentsSource = documentsSource;

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the value of the timestamp usage flag.</p>
  * <!-- end-UML-doc -->
  * @param flag <p>true if a timestamp is to be appended to the base download directory, false otherwise</p>
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_i_kkEExDEeeo2IEzB8X7BA"
  */
  public void setUseTimestamp(final boolean flag) {
    // begin-user-code
    this.useTimestamp = flag;
    // end-user-code
  }

}
