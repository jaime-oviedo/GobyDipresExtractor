
package com.ingenium.goby.budget.extractor.model;

import java.util.Collection;

/** 
 * <!-- begin-UML-doc -->
 * <p>Class that represents a budgetary program.<br>@author JaimeOviedo</p>
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_UasRYEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UasRYEquEeeJsdrfgQXeQw"
 */
public class Program extends CompositeBudgetElement {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param number
  * @param name
  * @param description
  * @param type
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UiydcEquEeeJsdrfgQXeQw"
  */
  public Program(int number, String name, String description,
      BudgetElementType type) {
    // begin-user-code
    super(number, name, description, type, BudgetHierarchyLevel.PROGRAM);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Adds a new assignment.</p>
  * <!-- end-UML-doc -->
  * @param subtitleNumber
  * @param itemNumber
  * @param assignment
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_olpyQFFmEeeK-J0N4T-kxQ"
  */
  public void addAssignment(int subtitleNumber, int itemNumber,
      Assignment assignment) {
    // begin-user-code
    Subtitle subtitle = (Subtitle) getSubelement(subtitleNumber);
    subtitle.addAssignment(itemNumber, assignment);

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param subtitleNumber
  * @param itemNumber
  * @param assignmentNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_p-97sFHAEeelKfiaecC7iA"
  */
  public Assignment getAssignment(int subtitleNumber, int itemNumber,
      int assignmentNumber) {
    // begin-user-code
    Subtitle subtitle = (Subtitle) getSubelement(subtitleNumber);
    return subtitle.getAssignment(itemNumber, assignmentNumber);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param subtitleNumber
  * @param item
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_HoEkAFHAEeelKfiaecC7iA"
  */
  public void addItem(int subtitleNumber, Item item) {
    // begin-user-code
    Subtitle subtitle = (Subtitle) getSubelement(subtitleNumber);
    subtitle.addItem(item);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param subtitleNumber
  * @param itemNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_-hBf8FG_EeelKfiaecC7iA"
  */
  public Item getItem(int subtitleNumber, int itemNumber) {
    // begin-user-code
    Subtitle subtitle = (Subtitle) getSubelement(subtitleNumber);
    return subtitle.getItem(itemNumber);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param subtitle
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Ui0SoEquEeeJsdrfgQXeQw"
  */
  public void addSubtitle(Subtitle subtitle) {
    // begin-user-code
    super.addSubelement(subtitle);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param subtitleNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Ui1gwEquEeeJsdrfgQXeQw"
  */
  public Subtitle getSubtitle(int subtitleNumber) {
    // begin-user-code
    return (Subtitle) super.getSubelements().get(subtitleNumber);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Retorna&nbsp;los&nbsp;subtitulos&nbsp;asociados&nbsp;al&nbsp;programa.<br><br><br><br><br>@return&nbsp;los&nbsp;subtitulos&nbsp;asociados&nbsp;al&nbsp;program
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Ui3V8EquEeeJsdrfgQXeQw"
  */
  @SuppressWarnings("unchecked")
  public Collection<Subtitle> getSubtitles() {
    // begin-user-code
    return (Collection<Subtitle>) super.getSubelements().values();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * stablece&nbsp;los&nbsp;subtitulos&nbsp;para&nbsp;el&nbsp;programa.<br><br><br><br>@param&nbsp;subtitulos<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;nuevo&nbsp;conjunto&nbsp;de&nbsp;subtitulos<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  * <!-- end-UML-doc -->
  * @param subtitles
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Ui5yMEquEeeJsdrfgQXeQw"
  */
  public void setSubtitles(Collection<Subtitle> subtitles) {
    // begin-user-code
    super.setSubelements(subtitles);
    // end-user-code
  }
}
