package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenDressesTshirts {

	
	public WebDriver driver;
	
	@FindBy(css="a[class='sf-with-ul']")
	WebElement Women;
	
	public WomenDressesTshirts(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getWomen()
	{
		return Women;
	}
}
