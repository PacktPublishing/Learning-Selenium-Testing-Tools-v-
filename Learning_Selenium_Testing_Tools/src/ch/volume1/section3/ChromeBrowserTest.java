package ch.volume1.section3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ChromeBrowserTest {

	WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		driver = new ChromeDriver();
		driver.get("http://book.theautomatedtester.co.uk/chapter4");
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testExamples(){
		WebElement element = driver.findElement(By.id("selectLoad"));
		String value = element.getAttribute("value");
		Assert.assertEquals("Click to load the select below", value);
	}
}