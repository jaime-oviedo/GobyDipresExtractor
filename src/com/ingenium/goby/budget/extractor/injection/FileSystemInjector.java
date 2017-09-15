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
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 *
 * @author Jaime Oviedo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_yNL6EFdBEee4ttLK_7FK1A"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_yNL6EFdBEee4ttLK_7FK1A"
 */
public class FileSystemInjector implements Injector {
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ve7uoGEGEeemUqxRur9fjQ"
   */
  private static final Logger log = Logger
      .getLogger("com.ingenium.goby.extractor.FileSystemInjector");

  public static void inject(Object element, String destination)
      throws InjectionException {
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
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_20YusFdBEee4ttLK_7FK1A"
   */
  private final String destination;

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_DkOzgFdEEee4ttLK_7FK1A"
   */
  private final Object element;

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc --> Creates a new instance of the class
   * FileSystemInjector.
   *
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
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
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
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @throws InjectionException
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ZEVjcFhLEeeLhanfOp3nJA"
   */
  @Override
  public void inject() throws InjectionException {
    // begin-user-code
    inject(element, destination);
    // end-user-code
  }
}