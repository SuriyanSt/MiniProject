package com.pageObjectMadule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel2 {
	
	public WebDriver driver;
	

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement clicked;
	
	

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continuebtn;
	
	public PageObjectModel2(WebDriver smdriver) {
		this.driver= smdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClicked() {
		return clicked;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
