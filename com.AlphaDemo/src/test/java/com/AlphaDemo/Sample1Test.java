package com.AlphaDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1Test {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void m1()
	{
		//Soumya
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.news18.com");
		
	}
	
	
	
	

}
