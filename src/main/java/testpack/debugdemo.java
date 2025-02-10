package testpack;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class debugdemo {
	
	WebDriver driver = new ChromeDriver();

	@Test
	public void test1() {
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
	  driver.get("https://www.Amazon.com");
	  String title = driver.getTitle();
	  boolean value = title.contains("Amazon");
	  System.out.println("status value is "+value);
	} 
	  @Test
	  public void test2() 
	  {
		  driver.quit();  
	  }
	  

}