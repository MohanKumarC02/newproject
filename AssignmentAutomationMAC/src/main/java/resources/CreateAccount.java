package resources;
//Run Separately on MAC
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount 
{
	public static void main(String[] args) 
	{
		//MAC
		System.setProperty("webdriver.gecko.driver", "//Users//mohankumar//Downloads//geckodriver");
		WebDriver driver = new FirefoxDriver();
		String link = "http://automationpractice.com/index.php";

		driver.get(link);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();

		
		driver.findElement(By.cssSelector("a[href*='my-account']")).click();
		
		driver.findElement(By.cssSelector("input[id='email_create']")).sendKeys("abcdefghijk@gmail.com");
		
		driver.findElement(By.cssSelector("button[type='Submit']")).click();

		driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
		driver.findElement(By.name("customer_firstname")).sendKeys("mickey");
		driver.findElement(By.name("customer_lastname")).sendKeys("mouse");
		driver.findElement(By.id("passwd")).sendKeys("12345");

		
		driver.findElement(By.id("firstname")).sendKeys("mickey");
		driver.findElement(By.id("lastname")).sendKeys("mouse");
		driver.findElement(By.id("company")).sendKeys("AAA tech");
		driver.findElement(By.id("address1")).sendKeys("#23, navi new york");
		driver.findElement(By.id("city")).sendKeys("new revenue");

		WebElement statedropdown = driver.findElement(By.name("id_state"));
		Select oSelect = new Select(statedropdown);
		oSelect.selectByValue("20");

		driver.findElement(By.name("postcode")).sendKeys("00000");

		WebElement countrydropDown = driver.findElement(By.name("id_country"));
		Select oSelectC = new Select(countrydropDown);
		oSelectC.selectByVisibleText("United States");

		
		driver.findElement(By.id("phone_mobile")).sendKeys("9076745483");
		driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("Donald Trump");
		driver.findElement(By.name("submitAccount")).click();
	}
}
