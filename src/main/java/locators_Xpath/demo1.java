package locators_Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Syntax --

// //tagname[@attribute_name='value1']

//xpath with single attribute

// eg //a[@href='http://www.google.com']
// eg //input[@id="name"]
// eg //input[@name="username"]
// eg //img[@alt="sometext"]

// xpath with multiple attribute

// //tagname[@attribute_name='value1'][attribute_name2='value2']
// eg //img[@alt="sometext"][@href='']
// eg //a[@id='id1'][@name='namevaues']

// eg input[@class='input' or @id='user_login']// returns 2
// eg input[@class='input' and @id='user_login'] // returns 1 
//
//
//
//
//
//
//
//
//
//

public class demo1 {
	public static void main(String[] args) {
//	Home System  =	
//  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//  Office System 
			System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");	  
			WebDriver driver = new ChromeDriver();
	}

}
