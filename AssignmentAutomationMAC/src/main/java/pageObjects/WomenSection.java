package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenSection {

	
	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[1]/img")
	WebElement Quickview;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[2]")
	WebElement Quickview1;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[2]")
	WebElement click;

	
	public WomenSection(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getQuickview()
	{
		return Quickview;
	}
	
	public WebElement getQuickview1()
	{
		return Quickview1;
	}
	
	public WebElement getclick()
	{
		return click;
	}
}
