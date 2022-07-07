package com.test_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import CucumberPractice.Baseclass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\feature" , glue = "com\\stepdefination",
                    plugin = {"html:Report" , "com.cucumber.listener.ExtentCucumberFormatter:Report/adactin.html"})
public class TestRunner  {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		
		driver = Baseclass.getbrowser("Chrome");

	}
	@AfterClass
	public static void getout() {
		
		driver.close();

	}
	

}
