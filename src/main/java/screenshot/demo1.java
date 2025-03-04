package screenshot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import library.utility;

import org.openqa.selenium.TakesScreenshot;

public class demo1 {
	@Test
	public void captuescreenshot() throws IOException {
		
	
	   WebDriver driver = new ChromeDriver();

//     Home System  =	
	   System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//     Office System 
//	   System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");	  
	
	   driver.get("https://demoqa.com/automation-practice-form");
	   utility.capturescreenshots(driver,"browser started"); //taking screenshot after each step

	   driver.manage().window().maximize();
	   utility.capturescreenshots(driver,"browser maiximized"); //taking screenshot after each step

	   driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("learning then earning");
	   utility.capturescreenshots(driver,"browser located and written"); //taking screenshot after each step
	
	   //type 1
//	   TakesScreenshot ts = (TakesScreenshot) driver;
//	   File source = ts.getScreenshotAs(OutputType.FILE);
//	   FileUtils.copyFile(source,new File("./ScreenShots/demo.png"));
//	   System.out.println("Screen Shots are Captured");
//	   driver.quit();
	   
	   //type 2 generic simple  method userdefined
	   utility.capturescreenshots(driver,"Finish");
	   
	   
}}