/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/** 
 * <!-- begin-UML-doc -->
 * lase&nbsp;que&nbsp;representa&nbsp;el&nbsp;clasificador&nbsp;de&nbsp;item&nbsp;presupuestario.<br><br><br><br><br>@author&nbsp;JaimeRodrig
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UXEVoEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UXEVoEquEeeJsdrfgQXeQw"
 */
public final class Item extends CompositeBudgetElement {
  
  /** 
  * <!-- begin-UML-doc -->
  * rea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;Item.<br><br><br><br><br>@param&nbsp;numero<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br><br>@param&nbsp;nombre<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br><br>@param&nbsp;descripcion<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcio
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase Item.
  * @param number
  * @param name
  * @param description
  * @param type
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UbdGYEquEeeJsdrfgQXeQw"
  */
  public Item(int number, String name, String description,
      BudgetElementType type) {
    // begin-user-code
    super(number, name, description, type, BudgetHierarchyLevel.ITEM);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param assignment
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UbjNAEquEeeJsdrfgQXeQw"
  */
  public void addAssignment(Assignment assignment) {
    // begin-user-code
    super.addSubelement(assignment);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param assignmentNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UblCMEquEeeJsdrfgQXeQw"
  */
  public Assignment getAssignment(Integer assignmentNumber) {
    // begin-user-code
    return (Assignment) super.getSubelements().get(assignmentNumber);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * btiene&nbsp;las&nbsp;asigaciones&nbsp;correspondientes&nbsp;a&nbsp;este&nbsp;item.<br><br><br><br><br>@return&nbsp;las&nbsp;asigaciones&nbsp;correspondientes&nbsp;a&nbsp;este&nbsp;ite
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UbnecEquEeeJsdrfgQXeQw"
  */
  public Collection<Assignment> getAssignments() {
    // begin-user-code
    Iterator<BudgetElement> it = getSubelements().values().iterator();
    Collection<Assignment> assignments = new ArrayList<>();
    while (it.hasNext()) {
      Assignment assignment = (Assignment) it.next();
      assignments.add(assignment);
    }
    return assignments;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * stablece&nbsp;las&nbsp;asignaciones&nbsp;para&nbsp;el&nbsp;item.<br><br><br><br><br>@param&nbsp;asignaciones<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;nuevo&nbsp;conjunto&nbsp;de&nbsp;asignacione
  * <!-- end-UML-doc -->
  * @param assignments
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uc87MEquEeeJsdrfgQXeQw"
  */
  public void setAssignments(Collection<Assignment> assignments) {
    // begin-user-code
    Collection<BudgetElement> classifiers = new ArrayList<>();
    Iterator<Assignment> it = assignments.iterator();
    while (it.hasNext()) {
      classifiers.add(it.next());
    }
    super.setSubelements(classifiers);
    // end-user-code
  }
  
}
