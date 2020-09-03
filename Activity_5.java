package testng_LMS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_5 {
	
	WebDriver driver;
	
	  @BeforeMethod
	  
	  public void Setup() {
		  
		//Open a browser.
		  
			driver = new FirefoxDriver();
	  }
  @Test
  public void myAccountPage() {
	  
	 // Navigate to ‘https://alchemy.hguy.co/lms’.
	  
	  driver.get("https://alchemy.hguy.co/lms");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //Find the navigation bar.
	  
	  //Select the menu item that says “My Account” and click it.
	  
	  driver.findElement(By.cssSelector("#menu-item-1507 > a:nth-child(1)")).click();
	  
	  String title = driver.getTitle();
	  
	  //Read the page title and verify that you are on the correct page.
	  
	  System.out.println("The title of the page is :  "+ driver.getTitle());
	  
	//Assertion for page title
	  
	  Assert.assertEquals("My Account – Alchemy LMS", title);

	  Assert.assertEquals(driver.getTitle(), "My Account – Alchemy LMS");
  }
  @AfterMethod
  
  public void TearDown() {
	  
	  driver.close();
  }
}
