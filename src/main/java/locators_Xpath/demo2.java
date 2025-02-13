package locators_Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//dynamic Xpath part 2
// Following,Preceeding Ancestor Absolute vs relative path
//
// Xpth using following
// eg1 //*[@id='content-label']/label/following::input// gives all element of input
// eg2 //*[@id='content-label']/label/following::input[1]// only specific 
// eg3 //*[@id='content-label']/label/following::input[2]
//
//eg4 //*[@id='menu-dashboard']/a//following::a[1]
//
//
//
//
//
//
//
//
//


public class demo2 {
	public static void main(String[] args) {
//	Home System  =	
//  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//  Office System 
			System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");	  
			WebDriver driver = new ChromeDriver();
			System.out.println("Done");
	}

}
