package NewTesting.GGGGGG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class WindowsHandle {
	
	
	@Test 
	public static void handleWindows() {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.linkedin.com/login");
		
		driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));
		
		driver.manage().window().setSize(new Dimension (3000, 3000));
		
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[@role=\"button\"][contains (@class, 'nsm7Bb')]")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.close();
		
		Actions ac = new Actions (driver);
	
		ac.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		ac.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		
		Alert al = driver.switchTo().alert();
		
		String per = "20%";
		
		driver.findElement(By.xpath("//*[@class=\"buvtMR\"][text()='" +per+ " or more']")).click();	
		
		System.out.println("//*[@class=\"buvtMR\"][text()='" +per+" or more']");
		
	Select sc = new Select (driver.findElement(By.xpath("//div[@role=\"button\"][contains (@class, 'nsm7Bb')]")));
	
	
	
	
		
		driver.close();
		
//	   driver.switchTo().frame(0);
		
		System.out.println("*******************");
		
		
		Set<String> s  = driver.getWindowHandles();
		
		
		
	
	Iterator<String> it = s.iterator();
	
	
		
		while (it.hasNext()) {
			
	driver.switchTo().window(it.next());
	
		
	driver.close();
		
	System.out.println(it.next());
	
		
		}
//		
//		
//		
		
		
		
		driver.switchTo().newWindow(WindowType.TAB);
	   System.out.println(parent);
		
		
		
		
		
		
		
	}
	
	

}
