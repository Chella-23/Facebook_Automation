package com.Facebook_Automation.Facebook_Automation;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetResultsMethods {

	public static void main(String[] args) {
		
		get_Screenshot();
		
		

	}

	public static void get_Screenshot()
	{
		WebDriver ch=null;
		
		try {
      TakesScreenshot sh=(TakesScreenshot)ch;
		    
		    File source=sh.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(source,new File("C:\\Users\\user\\Desktop\\Google_Automation\\Facebook_Automation\\Results\\ScreenShot\\Login.png"));
		    
		}
		 catch (Exception e){
			 
			 System.out.println(e);
		 }
	}
	
	
	
	
}
