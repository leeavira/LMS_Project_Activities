package testng_LMS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_6 {
	
	WebDriver driver;
	
	  @BeforeMethod
	  
	  public void Setup() {
		  
		//Open a browser.
		  
			driver = new FirefoxDriver();
	  }
	  
  @Test
  
  public void LoginValidation() {
	 
	  	//Navigate to ‘https://alchemy.hguy.co/lms’.
	
	  		driver.get("https://alchemy.hguy.co/lms");
	  		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			//Find the navigation bar
			
			//Select the menu item that says “My Account” and click it.
			
			WebElement myAcc = driver.findElement(By.cssSelector("#menu-item-1507 > a:nth-child(1)"));
			
			myAcc.click();	
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Read the page title and verify that you are on the correct page.
			
			System.out.println("The Title of the page is:  " + driver.getTitle());
			
			String actualTitle = driver.getTitle();
			
			driver.manage().window().maximize();
			
			String expectedTitle = "My Account – Alchemy LMS";
			
			//Assert.assertEquals("My Account - Alchemy LMS", actualTitle, expectedTitle );
			
			Assert.assertEquals(expectedTitle,actualTitle );
			
			//Find the “Login” button on the page and click it.
			
			WebElement loginButton = driver.findElement(By.cssSelector(".ld-login"));
			
			loginButton.click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Find the username field of the login form and enter the username into that field.
			
			WebElement un = driver.findElement(By.cssSelector("#user_login"));
			
			un.sendKeys("root");
			
			//Find the password field of the login form and enter the password into that field.
			
			WebElement pswd = driver.findElement(By.cssSelector("#user_pass"));
			
			pswd.sendKeys("pa$$w0rd");
			
			//Find the login button and click it.
			
			driver.findElement(By.id("wp-submit")).submit();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			//Verify that you have logged in.
			
			System.out.println("Logged In Sucessfully!");
	  
  }
  
  @AfterMethod
  
  public void TearDown() {
	  
	  driver.close();
  }
}
