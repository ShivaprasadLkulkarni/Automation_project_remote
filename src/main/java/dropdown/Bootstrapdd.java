package dropdown;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdd {

@Test	
public void selectolddropdownvlaues() throws InterruptedException {
	   WebDriver driver = new ChromeDriver();
//     Home System  =	
//     System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//     Office System 
	   System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");	  
		  
	   driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
	   driver.manage().window().maximize();
	   
	   driver.findElement(By.xpath("//*[@id=\"menu1\"]")).click();
	   List<WebElement>  dd_menu =driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]//li/a"));
	
//	   for(int i=0;i<dd_menu.size();i++) {
//       WebElement Ele = dd_menu.get(i);
//        String innerhtml =  Ele.getAttribute("innerHTML");
//        System.out.println(innerhtml);
	
	   for(WebElement ele :dd_menu) {
		String innerHTML=  ele.getAttribute("innerHTML");
		if(innerHTML.contentEquals("JavaScript")) {
			ele.click();
			break;
		}
		System.out.println(innerHTML);
	   }
	   driver.close();
}
}