
package com.ingenium.goby.budget.extractor.model;

import java.util.Collection;

/** 
 * <!-- begin-UML-doc -->
 * <p>Class that represents a budgetary subtitle.<br>@author JaimeOviedo</p>
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_Uawi0EquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Uawi0EquEeeJsdrfgQXeQw"
 */
public class Subtitle extends CompositeBudgetElement {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class Subtitle.
  * @param number
  * @param name
  * @param description
  * @param type
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UjSMsEquEeeJsdrfgQXeQw"
  */
  public Subtitle(int number, String name, String description,
      BudgetElementType type) {
    // begin-user-code
    super(number, name, description, type, BudgetHierarchyLevel.SUBTITLE);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <p>Adds a new assignment.</p>
  * <!-- end-UML-doc -->
  * @param itemNumber
  * @param assignment
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_ZvIp8FFmEeeK-J0N4T-kxQ"
  */
  public void addAssignment(int itemNumber, Assignment assignment) {
    // begin-user-code
    Item item = (Item) getSubelement(itemNumber);
    item.addAssignment(assignment);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param itemNumber
  * @param assignmentNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_SGtGEFHAEeelKfiaecC7iA"
  */
  public Assignment getAssignment(int itemNumber, int assignmentNumber) {
    // begin-user-code
    Item item = (Item) getSubelement(itemNumber);
    return item.getAssignment(assignmentNumber);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param item
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UjUo8EquEeeJsdrfgQXeQw"
  */
  public void addItem(Item item) {
    // begin-user-code
    super.addSubelement(item);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param itemNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UjV3EEquEeeJsdrfgQXeQw"
  */
  public Item getItem(int itemNumber) {
    // begin-user-code
    return (Item) super.getSubelements().get(itemNumber);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * etorna&nbsp;los&nbsp;items&nbsp;asociados&nbsp;al&nbsp;subtitulo.<br><br><br><br><br>@return&nbsp;los&nbsp;items&nbsp;asociados&nbsp;al&nbsp;subtitul
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UjXFMEquEeeJsdrfgQXeQw"
  */
  @SuppressWarnings("unchecked")
  public Collection<Item> getItems() {
    // begin-user-code
    return (Collection<Item>) super.getSubelements().values();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * stablece&nbsp;los&nbsp;items&nbsp;para&nbsp;la&nbsp;asignacion.<br><br><br><br>@param&nbsp;items<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;nuevo&nbsp;conjunto&nbsp;de&nbsp;asignaciones<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  * <!-- end-UML-doc -->
  * @param items
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_UjZhcEquEeeJsdrfgQXeQw"
  */
  public void setItems(Collection<Item> items) {
    // begin-user-code
    super.setSubelements(items);
    // end-user-code
  }
  
}
