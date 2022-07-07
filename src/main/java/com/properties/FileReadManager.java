package com.properties;

import java.io.IOException;

public class FileReadManager {
	
	
	private FileReadManager() {
		
	}
	
  public static FileReadManager getFRM() {
	  
	  FileReadManager frm = new FileReadManager();
	  
	  return frm;
	

}
	
	
	public ConfigurationReader getCR() throws IOException {
		
  ConfigurationReader cr = new ConfigurationReader();
  
  return cr;

	}
	
	

}
