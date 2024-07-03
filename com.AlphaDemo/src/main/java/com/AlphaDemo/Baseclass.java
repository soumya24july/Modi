package com.AlphaDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


public class Baseclass {
	
	public WebDriver driver;
	
	
	@BeforeSuite
	public void openDb()
	{
		Reporter.log("Database is open", true);
	}
	
	@BeforeClass
	public void openBrowser()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		if(BROWSER.contains("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.contains("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void DbConnectionClose()
	{
		driver.quit();
	}
	
	

}
