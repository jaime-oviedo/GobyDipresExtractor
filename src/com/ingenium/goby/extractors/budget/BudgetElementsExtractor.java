/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget;

import com.ingenium.goby.extractors.ExtractionException;
import com.ingenium.goby.extractors.ExtractorImpl;
import com.ingenium.goby.extractors.budget.elements.Assignment;
import com.ingenium.goby.extractors.budget.elements.BudgetElementToJsonMapper;
import com.ingenium.goby.extractors.budget.elements.BudgetElementType;
import com.ingenium.goby.extractors.budget.elements.BudgetElementsCatalog;
import com.ingenium.goby.extractors.budget.elements.Item;
import com.ingenium.goby.extractors.budget.elements.Subtitle;
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
 * <p>This class reads a csv file with the budget classifiers' information and generates an equivalent Json file.</p><p>@author JaimeRodrigo</p>
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UXHY8EquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UXHY8EquEeeJsdrfgQXeQw"
 */
public class BudgetElementsExtractor extends ExtractorImpl {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author joviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UaQMgEquEeeJsdrfgQXeQw"
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UaQMgEquEeeJsdrfgQXeQw"
  */
  private final class PlainBudgetElement {

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
    * <p>Creates a new instance of PlainBudgetClassifier.</p>
    * <!-- end-UML-doc -->
    * @param subtitle <p>the value of the subtitle field.</p>
    * @param item <p>the value of the item field.</p>
    * @param assignment <p>the value of the assignment field.</p>
    * @param name <p>the value of the name field.</p>
    * @param description <p>the value of the description field.</p>
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UhHpgEquEeeJsdrfgQXeQw"
    */
    public PlainBudgetElement(int subtitle, int item, int assignment,
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
  private static final class BudgetElementsMapper {

    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param classifiers
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UiMnkEquEeeJsdrfgQXeQw"
    */
    static final BudgetElementsCatalog map(
        Collection<PlainBudgetElement> classifiers) {
      // begin-user-code
      Iterator<PlainBudgetElement> ic = classifiers.iterator();
      BudgetElementsCatalog ccp = new BudgetElementsCatalog();
      while (ic.hasNext()) {
        PlainBudgetElement cp = ic.next();
        Integer subtitle = cp.getSubtitle();
        Integer item = cp.getItem();
        Integer asignacion = cp.getAssignment();
        String name = cp.getName();
        String description = cp.getDescription();
        if (asignacion == 0) {
          if (item == 0) {
            Subtitle st = new Subtitle(subtitle, name, description,
                BudgetElementType.BUDGETARY_CLASSIFICATION);
            ccp.addSubtitle(st);
          } else {
            Item i = new Item(item, name, description,
                BudgetElementType.BUDGETARY_CLASSIFICATION);
            ccp.addItem(subtitle, i);
          }
        } else {
          Assignment a = new Assignment(asignacion, name, description,
              BudgetElementType.BUDGETARY_CLASSIFICATION);
          ccp.addAssignment(subtitle, item, a);
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
  private static final Logger log = Logger
      .getLogger("com.ingenium.goby.extractors.BudgetElementsExtractor");

  /** 
  * <!-- begin-UML-doc -->
  * <p>Creates a new instance of a BudgetElementExtractor.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdnpkEquEeeJsdrfgQXeQw"
  */
  public BudgetElementsExtractor() {
    // begin-user-code
    super();
    this.setSource(Messages.getString("BudgetElementsExtractor.sourceUrl")); //$NON-NLS-1$
    this.setDestination(
        Messages.getString("BudgetElementsExtractor.destinationUrl")); //$NON-NLS-1$
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
    BudgetElementsCatalog ccp = extractElements();
    String mappedCatalog = BudgetElementToJsonMapper.map(ccp.getProgram(), 0);
    File file = new File(this.getDestination());
    file.getParentFile().mkdirs();

    PrintWriter outputStream = null;
    try {
      outputStream = new PrintWriter(new BufferedWriter(new FileWriter(file)));
      outputStream.write(mappedCatalog);
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
  * <p>Extracts the budget elements in a collection of plain objects.</p>
  * <!-- end-UML-doc -->
  * @return
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdrT8EquEeeJsdrfgQXeQw"
  */

  BudgetElementsCatalog extractElements() throws ExtractionException {
    // begin-user-code

    CSVReader reader = getReader();

    BudgetElementsExtractor.log.fine("Comenzando la extracción");
    Collection<PlainBudgetElement> budgetElements = new ArrayList<>();
    String[] line;
    int cnumber = 0;
    try {
      while ((line = reader.readNext()) != null) {
        log.fine("Procesando item " + cnumber);
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
            BudgetElementsExtractor.log
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
            BudgetElementsExtractor.log
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

        PlainBudgetElement c = new PlainBudgetElement(subtitle, item,
            assignment, name, description);
        budgetElements.add(c);
        cnumber++;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return BudgetElementsMapper.map(budgetElements);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * btiene&nbsp;un&nbsp;CVSReader&nbsp;apuntando&nbsp;al&nbsp;archivo&nbsp;de&nbsp;origen&nbsp;detallado&nbsp;en&nbsp;el<br><br>archivo<br><br><br><br>extractor.properties<br><br><br><br><br><br><br><br><br><br>@return&nbsp;el&nbsp;reader<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br><br>@throws&nbsp;ExtractionException<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;en&nbsp;caso&nbsp;de&nbsp;que&nbsp;no&nbsp;pueda&nbsp;obtenerse&nbsp;el&nbsp;handler&nbsp;al&nbsp;reade<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  * <!-- end-UML-doc -->
  * @return
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Udz20EquEeeJsdrfgQXeQw"
  */
  private CSVReader getReader() throws ExtractionException {
    // begin-user-code
    FileInputStream fi;
    try {
      fi = new FileInputStream(this.getSource());
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
        BudgetElementsExtractor.log
            .fine("Error al cerrar los streams de lectura");
        e.printStackTrace();
      }
      throw new ExtractionException("Error de codificación del archivo fuente");
    }
    return reader;
    // end-user-code
  }

}