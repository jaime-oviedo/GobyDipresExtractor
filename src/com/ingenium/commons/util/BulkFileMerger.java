/**
 *
 */

package com.ingenium.commons.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_gsMO4FdJEee4ttLK_7FK1A"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gsMO4FdJEee4ttLK_7FK1A"
 */
public class BulkFileMerger {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param souceDirectory
  * @param destinationDirectory
  * @param destinationFileName
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_mSfTkFdKEee4ttLK_7FK1A"
  */
  public static void merge(String souceDirectory, String destinationDirectory,
      String destinationFileName) {
    // begin-user-code
    OutputStream output = null;
    String destination = destinationDirectory + File.separator
        + destinationFileName;
    File dir = new File(souceDirectory);
    File[] sources = dir.listFiles();
    if (sources == null) {
      return;
    }
    try {
      output = new BufferedOutputStream(
          new FileOutputStream(destination, true));
      InputStream input = null;
      for (File source : sources) {
        try {
          input = new BufferedInputStream(new FileInputStream(source));
          IOUtils.copy(input, output);
        } catch (IOException e) {
          e.printStackTrace();
        } finally {
          IOUtils.closeQuietly(input);
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      IOUtils.closeQuietly(output);
    }
    // end-user-code
  }

}