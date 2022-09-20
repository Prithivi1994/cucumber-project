package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reporting.ReportsClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:src/test/resources/report/cucumber.json"},
	dryRun = false, features = "src/test/resources", 
	glue = "com.stepdefinition",monochrome=true)
public class Runner {
	@AfterClass
	public static void cucumberReports() {
		ReportsClass.generateJvm("C:\\Users\\PRITHIVIRAJ\\eclipse-workspace4\\CucumberProject\\src\\test\\resources\\report\\cucumber.json");

	}

}
