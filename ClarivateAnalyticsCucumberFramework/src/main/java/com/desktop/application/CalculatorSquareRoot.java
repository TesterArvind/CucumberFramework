package com.desktop.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.WiniumDriver;

import com.qa.enums.CalculatorKeys;

import junit.framework.Assert;

public class CalculatorSquareRoot {


	public WiniumDriver winiumDriver;

	public CalculatorSquareRoot(WiniumDriver winiumDriver) {  
		this.winiumDriver = winiumDriver;

	}

	public void enterDigitsInCalculator(String digit ){
		
		for (char ch : String.valueOf(digit).toCharArray()) {
			winiumDriver.findElement(By.id(String.valueOf(CalculatorKeys.valueOf("NUM" + ch)))).click();
           
        }
	}

	public void pressSquareRootButton(){
		winiumDriver.findElement(By.name("Square root")).click();
	}
    
	public void validateResultOutput(String ExpectedResult){
		
		String ActalResult = winiumDriver.findElement(By.id("CalculatorResults")).getAttribute("Name");
		Assert.assertTrue((ActalResult.contains(ExpectedResult)));
		winiumDriver.findElement(By.name("Close")).click();
	}

}
