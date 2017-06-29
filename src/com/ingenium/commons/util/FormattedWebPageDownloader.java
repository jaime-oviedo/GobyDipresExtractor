
package com.ingenium.commons.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/** 
 * <!-- begin-UML-doc -->
 * Clase&nbsp;que&nbsp;descarga&nbsp;una&nbsp;página&nbsp;web,&nbsp;intentando&nbsp;corregir&nbsp;automáticamente<br>cualquier&nbsp;error&nbsp;de&nbsp;tags&nbsp;HTML&nbsp;mal&nbsp;cerrados.<br><br>La&nbsp;descarga&nbsp;es&nbsp;sólo&nbsp;del&nbsp;texto&nbsp;html,&nbsp;no&nbsp;de&nbsp;sus&nbsp;imágenes&nbsp;ni&nbsp;de&nbsp;sus&nbsp;recursos<br>enlazados.<br><br>@author&nbsp;JaimeRodrigo
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UaNwQEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UaNwQEquEeeJsdrfgQXeQw"
 */
public class FormattedWebPageDownloader {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgsywEquEeeJsdrfgQXeQw"
  */
  private String source;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UguA4EquEeeJsdrfgQXeQw"
  */
  private String destination;
  
  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;FormattedWebPageDownloader.
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase FormattedWebPageDownloader.
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgvPAEquEeeJsdrfgQXeQw"
  */
  public FormattedWebPageDownloader() {
    // begin-user-code
    super();
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Crea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;FormattedWebPageDownloader.<br><br>@param&nbsp;source<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;la&nbsp;URL&nbsp;de&nbsp;donde&nbsp;se&nbsp;obtendrá&nbsp;el&nbsp;archivo<br>@param&nbsp;destination<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;la&nbsp;URL&nbsp;de&nbsp;donde&nbsp;se&nbsp;almacenará&nbsp;el&nbsp;archivo
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase FormattedWebPageDownloader.
  * @param source
  * @param destination
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UgxEMEquEeeJsdrfgQXeQw"
  */
  public FormattedWebPageDownloader(String source, String destination) {
    // begin-user-code
    super();
    this.source = source;
    this.destination = destination;
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ugy5YEquEeeJsdrfgQXeQw"
  */
  public void download() {
    // begin-user-code
    download(source, destination);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Descarga&nbsp;el&nbsp;archivo&nbsp;desde&nbsp;la&nbsp;fuente&nbsp;especificada&nbsp;al&nbsp;destino&nbsp;especificado.
  * <!-- end-UML-doc -->
  * @param source
  * @param destination
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ug0ukEquEeeJsdrfgQXeQw"
  */
  
  public void download(String source, String destination) {
    // begin-user-code
    PrintWriter outputStream = null;
    Document page = null;
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
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;el&nbsp;directorio&nbsp;y&nbsp;el&nbsp;nombre&nbsp;con&nbsp;el&nbsp;que&nbsp;se&nbsp;guarda&nbsp;el&nbsp;archivo.<br><br>@return&nbsp;directorio&nbsp;y&nbsp;el&nbsp;nombre&nbsp;con&nbsp;el&nbsp;que&nbsp;se&nbsp;guarda&nbsp;el&nbsp;archivo
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ug2jwEquEeeJsdrfgQXeQw"
  */
  public String getDestination() {
    // begin-user-code
    return destination;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Devuelve&nbsp;la&nbsp;URL&nbsp;de&nbsp;donde&nbsp;se&nbsp;obtendrá&nbsp;el&nbsp;archivo.<br><br>@return&nbsp;the&nbsp;source
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ug4Y8EquEeeJsdrfgQXeQw"
  */
  public String getSource() {
    // begin-user-code
    return source;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Establece&nbsp;el&nbsp;directorio&nbsp;y&nbsp;el&nbsp;nombre&nbsp;con&nbsp;el&nbsp;que&nbsp;se&nbsp;guarda&nbsp;el&nbsp;archivo.<br><br>@param&nbsp;destination<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;destination&nbsp;to&nbsp;set
  * <!-- end-UML-doc -->
  * @param destination
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ug61MEquEeeJsdrfgQXeQw"
  */
  public void setDestination(String destination) {
    // begin-user-code
    this.destination = destination;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * Establece&nbsp;la&nbsp;URL&nbsp;de&nbsp;donde&nbsp;se&nbsp;obtendrá&nbsp;el&nbsp;archivo.<br><br>@param&nbsp;source<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;la&nbsp;URL&nbsp;de&nbsp;donde&nbsp;se&nbsp;obtendrá&nbsp;el&nbsp;archivo
  * <!-- end-UML-doc -->
  * @param source
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ug8qYEquEeeJsdrfgQXeQw"
  */
  public void setSource(String source) {
    // begin-user-code
    this.source = source;
    // end-user-code
  }
  
}
