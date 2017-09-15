/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.crawl;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.ingenium.goby.budget.extractor.model.ExecutionPeriod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_bPdhEF5HEeeguv5GRmiMJw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_bPdhEF5HEeeguv5GRmiMJw"
 */
public class BudgetExecutionCrawler {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_3sGrYF5IEeeguv5GRmiMJw"
  */
  static final Logger log = Logger.getLogger(
      "com.ingenium.goby.budget.extractor.crawl.BudgetExecutionCrawler");
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_GOL0wF5JEeeguv5GRmiMJw"
  */
  private String budgetDirectorateWebsiteUrl = "http://www.dipres.gob.cl";
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_3aiXoGEkEeeMhLKRNTgRlA"
  */
  private List<String> executionFilesList;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_5nW0gGEkEeeMhLKRNTgRlA"
  */
  private String budgetExecutionFilesBaseUrl;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class BudgetExecutionCrawler.
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_iI3o4F5HEeeguv5GRmiMJw"
  */
  public BudgetExecutionCrawler() {
    // begin-user-code
    super();
    executionFilesList = new ArrayList<>();
    budgetExecutionFilesBaseUrl = null;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param year
  * @param executionPeriod
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_pCoWAF5HEeeguv5GRmiMJw"
  */
  public List<String> crawlAndFetchExecutionFilesList(final int year,
      final ExecutionPeriod executionPeriod) {
    // begin-user-code
    final WebClient webClient = new WebClient(BrowserVersion.BEST_SUPPORTED);
    webClient.getOptions().setCssEnabled(false);
    webClient.getOptions().setJavaScriptEnabled(false);
    List<String> executionFiles = new ArrayList<>(300);
    boolean trouble = false;
    
    // Get the main page
    HtmlPage mainPage = null;
    try {
      mainPage = webClient.getPage(budgetDirectorateWebsiteUrl);
      
      // Travel to budget page
      final String budgetPageURL = new StringBuilder("Presupuesto ")
          .append(String.valueOf(year)).append(" (en ejecución)").toString();
      
      HtmlAnchor anchor = mainPage.getAnchorByText(budgetPageURL);
      HtmlPage budgetPage = null;
      budgetPage = anchor.click();
      
      if ((budgetPage == null) || trouble) {
        BudgetExecutionCrawler.log
            .severe("Unable to fetch current budget page");
        webClient.close();
        return executionFiles;
      }
      
      // Travel to Budget by Programs page
      
      anchor = budgetPage.getAnchorByText("Resumen Presupuesto de Programas");
      
      HtmlPage programLevelBudgetPage = null;
      
      programLevelBudgetPage = anchor.click();
      
      if ((programLevelBudgetPage == null) || trouble) {
        BudgetExecutionCrawler.log
            .severe("Unable to fetch current budget page");
        webClient.close();
        return executionFiles;
      }
      
      // If the page is not null, we are at the budget law level, now we need to find the
      // execution-specific anchor
      
      // Travel to Budget Execution by Programs page
      
      anchor = programLevelBudgetPage
          .getAnchorByText("Informe Ejecución Programa");
      HtmlPage programLevelBudgetExecutionPage = null;
      
      programLevelBudgetExecutionPage = anchor.click();
      
      // We should be at the page of the current year, let's click on the specific year number just
      // to be sure.
      
      anchor = programLevelBudgetExecutionPage
          .getAnchorByText(String.valueOf(year));
      HtmlPage programLevelBudgetExecutionYearPage = null;
      programLevelBudgetExecutionYearPage = anchor.click();
      
      if (programLevelBudgetExecutionYearPage != null) {
        final String baseUri = programLevelBudgetExecutionYearPage.getBaseURI();
        final String fileName = FilenameUtils.getName(baseUri);
        budgetExecutionFilesBaseUrl = StringUtils
            .chop(baseUri.replace(fileName, ""));
        
        // Everything went OK, so now we extract the file list
        
        executionFiles = extractExecutionFilesList(
            programLevelBudgetExecutionYearPage, executionPeriod);
      }
      
    } catch (final IOException e) {
      BudgetExecutionCrawler.log
          .severe("Unable to navigate to budget execution details");
      BudgetExecutionCrawler.log.finer(e.getMessage());
      trouble = true;
    }
    
    webClient.close();
    return executionFiles;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * @param&nbsp;element<br>@return
  * <!-- end-UML-doc -->
  * @param element
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_XC2XsmCtEeeyf97XDVaBvw"
  */
  ExecutionPeriod determineExecutionPeriod(final HtmlElement element) {
    // begin-user-code
    final String divText = element.getTextContent();
    ExecutionPeriod executionPeriod = ExecutionPeriod.JANUARY;
    if (divText.contains("Enero")) {
      executionPeriod = ExecutionPeriod.JANUARY;
      ;
    }
    if (divText.contains("Febrero")) {
      executionPeriod = ExecutionPeriod.FEBRUARY;
    }
    if (divText.contains("Primer Trimestre")) {
      executionPeriod = ExecutionPeriod.FIRST_TRIMESTER;
    }
    if (divText.contains("Abril")) {
      executionPeriod = ExecutionPeriod.APRIL;
    }
    if (divText.contains("Mayo")) {
      executionPeriod = ExecutionPeriod.MAY;
    }
    if (divText.contains("Segundo Trimestre")) {
      executionPeriod = ExecutionPeriod.SECOND_TRIMESTER;
    }
    if (divText.contains("Julio")) {
      executionPeriod = ExecutionPeriod.JULY;
    }
    if (divText.contains("Agosto")) {
      executionPeriod = ExecutionPeriod.AUGUST;
    }
    if (divText.contains("Tercer Trimestre")) {
      executionPeriod = ExecutionPeriod.THIRD_TRIMESTER;
    }
    if (divText.contains("Octubre")) {
      executionPeriod = ExecutionPeriod.OCTOBER;
    }
    if (divText.contains("Noviembre")) {
      executionPeriod = ExecutionPeriod.NOVEMBER;
    }
    if (divText.contains("Cuarto Trimestre")) {
      executionPeriod = ExecutionPeriod.FOURTH_TRIMESTER;
    }
    return executionPeriod;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * @param&nbsp;programLevelBudgetExecutionYearPage
  * <!-- end-UML-doc -->
  * @param programLevelBudgetExecutionYearPage
  * @param executionPeriod
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_mVqTUWAREeefXZqJOyM9_Q"
  */
  List<String> extractExecutionFilesList(
      final HtmlPage programLevelBudgetExecutionYearPage,
      final ExecutionPeriod executionPeriod) {
    // begin-user-code
    
    // Get all divs
    final DomNodeList<DomElement> divTags = programLevelBudgetExecutionYearPage
        .getElementsByTagName("div");
    
    // Keep only divs of class recuadro
    final List<DomElement> recuadroDivTags = new ArrayList<>(400);
    for (final DomElement divTag : divTags) {
      if (divTag.getAttribute("class").equals("recuadro")) {
        recuadroDivTags.add(divTag);
      }
    }
    
    // Each recuadro should have exactly one div tag where the execution period can be identified.
    
    final Iterator<DomElement> i = recuadroDivTags.iterator();
    final DomElement sampleRecuadroDiv = i.next();
    final DomNodeList<HtmlElement> sampleRecuadroInnerDivs = sampleRecuadroDiv
        .getElementsByTagName("div");
    if (sampleRecuadroInnerDivs.size() > 1) {
      BudgetExecutionCrawler.log.warning(
          "The structure of a budget execution html div section is not as expected, the maximum execution period may be extracted incorrectly");
    }
    
    // Go through every recuadro div, extracting only the ones matching the period requested
    
    final List<DomElement> matchingDivs = new ArrayList<>(300);
    for (final DomElement recuadroDivTag : recuadroDivTags) {
      final Iterator<HtmlElement> recuadroIterator = recuadroDivTag
          .getElementsByTagName("div").iterator();
      final HtmlElement innerDiv = recuadroIterator.next();
      if (innerDiv == null) {
        BudgetExecutionCrawler.log.warning(
            "The structure of a budget execution html div section is not as expected, the maximum execution period may be extracted incorrectly");
        continue;
      }
      final ExecutionPeriod recuadroPeriod = determineExecutionPeriod(innerDiv);
      if (recuadroPeriod == executionPeriod) {
        matchingDivs.add(recuadroDivTag);
      }
    }
    
    final List<String> executionFiles = new ArrayList<>(300);
    for (final DomElement matchingDiv : matchingDivs) {
      final String csvFileUrl = getCsvFileUrl(matchingDiv);
      if (csvFileUrl != null) {
        executionFiles.add(csvFileUrl);
      }
    }
    
    return executionFiles;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_SzRDUGElEeeMhLKRNTgRlA"
  */
  public String getBudgetExecutionFilesBaseUrl() {
    // begin-user-code
    return budgetExecutionFilesBaseUrl;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param recuadroDivTag
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_XC3l0WCtEeeyf97XDVaBvw"
  */
  private String getCsvFileUrl(final DomElement recuadroDivTag) {
    // begin-user-code
    if (recuadroDivTag == null) {
      return "";
    }
    String url = null;
    String tmpUrl = null;
    final DomNodeList<HtmlElement> anchors = recuadroDivTag
        .getElementsByTagName("a");
    for (final HtmlElement anchor : anchors) {
      if (anchor instanceof HtmlAnchor) {
        final HtmlAnchor htmlAnchor = (HtmlAnchor) anchor;
        final String hrefAttribute = htmlAnchor.getHrefAttribute();
        BudgetExecutionCrawler.log.finest(
            new StringBuilder("Got href:").append(hrefAttribute).toString());
        tmpUrl = hrefAttribute.toString();
        if (tmpUrl.contains(".csv")) {
          url = tmpUrl;
        }
      }
      
    }
    return url;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_atThsGElEeeMhLKRNTgRlA"
  */
  public List<String> getExecutionFilesList() {
    // begin-user-code
    return executionFilesList;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param url
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_OAjiQGElEeeMhLKRNTgRlA"
  */
  public void setBudgetExecutionFilesBaseUrl(final String url) {
    // begin-user-code
    budgetExecutionFilesBaseUrl = url;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param list
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_VbBvwGElEeeMhLKRNTgRlA"
  */
  public void setExecutionFilesList(final List<String> list) {
    // begin-user-code
    executionFilesList = list;
    
    // end-user-code
  }
}