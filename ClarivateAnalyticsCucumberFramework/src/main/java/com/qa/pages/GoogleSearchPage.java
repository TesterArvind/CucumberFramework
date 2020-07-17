package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.TestBase;


    
public class GoogleSearchPage  {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='q']")
	@CacheLookup
	WebElement searchbox;
	
	
	
	public GoogleSearchPage(WebDriver driver) {  
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomepageTitle(){
		
	   return driver.getTitle();
	}
	
	public SearchResultsPage enterCompanyName(String name) {
		searchbox.sendKeys(name);
		searchbox.sendKeys(Keys.ENTER);
		return new SearchResultsPage(driver);	
	}	
	
	
}
