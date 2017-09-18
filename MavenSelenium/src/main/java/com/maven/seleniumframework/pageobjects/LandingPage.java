package com.maven.seleniumframework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By login=By.cssSelector("i[class='fa fa-lock fa-lg']");
	
	public LandingPage(WebDriver driver) {
		
		this.driver= driver;
	}

	public WebElement signin() {
		
		return driver.findElement(login);
		
	}

}
