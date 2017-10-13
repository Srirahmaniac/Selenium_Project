package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class utility {
	public WebDriver driver;
	
	@BeforeTest
	public void browserInitiating() {
	 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();	
	 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	@AfterTest
	public void browserClosing()
	{
	driver.quit();	
	}	 

	
}
