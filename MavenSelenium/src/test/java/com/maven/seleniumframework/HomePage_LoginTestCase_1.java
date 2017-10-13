package com.maven.seleniumframework;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.maven.seleniumframework.pageobjects.LandingPage;
import com.maven.seleniumframework.pageobjects.LoginPage;
import com.maven.seleniumframework.resources.Base_Work;

public class HomePage_LoginTestCase_1 extends Base_Work{
	
		@BeforeTest
		public void browserIntializer() throws IOException{
		driver=initializeDriver();
		driver.get(prop.getProperty("domain"));
	}

		@Test(dataProvider="getData")
		public void homepagenavigation(String username, String pass) throws IOException
		{
		
			//This code is for Landing WebApplication homepage
			LandingPage obj = new LandingPage(driver);
			obj.signin().click();
			//This code is for  Login validation
			LoginPage log = new LoginPage(driver);
			log.getUserId().sendKeys(username);
			log.getPassWrd().sendKeys(pass);
			log.getLogin().click();
		}
		
		@AfterTest
		public void Pageshutdown() {
			
			driver.close();
		}
		
		@DataProvider
		public Object[][] getData() {
			
			Object[][] data = new Object[1][2];
			data[0][0]="pageobjectmodel@gmail.com";
			data[0][1]="pageobject";
			return data;
			
			
			
		}
		 

		
	}

