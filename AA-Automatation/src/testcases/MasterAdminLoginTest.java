package testcases;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AdminUIRepo.AdminLoginPage;




public class MasterAdminLoginTest {

	@Test
	public static void LoignMasterAdmin() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./lib/browsers/chromedriver");
		
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://10.131.158.56:8080/arcotadmin/mabamlogin.htm");
		AdminLoginPage adminLogin = new AdminLoginPage(chromeDriver);
		// MasterAdmin Login & Logout
		adminLogin.UserPassword().sendKeys("master1234@");
		adminLogin.Login().click();
		Thread.sleep(5000);
		adminLogin.Logout().click();

		
		//chromeDriver.close();
	
		
	}
	
}
