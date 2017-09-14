package com.ingenium.goby.budget.extractor.factory;

import com.ingenium.goby.budget.extractor.factory.InstitutionsCatalogFactory;
import com.ingenium.goby.budget.extractor.injection.FileSystemInjector;
import com.ingenium.goby.budget.extractor.map.BudgetElementToJsonMapper;
import com.ingenium.goby.budget.extractor.model.BudgetElementType;
import com.ingenium.goby.budget.extractor.model.BudgetHierarchyLevel;
import com.ingenium.goby.budget.extractor.model.CompositeBudgetElement;
import com.ingenium.goby.budget.extractor.model.InstitutionsCatalog;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

public class InstitutionsCatalogFactoryTest {

  @Test
  public void testGetInstitutionsCatalog() {

    final String s = File.separator;
    final String source = new StringBuffer("test").append(s).append("com")
        .append(s).append("ingenium").append(s).append("goby").append(s)
        .append("budget").append(s).append("extractor").append(s)
        .append("fixture").append(s).append("institutions.csv").toString();
    final InstitutionsCatalogFactory factory = InstitutionsCatalogFactory
        .getInstance();
    factory.setSource(source);
    final InstitutionsCatalog catalog = factory.getInstitutionsCatalog(true);

    final CompositeBudgetElement b = new CompositeBudgetElement(0,
        "Catálogo Institucional", "",
        BudgetElementType.INSTITUTIONAL_CLASSIFICATION,
        BudgetHierarchyLevel.ROOT);
    b.setSubelements(catalog.getBatches());

    final String jsonCatalog = BudgetElementToJsonMapper.map(b, 0);
    final String destination = "tmp" + s + "institutions.json";
    final FileSystemInjector fsi = new FileSystemInjector(destination,
        jsonCatalog);
    try {
      fsi.inject();
      final File file1 = new File(destination);
      final String objective = new StringBuffer("test").append(s).append("com")
          .append(s).append("ingenium").append(s).append("goby").append(s)
          .append("budget").append(s).append("extractor").append(s)
          .append("fixture").append(s).append("institutions.json").toString();
      final File file2 = new File(objective);
      Assert.assertTrue(FileUtils.contentEquals(file1, file2));
    } catch (final Exception e) {
      Assert.fail("Injection failed or unexpected extracted file contents.");
      e.printStackTrace();
    }
    ;

  }

}
