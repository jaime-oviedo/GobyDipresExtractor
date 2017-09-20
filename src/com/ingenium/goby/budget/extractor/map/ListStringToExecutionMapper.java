/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.map;

import com.ingenium.goby.budget.extractor.factory.ClassifiersCatalogFactory;
import com.ingenium.goby.budget.extractor.factory.InstitutionsCatalogFactory;
import com.ingenium.goby.budget.extractor.model.Assignment;
import com.ingenium.goby.budget.extractor.model.Batch;
import com.ingenium.goby.budget.extractor.model.BudgetCurrency;
import com.ingenium.goby.budget.extractor.model.BudgetElementType;
import com.ingenium.goby.budget.extractor.model.BudgetExecution;
import com.ingenium.goby.budget.extractor.model.BudgetExecutionImpl;
import com.ingenium.goby.budget.extractor.model.Chapter;
import com.ingenium.goby.budget.extractor.model.ClassifiersCatalog;
import com.ingenium.goby.budget.extractor.model.InstitutionsCatalog;
import com.ingenium.goby.budget.extractor.model.Item;
import com.ingenium.goby.budget.extractor.model.Program;
import com.ingenium.goby.budget.extractor.model.Subtitle;

import java.math.BigInteger;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

/** 
 * <!-- begin-UML-doc -->
 * @author&nbsp;Jaime&nbsp;Oviedo<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_pBt2UZmrEeeAWKInz3apng"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_pBt2UZmrEeeAWKInz3apng"
 */
