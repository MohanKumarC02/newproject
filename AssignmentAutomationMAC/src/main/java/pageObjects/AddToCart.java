package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	public WebDriver driver;
	
	@FindBy(css="a[class='btn btn-default button-plus product_quantity_up']")
	WebElement plus;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]")
	WebElement submit;
	
	@FindBy(xpath="/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")
	WebElement proceedtocheckout;
	
	public AddToCart(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getplus()
	{
		return plus;
	}
	
	public WebElement getSubmit()
	{
		return submit;
	}
	
	public WebElement getproceedtocheckout()
	{
		return proceedtocheckout;
	}
}
