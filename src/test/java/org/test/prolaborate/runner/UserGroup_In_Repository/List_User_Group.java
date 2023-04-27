package org.test.prolaborate.runner.UserGroup_In_Repository;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featureFiles/UserGroup_In_Repository/List_User_Group.feature", glue = "org.test.prolaborate.stepDefinitions", dryRun = false
        , strict = true, plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags = {"@List_User_Group"},monochrome = true)
public class List_User_Group {
    @BeforeClass
    public static void before() throws IOException {
        System.out.println("Before runner class Runned");
        FileOutputStream fis = new FileOutputStream("src\\test\\resources\\extent.properties");
        Properties prop = new Properties();
        prop.setProperty("extent.reporter.spark.start", "true");
        prop.setProperty("extent.reporter.spark.config", "src/test/resources/extent-config.xml");
        prop.setProperty("extent.reporter.spark.out", "report/List_User_Group.html");
        prop.store(fis, null);
    }
}

