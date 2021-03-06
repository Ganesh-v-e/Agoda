package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import report.JVMreport;


@RunWith(Cucumber.class)
	@CucumberOptions(features="src\\test\\resources\\", glue="org.stepdefinition", tags = {"@dummy"} , dryRun=false, plugin = {"html:target\\reports",
	                                                                                                       "junit:target\\reports\\agoda.xml", 		
			                                                                                               "json:target\\reports\\agoda.json",
	                                                                                                       "rerun:src\\test\\resources\\reRun\\failedcases.txt"})

                                                                                                              

public class HomeTestRunnerClass {
	
	
	
	@AfterClass
	
	
	public static void finalReport() {

		JVMreport.generatrJvmReport("C:\\Users\\Homeeee\\eclipse-workspace\\AgodaTesting\\target\\reports\\agoda.json");
	}
	
	
	
}
