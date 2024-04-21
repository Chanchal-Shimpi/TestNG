package TestNGExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MavenTesting.SeleniumUtility;

public class Orangehrm extends SeleniumUtility {

	@Test(priority=2)
	public void testOrangeHrmLogin_PositiveFlow() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		typeRequiredText(driver.findElement(By.name("username")),"Admin");
		typeRequiredText(driver.findElement(By.name("password")),"admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		String expectedUrl="dashboard";
		System.out.println("Positive login validation: "+getApplicationUrl().contains(expectedUrl));
		driver.close();
	}                  
	@Test(priority=1) 
	public void testOrangeHrmLogin_NegativeFlow() {   
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		typeRequiredText(driver.findElement(By.name("username")),"Admin");
		typeRequiredText(driver.findElement(By.name("password")),"admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		String expectedUrl="login";
		System.out.println("Negative login validation: "+getApplicationUrl().contains(expectedUrl));
		driver.close();
	}
}