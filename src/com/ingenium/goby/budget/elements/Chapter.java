/**
 * 
 */

package com.ingenium.goby.budget.elements;

import java.util.Collection;

/** 
 * <!-- begin-UML-doc -->
 * <p>Class that represents a budgetary chapter.<br>@author JaimeOviedo</p>
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_0D1s0FFmEeeK-J0N4T-kxQ"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0D1s0FFmEeeK-J0N4T-kxQ"
 */
public class Chapter extends CompositeBudgetElement {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param number
  * @param name
  * @param description
  * @param type
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_8mFSsFG-EeelKfiaecC7iA"
  */
  public Chapter(int number, String name, String description,
      BudgetElementType type) {
    // begin-user-code
    super(number, name, description, type, BudgetHierarchyLevel.CHAPTER);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Adds a new assignment.</p>
  * <!-- end-UML-doc -->
  * @param programNumber
  * @param subtitleNumber
  * @param itemNumber
  * @param assignment
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_VVGxMFG_EeelKfiaecC7iA"
  */
  public void addAssignment(int programNumber, int subtitleNumber,
      int itemNumber, Assignment assignment) {
    // begin-user-code
    Program program = this.getProgram(programNumber);
    program.addAssignment(subtitleNumber, itemNumber, assignment);

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param programNumber
  * @param subtitleNumber
  * @param itemNumber
  * @param assignmentNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_FwIVgFHBEeelKfiaecC7iA"
  */
  public Assignment getAssignment(int programNumber, int subtitleNumber,
      int itemNumber, int assignmentNumber) {
    // begin-user-code
    Program program = this.getProgram(programNumber);
    return program.getAssignment(subtitleNumber, itemNumber, assignmentNumber);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param programNumber
  * @param subtitleNumber
  * @param item
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_sAqmUFHDEeelKfiaecC7iA"
  */
  public void addItem(int programNumber, int subtitleNumber, Item item) {
    // begin-user-code
    Program program = this.getProgram(programNumber);
    program.addItem(subtitleNumber, item);

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param programNumber
  * @param subtitleNumber
  * @param itemNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_sAqmU1HDEeelKfiaecC7iA"
  */
  public Item getItem(int programNumber, int subtitleNumber, int itemNumber) {
    // begin-user-code
    Program program = this.getProgram(programNumber);
    return program.getItem(subtitleNumber, itemNumber);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param programNumber
  * @param subtitle
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_HRQCoFHEEeelKfiaecC7iA"
  */
  public void addSubtitle(int programNumber, Subtitle subtitle) {
    // begin-user-code
    Program program = this.getProgram(programNumber);
    program.addSubtitle(subtitle);

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param programNumber
  * @param subtitleNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_HRQpsFHEEeelKfiaecC7iA"
  */
  public Subtitle getSubtitle(int programNumber, int subtitleNumber) {
    // begin-user-code
    Program program = this.getProgram(programNumber);
    return program.getSubtitle(subtitleNumber);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param program
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_moiOkFHEEeelKfiaecC7iA"
  */
  public void addProgram(Program program) {
    // begin-user-code
    super.addSubelement(program);

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param programNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_tutnEFHEEeelKfiaecC7iA"
  */
  public Program getProgram(int programNumber) {
    // begin-user-code
    return (Program) super.getSubelement(programNumber);

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_en4VYFHFEeelKfiaecC7iA"
  */
  @SuppressWarnings("unchecked")
  public Collection<Program> getPrograms() {
    // begin-user-code
    return (Collection<Program>) super.getSubelements();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param programs
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_L3I9wFHGEeelKfiaecC7iA"
  */
  public void setPrograms(Collection<Program> programs) {
    // begin-user-code
    super.setSubelements(programs);
    // end-user-code
  }
}