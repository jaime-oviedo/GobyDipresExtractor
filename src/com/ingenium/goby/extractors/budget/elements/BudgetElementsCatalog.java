
package com.ingenium.goby.extractors.budget.elements;

import java.util.Collection;

/**
 * <!-- begin-UML-doc -->
 * <p>
 * Represents a hierarchical catalog of budget elements.
 * </p>
 * <!-- end-UML-doc -->
 * 
 * @author joviedo
 * @uml.annotations derived_abstraction="platform:/resource/goby-design/elements.efx#_UXJ1MEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/elements.efx#_UXJ1MEquEeeJsdrfgQXeQw"
 */
public class BudgetElementsCatalog {

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Program element used to hold the elements of the catalog.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/elements.efx#_Ud4vUEquEeeJsdrfgQXeQw"
   */
  private Program root;

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Creates a new BudgetElementsCatalog.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @generated "sourceid:platform:/resource/goby-design/elements.efx#_Ud6kgEquEeeJsdrfgQXeQw"
   */
  public BudgetElementsCatalog() {
    // begin-user-code
    root = new Program(0, "Budget Classifiers Catalog",
        "This catalog contains the hierarchical structure of the budget classifier used in the Budget Law, including the name and description of each classifier, when relevant.",
        BudgetElementType.BUDGETARY_CLASSIFICATION);
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Adds a subtitle to the catalog.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @param subtitle
   *          <p>
   *          the subtitle id number
   *          </p>
   * @generated "sourceid:platform:/resource/goby-design/elements.efx#_Ud7yoEquEeeJsdrfgQXeQw"
   */
  public void addSubtitle(Subtitle subtitle) {
    // begin-user-code
    root.addSubtitle(subtitle);
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Adds an item to the catalog within the provided subtitle.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @param subtitleNumber
   *          <p>
   *          the subtitle id number
   *          </p>
   * @param item
   *          <p>
   *          the item id number
   *          </p>
   * @generated "sourceid:platform:/resource/goby-design/elements.efx#_Ud9AwEquEeeJsdrfgQXeQw"
   */
  public void addItem(Integer subtitleNumber, Item item) {
    // begin-user-code
    Subtitle s = root.getSubtitulo(subtitleNumber);
    if (s != null) {
      s.addItem(item);
    }
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Adds an assignment to the catalog within the provided subtitle and item.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @param subtitleNumber
   *          <p>
   *          the subtitle id number
   *          </p>
   * @param itemNumber
   *          <p>
   *          the item id number
   *          </p>
   * @param assignment
   *          <p>
   *          the assignment id number
   *          </p>
   * @generated "sourceid:platform:/resource/goby-design/elements.efx#_UeAEEEquEeeJsdrfgQXeQw"
   */
  public void addAssignment(Integer subtitleNumber, Integer itemNumber,
      Assignment assignment) {
    // begin-user-code
    Subtitle s = root.getSubtitulo(subtitleNumber);
    if (s != null) {
      Item item = s.getItem(itemNumber);
      if (item != null) {
        item.addAsignacion(assignment);
      }
    }
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Returns the subtitle identified by the provided number.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @param numero
   *          <p>
   *          the id of the subtitle
   *          </p>
   * @return
   *         <p>
   *         the subtitle identified by the provided number
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/elements.efx#_UeDHYEquEeeJsdrfgQXeQw"
   */
  public Subtitle getSubtitle(Integer numero) {
    // begin-user-code
    return root.getSubtitulo(numero);
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Returns the special root that holds the catalog's elements.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @return
   *         <p>
   *         the special root that holds the catalog's elements
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/elements.efx#_tThVoEt-EeeC6_ZX80x4yQ"
   */
  public Program getProgram() {
    // begin-user-code
    return root;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Sets the special root
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @param root
   * @generated "sourceid:platform:/resource/goby-design/elements.efx#_tTjK0Et-EeeC6_ZX80x4yQ"
   */
  public void setProgram(Program root) {
    // begin-user-code
    this.root = root;
    // end-user-code
  }

  /**
   * <!-- begin-UML-doc -->
   * <p>
   * Gets all the subtitles in the catalog.
   * </p>
   * <!-- end-UML-doc -->
   * 
   * @return
   *         <p>
   *         all the subtitles in the catalog
   *         </p>
   * @generated "sourceid:platform:/resource/goby-design/elements.efx#_UeEVgEquEeeJsdrfgQXeQw"
   */
  public Collection<Subtitle> getSubtitles() {
    // begin-user-code
    return root.getSubtitles();
    // end-user-code
  }

}
