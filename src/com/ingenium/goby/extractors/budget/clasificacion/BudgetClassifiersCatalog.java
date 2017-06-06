
package com.ingenium.goby.extractors.budget.clasificacion;

import java.util.Collection;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UXJ1MEquEeeJsdrfgQXeQw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UXJ1MEquEeeJsdrfgQXeQw"
 */
public class BudgetClassifiersCatalog {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ud4vUEquEeeJsdrfgQXeQw"
  */
  private Program program;

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ud6kgEquEeeJsdrfgQXeQw"
  */
  public BudgetClassifiersCatalog() {
    // begin-user-code
    program = new Program(0, "", "", BudgetElementType.CLASSIFICATION);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param subtitle
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ud7yoEquEeeJsdrfgQXeQw"
  */
  public void addSubtitulo(Subtitle subtitle) {
    // begin-user-code
    program.addSubtitle(subtitle);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * grega&nbsp;un&nbsp;item&nbsp;al&nbsp;subtitulo&nbsp;identificado.<br><br><br><br><br>@param&nbsp;numeroSubtitulo<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;identificador&nbsp;del&nbsp;subtitulo<br><br>@param&nbsp;item<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;item&nbsp;a&nbsp;agrega
  * <!-- end-UML-doc -->
  * @param subtitleNumber
  * @param item
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_Ud9AwEquEeeJsdrfgQXeQw"
  */
  public void addItem(Integer subtitleNumber, Item item) {
    // begin-user-code
    Subtitle s = program.getSubtitulo(subtitleNumber);
    if (s != null) {
      s.addItem(item);
    }
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * grega&nbsp;una&nbsp;asignación&nbsp;al&nbsp;item&nbsp;identificado.<br><br><br><br><br>@param&nbsp;numeroSubtitulo<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;subtitulo&nbsp;al&nbsp;que&nbsp;pertenece&nbsp;el&nbsp;item<br><br>@param&nbsp;numeroItem<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;el&nbsp;item&nbsp;identificador<br><br>@param&nbsp;asignacion<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;la&nbsp;asignación&nbsp;a&nbsp;agrega
  * <!-- end-UML-doc -->
  * @param subtitleNumber
  * @param itemNumber
  * @param assignment
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UeAEEEquEeeJsdrfgQXeQw"
  */
  public void addAsignacion(Integer subtitleNumber, Integer itemNumber,
      Assignment assignment) {
    // begin-user-code
    Subtitle s = program.getSubtitulo(subtitleNumber);
    if (s != null) {
      Item item = s.getItem(itemNumber);
      if (item != null) {
        item.addAsignacion(assignment);
      }
    }
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param numero
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UeDHYEquEeeJsdrfgQXeQw"
  */
  public Subtitle getSubtitulo(Integer numero) {
    // begin-user-code
    return program.getSubtitulo(numero);
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UeEVgEquEeeJsdrfgQXeQw"
  */
  public Collection<Subtitle> getSubtitulos() {
    // begin-user-code
    return program.getSubtitles();
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param nestingLevel
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UeGxwEquEeeJsdrfgQXeQw"
  */
  public String toJsonString(int nestingLevel) {
    // begin-user-code
    return program.toJsonString(nestingLevel);
    // end-user-code
  }
}
