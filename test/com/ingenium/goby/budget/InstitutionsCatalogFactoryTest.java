package com.ingenium.goby.budget;

import static org.junit.Assert.fail;

import com.ingenium.goby.budget.elements.Batch;
import com.ingenium.goby.budget.extraction.map.BudgetElementToJsonMapper;

import java.util.Collection;

import org.junit.Test;

public class InstitutionsCatalogFactoryTest {

  @Test
  public void testGetInstitutionsCatalog() {
    InstitutionsCatalogFactory factory = InstitutionsCatalogFactory
        .getInstance();
    Collection<Batch> batches = factory.getInstitutionsCatalog().getBatches();
    for (Batch batch : batches) {
      System.out.println(BudgetElementToJsonMapper.map(batch, 0));
    }

    fail("Not yet implemented");
  }

}
