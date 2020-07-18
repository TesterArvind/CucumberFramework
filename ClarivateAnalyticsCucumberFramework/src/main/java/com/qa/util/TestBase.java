package com.qa.util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import com.qa.stepDefinitions.GoogleSearchSteps;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop ;
	public static WiniumDriver winiumDriver;
   
	
	public TestBase(){
		prop = new Properties();
		try {
			InputStream input = new FileInputStream(System.getProperty("user.dir")+"\\input\\config.properties");
			prop.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void initialization(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");	
			driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
	}
	
	public static void initializationForWiniumDriver() throws IOException{
		String command = "C:\\Users\\Admin\\Downloads\\Winium.Desktop.Driver\\Winium.Desktop.Driver.exe";
		ProcessBuilder builder = new ProcessBuilder(command).inheritIO();
		builder.start();
		
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("c:\\Windows\\System32\\calc.exe");
		winiumDriver = new WiniumDriver(new URL("http://localhost:9999"),option);	
		
//		winiumDriver.findElement(By.name("Six")).click();
//		winiumDriver.findElement(By.name("Five")).click();
//		winiumDriver.findElement(By.name("Five")).click();
//		winiumDriver.findElement(By.name("Seven")).click();
//		winiumDriver.findElement(By.name("Five")).click();
	}	
}
