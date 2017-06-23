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
  public class InstitutionsCatalogImpl extends CompositeBudgetElement
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
    FileInputStream fi;
    try {
      fi = new FileInputStream(source);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      throw new ExtractionException("Archivo de origen no encontrado");
    }
    CSVReader reader = null;
    
    InstitutionsCatalogImpl catalog = new InstitutionsCatalogImpl();
    try {
      String line[];
      reader = new CSVReader(new InputStreamReader(fi, "UTF-8"), ';', '"', 1);
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
        
        String name;
        s = line[3];
        if (s != null) {
          name = s;
        } else {
          throw new ExtractionException("Unable to obtain name for element:"
              + batchNumber + chapterNumber + programNumber);
        }
        
        if (programNumber != 0) {
          Batch batch = catalog.getBatch(batchNumber);
          if (batch != null) {
            batch.addProgram(chapterNumber, new Program(programNumber, name, "",
                BudgetElementType.INSTITUTIONAL_CLASSIFICATION));
            continue;
          }
        }
        
        if (chapterNumber != 0)
        
        {
          Batch batch = catalog.getBatch(batchNumber);
          if (batch != null) {
            batch.addChapter(new Chapter(chapterNumber, name, "",
                BudgetElementType.INSTITUTIONAL_CLASSIFICATION));
            continue;
          }
        }
        
        if (batchNumber != 0) {
          Batch batch = new Batch(batchNumber, name, "",
              BudgetElementType.INSTITUTIONAL_CLASSIFICATION);
          catalog.addSubelement(batch);
          continue;
        }
        
        throw new ExtractionException(
            "Malformed csv file, found budgetary items (chapter or program) without previously created parent");
        
      }
      
      // while ((line = reader.readNext()) != null) {
      // int index = 0;
      // for (String element : line) {
      // lineElements.add(index, element);
      // index++;
      // }
      // lines.add(lineElements);
      // }
      reader.close();
    } catch (Exception e) {
      throw new ExtractionException(
          "Unable to create input stream or csv reader");
    } finally {
      try {
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
    
    // for (ArrayList<String> line : lines) {
    // int batchNumber = 0;
    //
    // String s = line.get(0);
    // try {
    // if (s != null) {
    // batchNumber = Integer.parseInt(s);
    // }
    // } catch (Exception e) {
    // throw new ExtractionException("Unable to extract batch number.");
    // }
    //
    // int chapterNumber = 0;
    // s = line.get(1);
    // if (s != null) {
    // try {
    // chapterNumber = Integer.parseInt(s);
    // } catch (NumberFormatException e) {
    // InstitutionsCatalogExtractor.log
    // .finest("Unable to extract chatper number.");
    // }
    // } else {
    // chapterNumber = 0;
    // }
    //
    // int programNumber = 0;
    // s = line.get(2);
    // if (s != null) {
    // try {
    // programNumber = Integer.parseInt(s);
    // } catch (NumberFormatException e) {
    // InstitutionsCatalogExtractor.log
    // .finest("Unable to extact program number.");
    // }
    // }
    //
    // String name;
    // s = line.get(3);
    // if (s != null) {
    // name = s;
    // } else {
    // throw new ExtractionException("Unable to obtain name for element:"
    // + batchNumber + chapterNumber + programNumber);
    // }
    //
    // if (programNumber != 0) {
    // Batch batch = catalog.getBatch(batchNumber);
    // if (batch != null) {
    // batch.addProgram(chapterNumber, new Program(programNumber, name, "",
    // BudgetElementType.INSTITUTIONAL_CLASSIFICATION));
    // break;
    // }
    // }
    //
    // if(chapterNumber!=0)
    //
    // {
    // Batch batch = catalog.getBatch(batchNumber);
    // if (batch != null) {
    // batch.addChapter(new Chapter(chapterNumber, name, "",
    // BudgetElementType.INSTITUTIONAL_CLASSIFICATION));
    // break;
    // }
    // }
    //
    // if(batchNumber!=0)
    // {
    // Batch batch = new Batch(batchNumber, name, "",
    // BudgetElementType.INSTITUTIONAL_CLASSIFICATION);
    // catalog.batches.put(batchNumber, batch);
    // break;
    // }
    
    // throw new ExtractionException("Malformed csv file, found budgetary items (chapter or program)
    // without previously created parent");
    // }
    return catalog;
    // end-user-code
  }
}