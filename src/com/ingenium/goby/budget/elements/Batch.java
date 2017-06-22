/**
 * 
 */

package com.ingenium.goby.budget.elements;

import java.util.Collection;

/** 
 * <!-- begin-UML-doc -->
 * <p>Class that represents a budgetary batch.<br>@author JaimeRodrigo</p>
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_0uoWQFFmEeeK-J0N4T-kxQ"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_0uoWQFFmEeeK-J0N4T-kxQ"
 */
public class Batch extends CompositeBudgetElement {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param number
  * @param name
  * @param description
  * @param type
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_2xEAEFG-EeelKfiaecC7iA"
  */
  public Batch(int number, String name, String description,
      BudgetElementType type) {
    // begin-user-code
    super(number, name, description, type, BudgetHierarchyLevel.BATCH);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Adds a new assignment.</p>
  * <!-- end-UML-doc -->
  * @param chapterNumber
  * @param programNumber
  * @param subtitleNumber
  * @param itemNumber
  * @param assignment
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_pNlXgFG_EeelKfiaecC7iA"
  */
  public void addAssignment(int chapterNumber, int programNumber,
      int subtitleNumber, int itemNumber, Assignment assignment) {
    // begin-user-code
    Chapter chapter = this.getChapter(chapterNumber);
    chapter.addAssignment(programNumber, subtitleNumber, itemNumber,
        assignment);

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param chapterNumber
  * @param programNumber
  * @param subtitleNumber
  * @param itemNumber
  * @param assignmentNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_RBO2UFHBEeelKfiaecC7iA"
  */
  public Assignment getAssignment(int chapterNumber, int programNumber,
      int subtitleNumber, int itemNumber, int assignmentNumber) {
    // begin-user-code
    Chapter chapter = this.getChapter(chapterNumber);
    return chapter.getAssignment(programNumber, subtitleNumber, itemNumber,
        assignmentNumber);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param chapterNumber
  * @param programNumber
  * @param subtitleNumber
  * @param item
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_5ajYkFHDEeelKfiaecC7iA"
  */
  public void addItem(int chapterNumber, int programNumber, int subtitleNumber,
      Item item) {
    // begin-user-code
    Chapter chapter = this.getChapter(chapterNumber);
    chapter.addItem(programNumber, subtitleNumber, item);

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param chapterNumber
  * @param programNumber
  * @param subtitleNumber
  * @param itemNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_5ajYlFHDEeelKfiaecC7iA"
  */
  public Item getItem(int chapterNumber, int programNumber, int subtitleNumber,
      int itemNumber) {
    // begin-user-code
    Chapter chapter = this.getChapter(chapterNumber);
    return chapter.getItem(programNumber, subtitleNumber, itemNumber);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param chapterNumber
  * @param programNumber
  * @param subtitle
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_VoTAsFHEEeelKfiaecC7iA"
  */
  public void addSubtitle(int chapterNumber, int programNumber,
      Subtitle subtitle) {
    // begin-user-code
    Chapter chapter = this.getChapter(chapterNumber);
    chapter.addSubtitle(programNumber, subtitle);

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param chapterNumber
  * @param programNumber
  * @param subtitleNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_VoTnwFHEEeelKfiaecC7iA"
  */
  public Subtitle getSubtitle(int chapterNumber, int programNumber,
      int subtitleNumber) {
    // begin-user-code
    Chapter chapter = this.getChapter(chapterNumber);
    return chapter.getSubtitle(programNumber, subtitleNumber);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param chapterNumber
  * @param program
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_y2UaEFHEEeelKfiaecC7iA"
  */
  public void addProgram(int chapterNumber, Program program) {
    // begin-user-code
    Chapter chapter = this.getChapter(chapterNumber);
    chapter.addProgram(program);

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param chapterNumber
  * @param programNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_y2VBIFHEEeelKfiaecC7iA"
  */
  public Program getProgram(int chapterNumber, Integer programNumber) {
    // begin-user-code
    Chapter chapter = this.getChapter(chapterNumber);
    return chapter.getProgram(programNumber);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Rf9ncFHGEeelKfiaecC7iA"
  */
  @SuppressWarnings("unchecked")
  public Collection<Chapter> getChapters() {
    // begin-user-code
    return (Collection<Chapter>) getSubelements().values();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param chapters
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UNjPEFHGEeelKfiaecC7iA"
  */
  public void setChapters(Collection<Chapter> chapters) {
    // begin-user-code
    getSubelements().clear();
    super.setSubelements(chapters);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param chapter
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_eJpPUFHHEeelKfiaecC7iA"
  */
  public void addChapter(Chapter chapter) {
    // begin-user-code
    super.addSubelement(chapter);

    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param chapterNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_g9hsMFHHEeelKfiaecC7iA"
  */
  public Chapter getChapter(int chapterNumber) {
    // begin-user-code
    return (Chapter) super.getSubelement(chapterNumber);
    // end-user-code
  }
}