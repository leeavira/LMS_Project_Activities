package testng_LMS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_13 {
	
	WebDriver driver;
	
	 @BeforeMethod
	 
	  public void setup() {
		  
		//Open the browser
		 
		 driver = new FirefoxDriver();	
	 }
  @Test
  public void entireCour() {
	  
	  //Open the browser to the All Courses page of Alchemy LMS site.
	  
	  driver.get("https://alchemy.hguy.co/lms");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[2]/a")).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	//Find a course to open using XPath notations.
	  
	  driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]/article/div[2]/p[2]/a")).click();
	  
	  
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
	  
	  //Find a lesson in that course and open it using XPath notations.
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/div/div/div/div[3]/div[2]/div[1]/div[1]/a/div[1]")).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //Open each topic in the lesson using XPath and mark them as complete.
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/a/div")).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  System.out.println("Status marked as:  "+ driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[1]/div[1]/div[2]")).getText());
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	  //Perform the above steps for all lessons and topics in the course.
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[3]/div[2]/a/span[1]")).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  System.out.println("The second lesson is:  "+ driver.getTitle());
		
	  System.out.println("Status marked as: " + driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[1]/div[1]/div[2]")).getText());
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[3]/div[2]/a")).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  System.out.println("The third lesson is:  "+ driver.getTitle());
	  
	  System.out.println("Status marked as: " + driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[1]/div[1]/div[2]")).getText());
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  
	  //Verify the course is complete by checking the value of the progress bar.
	
	  //Mark the lesson as complete and verify progress of the course.
	  
	  System.out.println("The value of progress bar is:  " + driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[3]/div/div[1]/div/div[1]")).getText());
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }
  
@AfterMethod

	public void tearDown()
    {
	  //Close the browser.
	
	  	driver.close(); 
	}
}
