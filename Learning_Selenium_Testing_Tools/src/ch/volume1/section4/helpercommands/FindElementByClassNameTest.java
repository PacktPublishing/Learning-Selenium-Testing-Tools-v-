package ch.volume1.section4.helpercommands;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.internal.FindsByClassName;
import org.testng.Assert;
import org.testng.annotations.*;

public class FindElementByClassNameTest {

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
		List<WebElement> elements = ((FindsByClassName)driver).findElementsByClassName("loadajax");
		Assert.assertEquals(1, elements.size());
		
		//returns WebElement object
		WebElement element = ((FindsByClassName)driver).findElementByClassName("loadajax");
		element.click();
	}
}