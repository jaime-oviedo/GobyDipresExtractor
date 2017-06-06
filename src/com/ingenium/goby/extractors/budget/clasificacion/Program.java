
package com.ingenium.goby.extractors.budget.clasificacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UasRYEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UasRYEquEeeJsdrfgQXeQw"
 */
public class Program extends CompositeBudgetElement {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param numero
  * @param name
  * @param description
  * @param type
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UiydcEquEeeJsdrfgQXeQw"
  */
  public Program(int numero, String name, String description,
      BudgetElementType type) {
    // begin-user-code
    super(numero, name, description, type, BudgetHierarchyLevel.PROGRAM);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param subtitle
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ui0SoEquEeeJsdrfgQXeQw"
  */
  public void addSubtitle(Subtitle subtitle) {
    // begin-user-code
    super.addSubelement(subtitle);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param subtitleNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ui1gwEquEeeJsdrfgQXeQw"
  */
  public Subtitle getSubtitulo(Integer subtitleNumber) {
    // begin-user-code
    return (Subtitle) super.getSubelements().get(subtitleNumber);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * Retorna&nbsp;los&nbsp;subtitulos&nbsp;asociados&nbsp;al&nbsp;programa.<br><br><br><br><br>@return&nbsp;los&nbsp;subtitulos&nbsp;asociados&nbsp;al&nbsp;program
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ui3V8EquEeeJsdrfgQXeQw"
  */
  public Collection<Subtitle> getSubtitles() {
    // begin-user-code
    Iterator<BudgetElement> it = getSubelements().values().iterator();
    Collection<Subtitle> subtitles = new ArrayList<>();
    while (it.hasNext()) {
      Subtitle st = (Subtitle) it.next();
      subtitles.add(st);
    }
    return subtitles;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * stablece&nbsp;los&nbsp;subtitulos&nbsp;para&nbsp;el&nbsp;programa.<br><br><br><br>@param&nbsp;subtitulos<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;nuevo&nbsp;conjunto&nbsp;de&nbsp;subtitulos<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  * <!-- end-UML-doc -->
  * @param subtitles
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ui5yMEquEeeJsdrfgQXeQw"
  */
  public void setSubtitles(Collection<Subtitle> subtitles) {
    // begin-user-code
    Collection<BudgetElement> classifiers = new ArrayList<>();
    Iterator<Subtitle> it = subtitles.iterator();
    while (it.hasNext()) {
      classifiers.add(it.next());
    }
    super.setSubelements(classifiers);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param nestingLevel
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ui7nYEquEeeJsdrfgQXeQw"
  */
  @Override
  public String toJsonString(int nestingLevel) {
    // begin-user-code
    StringBuilder nesting = new StringBuilder();
    for (int i = 0; i < nestingLevel; i++) {
      nesting.append("  ");
    }

    StringBuilder sb = new StringBuilder(nesting);
    sb.append("{\n");
    nesting.append("  ");
    String q = "\"";
    sb.append(nesting).append(q + "number" + q + ":" + getNumber() + ",\n");
    sb.append(nesting).append(q + "name" + q + ":" + q + getName() + q + ",\n");
    sb.append(nesting)
        .append(q + "description" + q + ":" + q + getDescription() + q);

    if (getSubtitles().size() > 0) {
      sb.append(",\n");
      sb.append(nesting).append(q + "subtitles" + q + ":[\n");
      Iterator<Subtitle> i = getSubtitles().iterator();
      while (i.hasNext()) {
        Subtitle item = i.next();
        sb.append(item.toJsonString(nestingLevel + 2));
        if (i.hasNext()) {
          sb.append(",\n");
        } else {
          sb.append("\n");
        }
      }
      sb.append(nesting).append("]\n");
    }
    nesting.delete(nesting.length() - 2, nesting.length());
    sb.append(nesting).append("}");
    return sb.toString();
    // end-user-code
  }

}
