/**
 *
 */

package com.ingenium.goby.extractors.budget;

import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.ExtractorImpl;

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
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UXFjwEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UXFjwEquEeeJsdrfgQXeQw"
 */
class BudgetFileListExtractor extends ExtractorImpl {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdIhYEquEeeJsdrfgQXeQw"
  */
  private Collection<String> budgetFileList;
  
  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;BudgetFileListExtractor.
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase BudgetFileListExtractor.
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdK9oEquEeeJsdrfgQXeQw"
  */
  public BudgetFileListExtractor() {
    // begin-user-code
    super();
    this.setSource(Messages.getString("BudgetFileListExtractor.sourceUrl")); //$NON-NLS-1$
    this.setDestination(
        Messages.getString("BudgetFileListExtractor.destinationUrl")); //$NON-NLS-1$
    budgetFileList = new ArrayList<>();
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
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdMy0EquEeeJsdrfgQXeQw"
  */
  @Override
  public void extract() throws ExtractionException {
    // begin-user-code
    final File input = new File(this.getSource());
    PrintWriter outputStream = null;
    Document doc;
    try {
      outputStream = new PrintWriter(
          new BufferedWriter(new FileWriter(this.getDestination())));
      doc = Jsoup.parse(input, "UTF-8");
      final Elements links = doc.select("a[href$=csv]");
      for (Element link : links) {
        String fileName = link.attr("href") + "\n";
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
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdQdMEquEeeJsdrfgQXeQw"
  */
  public Collection<String> getBudgetFileList() throws ExtractionException {
    // begin-user-code
    extract();
    return budgetFileList;
    // end-user-code
  }
}
