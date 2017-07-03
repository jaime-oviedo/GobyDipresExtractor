package com.ingenium.goby.budget.extractor;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClassifiersCatalogFactoryTest.class,
    InstitutionsCatalogFactoryTest.class, BudgetLawFactoryTest.class })
public class AllLocalTests {

}
