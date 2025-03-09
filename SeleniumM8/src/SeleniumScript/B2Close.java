package SeleniumScript;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class B2Close {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
		
		Set<String> address = driver.getWindowHandles();
		for(String s: address) {
			driver.switchTo().window(s);
			String url = driver.getCurrentUrl();
			
			if(url.contains("https://www.amazon.com/")) {
			driver.close();
			}
			else if(url.contains("https://www.instagram.com/")){
				driver.navigate().back();
				driver.close();
		}
	}
}
}