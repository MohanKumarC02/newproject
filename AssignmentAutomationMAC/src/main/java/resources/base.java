package resources;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base 
{
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException 
	{
		System.setProperty("webdriver.gecko.driver", "//Users//mohankumar//Downloads//geckodriver");
		WebDriver driver = new FirefoxDriver();
	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
