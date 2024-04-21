package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import MavenTesting.SeleniumUtility;

public class Assignment3 {
	
	public static void main(String[] args) {
		
	
      SeleniumUtility util=new SeleniumUtility();
      WebDriver driver=util.setUp("Chrome","https://erail.in/");
      //click on eCatering
      WebElement frame=driver.findElement(By.cssSelector(".eCatering"));
   
}
}
/*
TC5:
https://erail.in/
click on eCatering
enter train number 12627 and select from suggestion
date from next month
any station (Itarsi)
click submit
print all resturent names
go back home page
perform following
	1. from: Pune
	2. to: Bangalore
	3. date from next month
	4. click on get trains
print all the train numbers and name which are running on that particular date
*/