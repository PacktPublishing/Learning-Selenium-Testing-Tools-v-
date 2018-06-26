package ch.volume1.section3;

import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class InternetExplorerBrowserTest {

	WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.ie.driver", "D:\\browserDrivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://book.theautomatedtester.co.uk/chapter4");
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testExamples(){
		WebElement element = driver.findElement(By.id("bid"));
		Assert.assertEquals("50", element.getText());
	}
}