package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AdminUIRepo.AdminLoginPage;

public class GlobalAdminLoginTest {
	
	@Test
	public void LoginGlobalAdmin() throws InterruptedException
	{
				// GlobalAdmin Login & Logout
				System.setProperty("webdriver.chrome.driver", "./lib/browsers/chromedriver");
		
				ChromeDriver chromeDriver = new ChromeDriver();
				chromeDriver.get("http://10.131.158.56:8080/arcotadmin/mabamlogin.htm");
				AdminLoginPage adminLogin = new AdminLoginPage(chromeDriver);
				chromeDriver.get("http://10.131.158.56:8080/arcotadmin/adminlogin.htm");
				adminLogin.OrgName().sendKeys("defaultorg");
				adminLogin.Login().click();
				adminLogin.UserName().sendKeys("ga");
				adminLogin.UserPassword().sendKeys("dost1234@");
				
				adminLogin.Login().click();
				Thread.sleep(5000);;
				adminLogin.Logout();
				
	}

}
