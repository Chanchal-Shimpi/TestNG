package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import MavenTesting.SeleniumUtility;

public class HandlingFrame{
	
	public static void main(String[] args) {
		
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://jqueryui.com/");
		
		 
		//move control inside the frame to perform required opr on the element
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);		
				//or
		driver.switchTo().frame(0);
		
		util.clickOnElement(driver.findElement(By.xpath("//li[text()='Item 2']")));
		
		//to get the control back to main page use
		driver.switchTo().defaultContent();
		util.clickOnElement(driver.findElement(By.cssSelector(".logo")));		
	}
}

/*
open https://jqueryui.com/
click on Selectable
select any item
click on site logo
*/