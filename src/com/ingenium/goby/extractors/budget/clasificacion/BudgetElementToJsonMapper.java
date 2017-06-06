package com.ingenium.goby.extractors.budget.clasificacion;

import java.util.Iterator;

public class BudgetElementToJsonMapper {

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
        default:
          label = "";
          break;
        }
        if (!label.equals("")) {
          sb.append(nesting).append(q + label + q + ":[ \n");
          Iterator<BudgetElement> i = compositeElement.getSubelements().values()
              .iterator();
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

  public BudgetElementToJsonMapper() {
    // TODO Auto-generated constructor stub
  }

}
