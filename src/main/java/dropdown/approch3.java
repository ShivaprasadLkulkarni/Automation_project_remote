package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
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
public class approch3 {
	
@Test	
public void selectolddropdownvlaues() throws InterruptedException {
	   WebDriver driver = new ChromeDriver();
//     Home System  =	
//   System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//     Office System 
	   System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");	  
		  
	   driver.get("https://formstone.it/components/dropdown/demo/");
	   driver.manage().window().maximize();
	   Select tools = new Select(driver.findElement(By.id("demo_external")));
	  
	   List actuallist=new ArrayList<>();
	   List<WebElement>my_tools= tools.getOptions();
	   
	   for(WebElement ele:my_tools) {
		  String data = ele.getText();
		  actuallist.add(data); 
	   }
	   System.out.println(actuallist);
      List temp=new ArrayList();
      temp.addAll(actuallist);
     //Ascending
//      Collections.sort(temp);
      //Descending incase scenariuo
//      Collections.sort(temp,Collections.reverseOrder());
//      Assert.assertTrue(actuallist.equals(temp));
      System.out.println(temp);
	}

}
