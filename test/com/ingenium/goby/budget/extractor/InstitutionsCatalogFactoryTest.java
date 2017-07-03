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
    String source = new StringBuffer("test").append(s).append("com").append(s)
        .append("ingenium").append(s).append("goby").append(s).append("budget")
        .append(s).append("extractor").append(s).append("fixture").append(s)
        .append("institutions.csv").toString();
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
      String objective = new StringBuffer("test").append(s).append("com")
          .append(s).append("ingenium").append(s).append("goby").append(s)
          .append("budget").append(s).append("extractor").append(s)
          .append("fixture").append(s).append("institutions.json").toString();
      File file2 = new File(objective);
      Assert.assertTrue(FileUtils.contentEquals(file1, file2));
    } catch (Exception e) {
      Assert.fail("Injection failed or unexpected extracted file contents.");
      e.printStackTrace();
    }
    ;

  }

}
