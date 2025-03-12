package basic;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo2 {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
//	     Home System  =	
		//   System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//	     Office System 
		   System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");	  
			  
		   driver.get("https://login.yahoo.com/");
		   driver.manage().window().maximize();
	       System.out.println("test staasrtes");
//	       Thread.sleep(2000);
		   WebElement email_id = driver.findElement(By.xpath("//*[@name=\"username\"]"));
		   email_id.sendKeys("jh");
           driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
           Thread.sleep(2000);
         String actual_err =  driver.findElement(By.xpath("//*[@id=\"username-error\"]")).getText();
         String expctd_err = "Sorry, we don't recognize this email.";
         System.out.println(actual_err);
        //typ 1
//         Assert.assertEquals(actual_err, expctd_err);
        //typ 2 partial also passes
         Assert.assertTrue(actual_err.contains("Sorry, we don't recognize this email."));
		   System.out.println("test completss");
		
		   
//		   driver.close();
	}

}
