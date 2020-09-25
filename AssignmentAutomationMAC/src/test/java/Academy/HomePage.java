package Academy;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.AddToCart;
import pageObjects.Address;
import pageObjects.ConfirmOrder;
import pageObjects.Frames;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.Payment;
import pageObjects.Shipping;
import pageObjects.Summary;
import pageObjects.VerifyCost;
import pageObjects.WomenDressesTshirts;
import pageObjects.WomenSection;
import resources.base;

public class HomePage extends base 
{
	public WebDriver driver;

	
	@Test
	public void initialize() throws IOException, InterruptedException
	{
		driver = initializeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions a = new Actions(driver);
		
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys("abcdefghijkl@gmail.com");
		lp.getcreateaccount().click();
		lp.getLogin().click();
		lp.getEmail1().sendKeys("abcdefghijkl@gmail.com");
		lp.getPassword().sendKeys("12345");
		lp.getLogin1().click();
		WomenDressesTshirts wdt = new WomenDressesTshirts(driver);
		wdt.getWomen().click();
	
		WomenSection ws = new WomenSection(driver);
		
		js.executeScript("window.scrollBy(0,700)");
		a.moveToElement(ws.getQuickview()).build().perform();

		//uncomment to work on Quick view //Switching to frames
//		ws.getQuickview1().click();
//		Frames f = new Frames(driver);
//		driver.switchTo().frame(f.getframe());
//		f.getplus().click();
//		f.getsubmit().click();
		ws.getclick().click();
		
		//Used another option
		AddToCart ac = new AddToCart(driver);
		ac.getplus().click();
		ac.getSubmit().click();
		ac.getproceedtocheckout().click();
		
		Summary pc = new Summary(driver);
		js.executeScript("window.scrollBy(0,800)");
		pc.getproceedtocheckout1().click();
		
		Address ad = new Address(driver);
		js.executeScript("window.scrollBy(0,800)");
		ad.getproceedtocheckout2().click();
		
		Shipping sh = new Shipping(driver);
		js.executeScript("window.scrollBy(0,300)");
		sh.gettermscondition().click();
		sh.getproceedtocheckout3().click();
		
		Payment py = new Payment(driver);
		js.executeScript("window.scrollBy(0,700)");
		py.getproceedtocheckout4().click();
		
		ConfirmOrder con = new ConfirmOrder(driver);
		js.executeScript("window.scrollBy(0,500)");
		con.getconfirmorder().click();
		
		VerifyCost l1 = new VerifyCost(driver);
		l1.getback().click();
		
		
	}

	@AfterTest
	public void teardown() 
	{
		driver.close();
	}

}
