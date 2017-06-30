package com.ingenium.goby.budget;

import com.ingenium.goby.budget.extraction.BudgetLawCsvFilesListDownloaderTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClassifiersCatalogFactoryTest.class,
    InstitutionsCatalogFactoryTest.class,
    BudgetLawCsvFilesListDownloaderTest.class })
public class AllLocalTests {

}
