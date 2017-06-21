/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget;

import com.ingenium.goby.budget.elements.Subtitle;
import java.util.Collection;
import com.ingenium.goby.budget.elements.Assignment;
import com.ingenium.goby.budget.elements.Item;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_UcsIYFH0Eee-AoOzRlyylA"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_UcsIYFH0Eee-AoOzRlyylA"
 */
public interface ClassifiersCatalog {

  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param subtitleNumber
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_dRXQcFNcEeeyIrnvp3X3kA"
  */
  public Subtitle getSubtitle(int subtitleNumber);

  /** 
  * <!-- begin-UML-doc -->
  * Retorna&nbsp;los&nbsp;subtitulos&nbsp;asociados&nbsp;al&nbsp;programa.<br><br><br><br><br>@return&nbsp;los&nbsp;subtitulos&nbsp;asociados&nbsp;al&nbsp;program
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_dRX3gFNcEeeyIrnvp3X3kA"
  */
  public Collection<Subtitle> getSubtitles();
}