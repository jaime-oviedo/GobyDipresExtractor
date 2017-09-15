/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.map;

import com.ingenium.goby.budget.extractor.model.Assignment;
import com.ingenium.goby.budget.extractor.model.Batch;
import com.ingenium.goby.budget.extractor.model.BudgetElement;
import com.ingenium.goby.budget.extractor.model.BudgetExecution;
import com.ingenium.goby.budget.extractor.model.BudgetHierarchyLevel;
import com.ingenium.goby.budget.extractor.model.CompositeBudgetElement;
import com.ingenium.goby.budget.extractor.model.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * @author&nbsp;Jaime&nbsp;Oviedo<br>
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_f3DKEZlJEeeN7K_s3Iv6cQ"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_f3DKEZlJEeeN7K_s3Iv6cQ"
 */
public class ExecutionToListStringMapper {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @author Jaime Oviedo
  * @uml.annotations
  *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_f3f2AZlJEeeN7K_s3Iv6cQ"
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_f3f2AZlJEeeN7K_s3Iv6cQ"
  */
  private class MappedElement {
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_f_9OcJlJEeeN7K_s3Iv6cQ"
    */
    private String batchNumber;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_f_9OcZlJEeeN7K_s3Iv6cQ"
    */
    private String batchName;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_f_91gJlJEeeN7K_s3Iv6cQ"
    */
    private String chapterNumber;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_f_-ckJlJEeeN7K_s3Iv6cQ"
    */
    private String chapterName;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_f__DoJlJEeeN7K_s3Iv6cQ"
    */
    private String programNumber;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_f__DoZlJEeeN7K_s3Iv6cQ"
    */
    private String programName;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_f__qsJlJEeeN7K_s3Iv6cQ"
    */
    private String subtitleNumber;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAARwJlJEeeN7K_s3Iv6cQ"
    */
    private String subtitleName;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAA40JlJEeeN7K_s3Iv6cQ"
    */
    private String itemNumber;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAA40ZlJEeeN7K_s3Iv6cQ"
    */
    private String itemName;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gABf4JlJEeeN7K_s3Iv6cQ"
    */
    private String assignmentNumber;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gACG8JlJEeeN7K_s3Iv6cQ"
    */
    private String assignmentName;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gACuAJlJEeeN7K_s3Iv6cQ"
    */
    private String initialBudget;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gACuAZlJEeeN7K_s3Iv6cQ"
    */
    private String actualBudget;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gADVEJlJEeeN7K_s3Iv6cQ"
    */
    private String currency;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAD8IJlJEeeN7K_s3Iv6cQ"
    */
    private String cumulativeExecution;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAEjMJlJEeeN7K_s3Iv6cQ"
    */
    private String actualDollarBudget;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAFKQJlJEeeN7K_s3Iv6cQ"
    */
    private String cumulativeDollarExecution;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAFxUJlJEeeN7K_s3Iv6cQ"
    */
    private String initialDollarBudget;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAGYYJlJEeeN7K_s3Iv6cQ"
    */
    private String executionPercentage;
    /** 
    * <!-- begin-UML-doc -->
    * <!-- end-UML-doc -->
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAG_cJlJEeeN7K_s3Iv6cQ"
    */
    private String dollarExecutionPercentage;
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;actualBudget.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;actualBudget
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAHmgJlJEeeN7K_s3Iv6cQ"
    */
    public String getActualBudget() {
      // begin-user-code
      return this.actualBudget;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;actualDollarBudget.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;actualDollarBudget
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAI0oJlJEeeN7K_s3Iv6cQ"
    */
    public String getActualDollarBudget() {
      // begin-user-code
      return this.actualDollarBudget;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;assignmentName.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;assignmentName
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAKCwJlJEeeN7K_s3Iv6cQ"
    */
    public String getAssignmentName() {
      // begin-user-code
      return this.assignmentName;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;assignmentNumber.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;assignmentNumber
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAKp0JlJEeeN7K_s3Iv6cQ"
    */
    public String getAssignmentNumber() {
      // begin-user-code
      return this.assignmentNumber;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;batchName.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;batchName
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gALQ4plJEeeN7K_s3Iv6cQ"
    */
    public String getBatchName() {
      // begin-user-code
      return this.batchName;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;batchNumber.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;batchNumber
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAMfAJlJEeeN7K_s3Iv6cQ"
    */
    public String getBatchNumber() {
      // begin-user-code
      return this.batchNumber;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;chapterName.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;chapterName
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gANtIJlJEeeN7K_s3Iv6cQ"
    */
    public String getChapterName() {
      // begin-user-code
      return this.chapterName;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;chapterNumber.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;chapterNumber
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAO7QJlJEeeN7K_s3Iv6cQ"
    */
    public String getChapterNumber() {
      // begin-user-code
      return this.chapterNumber;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;cumulativeDollarExecution.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;cumulativeDollarExecution
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAPiUZlJEeeN7K_s3Iv6cQ"
    */
    public String getCumulativeDollarExecution() {
      // begin-user-code
      return this.cumulativeDollarExecution;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;cumulativeExecution.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;cumulativeExecution
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAQwcJlJEeeN7K_s3Iv6cQ"
    */
    public String getCumulativeExecution() {
      // begin-user-code
      return this.cumulativeExecution;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;currency.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;currency
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gARXgplJEeeN7K_s3Iv6cQ"
    */
    public String getCurrency() {
      // begin-user-code
      return this.currency;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * @return&nbsp;the&nbsp;dollarExecutionPercentage
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gASloJlJEeeN7K_s3Iv6cQ"
    */
    public final String getDollarExecutionPercentage() {
      // begin-user-code
      return this.dollarExecutionPercentage;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * @return&nbsp;the&nbsp;executionPercentage
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gATzwJlJEeeN7K_s3Iv6cQ"
    */
    public final String getExecutionPercentage() {
      // begin-user-code
      return this.executionPercentage;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;initialBudget.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;initialBudget
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAUa0JlJEeeN7K_s3Iv6cQ"
    */
    public String getInitialBudget() {
      // begin-user-code
      return this.initialBudget;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;initialDollarBudget.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;initialDollarBudget
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAVB4ZlJEeeN7K_s3Iv6cQ"
    */
    public String getInitialDollarBudget() {
      // begin-user-code
      return this.initialDollarBudget;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;itemName.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;itemName
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAWQAJlJEeeN7K_s3Iv6cQ"
    */
    public String getItemName() {
      // begin-user-code
      return this.itemName;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;itemNumber.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;itemNumber
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAW3EJlJEeeN7K_s3Iv6cQ"
    */
    public String getItemNumber() {
      // begin-user-code
      return this.itemNumber;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;programName.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;programName
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAXeIZlJEeeN7K_s3Iv6cQ"
    */
    public String getProgramName() {
      // begin-user-code
      return this.programName;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;programNumber.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;programNumber
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAYsQJlJEeeN7K_s3Iv6cQ"
    */
    public String getProgramNumber() {
      // begin-user-code
      return this.programNumber;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;subtitleName.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;subtitleName
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAZTUJlJEeeN7K_s3Iv6cQ"
    */
    public String getSubtitleName() {
      // begin-user-code
      return this.subtitleName;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Returns&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;subtitleNumber.<br><br>@return&nbsp;the&nbsp;value&nbsp;of&nbsp;field&nbsp;subtitleNumber
    * <!-- end-UML-doc -->
    * @return
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAahcJlJEeeN7K_s3Iv6cQ"
    */
    public String getSubtitleNumber() {
      // begin-user-code
      return this.subtitleNumber;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;actualBudget.<br><br>@param&nbsp;actualBudget<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;actualBudget.
    * <!-- end-UML-doc -->
    * @param actualBudget
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAbvkJlJEeeN7K_s3Iv6cQ"
    */
    public void setActualBudget(final String actualBudget) {
      // begin-user-code
      this.actualBudget = actualBudget;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;actualDollarBudget.<br><br>@param&nbsp;actualDollarBudget<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;actualDollarBudget.
    * <!-- end-UML-doc -->
    * @param actualDollarBudget
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAcWo5lJEeeN7K_s3Iv6cQ"
    */
    public void setActualDollarBudget(final String actualDollarBudget) {
      // begin-user-code
      this.actualDollarBudget = actualDollarBudget;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;assignmentName.<br><br>@param&nbsp;assignmentName<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;assignmentName.
    * <!-- end-UML-doc -->
    * @param assignmentName
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAdkw5lJEeeN7K_s3Iv6cQ"
    */
    public void setAssignmentName(final String assignmentName) {
      // begin-user-code
      this.assignmentName = assignmentName;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;assignmentNumber.<br><br>@param&nbsp;assignmentNumber<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;assignmentNumber.
    * <!-- end-UML-doc -->
    * @param assignmentNumber
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAey4plJEeeN7K_s3Iv6cQ"
    */
    public void setAssignmentNumber(final String assignmentNumber) {
      // begin-user-code
      this.assignmentNumber = assignmentNumber;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;batchName.<br><br>@param&nbsp;batchName<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;batchName.
    * <!-- end-UML-doc -->
    * @param batchName
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAgBAplJEeeN7K_s3Iv6cQ"
    */
    public void setBatchName(final String batchName) {
      // begin-user-code
      this.batchName = batchName;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;batchNumber.<br><br>@param&nbsp;batchNumber<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;batchNumber.
    * <!-- end-UML-doc -->
    * @param batchNumber
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAgoE5lJEeeN7K_s3Iv6cQ"
    */
    public void setBatchNumber(final String batchNumber) {
      // begin-user-code
      this.batchNumber = batchNumber;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;chapterName.<br><br>@param&nbsp;chapterName<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;chapterName.
    * <!-- end-UML-doc -->
    * @param chapterName
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAh2MplJEeeN7K_s3Iv6cQ"
    */
    public void setChapterName(final String chapterName) {
      // begin-user-code
      this.chapterName = chapterName;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;chapterNumber.<br><br>@param&nbsp;chapterNumber<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;chapterNumber.
    * <!-- end-UML-doc -->
    * @param chapterNumber
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAjEUZlJEeeN7K_s3Iv6cQ"
    */
    public void setChapterNumber(final String chapterNumber) {
      // begin-user-code
      this.chapterNumber = chapterNumber;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;cumulativeDollarExecution.<br><br>@param&nbsp;cumulativeDollarExecution<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;cumulativeDollarExecution.
    * <!-- end-UML-doc -->
    * @param cumulativeDollarExecution
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAjrY5lJEeeN7K_s3Iv6cQ"
    */
    public void setCumulativeDollarExecution(
        final String cumulativeDollarExecution) {
      // begin-user-code
      this.cumulativeDollarExecution = cumulativeDollarExecution;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;cumulativeExecution.<br><br>@param&nbsp;cumulativeExecution<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;cumulativeExecution.
    * <!-- end-UML-doc -->
    * @param cumulativeExecution
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAk5gplJEeeN7K_s3Iv6cQ"
    */
    public void setCumulativeExecution(final String cumulativeExecution) {
      // begin-user-code
      this.cumulativeExecution = cumulativeExecution;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;currency.<br><br>@param&nbsp;currency<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;currency.
    * <!-- end-UML-doc -->
    * @param currency
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAmHoJlJEeeN7K_s3Iv6cQ"
    */
    public void setCurrency(final String currency) {
      // begin-user-code
      this.currency = currency;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * @param&nbsp;dollarExecutionPercentage<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;dollarExecutionPercentage&nbsp;to&nbsp;set
    * <!-- end-UML-doc -->
    * @param dollarExecutionPercentage
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAmus5lJEeeN7K_s3Iv6cQ"
    */
    public final void setDollarExecutionPercentage(
        final String dollarExecutionPercentage) {
      // begin-user-code
      this.dollarExecutionPercentage = dollarExecutionPercentage;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * @param&nbsp;executionPercentage<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;executionPercentage&nbsp;to&nbsp;set
    * <!-- end-UML-doc -->
    * @param executionPercentage
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAn80JlJEeeN7K_s3Iv6cQ"
    */
    public final void setExecutionPercentage(final String executionPercentage) {
      // begin-user-code
      this.executionPercentage = executionPercentage;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;initialBudget.<br><br>@param&nbsp;initialBudget<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;initialBudget.
    * <!-- end-UML-doc -->
    * @param initialBudget
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAoj4ZlJEeeN7K_s3Iv6cQ"
    */
    public void setInitialBudget(final String initialBudget) {
      // begin-user-code
      this.initialBudget = initialBudget;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;initialDollarBudget.<br><br>@param&nbsp;initialDollarBudget<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;initialDollarBudget.
    * <!-- end-UML-doc -->
    * @param initialDollarBudget
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gApK85lJEeeN7K_s3Iv6cQ"
    */
    public void setInitialDollarBudget(final String initialDollarBudget) {
      // begin-user-code
      this.initialDollarBudget = initialDollarBudget;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;itemName.<br><br>@param&nbsp;itemName<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;itemName.
    * <!-- end-UML-doc -->
    * @param itemName
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAqZEplJEeeN7K_s3Iv6cQ"
    */
    public void setItemName(final String itemName) {
      // begin-user-code
      this.itemName = itemName;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;itemNumber.<br><br>@param&nbsp;itemNumber<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;itemNumber.
    * <!-- end-UML-doc -->
    * @param itemNumber
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gArAI5lJEeeN7K_s3Iv6cQ"
    */
    public void setItemNumber(final String itemNumber) {
      // begin-user-code
      this.itemNumber = itemNumber;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;programName.<br><br>@param&nbsp;programName<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;programName.
    * <!-- end-UML-doc -->
    * @param programName
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAsOQJlJEeeN7K_s3Iv6cQ"
    */
    public void setProgramName(final String programName) {
      // begin-user-code
      this.programName = programName;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;programNumber.<br><br>@param&nbsp;programNumber<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;programNumber.
    * <!-- end-UML-doc -->
    * @param programNumber
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAs1U5lJEeeN7K_s3Iv6cQ"
    */
    public void setProgramNumber(final String programNumber) {
      // begin-user-code
      this.programNumber = programNumber;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;subtitleName.<br><br>@param&nbsp;subtitleName<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;subtitleName.
    * <!-- end-UML-doc -->
    * @param subtitleName
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAuDcplJEeeN7K_s3Iv6cQ"
    */
    public void setSubtitleName(final String subtitleName) {
      // begin-user-code
      this.subtitleName = subtitleName;
      // end-user-code
    }
    
    /** 
    * <!-- begin-UML-doc -->
    * Sets&nbsp;the&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;subtitleNumber.<br><br>@param&nbsp;subtitleNumber<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the&nbsp;new&nbsp;value&nbsp;of&nbsp;the&nbsp;field&nbsp;subtitleNumber.
    * <!-- end-UML-doc -->
    * @param subtitleNumber
    * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_gAvRkplJEeeN7K_s3Iv6cQ"
    */
    public void setSubtitleNumber(final String subtitleNumber) {
      // begin-user-code
      this.subtitleNumber = subtitleNumber;
      // end-user-code
    }
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_f7-GUJlJEeeN7K_s3Iv6cQ"
  */
  private static Logger log = Logger
      .getLogger(ExecutionToListStringMapper.class.getCanonicalName());
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param element
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_f7_7gJlJEeeN7K_s3Iv6cQ"
  */
  private static Collection<MappedElement> map(final BudgetElement element) {
    // begin-user-code
    
    final List<MappedElement> mappedElements = new ArrayList<>();
    boolean isAssignment = false;
    boolean isLeafItem = false;
    // determine if it is a leaf object in the hierarchy and its kind
    if (!(element instanceof CompositeBudgetElement)) {
      // we should have an assignment here or it is malformed
      if (!(element instanceof Assignment)) {
        ExecutionToListStringMapper.log.warning(
            new StringBuffer("Malformed element, expected an Assignment, got:")
                .append(element.getClass().getName()).toString());
      } else {
        isAssignment = true;
      }
    } else {
      final CompositeBudgetElement ce = (CompositeBudgetElement) element;
      final Collection<? extends BudgetElement> subelements = ce
          .getSubelements().values();
      final int numberOfSubelements = subelements.size();
      if (numberOfSubelements == 0) {
        // we should have an item with no assignments or it is malformed
        if (!(ce instanceof Item)) {
          ExecutionToListStringMapper.log.warning(
              new StringBuffer("Malformed element, expected an Item, got:")
                  .append(element.getClass().getName()).toString());
        } else {
          isLeafItem = true;
        }
      }
      
      if (isAssignment || isLeafItem) {
        // Since it is a leaf element, end the recursive mapping
        final String name = element.getName();
        final int number = element.getNumber();
        final String currency = element.getCurrency().toString();
        final int initialBudget = element.getInitialBudget().intValue();
        final int initialDollarBudget = element.getActualDollarBudget()
            .intValue();
        final int actualBudget = element.getInitialBudget().intValue();
        final int actualDollarBudget = element.getActualDollarBudget()
            .intValue();
        final int cumulativeExecution = element.getCumulativeExecution()
            .intValue();
        final int cumulativeDollarExecution = element
            .getCumulativeDollarExecution().intValue();
        int executionPercentage = 0;
        int dollarExecutionPercentage = 0;
        if (actualBudget > 0) {
          executionPercentage = (cumulativeExecution / actualBudget) * 100;
        }
        if (actualDollarBudget > 0) {
          dollarExecutionPercentage = (cumulativeDollarExecution
              / actualDollarBudget) * 100;
        }
        
        final MappedElement mappedElement = new ExecutionToListStringMapper().new MappedElement();
        mappedElement.setCurrency(currency);
        mappedElement.setInitialBudget(String.valueOf(initialBudget));
        mappedElement.setActualBudget(String.valueOf(actualBudget));
        mappedElement
            .setInitialDollarBudget(String.valueOf(initialDollarBudget));
        mappedElement.setActualDollarBudget(String.valueOf(actualDollarBudget));
        mappedElement
            .setCumulativeExecution(String.valueOf(cumulativeExecution));
        mappedElement.setCumulativeDollarExecution(
            String.valueOf(cumulativeDollarExecution));
        mappedElement
            .setExecutionPercentage(String.valueOf(executionPercentage));
        mappedElement.setDollarExecutionPercentage(
            String.valueOf(dollarExecutionPercentage));
        
        if (isAssignment) {
          mappedElement.setAssignmentNumber(String.valueOf(number));
          mappedElement.setAssignmentName(name);
        } else {
          // isLeafItem
          mappedElement.setAssignmentNumber("");
          mappedElement.setAssignmentName("");
          mappedElement.setItemNumber(String.valueOf(number));
          mappedElement.setItemName(name);
        }
        mappedElements.add(mappedElement);
      } else {
        // If we reach this point, we are not in a leaf of the hierarchy
        for (final BudgetElement subElement : subelements) {
          mappedElements.addAll(ExecutionToListStringMapper.map(subElement));
        }
        final BudgetHierarchyLevel level = ce.getLevel();
        for (final MappedElement mappedElement : mappedElements) {
          switch (level) {
            case BATCH:
              mappedElement.setBatchNumber(String.valueOf(ce.getNumber()));
              mappedElement.setBatchName(ce.getName());
              break;
            case CHAPTER:
              mappedElement.setChapterNumber(String.valueOf(ce.getNumber()));
              mappedElement.setChapterName(ce.getName());
              break;
            case PROGRAM:
              mappedElement.setProgramNumber(String.valueOf(ce.getNumber()));
              mappedElement.setProgramName(ce.getName());
              break;
            case SUBTITLE:
              mappedElement.setSubtitleNumber(String.valueOf(ce.getNumber()));
              mappedElement.setSubtitleName(ce.getName());
              break;
            case ITEM:
              mappedElement.setItemNumber(String.valueOf(ce.getNumber()));
              mappedElement.setItemName(ce.getName());
              break;
            default:
              ExecutionToListStringMapper.log.warning(new StringBuffer(
                  "Malformed element, expected batch, chapter, program,")
                      .append(
                          " subtitle or an item with no assignments, but got:")
                      .append(element.getClass().getName()).toString());
          }
        }
      }
    }
    
    return mappedElements;
    
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param execution
  * @param extended
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_f8BJo5lJEeeN7K_s3Iv6cQ"
  */
  public static List<String> map(final BudgetExecution execution,
      final boolean extended) {
    // begin-user-code
    final Collection<Batch> batches = execution.getBatches();
    final List<MappedElement> mappedElements = new ArrayList<>();
    for (final Batch batch : batches) {
      mappedElements.addAll(ExecutionToListStringMapper.map(batch));
    }
    final StringBuilder sb = new StringBuilder();
    final String s = ";";
    sb.append("# partida;Partida;# capítulo;Capítulo;# programa;Programa;")
        .append("# subtítulo;Subtítulo;# item;Item;# asigación;Asignación;")
        .append("Moneda;Presupuesto inicial; Presupuesto Vigente;")
        .append("Ejecución; % ejecucion;\n");
    for (final MappedElement mappedElement : mappedElements) {
      sb.append(mappedElement.getBatchNumber()).append(s)
          .append(mappedElement.getBatchName()).append(s);
      sb.append(mappedElement.getChapterNumber()).append(s)
          .append(mappedElement.getChapterName()).append(s);
      sb.append(mappedElement.getProgramNumber()).append(s)
          .append(mappedElement.getProgramName()).append(s);
      sb.append(mappedElement.getSubtitleNumber()).append(s)
          .append(mappedElement.getSubtitleName()).append(s);
      sb.append(mappedElement.getItemNumber()).append(s)
          .append(mappedElement.getItemName()).append(s);
      sb.append(mappedElement.getAssignmentNumber()).append(s)
          .append(mappedElement.getAssignmentName()).append(s);
      final String currency = mappedElement.getCurrency();
      sb.append(currency).append(s);
      String initialBudget;
      String actualBudget;
      String exec;
      String executionPercent;
      switch (currency) {
        case "Dolar":
          initialBudget = mappedElement.getInitialDollarBudget();
          actualBudget = mappedElement.getActualDollarBudget();
          exec = mappedElement.getCumulativeDollarExecution();
          executionPercent = mappedElement.getDollarExecutionPercentage();
          break;
        default:
          if (!"Peso".equals(currency)) {
            ExecutionToListStringMapper.log
                .warning("Currency mixed or undefined. Defaulting to peso.");
          }
          initialBudget = mappedElement.getInitialBudget();
          actualBudget = mappedElement.getActualBudget();
          exec = mappedElement.getCumulativeExecution();
          executionPercent = mappedElement.getExecutionPercentage();
      }
      sb.append(initialBudget).append(s);
      sb.append(actualBudget).append(s);
      sb.append(exec).append(s);
      sb.append(executionPercent).append("\n");
    }
    return null;
    // end-user-code
  }
}
