package dropdown;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Approach
//Capture all values from drop down list
//then Create a temp list and sort them > you will have 2 list to compare
//then compare using equals method

//prequistes

//ArraysList > Collection 
//Dropdown handles
//Select values > get Selected values > get all selected values>get all values of dropedonw

//Tips
//if any dropdowns doesnot comes under select tag then u need to use find elemenets by xpoath and get the values

//Traditional Dropdowns
public class approch {
	
@Test	
public void selectolddropdownvlaues() throws InterruptedException {
	   WebDriver driver = new ChromeDriver();
//     Home System  =	
	   System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//     Office System 
//	   System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");	  
		  
	   driver.get("https://demoqa.com/select-menu");
	   driver.manage().window().maximize();
	   
	   WebElement color_dropdown= driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
	   
	   Select color_dd =new Select(color_dropdown);
	   color_dd.selectByIndex(3); //returns yellow
	   
	   Thread.sleep(3000); //keeping 3 sec delay
	   color_dd.selectByValue("2");//green  // please keep it in double course
	   Thread.sleep(2000);
	   color_dd.selectByVisibleText("Black");// black //highly recommend it will not change when dev changes for india 2 usa 5 also it remains same
	   driver.close();
	}

}