public class ListStringToExecutionMapper {
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_pE_Mw5mrEeeAWKInz3apng"
  */
  private static Logger log = Logger
      .getLogger(ListStringToExecutionMapper.class.getCanonicalName());
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param lines
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_pFAa4JmrEeeAWKInz3apng"
  */
  public static BudgetExecution map(final List<List<String>> lines) {
    // begin-user-code
    final BudgetExecutionImpl execution = new BudgetExecutionImpl();
    
    for (final List<String> line : lines) {
      
      int batchNumber = 0;
      
      String s = line.get(0);
      try {
        if (s != null) {
          batchNumber = Integer.parseInt(s);
        }
      } catch (final NumberFormatException e) {
        ListStringToExecutionMapper.log
            .warning("Unable to extract batch number.");
        continue;
      }
      
      int chapterNumber = 0;
      s = line.get(1);
      if (s != null) {
        try {
          chapterNumber = Integer.parseInt(s);
        } catch (final NumberFormatException e) {
          ListStringToExecutionMapper.log
              .warning("Unable to extract chatper number.");
          continue;
        }
      } else {
        chapterNumber = 0;
      }
      
      int programNumber = 0;
      s = line.get(2);
      if (s != null) {
        try {
          programNumber = Integer.parseInt(s);
        } catch (final NumberFormatException e) {
          ListStringToExecutionMapper.log
              .warning("Unable to extact program number.");
          continue;
        }
      }
      
      int subtitleNumber = 0;
      s = line.get(3);
      if (s != null) {
        try {
          subtitleNumber = Integer.parseInt(s);
        } catch (final NumberFormatException e) {
          ListStringToExecutionMapper.log
              .warning("Unable to extact subtitle number.");
          continue;
        }
      }
      
      int itemNumber = 0;
      s = line.get(4);
      if ((s != null) && !"".equals(s)) {
        try {
          itemNumber = Integer.parseInt(s);
        } catch (final NumberFormatException e) {
          ListStringToExecutionMapper.log
              .warning("Unable to extact item number.");
          continue;
        }
      }
      
      int assignmentNumber = 0;
      s = line.get(5);
      if ((s != null) && !"".equals(s)) {
        try {
          assignmentNumber = Integer.parseInt(s);
        } catch (final NumberFormatException e) {
          ListStringToExecutionMapper.log
              .warning("Unable to extact assignment number.");
          continue;
        }
      }
      
      final String fullElementTuple = new StringBuilder("(").append(batchNumber)
          .append(",").append(chapterNumber).append(",").append(programNumber)
          .append(",").append(subtitleNumber).append(",").append(itemNumber)
          .append(",").append(assignmentNumber).append(")").toString();
      
      BudgetCurrency currency = BudgetCurrency.PESO;
      s = line.get(6);
      if (s != null) {
        if ("P".equals(s.toUpperCase())) {
          currency = BudgetCurrency.PESO;
        } else if ("D".equals(s.toUpperCase())) {
          currency = BudgetCurrency.DOLLAR;
        } else {
          ListStringToExecutionMapper.log.warning(
              new StringBuilder("Unable to obtain currency for element:")
                  .append(fullElementTuple).append(", defaulting to Peso.")
                  .toString());
        }
        
        String name = "";
        s = line.get(7);
        if (s != null) {
          name = s;
        } else {
          ListStringToExecutionMapper.log
              .warning(new StringBuilder("Unable to obtain name for element:")
                  .append(fullElementTuple)
                  .append(". I will try to get it from the catalog.")
                  .toString());
        }
        
        // The french use comma for separating decimals, we'll use that locale.
        BigInteger initialBudgetNumber = BigInteger.ZERO;
        s = line.get(8);
        if (s != null) {
          try {
            initialBudgetNumber = BigInteger.valueOf(NumberFormat
                .getNumberInstance(Locale.FRANCE).parse(s).longValue());
          } catch (final ParseException e) {
            ListStringToExecutionMapper.log.warning(
                new StringBuilder("Unable to parse initial budget for element ")
                    .append(fullElementTuple).append("found:").append(s)
                    .toString());
          }
        }
        
        BigInteger currentBudgetNumber = BigInteger.ZERO;
        s = line.get(9);
        if (s != null) {
          try {
            currentBudgetNumber = BigInteger.valueOf(NumberFormat
                .getNumberInstance(Locale.FRANCE).parse(s).longValue());
          } catch (final ParseException e) {
            ListStringToExecutionMapper.log.warning(
                new StringBuilder("Unable to parse current budget for element ")
                    .append(fullElementTuple).append("found:").append(s)
                    .toString());
          }
        }
        
        BigInteger cumulativeExecution = BigInteger.ZERO;
        s = line.get(10);
        if (s != null) {
          try {
            cumulativeExecution = BigInteger.valueOf(NumberFormat
                .getNumberInstance(Locale.FRANCE).parse(s).longValue());
          } catch (final ParseException e) {
            ListStringToExecutionMapper.log.warning(new StringBuilder(
                "Unable to parse cumulative execution for element ")
                    .append(fullElementTuple).append("found:").append(s)
                    .toString());
          }
        }
        
        final ClassifiersCatalog cc = ClassifiersCatalogFactory.getInstance()
            .getClassifiersCatalog();
        final InstitutionsCatalog ic = InstitutionsCatalogFactory.getInstance()
            .getInstitutionsCatalog();
        
        final Batch catBatch = ic.getBatch(batchNumber);
        Chapter catChapter = null;
        if (catBatch != null) {
          catChapter = catBatch.getChapter(chapterNumber);
        }
        Program catProgram = null;
        if (catChapter != null) {
          catProgram = catChapter.getProgram(programNumber);
        }
        final Subtitle catSubtitle = cc.getSubtitle(subtitleNumber);
        
        if (catSubtitle == null) {
          // not interested.
          continue;
        }
        
        if ((catBatch == null) || (catChapter == null)
            || (catProgram == null)) {
          ListStringToExecutionMapper.log.warning(new StringBuilder(
              "Malformed input file. Can't find batch, chapter, program or subtitle in tuple (")
                  .append(batchNumber).append(",").append(chapterNumber)
                  .append(",").append(programNumber).append(",")
                  .append(subtitleNumber).append(")").toString());
          continue;
        }
        
        if ((itemNumber == 0) && (assignmentNumber != 0)) {
          ListStringToExecutionMapper.log.warning(
              new StringBuilder("Malformed input file. Received assignment ")
                  .append(assignmentNumber)
                  .append(" with no item number. See budget row (")
                  .append(batchNumber).append(",").append(chapterNumber)
                  .append(",").append(programNumber).append(",")
                  .append(subtitleNumber).append(")").toString());
          continue;
        }
        
        // No malformed entry, let's create the tree structure as needed
        
        Batch lawBatch = execution.getBatch(batchNumber);
        if (lawBatch == null) {
          lawBatch = new Batch(catBatch.getNumber(), catBatch.getName(),
              catBatch.getDescription(), BudgetElementType.BUDGET);
          execution.addSubelement(lawBatch);
        }
        
        Chapter lawChapter = lawBatch.getChapter(chapterNumber);
        if (lawChapter == null) {
          lawChapter = new Chapter(catChapter.getNumber(), catChapter.getName(),
              catChapter.getDescription(), BudgetElementType.BUDGET);
          lawBatch.addChapter(lawChapter);
        }
        
        Program lawProgram = lawChapter.getProgram(programNumber);
        if (lawProgram == null) {
          lawProgram = new Program(catProgram.getNumber(), catProgram.getName(),
              catProgram.getDescription(), BudgetElementType.BUDGET);
          lawChapter.addProgram(lawProgram);
        }
        
        Subtitle lawSubtitle = lawProgram.getSubtitle(subtitleNumber);
        if (lawSubtitle == null) {
          lawSubtitle = new Subtitle(catSubtitle.getNumber(),
              catSubtitle.getName(), catSubtitle.getDescription(),
              BudgetElementType.BUDGET);
          lawProgram.addSubtitle(lawSubtitle);
        }
        
        if (itemNumber == 0) {
          switch (currency) {
            case DOLLAR:
              lawSubtitle.setInitialDollarBudget(initialBudgetNumber);
              lawSubtitle.setActualDollarBudget(currentBudgetNumber);
              lawSubtitle.setCumulativeDollarExecution(cumulativeExecution);
              
              break;
            default:
              lawSubtitle.setInitialBudget(initialBudgetNumber);
              lawSubtitle.setActualBudget(currentBudgetNumber);
              lawSubtitle.setCumulativeExecution(cumulativeExecution);
          }
          continue;
        }
        
        Item lawItem = lawSubtitle.getItem(subtitleNumber);
        final Item catItem = catSubtitle.getItem(itemNumber);
        if (lawItem == null) {
          lawItem = new Item(catItem.getNumber(), name,
              catItem.getDescription(), BudgetElementType.BUDGET);
          final String catItemName = catItem.getName();
          if (!name.equals(catItemName)) {
            ListStringToExecutionMapper.log.fine(
                new StringBuilder("Name read from budget file:").append(name)
                    .append(" differs from name found in classifiers catalog:")
                    .append(catItemName).append(". Using budget file name.")
                    .toString());
          }
          lawSubtitle.addItem(lawItem);
        }
        
        if (assignmentNumber == 0) {
          switch (currency) {
            case DOLLAR:
              lawItem.setInitialDollarBudget(initialBudgetNumber);
              lawItem.setActualDollarBudget(currentBudgetNumber);
              lawItem.setCumulativeDollarExecution(cumulativeExecution);
              
              break;
            default:
              lawItem.setInitialBudget(initialBudgetNumber);
              lawItem.setActualBudget(currentBudgetNumber);
              lawItem.setCumulativeExecution(cumulativeExecution);
          }
          continue;
        }
        
        Assignment catAssignment = catItem.getAssignment(assignmentNumber);
        if (catAssignment == null) {
          ListStringToExecutionMapper.log.warning(
              new StringBuilder("Found assignment ").append(assignmentNumber)
                  .append(
                      " not contained in base classifiers catalog for the (subtitle,item):(")
                  .append(subtitleNumber).append(",").append(itemNumber)
                  .append(
                      "). It will be added to the catalog for extraction purposes ")
                  .append(
                      "but there could be something wrong with the input files.")
                  .toString());
          catAssignment = new Assignment(assignmentNumber, name, "",
              BudgetElementType.BUDGETARY_CLASSIFICATION);
          catItem.addAssignment(catAssignment);
        }
        
        final Assignment lawAssignment = new Assignment(
            catAssignment.getNumber(), name, catAssignment.getDescription(),
            BudgetElementType.BUDGET);
        final String catAssignmentName = catAssignment.getName();
        if (!name.equals(catAssignmentName)) {
          
          ListStringToExecutionMapper.log.fine(
              new StringBuilder("Name read from budget file:").append(name)
                  .append(" differs from name found in classifiers catalog:")
                  .append(catAssignmentName).append(". Using budget file name.")
                  .toString());
        }
        switch (currency) {
          case DOLLAR:
            lawAssignment.setInitialDollarBudget(initialBudgetNumber);
            lawAssignment.setActualDollarBudget(currentBudgetNumber);
            lawAssignment.setCumulativeDollarExecution(cumulativeExecution);
            
            break;
          default:
            lawAssignment.setInitialBudget(initialBudgetNumber);
            lawAssignment.setActualBudget(currentBudgetNumber);
            lawAssignment.setCumulativeExecution(cumulativeExecution);
        }
        lawItem.addAssignment(lawAssignment);
        
      }
    }
    
    return execution;
    // end-user-code
  }
}
