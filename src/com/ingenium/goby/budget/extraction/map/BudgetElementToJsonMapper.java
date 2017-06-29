
package com.ingenium.goby.budget.extraction.map;

import com.ingenium.goby.budget.elements.BudgetElement;
import com.ingenium.goby.budget.elements.BudgetElementType;
import com.ingenium.goby.budget.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.elements.CompositeBudgetElement;

import java.util.Collection;
import java.util.Iterator;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author JaimeRodrigo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_tOVToEt-EeeC6_ZX80x4yQ"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_tOVToEt-EeeC6_ZX80x4yQ"
 */
public class BudgetElementToJsonMapper {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param element
  * @param nestingLevel
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_tRANIEt-EeeC6_ZX80x4yQ"
  */
  public static String map(BudgetElement element, int nestingLevel) {
    // begin-user-code
    StringBuilder nesting = new StringBuilder();
    for (int i = 0; i < nestingLevel; i++) {
      nesting.append("  ");
    }
    
    StringBuilder sb = new StringBuilder(nesting);
    String lineSeparator = System.lineSeparator();
    sb.append("{").append(lineSeparator);
    nesting.append("  ");
    String q = "\"";
    sb.append(nesting).append(q).append("number").append(q).append(":")
        .append(element.getNumber()).append(",").append(lineSeparator);
    sb.append(nesting)
        .append(q + "name" + q + ":" + q + element.getName() + q + ",\n");
    String elementDescription = element.getDescription();
    sb.append(nesting)
        .append(q + "description" + q + ":" + q + elementDescription + q);
    BudgetElementType type = element.getType();
    switch (type) {
      case BUDGET:
        sb.append(",\n");
        sb.append(nesting)
            .append(q + "budget" + q + ":" + q + elementDescription + q);
        break;
      case EXECUTION:
        sb.append(",\n");
        sb.append(nesting).append(
            q + "budget" + q + ":" + q + elementDescription + q + ",\n");
        sb.append(nesting)
            .append(q + "execution" + q + ":" + q + elementDescription + q);
        break;
      default:
        break;
    }
    
    if (element instanceof CompositeBudgetElement) {
      CompositeBudgetElement compositeElement = (CompositeBudgetElement) element;
      Collection<? extends BudgetElement> ceSubelements = compositeElement
          .getSubelements().values();
      if (ceSubelements.size() > 0) {
        sb.append(",").append(lineSeparator);
        BudgetHierarchyLevel level = compositeElement.getLevel();
        String label = "";
        switch (level) {
          case ITEM:
            label = "assignments";
            break;
          case SUBTITLE:
            label = "items";
            break;
          case PROGRAM:
            label = "subtitles";
            break;
          case CHAPTER:
            label = "programs";
            break;
          case BATCH:
            label = "chapters";
            break;
          case ROOT:
            switch (element.getType()) {
              case BUDGETARY_CLASSIFICATION:
                label = "subtitles";
                break;
              default:
                label = "batches";
                break;
            }
            break;
          default:
            label = "";
            break;
        }
        if (!"".equals(label)) {
          sb.append(nesting).append(q + label + q + ":[ ")
              .append(lineSeparator);
          Iterator<? extends BudgetElement> i = ceSubelements.iterator();
          while (i.hasNext()) {
            BudgetElement subElement = i.next();
            sb.append(
                BudgetElementToJsonMapper.map(subElement, nestingLevel + 2));
            if (i.hasNext()) {
              sb.append(",").append(lineSeparator);
            } else {
              sb.append(lineSeparator);
            }
          }
          sb.append(nesting).append("]").append(lineSeparator);
        }
      } else {
        sb.append(lineSeparator);
      }
    } else {
      sb.append(lineSeparator);
    }
    nesting.delete(nesting.length() - 2, nesting.length());
    sb.append(nesting).append("}");
    return sb.toString();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Crea una nueva instancia de la clase BudgetElementToJsonMapper.
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_tRD3gEt-EeeC6_ZX80x4yQ"
  */
  private BudgetElementToJsonMapper() {
    // begin-user-code
    super();
    // end-user-code
  }
  
}
