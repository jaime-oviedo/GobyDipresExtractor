/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extraction;

import com.ingenium.goby.budget.ClassifiersCatalog;
import com.ingenium.goby.budget.Messages;
import com.ingenium.goby.budget.elements.Assignment;
import com.ingenium.goby.budget.elements.BudgetElementType;
import com.ingenium.goby.budget.elements.Item;
import com.ingenium.goby.budget.elements.Program;
import com.ingenium.goby.budget.elements.Subtitle;
import com.ingenium.goby.budget.extraction.map.BudgetElementToJsonMapper;
import com.ingenium.goby.extractors.DownloadException;
import com.ingenium.goby.extractors.Downloader;
import com.ingenium.goby.extractors.DownloaderImpl;
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
public class ClassifiersCatalogExtractor extends DownloaderImpl {

  /** 
  * <!-- begin-UML-doc -->
  * <p>Represents a hierarchical catalog of budget elements.</p>
  * <!-- end-UML-doc -->
  * @author joviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UXJ1MEquEeeJsdrfgQXeQw"
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UXJ1MEquEeeJsdrfgQXeQw"
  */
  protected class ClassifiersCatalogImpl implements ClassifiersCatalog {
    /** 
    * <!-- begin-UML-doc -->
    * <p>Program element used to hold the elements of the catalog.</p>
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ud4vUEquEeeJsdrfgQXeQw"
    */
    private Program root;

