/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.clasificacion;

import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.Extractor;
import com.ingenium.goby.extractors.budget.Messages;
import com.opencsv.CSVReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * sta&nbsp;clase&nbsp;lee&nbsp;un&nbsp;archivo&nbsp;separado&nbsp;por&nbsp;comas&nbsp;con&nbsp;la&nbsp;información&nbsp;de&nbsp;la&nbsp;ley<br>de<br><br>presupuestos&nbsp;y&nbsp;lo&nbsp;extrae&nbsp;a&nbsp;un&nbsp;archivo&nbsp;Jason&nbsp;destino.<br><br><br><br><br>@author&nbsp;JaimeRodrig
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UXHY8EquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UXHY8EquEeeJsdrfgQXeQw"
 */
public class BudgetClassifiersExtractor implements Extractor {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author joviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UaQMgEquEeeJsdrfgQXeQw"
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UaQMgEquEeeJsdrfgQXeQw"
  */
  private final class PlainBudgetClassifier {

    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhA70EquEeeJsdrfgQXeQw"
    */
    private final int subtitle;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhCJ8EquEeeJsdrfgQXeQw"
    */
    private final int item;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhDYEEquEeeJsdrfgQXeQw"
    */
    private final int assignment;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhEmMEquEeeJsdrfgQXeQw"
    */
    private final String name;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhF0UEquEeeJsdrfgQXeQw"
    */
    private final String description;

