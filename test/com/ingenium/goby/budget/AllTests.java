package com.ingenium.goby.budget;

import com.ingenium.goby.budget.extraction.BudgetLawCsvFilesDownloaderTest;
import com.ingenium.goby.budget.extraction.BudgetLawCsvFilesListDownloaderTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClassifiersCatalogFactoryTest.class,
    BudgetLawCsvFilesListDownloaderTest.class,
    BudgetLawCsvFilesDownloaderTest.class })
public class AllTests {

}
