package AdminUIRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {

	WebDriver driver;
	
	public AdminLoginPage(WebDriver driver) {
		
		this.driver = driver;	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@name='orgname']")
	WebElement orgName;
	
	@FindBy(xpath="//*[@name='userName']")
	WebElement userName;
	
	@FindBy(xpath="//*[@name='userPassword']")
	WebElement userPassword;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath="//*[@id=\"header\"]/p/strong/a[2]")
	WebElement logoutLink;
	
	public WebElement OrgName()
	{
		return orgName	;
	}
	
	public WebElement UserName()
	{
		return userName	;
	}
	
	public WebElement UserPassword()
	{
		return userPassword;
	}
	
	public WebElement Login()
	{
		return loginButton;
	}
	
	public WebElement Logout()
	{
		return logoutLink;
	}
	
}
