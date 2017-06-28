/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extraction;

import com.ingenium.goby.budget.ClassifiersCatalog;
import com.ingenium.goby.budget.elements.Assignment;
import com.ingenium.goby.budget.elements.BudgetElementType;
import com.ingenium.goby.budget.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.elements.CompositeBudgetElement;
import com.ingenium.goby.budget.elements.Item;
import com.ingenium.goby.budget.elements.Subtitle;
import com.opencsv.CSVReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
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
public class ClassifiersCatalogExtractor {

  /** 
  * <!-- begin-UML-doc -->
  * <p>Represents a hierarchical catalog of budget elements.</p>
  * <!-- end-UML-doc -->
  * @author joviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UXJ1MEquEeeJsdrfgQXeQw"
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UXJ1MEquEeeJsdrfgQXeQw"
  */
  protected class ClassifiersCatalogImpl extends CompositeBudgetElement
      implements ClassifiersCatalog {
    /** 
    * <!-- begin-UML-doc -->
    * <p>Creates a new BudgetElementsCatalog.</p>
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ud6kgEquEeeJsdrfgQXeQw"
    */
    public ClassifiersCatalogImpl() {
      // begin-user-code
      super(0, "Catalogo de clasificadores presupuestarios",
          "Estructura jerárquica de los clasificadores por objeto del gasto usados en el presupuesto",
          BudgetElementType.INSTITUTIONAL_CLASSIFICATION,
          BudgetHierarchyLevel.ROOT);

      // end-user-code
    }

    /** 
    * <!-- begin-UML-doc -->
    * <p>Gets all the subtitles in the catalog.</p>
    * <!-- end-UML-doc -->
    * @return <p>all the subtitles in the catalog</p>
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UeEVgEquEeeJsdrfgQXeQw"
    */
    @SuppressWarnings("unchecked")
    @Override
    public Collection<Subtitle> getSubtitles() {
      // begin-user-code
      return (Collection<Subtitle>) super.getSubelements().values();
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
      return (Subtitle) super.getSubelement(subtitleNumber);
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
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_LzWOoFk0EeeTxfHpmbMLyQ"
  */
  private final String source;

  /** 
  * <!-- begin-UML-doc -->
  * <p>Creates a new instance of a BudgetElementExtractor.</p>
  * <!-- end-UML-doc -->
  * @param source
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdnpkEquEeeJsdrfgQXeQw"
  */
  public ClassifiersCatalogExtractor(String source) {
    // begin-user-code
    super();
    this.source = source;
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
  * @return
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UdpewEquEeeJsdrfgQXeQw"
  */

  public ClassifiersCatalog extract() throws ExtractionException {
    // begin-user-code
    FileInputStream fi;
    try {
      fi = new FileInputStream(source);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      throw new ExtractionException("Source file not found");
    }
    CSVReader reader = null;

    ClassifiersCatalogImpl catalog = new ClassifiersCatalogImpl();
    try {
      String line[];
      reader = new CSVReader(new InputStreamReader(fi, "UTF-8"), ';', '"', 0);
      while ((line = reader.readNext()) != null) {

        int subtitleNumber = 0;

        String s = line[0];
        try {
          if (s != null) {
            subtitleNumber = Integer.parseInt(s);
          }
        } catch (Exception e) {
          throw new ExtractionException("Unable to extract subtitle number.");
        }

        int itemNumber = 0;
        s = line[1];
        if (s != null) {
          try {
            itemNumber = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            ClassifiersCatalogExtractor.log
                .finest("Unable to extract item number.");
          }
        } else {
          itemNumber = 0;
        }

        int assignmentNumber = 0;
        s = line[2];
        if (s != null) {
          try {
            assignmentNumber = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            ClassifiersCatalogExtractor.log
                .finest("Unable to extract assignment number.");
          }
        }

        String name;
        s = line[3];
        if (s != null) {
          name = s;
        } else {
          throw new ExtractionException("Unable to obtain name for element:"
              + subtitleNumber + itemNumber + assignmentNumber);
        }
        String description;
        s = line[4];
        if (s != null) {
          description = s;
        } else {
          description = "";
        }

        if (assignmentNumber != 0) {
          Subtitle subtitle = catalog.getSubtitle(subtitleNumber);
          if (subtitle != null) {
            subtitle.addAssignment(itemNumber,
                new Assignment(assignmentNumber, name, description,
                    BudgetElementType.INSTITUTIONAL_CLASSIFICATION));
            continue;
          }
        }

        if (itemNumber != 0)

        {
          Subtitle subtitle = catalog.getSubtitle(subtitleNumber);
          if (subtitle != null) {
            subtitle.addItem(new Item(itemNumber, name, description,
                BudgetElementType.INSTITUTIONAL_CLASSIFICATION));
            continue;
          }
        }

        if (subtitleNumber != 0) {
          Subtitle subtitle = new Subtitle(subtitleNumber, name, description,
              BudgetElementType.INSTITUTIONAL_CLASSIFICATION);
          catalog.addSubelement(subtitle);
          continue;
        }

        throw new ExtractionException(
            "Malformed csv file, found budgetary items (chapter or program) without previously created parent");

      }

      reader.close();
    } catch (IOException e) {
      throw new ExtractionException(
          "Unable to create input stream or csv reader");
    } finally {
      try {
        if (reader != null)
          reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
        fi.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return catalog;
    // end-user-code
  }

}