
package com.ingenium.goby.extractors.budget.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_Uawi0EquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Uawi0EquEeeJsdrfgQXeQw"
 */
public class Subtitle extends CompositeBudgetElement {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase Subtitle.
  * @param number
  * @param name
  * @param description
  * @param type
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjSMsEquEeeJsdrfgQXeQw"
  */
  public Subtitle(int number, String name, String description,
      BudgetElementType type) {
    // begin-user-code
    super(number, name, description, type, BudgetHierarchyLevel.SUBTITLE);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param item
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjUo8EquEeeJsdrfgQXeQw"
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
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjV3EEquEeeJsdrfgQXeQw"
  */
  public Item getItem(Integer itemNumber) {
    // begin-user-code
    return (Item) super.getSubelements().get(itemNumber);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * etorna&nbsp;los&nbsp;items&nbsp;asociados&nbsp;al&nbsp;subtitulo.<br><br><br><br><br>@return&nbsp;los&nbsp;items&nbsp;asociados&nbsp;al&nbsp;subtitul
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjXFMEquEeeJsdrfgQXeQw"
  */
  public Collection<Item> getItems() {
    // begin-user-code
    Iterator<BudgetElement> it = getSubelements().values().iterator();
    Collection<Item> items = new ArrayList<>();
    while (it.hasNext()) {
      Item item = (Item) it.next();
      items.add(item);
    }
    return items;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * stablece&nbsp;los&nbsp;items&nbsp;para&nbsp;la&nbsp;asignacion.<br><br><br><br>@param&nbsp;items<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;nuevo&nbsp;conjunto&nbsp;de&nbsp;asignaciones<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  * <!-- end-UML-doc -->
  * @param items
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UjZhcEquEeeJsdrfgQXeQw"
  */
  public void setItems(Collection<Item> items) {
    // begin-user-code
    Collection<BudgetElement> classifiers = new ArrayList<>();
    Iterator<Item> it = items.iterator();
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
  // "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ujb9sEquEeeJsdrfgQXeQw"
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
  // if (getItems().size() > 0) {
  // sb.append(",\n");
  // sb.append(nesting).append(q + "items" + q + ":[\n");
  // Iterator<Item> i = getItems().iterator();
  // while (i.hasNext()) {
  // Item item = i.next();
  // sb.append(item.toJsonString(nestingLevel + 2));
  // if (i.hasNext()) {
  // sb.append(",\n");
  // } else {
  // sb.append("\n");
  // }
  // }
  // sb.append(nesting).append("]\n");
  // }
  // nesting.delete(nesting.length() - 2, nesting.length());
  // sb.append(nesting).append("}");
  // return sb.toString();
  // // end-user-code
  // }
  
}
