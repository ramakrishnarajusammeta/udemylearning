package samples.selenium;
//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenURL {

	public static void main(String[] args) throws InterruptedException {
		
		// updated relative path 
		System.setProperty("webdriver.chrome.driver", "./lib/browsers/chromedriver");
		
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("http://www.facebook.com");
		
		// Type the email by [By Element ID]
		//chromeDriver.findElement(By.id("email")).sendKeys("test.sammeta@gmail.com");
		
		// Type the email by XPath
		//chromeDriver.findElementByXPath("//input[@id='email']").sendKeys("test.sammeta@gmail.com");
		
		
		// Type the email by CSS
		chromeDriver.findElementByCssSelector("input[id='email']").sendKeys("test.sammeta@gmail.com");
	
		
		Thread.sleep(10000);
		System.out.println("Completed Test");
		chromeDriver.close();
	
	}

}
