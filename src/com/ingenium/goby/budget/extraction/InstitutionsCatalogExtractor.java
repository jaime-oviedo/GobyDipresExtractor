/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extraction;

import com.ingenium.goby.budget.InstitutionsCatalog;
import com.ingenium.goby.budget.elements.Batch;
import com.ingenium.goby.budget.elements.BudgetElementType;
import com.ingenium.goby.budget.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.elements.Chapter;
import com.ingenium.goby.budget.elements.CompositeBudgetElement;
import com.ingenium.goby.budget.elements.Program;
import com.opencsv.CSVReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_dLNpsFYQEeeKVoBZn1AqUw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_dLNpsFYQEeeKVoBZn1AqUw"
 */
public class InstitutionsCatalogExtractor {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author JaimeRodrigo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_J2HjoFYYEeeKVoBZn1AqUw"
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_J2HjoFYYEeeKVoBZn1AqUw"
  */
  class InstitutionsCatalogImpl extends CompositeBudgetElement
      implements InstitutionsCatalog {
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * Crea una nueva instancia de la clase InstitutionsCatalogImpl.
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_N3jYwFYYEeeKVoBZn1AqUw"
    */
    public InstitutionsCatalogImpl() {
      // begin-user-code
      super(0, "Catálogo Institucional", "", BudgetElementType.NONE,
          BudgetHierarchyLevel.ROOT);
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_T_g1gFYYEeeKVoBZn1AqUw"
    */
    @SuppressWarnings("unchecked")
    @Override
    public Collection<Batch> getBatches() {
      // begin-user-code
      return (Collection<Batch>) getSubelements().values();
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @param batchNumber
    * @return
    * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_9MPckFYYEeeKVoBZn1AqUw"
    */
    @Override
    public Batch getBatch(int batchNumber) {
      // begin-user-code
      return (Batch) getSubelement(batchNumber);
      // end-user-code
    }
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_p71cgFYQEeeKVoBZn1AqUw"
  */
  private final String source;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_oMiFQFYUEeeKVoBZn1AqUw"
  */
  private static final Logger log = Logger
      .getLogger("com.ingenium.goby.extractors.InstitutionsCatalogExtractor");
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase InstitutionsCatalogExtractor.
  * @param source
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_omT0AFYQEeeKVoBZn1AqUw"
  */
  public InstitutionsCatalogExtractor(String source) {
    // begin-user-code
    this.source = source;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @throws ExtractionException
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Zh4xkFYbEeeKVoBZn1AqUw"
  */
  public InstitutionsCatalog extract() throws ExtractionException {
    // begin-user-code
    
    // get the csv file reader handler
    FileInputStream fi = null;
    try {
      fi = new FileInputStream(source);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      throw new ExtractionException("Source file not found");
    }
    CSVReader reader = null;
    
    InstitutionsCatalogImpl catalog = new InstitutionsCatalogImpl();
    try {
      String line[] = null;
      reader = new CSVReader(new InputStreamReader(fi, "UTF-8"), ';', '"', 0);
      while ((line = reader.readNext()) != null) {
        
        int batchNumber = 0;
        
        String s = line[0];
        try {
          if (s != null) {
            batchNumber = Integer.parseInt(s);
          }
        } catch (Exception e) {
          throw new ExtractionException("Unable to extract batch number.");
        }
        
        int chapterNumber = 0;
        s = line[1];
        if (s != null) {
          try {
            chapterNumber = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            InstitutionsCatalogExtractor.log
                .finest("Unable to extract chatper number.");
          }
        } else {
          chapterNumber = 0;
        }
        
        int programNumber = 0;
        s = line[2];
        if (s != null) {
          try {
            programNumber = Integer.parseInt(s);
          } catch (NumberFormatException e) {
            InstitutionsCatalogExtractor.log
                .finest("Unable to extact program number.");
          }
        }
        
        String name = "";
        s = line[3];
        if (s != null) {
          name = s;
        } else {
          throw new ExtractionException("Unable to obtain name for element:"
              + batchNumber + chapterNumber + programNumber);
        }
        String description = "";
        Batch batch = catalog.getBatch(batchNumber);
        if (programNumber != 0) {
          if (batch != null) {
            batch.addProgram(chapterNumber, new Program(programNumber, name,
                description, BudgetElementType.INSTITUTIONAL_CLASSIFICATION));
            continue;
          }
        }
        
        if (chapterNumber != 0)
        
        {
          if (batch != null) {
            batch.addChapter(new Chapter(chapterNumber, name, description,
                BudgetElementType.INSTITUTIONAL_CLASSIFICATION));
            continue;
          }
        }
        
        if (batchNumber != 0) {
          batch = new Batch(batchNumber, name, description,
              BudgetElementType.INSTITUTIONAL_CLASSIFICATION);
          catalog.addSubelement(batch);
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
        if (reader != null) {
          reader.close();
        }
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