
package com.ingenium.goby.budget.extraction.map;

import com.ingenium.goby.budget.elements.BudgetElement;
import com.ingenium.goby.budget.elements.BudgetElementType;
import com.ingenium.goby.budget.elements.BudgetHierarchyLevel;
import com.ingenium.goby.budget.elements.CompositeBudgetElement;

import java.util.Iterator;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
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
    sb.append("{\n");
    nesting.append("  ");
    String q = "\"";
    sb.append(nesting)
        .append(q + "number" + q + ":" + element.getNumber() + ",\n");
    sb.append(nesting)
        .append(q + "name" + q + ":" + q + element.getName() + q + ",\n");
    sb.append(nesting)
        .append(q + "description" + q + ":" + q + element.getDescription() + q);

    BudgetElementType type = element.getType();
    switch (type) {
    case BUDGET:
      sb.append(",\n");
      sb.append(nesting)
          .append(q + "budget" + q + ":" + q + element.getDescription() + q);
      break;
    case EXECUTION:
      sb.append(",\n");
      sb.append(nesting).append(
          q + "budget" + q + ":" + q + element.getDescription() + q + ",\n");
      sb.append(nesting)
          .append(q + "execution" + q + ":" + q + element.getDescription() + q);
      break;
    default:
      break;
    }

    if (element instanceof CompositeBudgetElement) {
      CompositeBudgetElement compositeElement = (CompositeBudgetElement) element;
      if (compositeElement.getSubelements().size() > 0) {
        sb.append(",\n");
        BudgetHierarchyLevel level = compositeElement.getLevel();
        String label;
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
        default:
          label = "";
          break;
        }
        if (!label.equals("")) {
          sb.append(nesting).append(q + label + q + ":[ \n");
          Iterator<? extends BudgetElement> i = compositeElement
              .getSubelements().values().iterator();
          while (i.hasNext()) {
            BudgetElement subElement = i.next();
            sb.append(
                BudgetElementToJsonMapper.map(subElement, nestingLevel + 2));
            if (i.hasNext()) {
              sb.append(",\n");
            } else {
              sb.append("\n");
            }
          }
          sb.append(nesting).append("]\n");
        }
      }
    } else {
      sb.append("\n");
    }
    nesting.delete(nesting.length() - 2, nesting.length());
    sb.append(nesting).append("}");
    return sb.toString();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_tRD3gEt-EeeC6_ZX80x4yQ"
  */
  private BudgetElementToJsonMapper() {
    // begin-user-code
    // TODO Auto-generated constructor stub
    // end-user-code
  }

}
