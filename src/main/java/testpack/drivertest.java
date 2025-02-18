package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivertest {
public static void main(String[] args) {
	
// Home System  =	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
// office System 
	System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");	  
	WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.Amazon.com");
	  driver.quit();
	  
	  
//	 Tips :
	 // and in office system donot commit the pom.xml changes and chromedriver add two one comment
	 // when u using homesystem usethis pom.xml 
	  
//	  <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
//	  <modelVersion>4.0.0</modelVersion>
//	  <groupId>automationTesting_SeleniumJava</groupId>
//	  <artifactId>automationTesting_SeleniumJava</artifactId>
//	  <version>0.0.1-SNAPSHOT</version>
//	  <name>automationTesting_SeleniumJava</name>
//	  <description>automationTesting_SeleniumJava</description>
//
//	  <dependencies>
//	 <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
//	<dependency>
//	    <groupId>org.seleniumhq.selenium</groupId>
//	    <artifactId>selenium-java</artifactId>
//	    <version>4.28.1</version>
//	</dependency>
//	   </dependencies>
//	</project>
	  
//	 office use
//	  <project xmlns="http://maven.apache.org/POM/4.0.0" 
//		         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
//		         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
//		    <modelVersion>4.0.0</modelVersion>
//
//		    <groupId>practises</groupId>
//		    <artifactId>practises</artifactId>
//		    <version>0.0.1-SNAPSHOT</version>
//
//		    <!-- Add dependencies -->
//		    <dependencies>
//		  
//		        
//		        <dependency>
//		            <groupId>JavaProject</groupId>
//		            <artifactId>Project</artifactId>
//		            <version>0.0.1-SNAPSHOT</version>
//		        </dependency>
//		       
//		    </dependencies>
//		</project>

}
}
