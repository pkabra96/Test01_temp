package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import util.driverutil;

public class NewTest {
	
	WebDriver driver;
	
	@Test
	public void openApplication() {
		driver.get("https://www.piyushkabrarcoem.weebly.com");
		}
	
	
	@BeforeTest
	public void configureBrowser() {
		driver=driverutil.getDriver("chrome");
		driver.manage().window().maximize();
				
	}
	
	
	@AfterTest
	public void closeApplication() {
	driver.close();
	}
}