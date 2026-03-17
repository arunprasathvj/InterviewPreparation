package NewTesting.GGGGGG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ExtendReportsClass {
	
	WebDriver driver;
	
	

	    @BeforeMethod
	    public void setUp() {
	    	
	    	WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }

	
	@Test
	public void testingPassed1() {
		
		Assert.assertEquals(true, true);
		
		System.out.println("Report Passed 1");
		
	}
	
	@Test (dependsOnMethods="testingPassed1")
   public void testingFaill() {
		Assert.assertEquals(true, false);
		
      
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("Report faill");
		
		
		
	}

	@Test (dependsOnMethods= "testingFaill")
   public void testingSkipped() {
	
         Assert.assertEquals(true, true);
		
		System.out.println("Report Skipped");
		
	
}

	@Test
   public void testingPassed2() {
		
     Assert.assertEquals(true, true);
		
		System.out.println("Report Passed 2");
		
	
	
}
	
	

}
