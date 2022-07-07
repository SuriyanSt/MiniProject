package com.pageObjectManager;

import org.openqa.selenium.WebDriver;

import com.pageObjectMadule.PageObjectModel1;
import com.pageObjectMadule.PageObjectModel2;
import com.pageObjectMadule.PageObjectModel3;

public class Page_Object_Manager_Practice {
	

	public WebDriver driver;
	
	private PageObjectModel1 obj;
	private PageObjectModel2 obj2;
	private PageObjectModel3 obj3;
	
	

	public PageObjectModel3 getInstance3() {
		if(obj3==null) {
			obj3= new PageObjectModel3(driver);
		}
		return obj3;
	}

	public Page_Object_Manager_Practice(WebDriver driver2) {
		this.driver = driver2;
	}

	public PageObjectModel1 getInstance() {
		if (obj ==null) {
		     obj = new PageObjectModel1(driver);
			}
		return obj;
		
	}
	
	public PageObjectModel2 getInstance2() {
		if(obj2==null) {
			obj2= new PageObjectModel2(driver);
		}
		return obj2;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
