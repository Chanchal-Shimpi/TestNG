package TestNGExample;

import org.testng.annotations.Test;

public class Example2CallingTC4 {
    @Test
	public void testcase1() {
		System.out.println("hii,TC1");
	}
    @Test
    public void testcase3() {
    	System.out.println("hii,TC3");
    }
   @Test
    public void testcase2() {
    	System.out.println("hii,TC2");
    	testcase4();
    }
   public void testcase4() {
		System.out.println("Hii, TC4");
	}
   
}
