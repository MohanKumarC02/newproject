package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {

	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")
	WebElement proceedtocheckout4;
	
	public Payment(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getproceedtocheckout4()
	{
		return proceedtocheckout4;
	}
}
