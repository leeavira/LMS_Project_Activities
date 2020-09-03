//Complete a topic in a lesson
//Goal: Navigate to a particular lesson and complete a topic in it.

package testng_LMS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_9 {
	
	WebDriver driver;
	
	 @BeforeMethod
	 
	  public void setup() {
		  
		//Open the browser
		 
		 driver = new FirefoxDriver();
		  
		//Find the navigation bar.	 
	  }
	 @Test
	 
  public void val() {
	  
	//Navigate to ‘https://alchemy.hguy.co/lms’.
		 
	  driver.get("https://alchemy.hguy.co/lms");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //Select the menu item that says “All Courses” and click it.
	  
	  WebElement allCourse = driver.findElement(By.cssSelector("#menu-item-1508 > a:nth-child(1)"));
	  
	  allCourse.click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //Click on a lesson in the course. Verify the title of the course.
	  
	  WebElement lesson = driver.findElement(By.cssSelector("#post-69 > div:nth-child(3) > h3:nth-child(1)"));
	  
	  System.out.println("Title of the Course is:  " + lesson.getText());
	  
	  WebElement c = driver.findElement(By.cssSelector("#post-69 > a:nth-child(2) > img:nth-child(1)"));
	  
	  c.click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //Open a topic in that lesson. Mark it as complete.
	  
	  WebElement log = driver.findElement(By.cssSelector(".ld-button"));
	  
	  log.click();
	  
	  //Login to access course
	  
	  WebElement userName = driver.findElement(By.cssSelector("#user_login"));
	  
	  userName.sendKeys("root");
	  
	  WebElement pas = driver.findElement(By.cssSelector("#user_pass"));
	  pas.sendKeys("pa$$w0rd");
	  
	  driver.findElement(By.cssSelector("#wp-submit")).submit();
	  //System.out.println("Logged In !");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
	  //Click the Mark Complete button on the page (if available).
	  
	  //WebElement status = driver.findElement(By.cssSelector(".ld-status"));
	  
	  //System.out.println("Status is:  " + status.getText());
	     
  }
  @AfterMethod
  
  public void tearDown()
  {
  //Close the browser.
	  
	 driver.close();	  
  }
}
