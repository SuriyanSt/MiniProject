package com.stepdefination;



import java.io.IOException;

import com.pageObjectManager.Page_Object_Manager_Practice;
import com.properties.FileReadManager;

import CucumberPractice.Baseclass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdefination extends Baseclass{
	
	public static Page_Object_Manager_Practice pom = new Page_Object_Manager_Practice(driver);
	
	@Before
	public void beforeHooks(Scenario s) {
		
		String name = s.getName();
		System.out.println("Scenario Name: "+ name);
	
	}
	@After
	public void afterHooks(Scenario s) throws IOException {
		
		String status = s.getStatus();
		System.out.println("Scenario Status: "+ status);
		
		if (s.isFailed()) {
			
			screenshot("C:\\Users\\MAHES\\Cucumber\\Cucumberlearning\\Screenshots");
			
		}

	}

	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		
		String url = FileReadManager.getFRM().getCR().geturl();
		getURl(url);
		
		Thread.sleep(2000);
	}
	

	
	@When("^user Enter The \"([^\"]*)\" In the Username Field$")
	public void user_Enter_The_In_the_Username_Field(String username) throws Throwable {
		InputValueElement(pom.getInstance().getLogin(),username);
	}
	
	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
		 InputValueElement(pom.getInstance().getPass(),password);
	}	
	@Then("^user Click the Login Button And Navigates To The Search Hotel Page$")
	public void user_Click_the_Login_Button_And_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		
     	ClickOnElement(pom.getInstance().getBtn());

	}
	
	@When("^user Select The \"([^\"]*)\" In The Location Field$")
	public void user_Select_The_In_The_Location_Field(String location) throws Throwable {
		
     	selectbyVisibleText(pom.getInstance().getLocation(), location);
     	
  

	}
	
	@When("^user Select The \"([^\"]*)\" In The Hotels Field$")
	public void user_Select_The_In_The_Hotels_Field(String selectHotel) throws Throwable {
		
     	selectbyVisibleText(pom.getInstance().getHotels(), selectHotel);

	}
	
	@When("^user Select The \"([^\"]*)\" In The HotelType Field$")
	public void user_Select_The_In_The_HotelType_Field(String Roomtype) throws Throwable {
		
		selectbyVisibleText(pom.getInstance().getRoomtype(), Roomtype);
	}
	
	@When("^user Select The \"([^\"]*)\" In The Number Of Rooms Field$")
	public void user_Select_The_In_The_Number_Of_Rooms_Field(String numberOfRoom) throws Throwable {
		
		selectbyVisibleText(pom.getInstance().getRoomNos(), numberOfRoom);
	}
	
	@When("^user Enter The \"([^\"]*)\" In The Check In Date Field$")
	public void user_Enter_The_In_The_Check_In_Date_Field(String cid) throws Throwable {
		
		InputValueElement(pom.getInstance().getDate(), cid);
	}
	
	@When("^user Enter The \"([^\"]*)\" In The Check Out Date Field$")
	public void user_Enter_The_In_The_Check_Out_Date_Field(String  cot) throws Throwable {
		
		InputValueElement(pom.getInstance().getCheckoutDate(), cot);
		
	
	}
	
	@Then("^user Click The Search Button And Navigates To The Select Hotel Page$")
	public void user_Click_The_Search_Button_And_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		
		ClickOnElement(pom.getInstance().getSearchbtn());
	}
	
	@When("^user Select The Select Button$")
	public void user_Select_The_Select_Button() throws Throwable {
		
		ClickOnElement(pom.getInstance2().getClicked());

	}
	
	@Then("^user Click the Continue Button And Navigates To The Book A Hotel page$")
	public void user_Click_the_Continue_Button_And_Navigates_To_The_Book_A_Hotel_page() throws Throwable {
		
		ClickOnElement(pom.getInstance2().getContinuebtn());

	}
	
	@When("^user Enter The \"([^\"]*)\" In The Firstname Field$")
	public void user_Enter_The_In_The_Firstname_Field(String fname) throws Throwable {
		
    InputValueElement(pom.getInstance3().getFirstname(),fname);
	}
	
	@When("^user Enter The \"([^\"]*)\" In The Lastname Field$")
	public void user_Enter_The_In_The_Lastname_Field(String lasname) throws Throwable {
		
		
		InputValueElement(pom.getInstance3().getLastname(),lasname);
	}
	
	@When("^user Enter The \"([^\"]*)\" In The Billing Address Field$")
	public void user_Enter_The_In_The_Billing_Address_Field(String addres) throws Throwable {
		
		
		InputValueElement(pom.getInstance3().getAddressbox(),addres);
	}
	
	@When("^user Enter The \"([^\"]*)\"In The Credit Card No Field$")
	public void user_Enter_The_In_The_Credit_Card_No_Field(String cardn) throws Throwable {
		
	
		InputValueElement(pom.getInstance3().getCardno(),cardn);
	}
	
	@When("^user Select The \"([^\"]*)\" In Credit Card Field$")
	public void user_Select_The_In_Credit_Card_Field(String cct) throws Throwable {
		
		selectbyVisibleText(pom.getInstance3().getCardtype(),cct);
	}
	
	@When("^user Select The \"([^\"]*)\" In the Expiry Month Field$")
	public void user_Select_The_In_the_Expiry_Month_Field(String month) throws Throwable {
		
		selectbyVisibleText(pom.getInstance3().getMonth(),month);
	}
	
	@When("^user Select The \"([^\"]*)\" In the Expiry Year Field$")
	public void user_Select_The_In_the_Expiry_Year_Field(String year) throws Throwable {
		
		selectbyVisibleText(pom.getInstance3().getYear(),year);
	}
	
	@When("^user Enter The \"([^\"]*)\" In The Cvv Field$")
	public void user_Enter_The_In_The_Cvv_Field(String cvv) throws Throwable {
		
	
		InputValueElement(pom.getInstance3().getCvv(),cvv);
		
	}
	
	@Then("^Click The Booking Now Button And Navigate To The Booking Confirmation Page$")
	public void click_The_Booking_Now_Button_And_Navigate_To_The_Booking_Confirmation_Page() throws Throwable {
		
		ClickOnElement(pom.getInstance3().getBooknow());
		
	}
	
	@When("^user Click the Logout Button$")
	public void user_Click_the_Logout_Button() throws Throwable {
		
		ClickOnElement(pom.getInstance3().getLogout());
	}

}
