package ch.volume1.section4.helpercommands;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.internal.FindsByXPath;
import org.testng.Assert;
import org.testng.annotations.*;

public class FindElementByXPathTest {

	WebDriver driver;

	@BeforeTest
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get("http://book.theautomatedtester.co.uk/chapter1");
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testMethod(){
		//returns collections of WebElements objects
		List<WebElement> elements = ((FindsByXPath)driver).findElementsByXPath("//input");
		Assert.assertEquals(6, elements.size());
		
		//returns WebElement object
		WebElement element = ((FindsByXPath)driver).findElementByXPath("//input[@id='verifybutton']");
		element.click();
	}
}