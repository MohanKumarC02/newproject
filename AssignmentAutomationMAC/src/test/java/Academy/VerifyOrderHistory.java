package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.VerifyCost;
import resources.base;

public class VerifyOrderHistory extends base 
{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException
	{

		driver = initializeDriver();
		log.info("Driver is initialized");

	}

	@Test

	public void validateorderhistory() throws IOException 
	{
		VerifyCost l = new VerifyCost(driver);
		Assert.assertEquals(l.getTitle().getText(), "$35.02");
		log.info("Successfully validated Total cost");

	}

	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
