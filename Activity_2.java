package testng_LMS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity_2 {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver = new FirefoxDriver();
		
		//Open the browser
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
  }
	@Test

		public void Validation(){
	
		driver.get("https://alchemy.hguy.co/lms/");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.manage().window().maximize();
	
		String actualHeading = driver.findElement(By.className("uagb-ifb-title")).getText();
	
		System.out.println("The heading of the page is:   " + actualHeading);
		
		String expectedHeading = "Learn from Industry Experts";
	
		//Assert.assertEquals("Learn from Industry Experts", actualHeading, expectedHeading );
		
		Assert.assertEquals(expectedHeading,actualHeading );
	}

	@AfterMethod
	
	public void TearDown() {
	
		driver.close();
	}

}
