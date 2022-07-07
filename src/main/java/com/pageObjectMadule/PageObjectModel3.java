package com.pageObjectMadule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel3 {
	
	public WebDriver driver;
	


	@FindBy (xpath= "(//input[@type='text'])[11]")
	private WebElement firstname;
	
	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement lastname;
	
	@FindBy (xpath = "//textarea[@name='address']")
	private WebElement addressbox;
	
	@FindBy (xpath ="(//input[@type='text'])[13]")
	private WebElement cardno;
	
	@FindBy (xpath = "//select[@name='cc_type']")
	private WebElement cardtype;
	
	@FindBy (xpath = "//select[@name='cc_exp_month']")
	private WebElement month;
	
	@FindBy (xpath = "//select[@name='cc_exp_year']")
	private WebElement year;
	
	@FindBy (xpath = "(//input[@type='text'])[14]")
	private WebElement cvv;
	
	@FindBy(xpath = "//input[@type='button']")
	private WebElement booknow;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	public PageObjectModel3(WebDriver driver3) {
		
      this.driver= driver3;
      
      PageFactory.initElements(driver, this);;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddressbox() {
		return addressbox;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getLogout() {
		return logout;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
