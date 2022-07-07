package CucumberPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static WebDriver getbrowser(String browsername){
		if (browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Chromedriver//chromedriver.exe");
			   
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	}
		
		else if (browsername.equalsIgnoreCase("firefox")) {
			

			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Chromedriver//chromedriver.exe");
			   
		 driver = new ChromeDriver();	
		}
		
		return driver;
		
	}
	

	
	public static void getURl(String url) {
		driver.get(url);

	}
	
	public static void ClickOnElement(WebElement element) {
		
		element.click();
		}
	
	
	public static void InputValueElement(WebElement element, String value) {
		element.sendKeys(value);

	}
	 
	public static void screenshot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(location);
	    FileHandler.copy(sc, des);
	}
	
	public static void DragAndDrop(WebElement element, WebElement element2) {
		 Actions act = new Actions(driver);
		 act.dragAndDrop(element, element2).build().perform();

	}
	
	public static void selectbyVisibleText(WebElement element, String name) {
		
		Select sel = new Select(element);
		sel.selectByVisibleText(name);
	}
	
	public static void selectByIndex(WebElement element, int index) {
		
		Select sel = new  Select(element);
		sel.selectByIndex(index);
		}
	public static void selectByValue(WebElement element, String value) {
		
		Select sel = new Select(element);
		sel.selectByValue(value);
		
		
  
	}

	
	
	
	public static void Closebrowser() {
	driver.close();
	}
	
	 

}
