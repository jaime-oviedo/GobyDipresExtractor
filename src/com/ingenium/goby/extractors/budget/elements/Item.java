/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.extractors.budget.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/** 
 * <!-- begin-UML-doc -->
 * lase&nbsp;que&nbsp;representa&nbsp;el&nbsp;clasificador&nbsp;de&nbsp;item&nbsp;presupuestario.<br><br><br><br><br>@author&nbsp;JaimeRodrig
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UXEVoEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UXEVoEquEeeJsdrfgQXeQw"
 */
public final class Item extends CompositeBudgetElement {

  /** 
  * <!-- begin-UML-doc -->
  * rea&nbsp;una&nbsp;nueva&nbsp;instancia&nbsp;de&nbsp;la&nbsp;clase&nbsp;Item.<br><br><br><br><br>@param&nbsp;numero<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;numero<br><br>@param&nbsp;nombre<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;nombre<br><br>@param&nbsp;descripcion<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;valor&nbsp;del&nbsp;campo&nbsp;descripcio
  * <!-- end-UML-doc -->
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
  public void addAsignacion(Assignment assignment) {
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
  public Assignment getAsignacion(Integer assignmentNumber) {
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
  public Collection<Assignment> getAsignaciones() {
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
  public void setAsignaciones(Collection<Assignment> assignments) {
    // begin-user-code
    Collection<BudgetElement> classifiers = new ArrayList<>();
    Iterator<Assignment> it = assignments.iterator();
    while (it.hasNext()) {
      classifiers.add(it.next());
    }
    super.setSubelements(classifiers);
    // end-user-code
  }

  // /**
  // * <!-- begin-UML-doc -->
  // * <!-- end-UML-doc -->
  // * @param nestingLevel
  // * @return
  // * @generated
  // "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uc_XcEquEeeJsdrfgQXeQw"
  // */
  // @Override
  // public String toJsonString(int nestingLevel) {
  // // begin-user-code
  // StringBuilder nesting = new StringBuilder();
  // for (int i = 0; i < nestingLevel; i++) {
  // nesting.append(" ");
  // }
  //
  // StringBuilder sb = new StringBuilder(nesting);
  // sb.append("{\n");
  // nesting.append(" ");
  // String q = "\"";
  // sb.append(nesting).append(q + "number" + q + ":" + getNumber() + ",\n");
  // sb.append(nesting).append(q + "name" + q + ":" + q + getName() + q + ",\n");
  // sb.append(nesting)
  // .append(q + "description" + q + ":" + q + getDescription() + q);
  //
  // if (getAsignaciones().size() > 0) {
  // sb.append(",\n");
  // sb.append(nesting).append(q + "assignments" + q + ":[ \n");
  // Iterator<Assignment> i = getAsignaciones().iterator();
  // while (i.hasNext()) {
  // Assignment assignment = i.next();
  // sb.append(assignment.toJsonString(nestingLevel + 2));
  // if (i.hasNext()) {
  // sb.append(",\n");
  // } else {
  // sb.append("\n");
  // }
  // }
  // sb.append(nesting).append("]\n");
  // } else {
  // sb.append("\n");
  // }
  // nesting.delete(nesting.length() - 2, nesting.length());
  // sb.append(nesting).append("}");
  // return sb.toString();
  // // end-user-code
  // }
}
