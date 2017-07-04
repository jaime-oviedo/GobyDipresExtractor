/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.extraction.crawl;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 *
 * @author JaimeRodrigo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_bPdhEF5HEeeguv5GRmiMJw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_bPdhEF5HEeeguv5GRmiMJw"
 */
public class BudgetExecutionCrawler {
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @author JaimeRodrigo
   * @uml.annotations derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_S4b_gF9qEeeRDb5hxZnsBw"
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_S4b_gF9qEeeRDb5hxZnsBw?DATATYPE"
   */
  public enum ExecutionPeriod {
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oyxI0F9qEeeRDb5hxZnsBw"
     */
    JANUARY,
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qb9UMF9qEeeRDb5hxZnsBw"
     */
    FEBRUARY,
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_jw5U8F9rEeeRDb5hxZnsBw"
     */
    FIRST_TRIMESTER,
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_lWKpoF9rEeeRDb5hxZnsBw"
     */
    APRIL,
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_mk5GkF9rEeeRDb5hxZnsBw"
     */
    MAY,
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_nU5nMF9rEeeRDb5hxZnsBw"
     */
    SECOND_TRIMESTER,
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_o0HXMF9rEeeRDb5hxZnsBw"
     */
    JULY,
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_p7BU4F9rEeeRDb5hxZnsBw"
     */
    AUGUST,
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_qpkc8F9rEeeRDb5hxZnsBw"
     */
    THIRD_TRIMESTER,
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_rnrD8F9rEeeRDb5hxZnsBw"
     */
    OCTOBER,
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_tCLTEF9rEeeRDb5hxZnsBw"
     */
    NOVEMBER,
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_uj6yoF9rEeeRDb5hxZnsBw"
     */
    FOURTH_TRIMESTER
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_vr2swF5HEeeguv5GRmiMJw"
   */
  private List<List<String>> keywordsGroups;

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_3sGrYF5IEeeguv5GRmiMJw"
   */
  static final Logger log = Logger.getLogger(
      "com.ingenium.goby.budget.extractor.extraction.crawl.BudgetExecutionCrawler");

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_GOL0wF5JEeeguv5GRmiMJw"
   */
  private String budgetDirectorateWebsiteUrl = "http://www.dipres.gob.cl";

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc --> Crea una nueva instancia de la clase
   * BudgetExecutionCrawler.
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_iI3o4F5HEeeguv5GRmiMJw"
   */
  public BudgetExecutionCrawler() {
    // begin-user-code
    keywordsGroups = new ArrayList<>(10);
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @param year
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_pCoWAF5HEeeguv5GRmiMJw"
   */
  public List<String> findExecutionFiles(int year, int executionPeriod) {
    // begin-user-code
    final WebClient webClient = new WebClient();
    HtmlPage mainPage = null;
    try {
      mainPage = webClient.getPage(budgetDirectorateWebsiteUrl);
    } catch (FailingHttpStatusCodeException | IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    String budgetPageURL = new StringBuffer("Presupuesto ")
        .append(String.valueOf(year)).append(" (en ejecución)").toString();

    HtmlAnchor anchor = mainPage.getAnchorByText(budgetPageURL);
    HtmlPage budgetPage = null;
    try {
      budgetPage = anchor.click();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    anchor = budgetPage.getAnchorByText("Resumen Presupuesto de Programas");

    HtmlPage programLevelBudgetPage = null;
    try {
      programLevelBudgetPage = anchor.click();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    // If the page is not null, we are at the budget law level, now we need to find the
    // execution-specific anchor
    anchor = programLevelBudgetPage
        .getAnchorByText("Informe Ejecución Programa");
    HtmlPage programLevelBudgetExecutionPage = null;
    try {
      programLevelBudgetExecutionPage = anchor.click();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    // We should be at the page of the current year, let's click on the specific year number just to
    // be sure.

    anchor = programLevelBudgetExecutionPage
        .getAnchorByText(String.valueOf(year));
    HtmlPage programLevelBudgetExecutionYearPage = null;
    try {
      programLevelBudgetExecutionYearPage = anchor.click();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    if (programLevelBudgetExecutionYearPage != null) {
      extractExecutionCsvFilesUrls(programLevelBudgetExecutionYearPage,
          executionPeriod);
    }

    webClient.close();
    return null;
    // end-user-code
  }

  /**
   * @param programLevelBudgetExecutionYearPage
   */
  List<String> extractExecutionCsvFilesUrls(
      HtmlPage programLevelBudgetExecutionYearPage, int executionPeriod) {

    // Get all divs
    DomNodeList<DomElement> divTags = programLevelBudgetExecutionYearPage
        .getElementsByTagName("div");

    // Keep only divs of class recuadro
    List<DomElement> recuadroDivTags = new ArrayList<>(400);
    for (DomElement divTag : divTags) {
      if (divTag.getAttribute("class").equals("recuadro")) {
        recuadroDivTags.add(divTag);
      }
    }

    // Each recuadro should have exactly one div tag where the execution period can be identified.

    Iterator<DomElement> i = recuadroDivTags.iterator();
    DomElement sampleRecuadroDiv = i.next();
    DomNodeList<HtmlElement> sampleRecuadroInnerDivs = sampleRecuadroDiv
        .getElementsByTagName("div");
    if (sampleRecuadroInnerDivs.size() > 1) {
      BudgetExecutionCrawler.log.warning(
          "The structure of a budget execution html div section is not as expected, the maximum execution period may be extracted incorrectly");
    }

    // Go through every recuadro div, extracting only the ones matching the period requested

    List<DomElement> matchingDivs = new ArrayList<>(300);
    for (DomElement recuadroDivTag : recuadroDivTags) {
      Iterator<HtmlElement> recuadroIterator = recuadroDivTag
          .getElementsByTagName("div").iterator();
      HtmlElement innerDiv = recuadroIterator.next();
      if (innerDiv == null) {
        BudgetExecutionCrawler.log.warning(
            "The structure of a budget execution html div section is not as expected, the maximum execution period may be extracted incorrectly");
        continue;
      }
      int recuadroPeriod = determineMaxExecutionPeriodAvailable(innerDiv);
      if (recuadroPeriod == executionPeriod) {
        matchingDivs.add(recuadroDivTag);
      }
    }

    List<String> executionFiles = new ArrayList<>(300);
    for (DomElement matchingDiv : matchingDivs) {
      String csvFileUrl = getCsvFileUrl(matchingDiv);
      if (csvFileUrl != null) {
        executionFiles.add(csvFileUrl);
      }
    }

    return executionFiles;
  }

  /**
   * @param element
   * @return
   */
  int determineMaxExecutionPeriodAvailable(HtmlElement element) {
    String divText = element.getTextContent();
    int maxExecutionPeriodAvailable = 0;
    if (divText.contains("Enero")) {
      maxExecutionPeriodAvailable = Calendar.JANUARY;
    }
    if (divText.contains("Febrero")) {
      maxExecutionPeriodAvailable = Calendar.FEBRUARY;
    }
    if (divText.contains("Primer Trimestre")) {
      maxExecutionPeriodAvailable = Calendar.MARCH;
    }
    if (divText.contains("Abril")) {
      maxExecutionPeriodAvailable = Calendar.APRIL;
    }
    if (divText.contains("Mayo")) {
      maxExecutionPeriodAvailable = Calendar.MAY;
    }
    if (divText.contains("Segundo Trimestre")) {
      maxExecutionPeriodAvailable = Calendar.JUNE;
    }
    if (divText.contains("Julio")) {
      maxExecutionPeriodAvailable = Calendar.JULY;
    }
    if (divText.contains("Agosto")) {
      maxExecutionPeriodAvailable = Calendar.AUGUST;
    }
    if (divText.contains("Tercer Trimestre")) {
      maxExecutionPeriodAvailable = Calendar.SEPTEMBER;
    }
    if (divText.contains("Octubre")) {
      maxExecutionPeriodAvailable = Calendar.OCTOBER;
    }
    if (divText.contains("Noviembre")) {
      maxExecutionPeriodAvailable = Calendar.NOVEMBER;
    }
    if (divText.contains("Cuarto Trimestre")) {
      maxExecutionPeriodAvailable = Calendar.DECEMBER;
    }
    return maxExecutionPeriodAvailable;
  }

  private String getCsvFileUrl(DomElement recuadroDivTag) {
    if (recuadroDivTag == null) {
      return "";
    }
    String url = null;
    String tmpUrl = null;
    DomNodeList<HtmlElement> anchors = recuadroDivTag.getElementsByTagName("a");
    for (HtmlElement anchor : anchors) {
      tmpUrl = anchor.getAttribute("href");
      if (tmpUrl.contains(".csv")) {
        url = tmpUrl;
      }
    }
    return url;
  }
}