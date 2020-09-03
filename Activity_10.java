package testng_LMS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_10 {
	
	WebDriver driver;
	
	 @BeforeMethod
	 
	  public void setup() {
		  
		//Open the browser
		 
		 driver = new FirefoxDriver();
		  
		//Find the navigation bar.	 
	  }
	 
	 @Test 
	 
  public void topivVal() {
		 
		 //Navigate to ‘https://alchemy.hguy.co/lms’. 
		 
		 driver.get("https://alchemy.hguy.co/lms");
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 //Find the navigation bar.
		
		 //click on all courses
		
		driver.findElement(By.cssSelector("#menu-item-1508 > a:nth-child(1)")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//select first course
		
		 driver.findElement(By.cssSelector("#post-69 > div:nth-child(3) > p:nth-child(3) > a:nth-child(1)")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 //driver.findElement(By.id("menu-item-1508")).click();
		  
		 //login to enroll button
		 
		 driver.findElement(By.cssSelector(".ld-button")).click();
		 
		//Provide credentials
		 
		  WebElement userName = driver.findElement(By.cssSelector("#user_login"));
		  
		  userName.sendKeys("root");
		  
		  WebElement pas = driver.findElement(By.cssSelector("#user_pass"));
		  
		  pas.sendKeys("pa$$w0rd");
		 
		  driver.findElement(By.cssSelector("#wp-submit")).submit();
		  
		  System.out.println("Logged In !");
		  
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 
		 WebElement firstCou = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/div/div/div/div[3]/div[2]/div[1]/div[1]/a"));
		 
		 firstCou.click();
		 
		 System.out.println("Title of page is: " +driver.getTitle());
		  
		 //open first topic
		 
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/a/span")).click();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 System.out.println("Status is:  "+ driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[1]/div[1]/div[2]")).getText());
		 	 
		 //Mark all the topics in the lesson as complete (if available)	 
  } 
	 @AfterMethod
	 
	  public void tearDown()
	  {
	  //Close the browser.
		 
		 driver.close();	  
	  }
}
