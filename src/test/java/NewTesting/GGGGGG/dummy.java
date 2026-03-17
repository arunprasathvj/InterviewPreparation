package NewTesting.GGGGGG;

import org.testng.annotations.Test;

public class dummy {

	@Test(invocationCount = 5, threadPoolSize = 2)
	public void testMethod() {
	    System.out.println(Thread.currentThread().getId());
	}
	
}
