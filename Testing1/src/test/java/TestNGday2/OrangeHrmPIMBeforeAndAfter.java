package TestNGday2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MavenTesting.SeleniumUtility;

public class OrangeHrmPIMBeforeAndAfter extends SeleniumUtility {	
	@BeforeTest
	public void precondition() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}	
	@BeforeMethod
	public void login() {
		typeRequiredText(driver.findElement(By.name("username")),"Admin");
		typeRequiredText(driver.findElement(By.name("password")),"admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
	}
	@Test(priority=2)
	public void testOrangeHrmPIMPage() {
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
		String expectedUrl="pim";
		Assert.assertTrue(getApplicationUrl().contains(expectedUrl));
	}
}