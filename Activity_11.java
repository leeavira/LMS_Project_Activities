package testng_LMS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_11 {
	
	WebDriver driver;
	
	 @BeforeMethod
	 
	  public void setup() {
		  
		//Open the browser
		 
		 driver = new FirefoxDriver();	 
	  }
  @Test
  
  public void allVal() {
	  
	  driver.get("https://alchemy.hguy.co/lms");
 
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //Open the browser to the All Courses page of Alchemy LMS site.
	  
	  driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[2]/a")).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //Select any course and open it.
	  
	  driver.findElement(By.cssSelector("#post-69 > div:nth-child(3) > p:nth-child(3) > a:nth-child(1)")).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
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
	  
	  //Click on a lesson in the course. Verify the title of the course.
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/div/div/div/div[3]/div[2]/div[1]/div[1]/a/div[1]")).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	  //Open a topic in that lesson. Mark it as complete.
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/a/div")).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  System.out.println("Status marked as:  "+ driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[1]/div[1]/div[2]")).getText());
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	  //Perform the above steps for all lessons and topics in the course.
	  
	  driver.findElement(By.cssSelector("div.ld-content-action:nth-child(3) > a:nth-child(1)")).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  System.out.println("The second lesson is:  "+ driver.getTitle());
		
	  System.out.println("Status marked as: " + driver.findElement(By.cssSelector(".ld-status")).getText());
	  
	  driver.findElement(By.cssSelector("div.ld-content-action:nth-child(3) > a:nth-child(1)")).click();
		
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  System.out.println("The third lesson is:  "+ driver.getTitle());
	  
	  System.out.println("Status marked as: " + driver.findElement(By.cssSelector(".ld-status")).getText());
		
	  //Verify the course is complete by checking the value of the progress bar.
	  
	  System.out.println("The value of progress bar is:  " + driver.findElement(By.cssSelector("div.ld-progress-stats:nth-child(1) > div:nth-child(1)")).getText());
	 	 
  }
  @AfterMethod
  
  		public void tearDown()
  {
	  //Close the browser.
	  
	 driver.close(); 
  }
}
