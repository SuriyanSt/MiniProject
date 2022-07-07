	package com.pageObjectMadule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel1 {
	
public WebDriver driver;
	
	
	@FindBy (xpath = "//input[@id='username']")
	
	private WebElement login;
	


	@FindBy (xpath = "//input[@id='password']")
	
	private  WebElement pass;
	
	@FindBy (xpath = "//input[@id='login']")
	
	private WebElement btn;
	
	
	public PageObjectModel1(WebDriver rcdriver) {
		
		this.driver = rcdriver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getBtn() {
		return btn;
	}
	
	
	
	@FindBy(xpath = "//select[@name='location']")
	
	private WebElement location;
	


	@FindBy (xpath = "//select[@name='hotels']")
	
	private WebElement hotels;
	
	
	@FindBy (xpath = "//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomNos;
	
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement date;
	
	
	@FindBy (xpath= "(//input[@type='text'])[3]")
	private WebElement checkoutDate; 

	@FindBy(xpath ="//input[@id='Submit']")
	private WebElement searchbtn;
	
	
	

	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getHotels() {
		return hotels;
	}

    public WebElement getRoomtype() {
		return roomtype;
	}

    public WebElement getRoomNos() {
		return roomNos;
	}

    public WebElement getDate() {
		return date;
	}
    public WebElement getCheckoutDate() {
		return checkoutDate;
	}
    public WebElement getSearchbtn() {
		return searchbtn;
	}
  



}
