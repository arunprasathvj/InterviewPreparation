package NewTesting.GGGGGG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PsuedoElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
		List<WebElement> element= driver.findElements(By.xpath("//form[@id=\"form-register\"]//label[starts-with(@for,'input')]"));
		
		for(WebElement el:element) {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			String script = "return window.getComputedStyle(argument[0],'::Before').getPropertyValue('content');";
			String content = js.executeScript(script, el).toString();
			
			if(content.contains("*")) {
				
				System.out.println("*****" + el.getText());
			}
			
		}
		
		

	}

}
