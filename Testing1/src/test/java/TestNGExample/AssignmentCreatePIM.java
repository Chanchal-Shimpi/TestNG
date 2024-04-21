package TestNGExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utility.SeleniumUtility22;

public class AssignmentCreatePIM extends SeleniumUtility22 {

	@Test
	public void orangeHRM_PIMCreationTest() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		typeInput(driver.findElement(By.name("username")), "Admin");
		typeInput(driver.findElement(By.name("password")), "admin123");

		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Add Employee']")));
		typeInput(driver.findElement(By.name("firstName")), "Chanchal");
		typeInput(driver.findElement(By.name("lastName")), "Shimpi");
		// employee id
		typeInput(driver.findElement(By.className("oxd-input ")),"0504");
		// click on save
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-card-container>:nth-child(3)>:nth-child(3)>*:nth-child(3)")));

	}
}
