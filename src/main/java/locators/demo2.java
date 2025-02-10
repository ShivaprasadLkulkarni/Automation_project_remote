package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//name or id // id is not available in page so used name but not working
    WebElement uname = driver.findElement(By.id("username"));// By is an class id is a static method
    uname.sendKeys("Admin");
    //name
    By pass = By.name("password");
    driver.findElement(pass).sendKeys("admin12");
    
   // class Name many time class name wont be unique
    driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
   // Xpath
    driver.findElement(By.xpath("")).click();
    // Css selector
    driver.findElement(By.cssSelector("")).click();

}

}
