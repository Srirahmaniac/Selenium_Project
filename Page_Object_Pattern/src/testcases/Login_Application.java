package testcases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import com.object.selenium.HomePage_Rediff;
import com.object.selenium.LoginPage_Rediff;
import library.utility;

public class Login_Application extends utility{
	
	@Test
	public void login()
	{
			LoginPage_Rediff lp=new LoginPage_Rediff(driver);
			lp.emaild().sendKeys("podapanni@gmail.com");
			lp.password().sendKeys("podapanni");
			//rd.submit().click();
			lp.home().click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			HomePage_Rediff hp=new HomePage_Rediff(driver);
			hp.search().sendKeys("rediff");
			hp.submit().click();
			
	}

}