    /** 
    * <!-- begin-UML-doc -->
    * <p>Creates a new BudgetElementsCatalog.</p>
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ud6kgEquEeeJsdrfgQXeQw"
    */
    public void ClassifiersCatalog() {
      // begin-user-code
      root = new Program(0, "Catalogo de clasificadores presupuestarios",
          "Estructura jerárquica de los clasificadores por objeto del gasto usados en el presupuesto",
          BudgetElementType.BUDGETARY_CLASSIFICATION);

      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <p>Adds a subtitle to the catalog.</p>
    * <!-- end-UML-doc -->
    * @param subtitle <p>the subtitle id number</p>
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ud7yoEquEeeJsdrfgQXeQw"
    */
    public void addSubtitle(Subtitle subtitle) {
      // begin-user-code
      root.addSubtitle(subtitle);
      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <p>Adds an item to the catalog within the provided subtitle.</p>
    * <!-- end-UML-doc -->
    * @param subtitleNumber <p>the subtitle id number</p>
    * @param item <p>the item id number</p>
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ud9AwEquEeeJsdrfgQXeQw"
    */
    public void addItem(Integer subtitleNumber, Item item) {
      // begin-user-code
      root.addItem(subtitleNumber, item);

      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <p>Adds an assignment to the catalog within the provided subtitle and item.</p>
    * <!-- end-UML-doc -->
    * @param subtitleNumber <p>the subtitle id number</p>
    * @param itemNumber <p>the item id number</p>
    * @param assignment <p>the assignment id number</p>
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UeAEEEquEeeJsdrfgQXeQw"
    */
    public void addAssignment(Integer subtitleNumber, Integer itemNumber,
        Assignment assignment) {
      // begin-user-code
      root.addAssignment(subtitleNumber, itemNumber, assignment);

      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <p>Returns the special program that holds the catalog's elements.</p>
    * <!-- end-UML-doc -->
    * @return <p>the special program that holds the catalog's elements</p>
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_tThVoEt-EeeC6_ZX80x4yQ"
    */
    public Program getProgram() {
      // begin-user-code
      return root;
      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <p>Sets the special program</p>
    * <!-- end-UML-doc -->
    * @param program
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_tTjK0Et-EeeC6_ZX80x4yQ"
    */
    public void setProgram(Program program) {
      // begin-user-code
      root = program;

      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <p>Gets all the subtitles in the catalog.</p>
    * <!-- end-UML-doc -->
    * @return <p>all the subtitles in the catalog</p>
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UeEVgEquEeeJsdrfgQXeQw"
    */
    @Override
    public Collection<Subtitle> getSubtitles() {
      // begin-user-code
      return root.getSubtitles();
      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param subtitleNumber
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_cLkIoFLxEeeyIrnvp3X3kA"
    */
    @Override
    public Subtitle getSubtitle(int subtitleNumber) {
      // begin-user-code
      return root.getSubtitle(subtitleNumber);
      // end-user-code
    }
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author joviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UaQMgEquEeeJsdrfgQXeQw"
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UaQMgEquEeeJsdrfgQXeQw"
  */
  protected final class PlainBudgetElement {

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
  protected class BudgetClassifiersMapper {

    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param classifiers
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UiMnkEquEeeJsdrfgQXeQw"
    */
    public final ClassifiersCatalogImpl map(
        Collection<PlainBudgetElement> classifiers) {
      // begin-user-code
      Iterator<PlainBudgetElement> ic = classifiers.iterator();
      ClassifiersCatalogImpl ccp = new ClassifiersCatalogImpl();
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
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_4kcKEFLuEeeyIrnvp3X3kA"
  */
  private ClassifiersCatalog classifiersCatalog;

  /** 
  * <!-- begin-UML-doc -->
  * <p>Creates a new instance of a BudgetElementExtractor.</p>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdnpkEquEeeJsdrfgQXeQw"
  */
  public ClassifiersCatalogExtractor() {
    // begin-user-code
    super();
    classifiersCatalog = new ClassifiersCatalogImpl();
    setSource(Messages.getString("ClassifiersCatalogExtractor.sourceUrl")); //$NON-NLS-1$
    setDestination(
        Messages.getString("ClassifiersCatalogExtractor.destinationUrl")); //$NON-NLS-1$
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
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdpewEquEeeJsdrfgQXeQw"
  */

  public void extract() throws DownloadException {
    // begin-user-code
    ClassifiersCatalogImpl ccp = extractClassifierCatalog();
    classifiersCatalog = ccp;
    String mappedCatalog = BudgetElementToJsonMapper.map(ccp.getProgram(), 0);
    File file = new File(getDestination());
    file.getParentFile().mkdirs();

    PrintWriter outputStream = null;
    try {
      outputStream = new PrintWriter(new BufferedWriter(new FileWriter(file)));
      outputStream.write(mappedCatalog);
    } catch (IOException e) {
      e.printStackTrace();
      throw new DownloadException("Falla al escribir el archivo destino");
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
  * @throws DownloadException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdrT8EquEeeJsdrfgQXeQw"
  */

  private ClassifiersCatalogImpl extractClassifierCatalog()
      throws DownloadException {
    // begin-user-code

    CSVReader reader = getReader();

    ClassifiersCatalogExtractor.log.fine("Comenzando la extracción");
    Collection<PlainBudgetElement> budgetElements = new ArrayList<>();
    String[] line;
    int cnumber = 0;
    try {
      while ((line = reader.readNext()) != null) {
        ClassifiersCatalogExtractor.log.fine("Procesando item " + cnumber);
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
          throw new DownloadException(
              "No es posible extraer el número de subtitle");
        }

        int item = 0;
        s = elements.get(1);
        if (s != null) {
          try {
            item = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            ClassifiersCatalogExtractor.log
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
            ClassifiersCatalogExtractor.log
                .finest("No se pudo obtener un número de asignación");
          }
        }

        String name;
        s = elements.get(3);
        if (s != null) {
          name = s;
        } else {
          throw new DownloadException(
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
    BudgetClassifiersMapper mapper = new BudgetClassifiersMapper();
    return mapper.map(budgetElements);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Gets a CSV reader pointing to the source file specified in a the properties file.</p>
  * <!-- end-UML-doc -->
  * @return
  * @throws DownloadException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Udz20EquEeeJsdrfgQXeQw"
  */
  private CSVReader getReader() throws DownloadException {
    // begin-user-code
    FileInputStream fi;
    try {
      fi = new FileInputStream(getSource());
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      throw new DownloadException("Archivo de origen no encontrado");
    }
    CSVReader reader = null;
    try {
      reader = new CSVReader(new InputStreamReader(fi, "UTF-8"), ';');
    } catch (UnsupportedEncodingException e1) {
      e1.printStackTrace();
      try {
        fi.close();
      } catch (IOException e) {
        ClassifiersCatalogExtractor.log
            .fine("Error al cerrar los streams de lectura");
        e.printStackTrace();
      }
      throw new DownloadException("Error de codificación del archivo fuente");
    }
    return reader;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_8frQkFLuEeeyIrnvp3X3kA"
  */
  public ClassifiersCatalog getExtractedCatalog() {
    // begin-user-code
    return classifiersCatalog;
    // end-user-code
  }

  /** 
  * (non-Javadoc)
  * @see Downloader#download()
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UfdcoEquEeeJsdrfgQXeQw?INHERITED"
  */
  @Override
  public void download() throws DownloadException {
    // begin-user-code
    // TODO Auto-generated method stub

    // end-user-code
  }

}