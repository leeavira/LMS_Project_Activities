package testng_LMS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_3 {
	
	WebDriver driver;
	
  @BeforeMethod
  
  public void Setup() {
	  
	//Open a browser.
	  
		driver = new FirefoxDriver();
  }
  
  @Test
  
  public void titleMatchValidation() {
	  
	//Navigate to ‘https://alchemy.hguy.co/lms’. 
	  
	  driver.get("https://alchemy.hguy.co/lms");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //Get the title of the first info box.
	  
	  String actualTitleInfo = driver.findElement(By.cssSelector("#uagb-infobox-f08ebab0-fbf1-40ec-9b2a-c9feeb3d4810 > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h3:nth-child(1)")).getText();
	  
	  //Make sure it matches “Actionable Training” exactly.

	  String expectedTitleInfo = "Actionable Training";
		
	  //Assert.assertEquals("Actionable Training", actualHeading, expectedHeading );
	  
	  Assert.assertEquals(expectedTitleInfo,actualTitleInfo );	  
	  
  }
  
  @AfterMethod
  
  public void TearDown() {
	  
	  driver.close();
  }
}
