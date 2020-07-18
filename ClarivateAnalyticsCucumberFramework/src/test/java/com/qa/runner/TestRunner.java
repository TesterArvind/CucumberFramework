package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Admin\\git\\CucumberFramework\\ClarivateAnalyticsCucumberFramework\\src\\main\\java\\com\\qa\\features\\search.feature",
		glue={"com.qa.stepDefinitions"}, //path of the step definition file
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, 
		monochrome = true, 
		strict = true, 
		dryRun = false 		
		)
 
public class TestRunner {
 
}