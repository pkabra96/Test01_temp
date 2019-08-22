package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.driverutil;

public class RegisterCaseStudy {
	
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	  driver = driverutil.getDriver("chrome");
	  driver.manage().window().maximize();
	  driver.get("https:demowebshop.tricentis.com/");
	  
	  driver.findElement(By.linkText("Register")).click();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("gender-male")).click();
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("FirstName")).sendKeys("Piyush");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("LastName")).sendKeys("Kabra");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("Email")).sendKeys("piyush@kabra.com");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("Password")).sendKeys("123456789");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("ConfirmPassword")).sendKeys("123456789");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("register-button")).click();
	  Thread.sleep(1000);
	  
	  driver.close();  
	  
	 
  }
}
