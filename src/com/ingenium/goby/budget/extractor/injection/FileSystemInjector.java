/**
 *
 */

package com.ingenium.goby.budget.extractor.injection;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_yNL6EFdBEee4ttLK_7FK1A"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yNL6EFdBEee4ttLK_7FK1A"
 */
public class FileSystemInjector {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ve7uoGEGEeemUqxRur9fjQ"
  */
  private static final Logger log = Logger
      .getLogger("com.ingenium.goby.extractor.FileSystemInjector");
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param element
  * @param destination
  * @throws InjectionException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_PCgL8JpTEee9SelJ6GNJZw"
  */
  public static void inject(Object element, String destination)
      throws InjectionException {
    // begin-user-code
    final File file = new File(destination);
    final boolean dirCreated = file.getParentFile().mkdirs();
    if (!dirCreated) {
      log.warning("Unable to create directories for injection.");
    }
    
    PrintWriter outputStream = null;
    try {
      outputStream = new PrintWriter(new BufferedWriter(new FileWriter(file)));
      outputStream.write(element.toString());
    } catch (final IOException e) {
      log.warning(e.getMessage());
      throw new InjectionException("Unable to write on injection destination");
    } finally {
      if (outputStream != null) {
        outputStream.close();
      }
    }
    // end-user-code
  }
}