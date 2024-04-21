package TestNGExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utility.SeleniumUtility22;

public class Assignment222 extends SeleniumUtility22 {

	@Test
	public void sourceDemoShopping() {
		setUp("Chrome","https://www.saucedemo.com/");
		typeInput(driver.findElement(By.name("user-name")),"standard_user");
		typeInput(driver.findElement(By.name("password")),"secret_sauce");
		clickOnElement(driver.findElement(By.id("login-button")));
		clickOnElement(driver.findElement(By.id("add-to-cart-sauce-labs-backpack")));
		clickOnElement(driver.findElement(By.className("shopping_cart_container")));
		clickOnElement(driver.findElement(By.id("checkout")));
		typeInput(driver.findElement(By.id("first-name")),"Chanchal");
		typeInput(driver.findElement(By.id("last-name")),"Shimpi");
		typeInput(driver.findElement(By.id("postal-code")),"0304");
		clickOnElement(driver.findElement(By.id("continue")));
		clickOnElement(driver.findElement(By.id("finish")));
	    clickOnElement(driver.findElement(By.id("back-to-products")));
	}
	
	
		
	}

	
	