package CucumberPractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pageObjectMadule.PageObjectModel2;
import com.pageObjectMadule.PageObjectModel3;
import com.pageObjectManager.Page_Object_Manager_Practice;
import com.properties.FileReadManager;

public class RunnerClass extends Baseclass  {
	
public static WebDriver driver = getbrowser("Chrome");
	
	
	public static Page_Object_Manager_Practice pom = new Page_Object_Manager_Practice(driver);
	public static  PageObjectModel2 obj2 = new PageObjectModel2(driver);
	public static PageObjectModel3 obj3 = new PageObjectModel3(driver);
	
	
	
	public static void main(String[] args) throws IOException {
		
	String url = FileReadManager.getFRM().getCR().geturl();
	getURl(url);
	
		String username = FileReadManager.getFRM().getCR().getusername();
		InputValueElement(pom.getInstance().getLogin(),username);
		
		
		String password = FileReadManager.getFRM().getCR().getpassword();
	    InputValueElement(pom.getInstance().getPass(),password);
	
     	ClickOnElement(pom.getInstance().getBtn());
     	
     	selectbyVisibleText(pom.getInstance().getLocation(), "Sydney");
     	selectbyVisibleText(pom.getInstance().getHotels(), "Hotel Sunshine");
     	selectbyVisibleText(pom.getInstance().getRoomtype(), "Double");
     	selectbyVisibleText(pom.getInstance().getRoomNos(), "3 - Three");
     	InputValueElement(pom.getInstance().getDate(), "12/06/2022");
     	InputValueElement(pom.getInstance().getCheckoutDate(), "15/06/2022");
		ClickOnElement(pom.getInstance().getSearchbtn());
		
		ClickOnElement(pom.getInstance2().getClicked());
		ClickOnElement(pom.getInstance2().getContinuebtn());
		
		
		String firtname = FileReadManager.getFRM().getCR().getfirstname();
		InputValueElement(pom.getInstance3().getFirstname(),firtname);
		
		String lasname = FileReadManager.getFRM().getCR().getlastname();
		InputValueElement(pom.getInstance3().getLastname(),lasname);
		
		String addres = FileReadManager.getFRM().getCR().address();
		InputValueElement(pom.getInstance3().getAddressbox(),addres);
		
		String cardn = FileReadManager.getFRM().getCR().getcardno();
		InputValueElement(pom.getInstance3().getCardno(),cardn);
		
		selectbyVisibleText(pom.getInstance3().getCardtype(),"VISA");
		selectbyVisibleText(pom.getInstance3().getMonth(),"March");
		selectbyVisibleText(pom.getInstance3().getYear(),"2022");
		
		String cvv = FileReadManager.getFRM().getCR().getcvv();
		InputValueElement(pom.getInstance3().getCvv(),cvv);
		
		ClickOnElement(pom.getInstance3().getBooknow());
		
		ClickOnElement(pom.getInstance3().getLogout());
	

     //	screenshot("C:\\Users\\MAHES\\Maven\\MavenPractice\\Screenshot\\photo1.png");
		
	//	Closebrowser();
		
		
		
		
		

}


}
