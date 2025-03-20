package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class demoframe1 {
    @Test
    public void testframes() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/usr/lib64/chromium-browser/chromedriver");

        // Create a unique temporary directory for each session
        try {
            Path tempDir = Files.createTempDirectory("chrome_user_data_");

            ChromeOptions options = new ChromeOptions();
            // Specify a unique user data directory for each session
            options.addArguments("user-data-dir=" + tempDir.toAbsolutePath().toString());
            options.addArguments("temp-dir=" + tempDir.toAbsolutePath().toString());  // Optional: Set temp directory as well

            // Initialize ChromeDriver with the specified options
            WebDriver driver = new ChromeDriver(options);

            // Open the website
            driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
            driver.manage().window().maximize();

            // Switch to the frame by ID
            driver.switchTo().frame("frm2");  // Switching to frame by ID

            // Locate the first name field and input text
            driver.findElement(By.id("firstName")).sendKeys("shiv");

            // Optionally, you can add further actions or validations here

            // Close the driver after the test
//            driver.quit();
            driver.switchTo().defaultContent();
            driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/h2/text()")).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
