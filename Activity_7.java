
//Goal: Navigate to the “All Courses” page and count the number of courses.


//Find all the courses on the page.
//Print the number of courses on the page.

package testng_LMS;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_7 {
	
	WebDriver driver;
	
	@BeforeMethod

  public void setup() {
		
		//Open a browser
		
		driver = new FirefoxDriver();			
  }
	@Test
	
	public void courseCount() {
		
		//Navigate to ‘https://alchemy.hguy.co/lms’.
		
		driver.get("https://alchemy.hguy.co/lms");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	
		//Find the navigation bar.
	
		//Count the number of courses
		
		 //Select the menu item that says “All Courses” and click it.
		
		List<WebElement> links = driver.findElements(By.className("entry-title"));  //Identify the number of Link on webpage and assign into Webelement List

		//Print the number of courses on the page
		
        int linkCount = links.size();     // Count the total Link list on Web Page

        System.out.println("Total Number of link count on webpage = "  + linkCount);

        for (WebElement obkCurrentLink : links) {
        	
        String strLinkText = obkCurrentLink.getText();
        	
        //Find all the courses on the page.
        	
        System.out.println(strLinkText);
        }
			
	}
        @AfterMethod
        
        public void tearDown(){
        	
        	driver.close();
        }
}

