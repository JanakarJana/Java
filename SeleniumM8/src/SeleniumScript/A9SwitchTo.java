package SeleniumScript;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9SwitchTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/");
		
		Set<String> address = driver.getWindowHandles();
		for(String s: address) {
			driver.switchTo().window(s);
			
			driver.close();
		}
	}
}
