package com.rkcompany.app;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenURLTest {

	@Test
	public void OpenURLFuntest() throws InterruptedException { 
	
	System.setProperty("webdriver.chrome.driver", "./lib/browsers/chromedriver");
	
	ChromeDriver chromeDriver = new ChromeDriver();
	
	chromeDriver.get("http://www.facebook.com");
	System.out.println("OpenURLFunTest Success");
	Thread.sleep(10000);
	// The following is throwing error
	//chromeDriver.findElementByXPath("//input[@id='email']").sendKeys("test.sammeta@gmail.com");
	System.out.println("Completed Test");
	
	chromeDriver.close();
	
	}
}
