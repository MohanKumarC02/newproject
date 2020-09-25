package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public WebDriver driver;
	
	@FindBy(css="input[id='email_create']")
	WebElement email;
	
	@FindBy(css="button[type='Submit']")
	WebElement createaccount;
	
	@FindBy(css="a[href*='my-account']")
	WebElement signin;
	
	@FindBy(css="input[id='email']")
	WebElement email1;
	
	@FindBy(css="input[id='passwd']")
	WebElement password;
	
	@FindBy(css="button[id='SubmitLogin']")
	WebElement signin1;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEmail()
	{
		return email;
	}
	
	public WebElement getcreateaccount()
	{
		return createaccount;
	}
	
	public WebElement getLogin()
	{
		 return signin;
	}
	
	public WebElement getEmail1()
	{
		return email1;
	}
	
	public WebElement getPassword()
	{
		return password;
	}
	
	public WebElement getLogin1()
	{
		return signin1;
	}
}
