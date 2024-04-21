package TestNGday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MavenTesting.SeleniumUtility;

public class OrnageHRM_PIM extends SeleniumUtility{
	@BeforeTest
	public void OrangeHRM() {
	setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
	@BeforeMethod
	public void loginAndNavigateToPIMHomePage() {
	
		typeRequiredText(driver.findElement(By.name("username")),"Admin");
		typeRequiredText(driver.findElement(By.name("password")),"admin123");
	clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
	clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
	}
	
	@Test(priority=1)
	public void testPIM_Creation() {
	    
		clickOnElement(driver.findElement(By.xpath("//a[text()='Add Employee']")));
		typeRequiredText(driver.findElement(By.name("firstName")),"Chanchal");
		typeRequiredText(driver.findElement(By.name("lastName")),"Shimpi");
		//employee id 
		typeRequiredText(driver.findElement(By.cssSelector(".orangehrm-employee-form>div>:nth-child(2)>div>div>:nth-child(2)>input")),"0504");
		//click on save
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-card-container>:nth-child(3)>:nth-child(3)>*:nth-child(3)")));
		
	}
	
	

	
	@Test(priority=2, dependsOnMethods = "testPIM_Creation")
	public void testPIM_Update() {
		WebElement empid=driver.findElement(By.className("oxd-input "));
		empid.sendKeys("0504");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-card-container>:nth-child(3)>:nth-child(3)>*:nth-child(3)")));
		
		
		 
		
		
		
	}
	
	@Test(priority=3, dependsOnMethods = "testPIM_Update")
	public void testPIM_Delete() {
		clickOnElement(driver.findElement(By.xpath("//span[text()='delete']")));
		String expectedUrl="delete";
		Assert.assertTrue(getApplicationUrl().contains(expectedUrl));
		
	}

	@AfterMethod
	public void logout() {
	}

	@AfterTest
	public void closeBrowser() {
	}

}
	
		
	
