package com.ingenium.goby.budget.extractor;

import com.ingenium.goby.budget.extractor.download.BudgetLawCsvFilesDownloaderTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClassifiersCatalogFactoryTest.class, BudgetLawFactoryTest.class,
    BudgetLawCsvFilesDownloaderTest.class })
public class AllTests {

}
