package NewTesting.GGGGGG;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Likwew {
	
	@Test
	public static void testing () {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	List <WebElement> list =	driver.findElements(By.tagName("a"));
	
	for (int i =0 ; i<list.size(); i++ ) { 
		
		String url = list.get(i).getAttribute("href");
		
		if (url.contains("machine_learning")) {
		
			driver.navigate().to(url);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			System.out.println("*****" + "PASSSSSSSSSSSSSSSSSSS");
			
			
		}
		
		//driver.get(url);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
		System.out.println("*****" + url);
		
	}
//		List<WebElement> list = new LinkedList<WebElement>();
//		
//		list.addAll(driver.findElements(By.tagName("a")));
		
		//System.out.println("*****" + list);
		
		
		
		
	}

}
