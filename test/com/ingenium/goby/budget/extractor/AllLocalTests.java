package com.ingenium.goby.budget.extractor;

import com.ingenium.goby.budget.extractor.factory.BudgetLawFactoryTest;
import com.ingenium.goby.budget.extractor.factory.ClassifiersCatalogFactoryTest;
import com.ingenium.goby.budget.extractor.factory.InstitutionsCatalogFactoryTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClassifiersCatalogFactoryTest.class,
    InstitutionsCatalogFactoryTest.class, BudgetLawFactoryTest.class })
public class AllLocalTests {

}
