/**
 *
 */

package com.ingenium.commons.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Esta clase permite la descarga de un archivo desde un sitio Web.
 *
 * @author JaimeRodrigo
 */
public class SimpleFileDownloader implements Downloader {

  private static final int BUFFER_SIZE = 4096;

  /**
   * Crea una nueva instancia de la clase SimpleFileDownloader.
   */
  public SimpleFileDownloader() {
    // TODO Auto-generated constructor stub
  }

  /*
   * (non-Javadoc)
   * @see com.ingenium.commons.util.Downloader#download(java.lang.String,
   * java.lang.String)
   */
  @Override
  public void download(String source, String destination) throws IOException {
    URL url = new URL(source);
    HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
    int responseCode = httpConn.getResponseCode();

    // always check HTTP response code first
    if (responseCode == HttpURLConnection.HTTP_OK) {
      String fileName = "";
      final String disposition = httpConn.getHeaderField("Content-Disposition");
      final String contentType = httpConn.getContentType();
      final int contentLength = httpConn.getContentLength();

      if (disposition != null) {
        // extracts file name from header field
        int index = disposition.indexOf("filename=");
        if (index > 0) {
          fileName = disposition.substring(index + 10,
              disposition.length() - 1);
        }
      } else {
        // extracts file name from URL
        fileName = source.substring(source.lastIndexOf("/") + 1,
            source.length());
      }
      System.out.println("Content-Type = " + contentType);
      System.out.println("Content-Disposition = " + disposition);
      System.out.println("Content-Length = " + contentLength);
      System.out.println("fileName = " + fileName);
      // opens input stream from the HTTP connection
      InputStream inputStream = httpConn.getInputStream();
      String saveFilePath = destination + File.separator + fileName;
      // opens an output stream to save into file
      FileOutputStream outputStream = new FileOutputStream(saveFilePath);
      int bytesRead = -1;
      byte[] buffer = new byte[SimpleFileDownloader.BUFFER_SIZE];
      while ((bytesRead = inputStream.read(buffer)) != -1) {
        outputStream.write(buffer, 0, bytesRead);
      }
      outputStream.close();
      inputStream.close();
      System.out.println("File downloaded");
    } else {
      System.out.println(
          "No file to download. Server replied HTTP code: " + responseCode);
    }
    httpConn.disconnect();
    // BufferedReader inputStream = null;
    // PrintWriter outputStream = null;
    // final URL url = new URL(source);
    // final Charset inputCharset = Charset.forName("ISO-8859-1");
    //
    // try {
    // inputStream = new BufferedReader(
    // new InputStreamReader(url.openStream(), inputCharset));
    // outputStream = new PrintWriter(
    // new BufferedWriter(new FileWriter(destination)));
    // String l;
    //
    // while ((l = inputStream.readLine()) != null) {
    // outputStream.write(l);
    // }
    // } finally {
    // if (inputStream != null) {
    // inputStream.close();
    // }
    // if (outputStream != null) {
    // outputStream.close();
    // }
    // }
  }

}
