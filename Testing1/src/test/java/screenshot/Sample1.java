package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import MavenTesting.SeleniumUtility;

public class Sample1 {

	public static void main(String[] args) throws IOException {
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver = util.setUp("chrome", "https://www.google.com");

//		// type cast WebDriver instance into TakeScreenshot
 	    TakesScreenshot ts = (TakesScreenshot) driver;
//		// now using TakesScreenshot interface get the screenshot
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
//		// after taking screenshot store it into required location
		FileUtils.copyFile(screenshot, new File("./screenshots/google2.jpg"));
		
	
	}


	}


