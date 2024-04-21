package TestNGday2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SuiteConditions {
 
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("*******************beforesuit****************");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("*************aftersuit*******************");
  }

}
