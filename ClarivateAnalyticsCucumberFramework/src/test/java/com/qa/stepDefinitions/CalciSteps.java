package com.qa.stepDefinitions;

import org.apache.logging.log4j.LogManager;

import com.desktop.application.CalculatorSquareRoot;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalciSteps extends TestBase {
	
	CalculatorSquareRoot calci;
	
	org.apache.logging.log4j.Logger logger = LogManager.getLogger(GoogleSearchSteps.class);
	
	
	@Given("^Open windows calculator app$")
	public void open_windows_calculator_app() throws Throwable {
		logger.info("Start Winium Driver");
		TestBase.initializationForWiniumDriver();
		logger.info("Winium Driver Started Successfully");
	}

	@When("^Enter \"([^\"]*)\"  value$")
	public void enter_value(String arg1) throws Throwable {
		calci= new CalculatorSquareRoot(winiumDriver);
		calci.enterDigitsInCalculator(arg1);
		logger.info(arg1+ "entered in calculator");
	
	}

	@Then("^user clicks square root button$")
	public void user_clicks_square_root_button() throws Throwable {
		calci.pressSquareRootButton();
		logger.info("Square Root button pressed");
	}

	@Then("^validate result is \"([^\"]*)\"$")
	public void validate_result_is(String arg1) throws Throwable {
		calci.validateResultOutput(arg1);
		logger.info("Test Completed Successfully");
	    
	}

}
