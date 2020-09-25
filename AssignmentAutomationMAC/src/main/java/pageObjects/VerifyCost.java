package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyCost {

	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/form/p/button")
	WebElement confirmorder;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/span/strong")
	WebElement title;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/p/a")
	WebElement back;
	
	public VerifyCost(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getconfirmorder()
	{
		return confirmorder;
	}
	
	public WebElement getTitle()
	{
		return title;
	}
	
	public WebElement getback()
	{
		return back;
	}
}