    /** 
    * <!-- begin-UML-doc -->
    * rea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;PlainBudgetClassifier.<br><br><br><br><br>@param&nbsp;subtitle<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;subtitle<br><br>@param&nbsp;item<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;item<br><br>@param&nbsp;assignment<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;assignment<br><br>@param&nbsp;name<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;name<br><br>@param&nbsp;description<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descriptio
    * <!-- end-UML-doc -->
    * @param subtitle
    * @param item
    * @param assignment
    * @param name
    * @param description
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhHpgEquEeeJsdrfgQXeQw"
    */
    public PlainBudgetClassifier(int subtitle, int item, int assignment,
        String name, String description) {
      // begin-user-code
      super();
      this.subtitle = subtitle;
      this.item = item;
      this.assignment = assignment;
      this.name = name;
      this.description = description;
      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhKFwEquEeeJsdrfgQXeQw"
    */
    @Override
    public String toString() {
      // begin-user-code
      StringBuilder sb = new StringBuilder();
      sb.append(String.valueOf(subtitle)).append(";")
          .append(String.valueOf(item)).append(";")
          .append(String.valueOf(assignment)).append(";").append(name)
          .append(";").append(description).append(";");
      return sb.toString();
      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhT2wEquEeeJsdrfgQXeQw"
    */
    public int getSubtitle() {
      // begin-user-code
      return subtitle;
      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhVr8EquEeeJsdrfgQXeQw"
    */
    public int getItem() {
      // begin-user-code
      return item;
      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhW6EEquEeeJsdrfgQXeQw"
    */
    public int getAssignment() {
      // begin-user-code
      return assignment;
      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhYvQEquEeeJsdrfgQXeQw"
    */
    public String getName() {
      // begin-user-code
      return name;
      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhZ9YEquEeeJsdrfgQXeQw"
    */
    public String getDescription() {
      // begin-user-code
      return description;
      // end-user-code
    }
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author joviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UagrMEquEeeJsdrfgQXeQw"
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UagrMEquEeeJsdrfgQXeQw"
  */
  private static final class BudgetClassifierMapper {

    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param classifiers
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UiMnkEquEeeJsdrfgQXeQw"
    */
    static final BudgetClassifiersCatalog map(
        Collection<PlainBudgetClassifier> classifiers) {
      // begin-user-code
      Iterator<PlainBudgetClassifier> ic = classifiers.iterator();
      BudgetClassifiersCatalog ccp = new BudgetClassifiersCatalog();
      while (ic.hasNext()) {
        PlainBudgetClassifier cp = ic.next();
        Integer subtitle = cp.getSubtitle();
        Integer item = cp.getItem();
        Integer asignacion = cp.getAssignment();
        String name = cp.getName();
        String description = cp.getDescription();
        if (asignacion == 0) {
          if (item == 0) {
            Subtitle st = new Subtitle(subtitle, name, description,
                BudgetElementType.CLASSIFICATION);
            ccp.addSubtitulo(st);
          } else {
            Item i = new Item(item, name, description,
                BudgetElementType.CLASSIFICATION);
            ccp.addItem(subtitle, i);
          }
        } else {
          Assignment a = new Assignment(asignacion, name, description,
              BudgetElementType.CLASSIFICATION);
          ccp.addAsignacion(subtitle, item, a);
        }
      }
      return ccp;
      // end-user-code
    }
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uda1QEquEeeJsdrfgQXeQw"
  */
  private static final Logger log = Logger.getLogger(
      "com.ingenium.goby.extractors.dipres.ClasificadorPresupuestarioExtractor");

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdkmQEquEeeJsdrfgQXeQw"
  */
  private final String source;

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Udl0YEquEeeJsdrfgQXeQw"
  */
  private final String destination;

  /** 
  * <!-- begin-UML-doc -->
  * rea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;BudgetClassifierCVStoJSONParser.
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdnpkEquEeeJsdrfgQXeQw"
  */
  public BudgetClassifiersExtractor() {
    // begin-user-code
    source = Messages
        .getString("BudgetClassifiersExtractor.sourceUrl"); //$NON-NLS-1$
    destination = Messages
        .getString("BudgetClassifiersExtractor.destinationUrl"); //$NON-NLS-1$
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
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdpewEquEeeJsdrfgQXeQw"
  */
  @Override
  public void extract() throws ExtractionException {
    // begin-user-code
    BudgetClassifiersCatalog ccp = extractBudgetClassifiers();
    String jsonCatalog = ccp.toJsonString(0);
    File file = new File(destination);
    file.getParentFile().mkdirs();

    PrintWriter outputStream = null;
    try {
      outputStream = new PrintWriter(new BufferedWriter(new FileWriter(file)));
      outputStream.write(jsonCatalog);
    } catch (IOException e) {
      e.printStackTrace();
      throw new ExtractionException("Falla al escribir el archivo destino");
    } finally {
      if (outputStream != null) {
        outputStream.close();
      }
    }
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * xtrae&nbsp;los&nbsp;clasificadores&nbsp;presupuestarios&nbsp;a&nbsp;una&nbsp;colección&nbsp;en&nbsp;un<br>formato<br><br>plano.<br><br><br><br><br>@return&nbsp;la&nbsp;colección&nbsp;con&nbsp;los&nbsp;clasificadores&nbsp;extraidos<br><br>@throws&nbsp;ExtractionException<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;en&nbsp;caso&nbsp;de&nbsp;que&nbsp;no&nbsp;puedan&nbsp;extraerse&nbsp;los&nbsp;clasificadores&nbsp;por<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;problemas&nbsp;en&nbsp;el&nbsp;archivo&nbsp;fuent
  * <!-- end-UML-doc -->
  * @return
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdrT8EquEeeJsdrfgQXeQw"
  */

  BudgetClassifiersCatalog extractBudgetClassifiers()
      throws ExtractionException {
    // begin-user-code

    CSVReader reader = getReader();

    BudgetClassifiersExtractor.log.fine("Comenzando la extracción");
    Collection<PlainBudgetClassifier> classifiers = new ArrayList<>();
    String[] line;
    int cnumber = 0;
    try {
      while ((line = reader.readNext()) != null) {
        System.out.println("Procesando item " + cnumber);
        ArrayList<String> elements = new ArrayList<>();
        int index = 0;
        for (String element : line) {
          elements.add(index, element);
          index++;
        }
        int subtitle = 0;

        String s = elements.get(0);
        try {
          if (s != null) {
            subtitle = Integer.parseInt(s);
          }
        } catch (Exception e) {
          throw new ExtractionException(
              "No es posible extraer el número de subtitle");
        }

        int item = 0;
        s = elements.get(1);
        if (s != null) {
          try {
            item = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            BudgetClassifiersExtractor.log
                .finest("No se pudo obtener un número de item");
          }
        } else {
          item = 0;
        }

        int assignment = 0;
        s = elements.get(2);
        if (s != null) {
          try {
            assignment = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            BudgetClassifiersExtractor.log
                .finest("No se pudo obtener un número de asignación");
          }
        }

        String name;
        s = elements.get(3);
        if (s != null) {
          name = s;
        } else {
          throw new ExtractionException(
              "No es posible extraer el name del elemento" + subtitle + item
                  + assignment);
        }
        String description;
        s = elements.get(4);
        if (s != null) {
          description = s;
        } else {
          description = "";
        }

        PlainBudgetClassifier c = new PlainBudgetClassifier(subtitle,
            item, assignment, name, description);
        classifiers.add(c);
        cnumber++;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return BudgetClassifierMapper.map(classifiers);
    // end-user-code
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ingenium.goby.extractors.Extractor#getExtractionDestination()
   */
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UduXQEquEeeJsdrfgQXeQw"
  */
  @Override
  public String getExtractionDestination() {
    // begin-user-code
    return destination;
    // end-user-code
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.ingenium.goby.extractors.Extractor#getExtractionSource()
   */
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdwzgEquEeeJsdrfgQXeQw"
  */
  @Override
  public String getExtractionSource() {
    // begin-user-code
    return source;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * btiene&nbsp;un&nbsp;CVSReader&nbsp;apuntando&nbsp;al&nbsp;archivo&nbsp;de&nbsp;origen&nbsp;detallado&nbsp;en&nbsp;el<br>archivo<br><br>extractor.properties<br><br><br><br><br>@return&nbsp;el&nbsp;reader<br><br>@throws&nbsp;ExtractionException<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;en&nbsp;caso&nbsp;de&nbsp;que&nbsp;no&nbsp;pueda&nbsp;obtenerse&nbsp;el&nbsp;handler&nbsp;al&nbsp;reade
  * <!-- end-UML-doc -->
  * @return
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Udz20EquEeeJsdrfgQXeQw"
  */
  private CSVReader getReader() throws ExtractionException {
    // begin-user-code
    FileInputStream fi;
    try {
      fi = new FileInputStream(source);
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
        BudgetClassifiersExtractor.log
            .fine("Error al cerrar los streams de lectura");
        e.printStackTrace();
      }
      throw new ExtractionException("Error de codificación del archivo fuente");
    }
    return reader;
    // end-user-code
  }
}