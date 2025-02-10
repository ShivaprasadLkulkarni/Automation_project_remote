package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivertest {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.Amazon.com");
	  driver.quit();
}
}
