package TestNGday2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MavenTesting.SeleniumUtility;

public class OrangeHrmPIMWithBeforeAndAfterMethod extends SeleniumUtility {
	
	@BeforeMethod
	public void precondition() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	} 

	@Test(priority=2)
	public void testOrangeHrmLogin_PositiveFlow() {
		typeRequiredText(driver.findElement(By.name("username")),"Admin");
		typeRequiredText(driver.findElement(By.name("password")),"admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		String expectedUrl="dashboard";
		Assert.assertTrue(getApplicationUrl().contains(expectedUrl));
	}
	@Test(priority=1)
	public void testOrangeHrmLogin_NegativeFlow() {
		String expectedUrl="login";
		Assert.assertTrue(getApplicationUrl().contains(expectedUrl));
	}
	
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
}