package com.qa.stepDefinitions;



import org.apache.logging.log4j.LogManager;
import com.qa.pages.GoogleSearchPage;
import com.qa.pages.SearchResultsPage;
import com.qa.util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class GoogleSearchSteps extends TestBase {
	
	GoogleSearchPage page ;
	SearchResultsPage resultPage;
	org.apache.logging.log4j.Logger logger = LogManager.getLogger(GoogleSearchSteps.class);
	
	@Given("^user opens browser$")
	 public void user_opens_browser() {
		TestBase.initialization();
		logger.info("Chrome Browser is Launched successfully");
	 }
	
	
	@When("^user is on google home page$")
	public void user_is_on_google_home_page() throws Throwable {
		logger.info("Test Started Successfully");
		page = new GoogleSearchPage(driver);
		String title = page.validateHomepageTitle();
		Assert.assertEquals("Google", title);
		
	}

	@Then("^user enters \"([^\"]*)\" search box$")
	public void user_enters_search_box(String companyName) throws Throwable {
		page.enterCompanyName(companyName);
	}
	
	
	@Then("^\"([^\"]*)\" should be the first searched result$")
	public void should_be_the_first_search_result(String expectedResult) throws Throwable {
		resultPage = new SearchResultsPage(driver);
		String actualResult = resultPage.validateSearchResult();
		Assert.assertEquals(expectedResult, actualResult);
		logger.info("Test completed successfully");
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		logger.info("Tear Down for test started");
		driver.close();
		logger.info("Chrome Brwowser closed successfully");
	}
}
