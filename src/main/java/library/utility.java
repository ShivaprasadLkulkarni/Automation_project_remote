package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class utility {
   @Test
	public static void capturescreenshots(WebDriver driver,String sname) {
	   try {
		TakesScreenshot ts = (TakesScreenshot) driver;
		   File source = ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(source,new File("./ScreenShots/"+sname+".png"));
		   System.out.println("Screen Shots are Captured");
	} catch (Exception e) {
	System.out.println("Exception while taking screenshot "+e.getMessage());
	}
	}
}
