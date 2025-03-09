package SeleniumScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4GetTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String title1 = driver.getTitle();
		System.out.println(title1);
		if(title1.contains("Demo Web Shop")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		driver.get("https://www.instagram.com/");
		String title2 = driver.getTitle();
		System.out.println(title2);
		if(title2.contains("Instagram")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		driver.close();
	}
}
