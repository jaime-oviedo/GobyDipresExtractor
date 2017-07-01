package com.ingenium.goby.budget.extractor;

import com.ingenium.goby.budget.extractor.elements.BudgetElementType;
import com.ingenium.goby.budget.extractor.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.extractor.elements.CompositeBudgetElement;
import com.ingenium.goby.budget.extractor.extraction.map.BudgetElementToJsonMapper;
import com.ingenium.goby.budget.extractor.injection.FileSystemInjector;

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
    InstitutionsCatalog catalog = factory.getInstitutionsCatalog(true);

    CompositeBudgetElement b = new CompositeBudgetElement(0,
        "Catálogo Institucional", "",
        BudgetElementType.INSTITUTIONAL_CLASSIFICATION,
        BudgetHierarchyLevel.ROOT);
    b.setSubelements(catalog.getBatches());

    String jsonCatalog = BudgetElementToJsonMapper.map(b, 0);
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
