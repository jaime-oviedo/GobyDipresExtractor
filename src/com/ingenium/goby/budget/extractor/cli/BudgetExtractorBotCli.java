/**
 * Copyright (c) 2017 Ingenium Software Ltda.
 */

package com.ingenium.goby.budget.extractor.cli;

import com.ingenium.goby.budget.extractor.bot.BudgetExtractorBot;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Logger;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jaime Oviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/budget-extractor.emx#_H-EEYJVnEeevpubR7V73Yw"
 * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_H-EEYJVnEeevpubR7V73Yw"
 */
public class BudgetExtractorBotCli {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqaSEJWkEeevpubR7V73Yw"
  */
  private static final String EXTRACTION_TYPE_OPTION = "type";
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqa5IZWkEeevpubR7V73Yw"
  */
  private static final String PRESERVE_DOWNLOADED_FILES = "preserve";
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqbgMZWkEeevpubR7V73Yw"
  */
  private static final String FORMAT_OPTION = "format";
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqcHQZWkEeevpubR7V73Yw"
  */
  private static final String FILE_OPTION = "file";
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqcuUZWkEeevpubR7V73Yw"
  */
  private static final String DIRECTORY_OPTION = "dir";
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqdVYZWkEeevpubR7V73Yw"
  */
  private static final String VERBOSE_OPTION = "verbose";
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqd8cZWkEeevpubR7V73Yw"
  */
  private static final String MONTH_OPTION = "month";
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqejgZWkEeevpubR7V73Yw"
  */
  private static final String YEAR_OPTION = "year";
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqfKkZWkEeevpubR7V73Yw"
  */
  private static final String PROCESS_LOCAL_OPTION = "local";
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqfxoJWkEeevpubR7V73Yw"
  */
  private static Logger log = Logger.getLogger(
      "com.ingenium.goby.budget.extractor.cli.BudgetExtractorBotCli");
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_Zo8KsJVnEeevpubR7V73Yw"
  */
  private BudgetExtractorBot budgetExtractorBot;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqg_wJWkEeevpubR7V73Yw"
  */
  private final String[] args;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqiN4JWkEeevpubR7V73Yw"
  */
  private final Options options;
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * Creates a new instance of the class BudgetExtractorBotCli.
  * @param args
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqiN4ZWkEeevpubR7V73Yw"
  */
  private BudgetExtractorBotCli(final String[] args) {
    // begin-user-code
    this.args = args;
    this.options = this.generateOptions();
    this.budgetExtractorBot = new BudgetExtractorBot();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @param args
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqjcA5WkEeevpubR7V73Yw"
  */
  public static void main(final String[] args) {
    // begin-user-code
    final BudgetExtractorBotCli cli = new BudgetExtractorBotCli(args);
    final CommandLine cmd = cli.parse();
    
    cli.printUsage();
    
    final HelpFormatter formatter = new HelpFormatter();
    formatter.printHelp("extract", cli.options);
    cli.extract();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqkqIJWkEeevpubR7V73Yw"
  */
  private void extract() {
    // begin-user-code
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <br>"Definition"&nbsp;stage&nbsp;of&nbsp;command-line&nbsp;parsing&nbsp;with&nbsp;Apache&nbsp;Commons&nbsp;CLI.<br><br>@return&nbsp;Definition&nbsp;of&nbsp;command-line&nbsp;options.<br>
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqkqIZWkEeevpubR7V73Yw"
  */
  
  private Options generateOptions() {
    // begin-user-code
    final Option typeOption = Option.builder("t").required()
        .longOpt(BudgetExtractorBotCli.EXTRACTION_TYPE_OPTION).hasArg()
        .argName("extraction type")
        .desc("The type of extraction to perform: law or execution.").build();
    final Option fileOption = Option.builder("o").required(false)
        .longOpt(BudgetExtractorBotCli.FILE_OPTION).hasArg(true)
        .argName("ouput file")
        .desc(
            "Write output to a file. If no file name is provided a default one will be created")
        .build();
    final Option formatOption = Option.builder("f").required(false)
        .longOpt(BudgetExtractorBotCli.FORMAT_OPTION).hasArg(true)
        .argName("format")
        .desc(
            "Write the output into one of the following formats: human, for human readable csv (default), csv, for optimized csv and json for json formatted file.")
        .build();
    final Option directoryOption = Option.builder("d").required(false)
        .longOpt(BudgetExtractorBotCli.DIRECTORY_OPTION).hasArg()
        .argName("directory")
        .desc(
            new StringBuilder("Place output file in the provided directory.\n")
                .append(
                    "If no directory is provided, the result file will be written to the current directory.\n")
                .append("If the directory does not exist, it will be created.")
                .toString())
        .build();
    final Option verboseOption = Option.builder("v").required(false)
        .hasArg(false).longOpt(BudgetExtractorBotCli.VERBOSE_OPTION)
        .desc("Print status with verbosity.").build();
    final Option preserveOption = Option.builder("p").required(false)
        .longOpt(BudgetExtractorBotCli.PRESERVE_DOWNLOADED_FILES)
        .desc("Do not deleted downloaded source files.").build();
    
    final Option monthOption = Option.builder("m").required(false).hasArg()
        .argName("month").longOpt(BudgetExtractorBotCli.MONTH_OPTION)
        .desc("Do not deleted downloaded source files.").build();
    
    final Option yearOption = Option.builder("y").required(false).hasArg()
        .argName("year").longOpt(BudgetExtractorBotCli.YEAR_OPTION)
        .desc("Do not deleted downloaded source files.").build();
    final Option processLocalOption = Option.builder("l").required(false)
        .hasArg().argName("source dir")
        .longOpt(BudgetExtractorBotCli.PROCESS_LOCAL_OPTION)
        .desc(
            "Do not download files from the DIPRES's website, instead process the files from the provided directory.")
        .build();
    final Options options = new Options();
    options.addOption(typeOption);
    options.addOption(fileOption);
    options.addOption(directoryOption);
    options.addOption(formatOption);
    options.addOption(verboseOption);
    options.addOption(preserveOption);
    options.addOption(monthOption);
    options.addOption(yearOption);
    options.addOption(processLocalOption);
    
    return options;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <br>"Parsing"&nbsp;stage&nbsp;of&nbsp;command-line&nbsp;processing&nbsp;demonstrated&nbsp;with&nbsp;Apache&nbsp;Commons&nbsp;CLI.<br><br>@param&nbsp;options<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Options&nbsp;from&nbsp;"definition"&nbsp;stage.<br>@param&nbsp;args<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Command-line&nbsp;arguments&nbsp;provided&nbsp;to&nbsp;application.<br>@return&nbsp;Instance&nbsp;of&nbsp;CommandLine&nbsp;as&nbsp;parsed&nbsp;from&nbsp;the&nbsp;provided&nbsp;Options&nbsp;and&nbsp;command&nbsp;line&nbsp;arguments;<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;may&nbsp;be&nbsp;{@code&nbsp;null}&nbsp;if&nbsp;there&nbsp;is&nbsp;an&nbsp;exception&nbsp;encountered&nbsp;while&nbsp;attempting&nbsp;to&nbsp;parse&nbsp;the<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;command&nbsp;line&nbsp;options.
  * <!-- end-UML-doc -->
  * @return
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oql4QJWkEeevpubR7V73Yw"
  */
  
  private CommandLine parse() {
    // begin-user-code
    final CommandLineParser cmdLineParser = new DefaultParser();
    CommandLine commandLine = null;
    try {
      commandLine = cmdLineParser.parse(this.options, this.args);
    } catch (final ParseException parseException) {
      System.out.println(
          new StringBuilder("ERROR: Unable to parse command-line arguments")
              .append(Arrays.toString(this.args)).append(" due to: ")
              .append(parseException).toString());
    }
    return commandLine;
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <br>Generate&nbsp;usage&nbsp;information&nbsp;with&nbsp;Apache&nbsp;Commons&nbsp;CLI.<br><br><br><br>@param&nbsp;options<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Instance&nbsp;of&nbsp;Options&nbsp;to&nbsp;be&nbsp;used&nbsp;to&nbsp;prepare<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;usage&nbsp;formatter.<br><br>@return&nbsp;HelpFormatter&nbsp;instance&nbsp;that&nbsp;can&nbsp;be&nbsp;used&nbsp;to&nbsp;print<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;usage&nbsp;information.<br>
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqnGYJWkEeevpubR7V73Yw"
  */
  
  private void printUsage()
  
  {
    // begin-user-code
    final HelpFormatter formatter = new HelpFormatter();
    final String syntax = "Main";
    System.out.println("\n=====");
    System.out.println("Extract budgetary information from DIPRES's website.");
    System.out.println("=====");
    final PrintWriter pw = new PrintWriter(System.out);
    formatter.printUsage(pw, 80, syntax, this.options);
    pw.flush();
    // end-user-code
  }
  
  /** 
  * <!-- begin-UML-doc -->
  * <br>Generate&nbsp;help&nbsp;information&nbsp;with&nbsp;Apache&nbsp;Commons&nbsp;CLI.<br><br><br><br>@param&nbsp;options<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Instance&nbsp;of&nbsp;Options&nbsp;to&nbsp;be&nbsp;used&nbsp;to&nbsp;prepare<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;help&nbsp;formatter.<br><br>@return&nbsp;HelpFormatter&nbsp;instance&nbsp;that&nbsp;can&nbsp;be&nbsp;used&nbsp;to&nbsp;print<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;help&nbsp;information.<br>
  * <!-- end-UML-doc -->
  * @param options
  * @generated "sourceid:platform:/resource/goby-design/budget-extractor.emx#_oqntcJWkEeevpubR7V73Yw"
  */
  
  private static void printHelp(final Options options) {
    // begin-user-code
    final HelpFormatter formatter = new HelpFormatter();
    final String syntax = "Main";
    final String usageHeader = "Example of Using Apache Commons CLI";
    final String usageFooter = "See http://marxsoftware.blogspot.com/ for further details.";
    System.out.println("\n====");
    System.out.println("HELP");
    System.out.println("====");
    formatter.printHelp(syntax, usageHeader, options, usageFooter);
    // end-user-code
  }
}