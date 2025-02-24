package basic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTitle {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
//	     Home System  =	
		//   System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//	     Office System 
		   System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");	  
			  
		   driver.get("https://formstone.it/components/dropdown/demo/");
		   driver.manage().window().maximize();
		  String title_page = driver.getTitle();
//		  String title_page =  driver.getPageSource();
		  System.out.println("Test Started");
		  System.out.println(title_page);
		  
//		  String e_t = "Dropdown · Formstone";
//		  Assert.assertEquals(title_page,e_t); // fll check
		  Assert.assertTrue(title_page.contains("Formstone"));//partial chck
		  System.out.println("Test Completed");
		  driver.close();
	}

}
