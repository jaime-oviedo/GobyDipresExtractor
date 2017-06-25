package com.ingenium.goby.budget;

import com.ingenium.goby.budget.extraction.BudgetLawCsvFilesListExtractorTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClassifiersCatalogFactoryTest.class,
    InstitutionsCatalogFactoryTest.class,
    BudgetLawCsvFilesListExtractorTest.class })
public class AllLocalTests {

}
