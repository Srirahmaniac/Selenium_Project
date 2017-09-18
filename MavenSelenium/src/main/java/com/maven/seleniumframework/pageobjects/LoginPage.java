package com.maven.seleniumframework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email =By.cssSelector("input[id='user_email']");
	By pswd = By.cssSelector("input[id='user_password']");
	By login = By.xpath("//input[@value=\"Log In\"]");
	
	public LoginPage(WebDriver driver) {
		
		this.driver= driver;
	}

	public WebElement getUserId() {
		
		return driver.findElement(email);
		
	}
	
	public WebElement getPassWrd() {
		
		return driver.findElement(pswd);
		
	}
		
	public WebElement getLogin() {
			
			return driver.findElement(login);
		
	}

}
