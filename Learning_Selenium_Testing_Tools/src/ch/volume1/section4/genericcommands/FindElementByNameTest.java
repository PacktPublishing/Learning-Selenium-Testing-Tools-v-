package ch.volume1.section4.genericcommands;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class FindElementByNameTest {

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
		List<WebElement> elements = driver.findElements(By.name("selected(1234)"));
		Assert.assertEquals(1, elements.size());
		
		//returns WebElement object
		WebElement element = driver.findElement(By.name("selected(1234)"));
		element.click();
	}
}