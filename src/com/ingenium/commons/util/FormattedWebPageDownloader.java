
package com.ingenium.commons.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Clase que descarga una página web, intentando corregir automáticamente
 * cualquier error de tags HTML mal cerrados.<br>
 * La descarga es sólo del texto html, no de sus imágenes ni de sus recursos
 * enlazados.
 *
 * @author JaimeRodrigo
 */
public class FormattedWebPageDownloader {
  
  private String source;
  private String destination;
  
  /**
   * Crea una nueva instancia de FormattedWebPageDownloader.
   */
  public FormattedWebPageDownloader() {
    super();
    
  }
  
  /**
   * Crea una nueva instancia de FormattedWebPageDownloader.
   *
   * @param source
   *          la URL de donde se obtendrá el archivo
   * @param destination
   *          la URL de donde se almacenará el archivo
   */
  public FormattedWebPageDownloader(String source, String destination) {
    super();
    this.source = source;
    this.destination = destination;
    
  }
  
  public void download() {
    download(source, destination);
  }
  
  /**
   * Descarga el archivo desde la fuente especificada al destino especificado.
   */
  
  public void download(String source, String destination) {
    PrintWriter outputStream;
    Document page;
    try {
      outputStream = new PrintWriter(
          new BufferedWriter(new FileWriter(destination)));
    } catch (IOException e) {
      System.out
          .println("No se pudo abrir el stream de escritura en " + destination);
      e.printStackTrace();
      return;
    }
    
    try {
      page = Jsoup.connect(source).get();
      page = Jsoup.parse(page.html());
    } catch (IOException e) {
      System.out
          .println("No fue posible descargar el archivo desde  " + source);
      e.printStackTrace();
      if (outputStream != null) {
        outputStream.close();
      }
      return;
    }
    
    if (outputStream != null) {
      outputStream.write(page.toString());
      outputStream.close();
      
      if (outputStream.checkError()) {
        System.out.println(
            "Un error desconocido ocurrió durante la escritura o el cierre del "
                + "stream de escritura. El archivo descargado podría haber "
                + "quedado corrupto o el stream podría haber quedado abierto.");
      }
    }
    
  }
  
  /**
   * Devuelve el directorio y el nombre con el que se guarda el archivo.
   *
   * @return directorio y el nombre con el que se guarda el archivo
   */
  public String getDestination() {
    return destination;
  }
  
  /**
   * Devuelve la URL de donde se obtendrá el archivo.
   *
   * @return the source
   */
  public String getSource() {
    return source;
  }
  
  /**
   * Establece el directorio y el nombre con el que se guarda el archivo.
   *
   * @param destination
   *          the destination to set
   */
  public void setDestination(String destination) {
    this.destination = destination;
  }
  
  /**
   * Establece la URL de donde se obtendrá el archivo.
   *
   * @param source
   *          la URL de donde se obtendrá el archivo
   */
  public void setSource(String source) {
    this.source = source;
  }
  
}
