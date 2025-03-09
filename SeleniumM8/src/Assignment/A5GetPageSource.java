package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5GetPageSource {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		driver.close();
	}
}
