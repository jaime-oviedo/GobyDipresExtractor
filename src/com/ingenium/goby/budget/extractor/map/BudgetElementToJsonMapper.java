
package com.ingenium.goby.budget.extractor.map;

import com.ingenium.goby.budget.extractor.model.BudgetElement;
import com.ingenium.goby.budget.extractor.model.BudgetElementType;
import com.ingenium.goby.budget.extractor.model.BudgetHierarchyLevel;
import com.ingenium.goby.budget.extractor.model.CompositeBudgetElement;

import java.util.Collection;
import java.util.Iterator;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_tOVToEt-EeeC6_ZX80x4yQ"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_tOVToEt-EeeC6_ZX80x4yQ"
 */
public class BudgetElementToJsonMapper {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param element
  * @param nestingLevel
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_tRANIEt-EeeC6_ZX80x4yQ"
  */
  public static String map(final BudgetElement element,
      final int nestingLevel) {
    // begin-user-code
    final StringBuilder nesting = new StringBuilder();
    for (int i = 0; i < nestingLevel; i++) {
      nesting.append("  ");
    }
    
    final StringBuilder sb = new StringBuilder(nesting);
    final String lineSeparator = System.lineSeparator();
    sb.append("{").append(lineSeparator);
    nesting.append("  ");
    final String q = "\"";
    sb.append(nesting).append(q).append("number").append(q).append(":")
        .append(element.getNumber()).append(",").append(lineSeparator);
    sb.append(nesting)
        .append(q + "name" + q + ":" + q + element.getName() + q + ",\n");
    final String elementDescription = element.getDescription();
    sb.append(nesting)
        .append(q + "description" + q + ":" + q + elementDescription + q);
    final BudgetElementType type = element.getType();
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
      final CompositeBudgetElement compositeElement = (CompositeBudgetElement) element;
      final Collection<? extends BudgetElement> ceSubelements = compositeElement
          .getSubelements().values();
      if (ceSubelements.size() > 0) {
        sb.append(",").append(lineSeparator);
        final BudgetHierarchyLevel level = compositeElement.getLevel();
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
            switch (type) {
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
          final Iterator<? extends BudgetElement> i = ceSubelements.iterator();
          while (i.hasNext()) {
            final BudgetElement subElement = i.next();
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
    final int nestingLength = nesting.length();
    nesting.delete(nestingLength - 2, nestingLength);
    sb.append(nesting).append("}");
    return sb.toString();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param element
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_wppWIpzOEeeKKp-m4AD7KQ"
  */
  public static String map(final BudgetElement element) {
    // begin-user-code
    return BudgetElementToJsonMapper.map(element, 0);
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class BudgetElementToJsonMapper.
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_tRD3gEt-EeeC6_ZX80x4yQ"
  */
  private BudgetElementToJsonMapper() {
    // begin-user-code
    super();
    // end-user-code
  }
  
}
