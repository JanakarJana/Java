package SeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3GetCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("https://demowebshop.tricentis.com/")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
	}
}
