/**
 *
 */

package com.ingenium.goby.extractors.dipres;

import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.Extractor;

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
 * Clase que descarga la lista de archivos que contienen información de la Ley
 * de Presupuestos.
 *
 * @author JaimeRodrigo
 */
class BudgetFileListExtractor implements Extractor {
  
  private final String extractionSource;
  
  private final String extractionDestination;
  
  private Collection<String> budgetFileList;
  
  /**
   * Crea una nueva instancia de BudgetFileListExtractor.
   */
  public BudgetFileListExtractor() {
    extractionSource = Messages.getString("BudgetFileListExtractor.sourceUrl"); //$NON-NLS-1$
    extractionDestination = Messages
        .getString("BudgetFileListExtractor.destinationUrl"); //$NON-NLS-1$
    budgetFileList = new ArrayList<>();
  }
  
  /*
   * (non-Javadoc)
   * @see com.ingenium.goby.extractors.Extractor#extract()
   */
  @Override
  public void extract() throws ExtractionException {
    final File input = new File(extractionSource);
    PrintWriter outputStream = null;
    Document doc;
    try {
      outputStream = new PrintWriter(
          new BufferedWriter(new FileWriter(extractionDestination)));
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
    
  }
  
  public Collection<String> getBudgetFileList() throws ExtractionException {
    extract();
    return budgetFileList;
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
