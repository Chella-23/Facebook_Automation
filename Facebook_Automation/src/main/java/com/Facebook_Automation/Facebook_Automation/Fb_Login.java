package com.Facebook_Automation.Facebook_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Login extends GetResultsMethods {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Google_Automation\\Facebook_Automation\\Library\\Drivers\\chromedriver.exe");
		ChromeDriver ch=null;
		try {
			GetResultsMethods grs=new GetResultsMethods();
			
			
			ch = new ChromeDriver();
			ch.manage().window().maximize();
			ch.get("https://www.facebook.com/");
			Thread.sleep(2000);
			GetResultsMethods.get_Screenshot();
			ch.findElement(By.name("firstname")).sendKeys("First Name");
			ch.findElement(By.name("lastname")).sendKeys("LastName");
			ch.findElement(By.name("reg_email__")).sendKeys("test@sg.com");
			Thread.sleep(2000);
			ch.findElement(By.name("reg_email_confirmation__")).sendKeys("test@sg.com");
			ch.findElement(By.id("password_step_input")).sendKeys("Mercury1");
			
			ch.findElement(By.name("websubmit")).click();
			
			
			Thread.sleep(5000);
			ch.close();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			ch = null;
		}
		

	}

}
