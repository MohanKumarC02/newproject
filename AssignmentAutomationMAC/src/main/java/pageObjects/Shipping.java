package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {

	public WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"cgv\"]")
	WebElement termscondition;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/form/p/button")
	WebElement proceedtocheckout3;
	
	public Shipping(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public WebElement gettermscondition()
	{
		return termscondition;
	}
	
	public WebElement getproceedtocheckout3()
	{
		return proceedtocheckout3;
	}
}
