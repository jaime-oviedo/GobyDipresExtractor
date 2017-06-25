package com.ingenium.goby.budget;

import com.ingenium.goby.budget.extraction.BudgetLawCsvFilesDownloaderTest;
import com.ingenium.goby.budget.extraction.BudgetLawCsvFilesListExtractorTest;
import com.ingenium.goby.budget.extraction.BudgetLawExtractorTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClassifiersCatalogFactoryTest.class,
    BudgetLawCsvFilesListExtractorTest.class,
    BudgetLawCsvFilesDownloaderTest.class, BudgetLawExtractorTest.class })
public class AllTests {

}
