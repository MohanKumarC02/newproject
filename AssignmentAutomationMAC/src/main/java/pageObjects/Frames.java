package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frames {

	public WebDriver driver;
	
	@FindBy(css=".fancybox-wrap")
	WebElement frame;
	
	@FindBy(css="a[class='btn btn-default button-plus product_quantity_up']")
	WebElement plus;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]")
	WebElement submit;
	
	public Frames(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getframe()
	{
		return frame;
	}
	
	public WebElement getplus()
	{
		return plus;
	}
	
	public WebElement getsubmit()
	{
		return submit;
	}
}
