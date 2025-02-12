package locators_Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Syntax --
//if you donot the tag u can use *
//*[text()='Howdy,admin']
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
// xpath with contains 
// //a[contains(@href,'edit.php')]// returns many elements
// //a[contains(@href,'edit.php')][text()='posts']// gives exact
//
// xpath with dynamic elements
// id = edit12345
// id = edit12222
// id = edit13333
//  //*[contains(@id,'edit')]

//  xpath with starts-with
//  //input[starts-with(@id,'1')]
//  //a[starts-with(@href='')]
//  //input[starts-with(@srs='')]
//  //button[starts-with(@id='')]
//  //img[starts-with(@id='')]

public class demo1 {
	public static void main(String[] args) {
//	Home System  =	
//  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//  Office System 
			System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");	  
			WebDriver driver = new ChromeDriver();
			System.out.println("Done");
	}

}
