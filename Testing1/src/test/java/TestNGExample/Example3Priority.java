package TestNGExample;

import org.testng.annotations.Test;

public class Example3Priority {
	@Test (priority=3)
	public void testcase1() {
		System.out.println("hii,tc1");
	}
	@Test(priority=1)
	public void testcase2() {
		System.out.println("hii,tc2");
	}
	
	@Test(priority=1)
	public void testcase3() {
		System.out.println("hii,tc3");
	}
	
}
