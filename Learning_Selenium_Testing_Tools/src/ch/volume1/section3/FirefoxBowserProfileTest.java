package ch.volume1.section3;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class FirefoxBowserProfileTest {

	WebDriver driver;

	@BeforeTest
	public void setUp(){
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.startup.homepage", "http://book.theautomatedtester.co.uk/chapter4");
		driver = new FirefoxDriver(profile);
	}

	@AfterTest
	public void tearDown(){
		driver.quit();
	}

	@Test
	public void testExamples(){
		WebElement element = driver.findElement(By.id("nextBid"));
		element.sendKeys("100");
	}
}