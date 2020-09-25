package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {

	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/form/p/button")
	WebElement proceedtocheckout2;
	
	public Address(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getproceedtocheckout2()
	{
		return proceedtocheckout2;
	}
}
