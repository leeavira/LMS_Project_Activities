package testng_LMS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_14 {
	
	WebDriver driver;
	
	Actions actions; 
	
	@BeforeMethod
	
	  public void setup() {
		  
		//Open the browser
		
		 driver = new FirefoxDriver();
		 
		 actions = new Actions(driver);
	 }
	@Test
		public void keyVal() {
	  
	  	//Open the browser to the My Account page of Alchemy LMS site.
		
	  	driver.get("https://alchemy.hguy.co/lms");
	  	
	  	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	
	  	//Go to MyAccount page
	  	
	  	WebElement myaccount = driver.findElement(By.cssSelector("#menu-item-1507 > a:nth-child(1)"));
	  	
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	 
	  	actions.click(myaccount).perform();
	  	
	  	//login
	  	
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	  	WebElement log = driver.findElement(By.cssSelector(".ld-login"));
	  	
	  	actions.click(log).perform();
	  	
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	
	  	driver.findElement(By.cssSelector("#user_login")).sendKeys("root"); 
	  	
	  	driver.findElement(By.cssSelector("#user_pass")).sendKeys("pa$$w0rd");
	  	
	  	driver.findElement(By.cssSelector("#wp-submit")).submit();
	  	
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	
	  	//access course
	  	 
	  	driver.findElement(By.cssSelector("#ld-course-list-item-24042 > div:nth-child(1) > a:nth-child(1) > span:nth-child(2)")).click();
	  	
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	
	  	//open first lesson
	  	 
	  	driver.findElement(By.cssSelector("div.ld-item-list-item:nth-child(2) > div:nth-child(1) > a:nth-child(1) > div:nth-child(2)")).click();
	  	
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	
	  	//open lesson
	  	 
	  	driver.findElement(By.cssSelector("#ld-table-list-item-289 > a:nth-child(1) > span:nth-child(2)")).click();
	  	
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	
	  	JavascriptExecutor js = (JavascriptExecutor) driver;
	  	
		js.executeScript("window.scrollBy(0,3000)");
	  	
	  	WebElement b = driver.findElement(By.cssSelector("div.ld-content-action:nth-child(3) > a:nth-child(1) > span:nth-child(1)"));
	  	
	  	actions.moveToElement(b).click(b).perform();
	  	
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	
		
	  	System.out.println("The progress is: "+ driver.findElement(By.cssSelector("div.ld-progress-stats:nth-child(1) > div:nth-child(1)")).getText());
	  	
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
		
  public void tearDown()
  {
	  //Close the browser.
	  
	  	driver.close(); 
	}
  
  
}
