
package com.ingenium.commons.util;

import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlainWebPageDownloaderTest {
  
  private String source;
  private String destination;
  
  @Before
  public void setup() {
    source = "http://www.dipres.gob.cl/595/w3-propertyvalue-15146.html"; //$NON-NLS-1$
    destination = "stage/ejecucion.html"; //$NON-NLS-1$
  }
  
  @Test
  public void test() {
    final FormattedWebPageDownloader downloader = new FormattedWebPageDownloader(
        source, destination);
    try {
      downloader.download();
    } catch (final Exception e) {
      e.printStackTrace();
      Assert.fail("download failed");
    }
    
    final File f = new File(downloader.getDestination());
    Assert.assertTrue(f.exists() && !f.isDirectory());
  }
  
}
