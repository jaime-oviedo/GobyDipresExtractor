package com.ingenium.goby.budget;

import com.ingenium.goby.budget.extraction.InstitutionsCatalogExtractor.InstitutionsCatalogImpl;
import com.ingenium.goby.budget.extraction.map.BudgetElementToJsonMapper;
import com.ingenium.goby.budget.injection.FileSystemInjector;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

public class InstitutionsCatalogFactoryTest {

  @Test
  public void testGetInstitutionsCatalog() {

    String s = File.separator;
    String source = "test" + s + "com" + s + "ingenium" + s + "goby" + s
        + "extractors" + s + "budget" + s + "fixture" + s + "institutions.csv";
    InstitutionsCatalogFactory factory = InstitutionsCatalogFactory
        .getInstance();
    factory.setSource(source);
    InstitutionsCatalogImpl catalog = (InstitutionsCatalogImpl) factory
        .getInstitutionsCatalog(true);

    String jsonCatalog = BudgetElementToJsonMapper.map(catalog, 0);
    String destination = "tmp" + s + "institutions.json";
    FileSystemInjector fsi = new FileSystemInjector(destination, jsonCatalog);
    try {
      fsi.inject();
      File file1 = new File(destination);
      String objective = "test" + s + "com" + s + "ingenium" + s + "goby" + s
          + "extractors" + s + "budget" + s + "fixture" + s
          + "institutions.json";
      File file2 = new File(objective);
      Assert.assertTrue(FileUtils.contentEquals(file1, file2));
    } catch (Exception e) {
      Assert.fail("Injection failed or unexpected extracted file contents.");
      e.printStackTrace();
    }
    ;

  }

}
