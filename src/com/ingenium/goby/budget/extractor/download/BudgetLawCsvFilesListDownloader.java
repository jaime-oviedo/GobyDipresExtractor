/**
 *
 */

package com.ingenium.goby.budget.extractor.download;

import com.ingenium.commons.util.AbstractDownloader;
import com.ingenium.commons.util.DownloadException;
import com.ingenium.goby.budget.extractor.Messages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;que&nbsp;descarga&nbsp;la&nbsp;lista&nbsp;de&nbsp;archivos&nbsp;que&nbsp;contienen&nbsp;información&nbsp;de&nbsp;la&nbsp;Ley<br>de&nbsp;Presupuestos.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_UXFjwEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UXFjwEquEeeJsdrfgQXeQw"
 */
public class BudgetLawCsvFilesListDownloader extends AbstractDownloader {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UdIhYEquEeeJsdrfgQXeQw"
  */
  private Collection<String> budgetFileList;

  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;BudgetFileListExtractor.
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UdK9oEquEeeJsdrfgQXeQw"
  */
  public BudgetLawCsvFilesListDownloader() {
    // begin-user-code
    super();
    setSource(Messages.getString("BudgetLawCsvFilesListExtractor.sourceUrl")); //$NON-NLS-1$
    setDestination(
        Messages.getString("BudgetLawCsvFilesListExtractor.destinationUrl")); //$NON-NLS-1$
    budgetFileList = new ArrayList<>(400);
    // end-user-code
  }

  /*
   * (non-Javadoc)
   *
   * @see com.ingenium.goby.extractors.Extractor#extract()
   */
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @throws DownloadException
  * @throws DownloadException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UdMy0EquEeeJsdrfgQXeQw"
  */
  @Override
  public void download() throws DownloadException, DownloadException {
    // begin-user-code
    final File input = new File(getSource());
    PrintWriter outputStream = null;
    Document doc = null;
    try {
      outputStream = new PrintWriter(
          new BufferedWriter(new FileWriter(getDestination())));
      doc = Jsoup.parse(input, "UTF-8");
      final Elements links = doc.select("a[href$=csv]");
      for (final Element link : links) {
        final String fileName = new StringBuilder(link.attr("href"))
            .append(System.lineSeparator()).toString();
        budgetFileList.add(fileName);
        outputStream.write(fileName);
      }
    } catch (final IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      if (outputStream != null) {
        outputStream.close();
      }
    }

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @throws DownloadException
  * @throws DownloadException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UdQdMEquEeeJsdrfgQXeQw"
  */
  public Collection<String> getBudgetFileList()
      throws DownloadException, DownloadException {
    // begin-user-code
    download();
    return budgetFileList;
    // end-user-code
  }

}
