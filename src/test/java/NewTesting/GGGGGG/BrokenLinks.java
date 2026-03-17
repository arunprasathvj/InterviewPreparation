package NewTesting.GGGGGG;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.edgedriver().setup();
		ChromeDriver driver= new ChromeDriver ();
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List <WebElement> list = driver.findElements(By.tagName("a"));
		
		int BrokenlinkCount = 0;
		int CorrectlinkCount =0 ;
		
		
		for(WebElement links : list) {
			
			String linkUrl = links.getAttribute("href");
			
			if (linkUrl == null || linkUrl.isEmpty()) {
				
				System.out.println("Empty and Null urls");
				continue;
			}
			
			try {
				URL correctUrls = new URL (linkUrl);
				
				HttpURLConnection http = (HttpURLConnection) correctUrls.openConnection();
				http.connect();
				
				
				
				if(http.getResponseCode() >=400) {
					
					System.out.println("Broken link :-" + linkUrl);
					BrokenlinkCount++;	
				}
				
				else {
					
					System.out.println("Correct link :-" + linkUrl);
					CorrectlinkCount++;	
					
				}
				
				
				
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
			}
			
			finally {
				
				System.out.println(" CorrectlinkCount :-" + CorrectlinkCount);

				System.out.println(" BrokenlinkCount :-" + BrokenlinkCount);
				}
			
		}
		
		
		
	}

}
