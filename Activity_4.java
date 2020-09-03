package testng_LMS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_4 {
	
	WebDriver driver;
	
	  @BeforeMethod
	  
	  public void Setup() {
		  
		//Open a browser.
		  
			driver = new FirefoxDriver();
	  }
  @Test
  public void titleVerify() {
	  
	  //Navigate to ‘https://alchemy.hguy.co/lms’. 
		  
	  driver.get("https://alchemy.hguy.co/lms");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //Get the title of the second most popular course.
	  
	  String actualTitle = driver.findElement(By.cssSelector("#post-71 > div:nth-child(3) > h3:nth-child(1)")).getText();
	  
	  //System.out.println("The title of second most popular course is:  " + actualTitle.getText());
	  
	  //Make sure it matches “Email Marketing Strategies” exactly.

	  String expectedTitle = "Email Marketing Strategies";
		
	  //Assert.assertEquals("Email Marketing Strategies", actualHeading, expectedHeading );
	  
	  Assert.assertEquals(expectedTitle,actualTitle );	  
	  
  }
  @AfterMethod
  
  public void TearDown() {
	  
	  driver.close();
  }
}
