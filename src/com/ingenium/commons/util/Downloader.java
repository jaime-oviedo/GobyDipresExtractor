/**
 *
 */

package com.ingenium.commons.util;

import java.io.IOException;

/**
 * Las clases que implementan la interfaz Downloader tienen la capacidad de
 * descargar archivos desde una URL.
 * 
 * @author JaimeRodrigo
 */
public interface Downloader {

  public void download(String source, String destination) throws IOException;

}
