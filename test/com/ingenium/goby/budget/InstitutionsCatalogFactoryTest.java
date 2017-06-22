package com.ingenium.goby.budget;

import com.ingenium.goby.budget.extraction.InstitutionsCatalogExtractor.InstitutionsCatalogImpl;
import com.ingenium.goby.budget.extraction.map.BudgetElementToJsonMapper;

import org.junit.Assert;
import org.junit.Test;

public class InstitutionsCatalogFactoryTest {

  @Test
  public void testGetInstitutionsCatalog() {
    InstitutionsCatalogFactory factory = InstitutionsCatalogFactory
        .getInstance();
    InstitutionsCatalogImpl catalog = (InstitutionsCatalogImpl) factory
        .getInstitutionsCatalog();
    System.out.println(BudgetElementToJsonMapper.map(catalog, 0));
    // Collection<Batch> batches = factory.getInstitutionsCatalog().getBatches();
    // for (Batch batch : batches) {
    // System.out.println(BudgetElementToJsonMapper.map(batch, 0));
    // }

    Assert.fail("Not yet implemented");
  }

}
