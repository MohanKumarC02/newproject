package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyHistory {

	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[1]/td[3]/span")
	WebElement title;
	
	public VerifyHistory(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTitle()
	{
		return title;
	}
}
