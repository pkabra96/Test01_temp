package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.driverutil;

public class OrderCaseStudy {
	WebDriver driver;
	  @Test
	 public void placeOrder() throws Exception {
		  
		  driver = driverutil.getDriver("chrome");
		  driver.manage().window().maximize();
		  driver.get("https:demowebshop.tricentis.com/");
		  
		  driver.findElement(By.linkText("Log in")).click();
		  Thread.sleep(1000);
		    
		  driver.findElement(By.id("Email")).sendKeys("piyush@kabra.com");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("Password")).sendKeys("123456789");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.linkText("Apparel & Shoes")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.linkText("Casual Golf Belt")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("addtocart_40_EnteredQuantity")).clear();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("addtocart_40_EnteredQuantity")).sendKeys("10");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("add-to-cart-button-40")).click();
		  Thread.sleep(1000);
	       
		  driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		  Thread.sleep(1000);
		  
		  Assert.assertEquals(driver.findElement(By.linkText("Casual Golf Belt")).getText(),"Casual Golf Belt");
		  Thread.sleep(1000);
		  
//		  Assert.assertEquals(driver.findElement(By.xpath("//input[starts-with(@name,'itemquantity')]")).getAttribute("value"),"20");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("termsofservice")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("checkout")).click();
		  Thread.sleep(1000);
		  
//		  Select testing =new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
//		  testing.selectByVisibleText("India");
//		  Thread.sleep(1000);
//		  Select testing1 =new Select(driver.findElement(By.id("BillingNewAddress_StateProvinceId")));
//		  testing1.selectByIndex(0);
//		  driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Nagpur");
//		  driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Itwari");
//		  driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("");
//		  driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("440017");
//		  driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567890");
//		  driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("NA");
		  
		  
		  driver.findElement(By.xpath("//input[@value='Continue']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//div[@id='shipping-buttons-container']//input[@value='Continue']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//input[@value='Continue']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("paymentmethod_2")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']//input[@value='Continue']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("CardholderName")).sendKeys("Piyush Kabra");
		  Thread.sleep(500);
		  driver.findElement(By.id("CardNumber")).sendKeys("4485564059489345");
		  Thread.sleep(500);
		  driver.findElement(By.id("ExpireMonth")).sendKeys("04");
		  Thread.sleep(500);
		  driver.findElement(By.id("ExpireYear")).sendKeys("2020");
		  Thread.sleep(500);
		  driver.findElement(By.id("CardCode")).sendKeys("123");
		  Thread.sleep(500);
		  
		  
		  driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']//input[@value='Continue']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		  Thread.sleep(2000);
		  
		  Assert.assertEquals(driver.findElement(By.xpath("//div[@class='title']//strong")).getText(),"Your order has been successfully processed!");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.linkText("Log out")).click();
		  Thread.sleep(2000);
		  
		  driver.close();
		  

		 
  }
}
