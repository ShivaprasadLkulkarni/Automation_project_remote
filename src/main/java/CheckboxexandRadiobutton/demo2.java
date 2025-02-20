package CheckboxexandRadiobutton;

import java.awt.Canvas;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
//	     Home System  =	
		//   System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//	     Office System 
		   System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");	  
			  
		   driver.get("https://www.globalsqa.com/samplepagetest/");
		   driver.manage().window().maximize();
		   // working with multiple elements u need to use webelements sou can use list
		  List<WebElement> radiobutton = driver.findElements(By.xpath("//*[@type=\"radio\"]"));
		   
		  for(int  i=0;i<radiobutton.size();i++) {
//			  WebElement localbx = radiobutton.get(i);
//			  String val=  localbx.getAttribute("value");
//			  System.out.println("valyes from checkboxes are : "+val);
//		  }
		 
		  for(WebElement ele :radiobutton) {
           String vals = ele.getAttribute("value");
			  System.out.println("valyes from radiobutton are : "+vals);
			  
			  if(vals.equalsIgnoreCase("Graduate")){
				  System.out.println("Congrats " +vals);
				  ele.click();
			  }
		  }
		
	}

	}}
