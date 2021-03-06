package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage  {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//div[@class='TbwUpd NJjxre'])[1]")
	@CacheLookup
	WebElement firstSearchResult;
	
	
	public SearchResultsPage(WebDriver driver) {  
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


public String validateSearchResult(){
		
		return 	firstSearchResult.getText();
	}
	
	

}
