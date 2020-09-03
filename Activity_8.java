//Contact the admin
//Goal: Navigate to the “Contact Us” page and complete the form.

package testng_LMS;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_8 {
	
	WebDriver driver;
	
 @BeforeMethod
 
  public void setup() {
	  
	//Open the browser
	 
	 driver = new FirefoxDriver();
	  
	  //Find the navigation bar.	  	  
  }
 @Test
 
  public void contactValidation(){
	  
	 //Navigate to ‘https://alchemy.hguy.co/lms’.
	 
	  driver.get("https://alchemy.hguy.co/lms");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //Select the menu item that says “Contact” and click it.
	  
	  WebElement conLink = driver.findElement(By.cssSelector("#menu-item-1506 > a:nth-child(1)"));
	  conLink.click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.manage().window().maximize();
	  	
	  //Find the contact form fields (Full Name, email, etc.)
	  
	  WebElement nm = driver.findElement(By.cssSelector("#wpforms-8-field_0"));
	  
	  nm.sendKeys("Leena");
	  
	  WebElement email = driver.findElement(By.cssSelector("#wpforms-8-field_1"));
	  
	  email.sendKeys("lbansiwal@gmail.com");
	  
	  
	  WebElement sub = driver.findElement(By.cssSelector("#wpforms-8-field_3"));
	  
	  sub.sendKeys("Query reg course");
	    
	  //Fill in the information and leave a message.
	  
	  WebElement message = driver.findElement(By.cssSelector("#wpforms-8-field_2"));
	  
	  message.sendKeys("Please connect with me regarding Course details.");
	  
	  //Click submit.
	  
	  WebElement sendMes = driver.findElement(By.cssSelector("#wpforms-submit-8"));
	  
	  sendMes.submit();
	  
	  System.out.println("Form submitted!");
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //Read and print the message displayed after submission.
	  
	  WebElement mes = driver.findElement(By.cssSelector("#wpforms-confirmation-8"));
	  
	  System.out.println("Messsage is:   " + mes.getText());	   
  }
  
 @AfterMethod
 
	  public void tearDown() {
	 
	  //Close the browser.
	 
		  driver.close();	  
  }
}
