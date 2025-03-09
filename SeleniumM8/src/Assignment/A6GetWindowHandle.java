package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6GetWindowHandle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		String address = driver.getWindowHandle();
		System.out.println(address);
		driver.close();
	}
}
