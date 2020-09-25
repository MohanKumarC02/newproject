package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {

	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")
	WebElement proceedtocheckout1;
	
	public Summary(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getproceedtocheckout1()
	{
		return proceedtocheckout1;
	}
}
