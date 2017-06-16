package com.ingenium.goby.budget;

import com.ingenium.goby.budget.extraction.BudgetLawCsvFilesDownloaderTest;
import com.ingenium.goby.budget.extraction.BudgetLawCsvFilesListExtractorTest;
import com.ingenium.goby.budget.extraction.BudgetLawExtractorTest;
import com.ingenium.goby.extractors.budget.elements.ClassifiersCatalogExtractorTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClassifiersCatalogExtractorTest.class,
    BudgetLawCsvFilesListExtractorTest.class,
    BudgetLawCsvFilesDownloaderTest.class, BudgetLawExtractorTest.class })
public class AllTests {

}
