package org.test.prolaborate.runner.Users_In_Repository;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featureFiles/Users_In_Repository/Add_Existing_Users.feature", glue = "org.test.prolaborate.stepDefinitions", dryRun = !true, strict = true, plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" } , tags = {"@tag9"} )
public class Add_Existing_Users {
	@BeforeClass
	public static void before() throws IOException {
		System.out.println("Before runner class Runned");
		FileOutputStream fis = new FileOutputStream("src\\test\\resources\\extent.properties");
		Properties prop = new Properties();
		prop.setProperty("extent.reporter.spark.start", "true");
		prop.setProperty("extent.reporter.spark.config", "src/test/resources/extent-config.xml");
		prop.setProperty("extent.reporter.spark.out", "report/Add_Existing_Users.html");
		prop.store(fis, null);
	}
	
}


