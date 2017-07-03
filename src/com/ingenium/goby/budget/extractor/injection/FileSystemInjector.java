/**
 * 
 */

package com.ingenium.goby.budget.extractor.injection;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_yNL6EFdBEee4ttLK_7FK1A"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yNL6EFdBEee4ttLK_7FK1A"
 */
public class FileSystemInjector implements Injector {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_20YusFdBEee4ttLK_7FK1A"
  */
  private final String destination;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_DkOzgFdEEee4ttLK_7FK1A"
  */
  private final Object element;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase FileSystemInjector.
  * @param destination
  * @param element
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_8Hj4gFdBEee4ttLK_7FK1A"
  */
  public FileSystemInjector(String destination, Object element) {
    // begin-user-code
    this.destination = destination;
    this.element = element;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_rTB5cFdDEee4ttLK_7FK1A"
  */
  @Override
  public String getDestination() {
    // begin-user-code
    return destination;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @throws InjectionException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ZEVjcFhLEeeLhanfOp3nJA"
  */
  @Override
  public void inject() throws InjectionException {
    // begin-user-code
    File file = new File(getDestination());
    file.getParentFile().mkdirs();
    
    PrintWriter outputStream = null;
    try {
      outputStream = new PrintWriter(new BufferedWriter(new FileWriter(file)));
      outputStream.write(element.toString());
    } catch (IOException e) {
      e.printStackTrace();
      throw new InjectionException("Falla al escribir el archivo destino");
    } finally {
      if (outputStream != null) {
        outputStream.close();
      }
    }
    
    // end-user-code
  }
}