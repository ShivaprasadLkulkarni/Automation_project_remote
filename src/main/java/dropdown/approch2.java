package dropdown;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class approch2 {
	
@Test	
public void selectolddropdownvlaues() throws InterruptedException {
	   WebDriver driver = new ChromeDriver();
//     Home System  =	
//     System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//     Office System 
	   System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");	  
		  
	   driver.get("https://formstone.it/components/dropdown/demo/");
	   driver.manage().window().maximize();
	   
	   WebElement color_dropdown= driver.findElement(By.xpath("//*[@id='demo_basic']"));   
	   Select color_dd =new Select(color_dropdown);
	   
//	   WebElement selected_value=  color_dd.getFirstSelectedOption();
//	   //t should return derfault value one
//	   System.out.println("Before selection value is : "+ selected_value.getText());
//
//	   
//	   // it will select the text of element :  two
//	   color_dd.selectByIndex(1);
//	   WebElement selected_value1=  color_dd.getFirstSelectedOption();
//	   System.out.println("After selection value is : "+ selected_value1.getText());
//	   
	 List<WebElement> listsofdd =  color_dd.getOptions();
	 int total_dd=listsofdd.size();
	 
	// Assert.assertEquals(total_dd, 2);
	   System.out.println("total count : "+total_dd);
	   
	   //Enhancehd while loop
	   for(WebElement ele : listsofdd) {
		 String dd_name = ele.getText();
		 System.out.println("numbers are : "+dd_name);
	   }
	   
	   
	   
	   
	   
	   driver.close();
	}

}
