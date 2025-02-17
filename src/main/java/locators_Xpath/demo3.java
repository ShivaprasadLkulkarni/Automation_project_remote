package locators_Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//dynamic Xpath part 3
// //*[@id='menu-links']/a//preceeding::a // it just goback to the pointed element
// with ancestor
// //*[@id='welcome-panel']/div[1]//ancestor::div[1]//bfore welcome panel what and all divs are ther it points
// xpath with single line
//  //*[@id='welcome-panel']/a // searches anchor link inside welcome panel
//  //*[@id='welcome-panel']/div[2]/h3
// //*[@id='welcome-panel']/div[2]/p
//
public class demo3 {
	public static void main(String[] args) {
//	Home System  =	
//  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//  Office System 
			System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");	  
			WebDriver driver = new ChromeDriver();
			System.out.println("Done");
	}

}
