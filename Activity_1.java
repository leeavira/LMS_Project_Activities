package testng_LMS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_1 {
	
	WebDriver driver;
	
	@BeforeMethod
  
  public void beforeMethod() {
	  
		//Create a new instance of the Firefox driver
		
		driver = new FirefoxDriver();
		
		//Open browser
		
		driver.get("https://alchemy.hguy.co/lms/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	
	 public void titleVal() {
		
		//Get the title of the page
		
		String title = driver.getTitle();
		
		//Print the title of the page
		
		System.out.println("Page title is: " + title);
		
		//Assertion for page title
		
		Assert.assertEquals("Alchemy LMS – An LMS Application", title);

		Assert.assertEquals(driver.getTitle(), "Alchemy LMS – An LMS Application");

    }
	@AfterMethod

    public void afterMethod() {

        //Close the browser

        driver.close();

    }
}
