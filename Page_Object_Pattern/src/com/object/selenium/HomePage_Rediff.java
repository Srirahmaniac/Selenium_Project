package com.object.selenium;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Rediff {
	
		WebDriver driver;
		public HomePage_Rediff(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
	    
	  
	  
	  @FindBy(id="srchword")
	  WebElement search;
	  
	  @FindBy(xpath="//input[@type='submit']")
	  WebElement submit;
	  
	  
	  
	  
	    
	    public WebElement search()
	    {
	    	return search;
	    }
	   
	    public WebElement submit()
	    {
	    	return submit;
	    }
	   
	 
		}



