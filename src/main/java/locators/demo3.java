package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	// By link text 
	driver.findElement(By.linkText("Forgot your password? ")).click();
	// By Partial Link text when the link is dynamic
	driver.findElement(By.partialLinkText("Forgot ")).click();
	// Tag name // it gives maximum benifits when u use it with findelements instead of elemement
	driver.findElement(By.tagName("img"));
	
	System.out.println(driver.findElements(By.tagName("img")).size());

	// Direct locators id name Classname are faster
	// Dynamic - Xpath Css
}

}
