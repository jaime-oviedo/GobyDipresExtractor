/**
 *
 */

package com.ingenium.goby.budget.extractor.normalization;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 *
 * @author JaimeRodrigo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_95O2AGNsEeebmPnwD8r8OA"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_95O2AGNsEeebmPnwD8r8OA"
 */
public class BudgetExecutionCsvFileNormalizer {
  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc --> Crea una nueva instancia de la clase
   * BudgetExecutionCsvFileNormalizer.
   *
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_CU6-MGNtEeebmPnwD8r8OA"
   */
  private BudgetExecutionCsvFileNormalizer() {
    // begin-user-code
    // TODO Auto-generated constructor stub
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @param csvBudgetExecutionFile
   * @param destination
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_FYutcGNtEeebmPnwD8r8OA"
   */
  public static String normalize(String csvBudgetExecutionFile,
      String destination) {
    // begin-user-code
    // FileInputStream fi = new FileInputStream(csvBudgetExecutionFile);
    // InputStreamReader isr = new InputStreamReader(fi, "CP1250");
    // BufferedReader buffReader = new BufferedReader(isr);
    // CSVReader reader = new CSVReader(buffReader, ';', '"', 1);
    // String line[] = null;
    //
    // CSVWriter writer = new CSVWriter(new FileWriter(destination), ';',
    // CSVWriter.NO_QUOTE_CHARACTER);
    // writer.writeAll(csvEntries);
    return null;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc --> <!-- end-UML-doc -->
   *
   * @param csvBudgetExecutionFile
   * @return
   * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_TBCWMGNtEeebmPnwD8r8OA"
   */
  public static String normalize(String csvBudgetExecutionFile) {
    // begin-user-code
    // TODO Auto-generated method stub
    return null;
    // end-user-code
  }
}