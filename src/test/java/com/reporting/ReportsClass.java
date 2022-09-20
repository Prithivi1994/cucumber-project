package com.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportsClass {
	public static void generateJvm(String jsonFile) {
		File file=new File("C:\\Users\\PRITHIVIRAJ\\eclipse-workspace4\\CucumberProject\\src\\test\\resources\\report");
		
		Configuration config=new Configuration(file, "Adactin");
		
		config.addClassifications("os", "Windows 11");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("version", "101");
		
		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder=new ReportBuilder(jsonFiles, config);
		builder.generateReports();
		

	}
}
