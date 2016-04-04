package guru99.gittests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	  @Test              
      public void testEasy() 
      {    
		  WebDriver driver = new FirefoxDriver();
          driver.get("http://www.guru99.com/selenium-tutorial.html");  
          String title = driver.getTitle();                
          Assert.assertTrue(title.contains("Free Selenium Tutorials"));       
          driver.quit();
      }           
}
