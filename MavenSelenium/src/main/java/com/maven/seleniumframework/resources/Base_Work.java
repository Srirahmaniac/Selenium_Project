package com.maven.seleniumframework.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Work {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Eclipse project\\MavenSelenium\\data.properties");
		prop.load(file);
		String browsername= prop.getProperty("browser");
		//prop.getProperty("url");
		System.out.println(browsername);
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			//Execute chrome driver
		}
		else if (browsername.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 //Execute firefoxdriver
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
	}

}
