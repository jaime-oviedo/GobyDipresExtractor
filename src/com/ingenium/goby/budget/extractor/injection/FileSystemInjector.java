/**
 *
 */

package com.ingenium.goby.budget.extractor.injection;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_yNL6EFdBEee4ttLK_7FK1A"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yNL6EFdBEee4ttLK_7FK1A"
 */
public final class FileSystemInjector {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ve7uoGEGEeemUqxRur9fjQ"
  */
  private static final Logger log = Logger
      .getLogger(FileSystemInjector.class.getCanonicalName());
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param element
  * @param fileName
  * @param directory
  * @param encoding
  * @throws InjectionException
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_PCgL8JpTEee9SelJ6GNJZw"
  */
  public static void inject(Object element, String fileName, String directory,
      String encoding) throws InjectionException {
    // begin-user-code
    final File dir = new File(directory);
    final boolean dirCreated = dir.mkdirs();
    if (!dirCreated) {
      FileSystemInjector.log.warning(
          "Unable to create directories for injection. They could already exist or there could be another problem.");
    }
    
    FileOutputStream fos = null;
    OutputStreamWriter osw = null;
    try {
      fos = new FileOutputStream(new StringBuilder(directory)
          .append(File.separator).append(fileName).toString());
      osw = new OutputStreamWriter(fos, Charset.forName(encoding));
      osw.write(element.toString());
    } catch (final IOException e) {
      throw new InjectionException(
          new StringBuilder("Unable to write on injection destination:")
              .append(e.getMessage()).toString());
    } finally {
      if (osw != null) {
        try {
          osw.close();
        } catch (final IOException e) {
          FileSystemInjector.log
              .fine(new StringBuilder("Unable to close streams:")
                  .append(e.getMessage()).toString());
        }
      }
      if (fos != null) {
        try {
          fos.close();
        } catch (final IOException e) {
          FileSystemInjector.log
              .fine(new StringBuilder("Unable to close streams:")
                  .append(e.getMessage()).toString());
        }
      }
      
    }
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class FileSystemInjector.
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Di4Y4JzCEeeKKp-m4AD7KQ"
  */
  private FileSystemInjector() {
    // begin-user-code
    
    // end-user-code
  }
}