package SeleniumScript;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1GetWindowHandles {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://instagram.com/");
		
		Set<String> address = driver.getWindowHandles();		// set will not allow duplicate values
		System.out.println(address);
		
		for(String s: address) {			//for each loop
			System.out.println(s);
		}
	}
}
