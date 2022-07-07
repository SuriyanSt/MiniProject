package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
public static Properties pro;
	
	public ConfigurationReader() throws IOException {
		
		  File fili = new File("C:\\Users\\MAHES\\Cucumber\\Cucumberlearning\\src\\main\\java\\com\\properties\\adactin.properties");
		   
		   FileInputStream fid = new FileInputStream(fili);
		 
		   pro = new Properties();
		   
		   pro.load(fid);
		
	}
	
 public String geturl() throws IOException {
 
   
   String url = pro.getProperty("url");
   
   return url;
  }
 
 public String getusername() {
	  
	 String username = pro.getProperty("username");
	 
	 return username;

}
 
 public String getpassword() {
	
	 String pass = pro.getProperty("pass");
	 
	 return pass;

}
 
 public String getfirstname() {
	 
     String fname = pro.getProperty("firstname");
     
     return fname;
}
 
 public String getlastname() {
  
	 String lstname = pro.getProperty("lastname");
	 
	 return lstname;
}
 
 
 public String getcardno() {
	 
  String cardno = pro.getProperty("cardno");
  
  return cardno;
}
 
 public String getcvv() {

	 String cvv = pro.getProperty("cvvno");
	 
	 return cvv;
}
 
 public String address() {
	 
String add = pro.getProperty("address");

return add;
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

}
