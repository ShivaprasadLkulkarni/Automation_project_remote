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
			  
		   driver.get("https://demoqa.com/login");
		   driver.manage().window().maximize();
//		   Thread.sleep(2000);
		   System.out.println("test staasrtes");
		   WebElement sign_upname = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		   sign_upname.sendKeys("21565sdsd6");
		   WebElement sign_uppwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		   sign_uppwd.sendKeys("21521sdsds52656");
		   Thread.sleep(2000);
		   WebElement login_btn = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		   login_btn.click();
//		   Thread.sleep(2000);
//		  String err_actual_msg = driver.findElement(By.xpath("//*[@id=\"name\"]")).getText();
//		  String err_expctd_msg = "Invalid username or password!";
//		  Assert.assertEquals(err_actual_msg,err_expctd_msg);//typ1
//		  Assert.assertTrue(err_actual_msg.contains("Invalid username or password!"));//typ2
		   System.out.println("test completss");
		   
		   
		   
		  driver.close();
	}

}
