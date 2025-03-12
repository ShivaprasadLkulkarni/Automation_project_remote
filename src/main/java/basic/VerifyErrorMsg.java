package basic;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMsg {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); // Set the correct path
        driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/?.src=ym&pspid=2114723002&activity=header-mail&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%3F.intl%3Din%26.lang%3Den-IN%26pspid%3D2114723002%26activity%3Dheader-mail");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyErrorMsg() {
        // Locate email/username input field and enter invalid data
        WebElement emailField = driver.findElement(By.id("login-username"));
        emailField.sendKeys("invalidemail@example.com");

        // Locate and click the "Next" button
        WebElement nextButton = driver.findElement(By.id("login-signin"));
        nextButton.click();

        // Wait for the error message to appear (you might want to use WebDriverWait here for better synchronization)
        WebElement errorMsg = driver.findElement(By.id("username-error"));

        // Verify the error message text
        String actualErrorMsg = errorMsg.getText();
        String expectedErrorMsg = "Sorry, we don’t recognize this email.";

        // Assert the error message is correct
        Assert.assertEquals(expectedErrorMsg, actualErrorMsg);

        // Optional: Clean up
        driver.quit();
    }
}
