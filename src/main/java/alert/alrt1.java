package alert;
//alert window
// handle alert
//switchTo()-Frames,Alert,window handling
//use alert interface
//capture 
//validate

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alrt1 {
	
	@Test
	public void handlealert() throws InterruptedException {
	   WebDriver driver = new ChromeDriver();
//     Home System  =	
	//   System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//     Office System 
	   System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");	  
		  
	   driver.get("https://demoqa.com/alerts");
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
       Thread.sleep(5000);
//	   Alert alrt =  driver.switchTo().alert();
//       alrt.accept();
       
//       driver.switchTo().alert().accept();
      String actl_msg = driver.switchTo().alert().getText();
      System.out.println("Alert msg is :" +actl_msg);
       driver.switchTo().alert().dismiss();
       
	}
}