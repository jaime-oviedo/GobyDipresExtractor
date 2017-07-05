package com.ingenium.goby.budget.extractor;

import com.ingenium.goby.budget.extractor.download.BudgetCsvFilesDownloaderTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClassifiersCatalogFactoryTest.class, BudgetLawFactoryTest.class,
    BudgetCsvFilesDownloaderTest.class })
public class AllTests {

}
