package com.object.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_Rediff {
	
	WebDriver driver;
	
/*	By username = By.xpath(".//*[@id='login1']");
	By password = By.name("passwd");
	By go = By.cssSelector(".floatL>input");*/

	public LoginPage_Rediff(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
   By username=By.xpath(".//*[@id='login1']");
   By Password=By.name("passwd");
   By go=By.name("proceed");
   By home=By.linkText("Home");
   
   
   public WebElement emaild()
   {
	   return driver.findElement(username);
   }
         
   public WebElement password()
   {
	   return driver.findElement(Password);
   }
   
   public WebElement submit()
   {
	   return driver.findElement(go);
   }
   
   public WebElement home()
   {
	   return driver.findElement(home);
   }


}
