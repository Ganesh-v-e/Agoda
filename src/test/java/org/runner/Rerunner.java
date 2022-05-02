package org.runner;

import org.junit.AfterClass;

import report.JVMreport;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import report.JVMreport;


@RunWith(Cucumber.class)
	@CucumberOptions(features="@src\\test\\resources\\reRun\\failedcases.txt", glue="org.stepdefinition", dryRun=false, plugin = {"html:target\\reports",
	                                                                                                       "junit:target\\reports\\agoda.xml", 		
			                                                                                               "json:target\\reports\\agoda.json",
	                                                                                                       "rerun:src\\test\\resources\\reRun\\failedcases.txt"})

       


public class Rerunner {

	
	@AfterClass
	
	
	public static void finalReport() {

		JVMreport.generatrJvmReport("C:\\Users\\Homeeee\\eclipse-workspace\\AgodaTesting\\target\\reports\\agoda.json");
	}
	
	
	
	
}
