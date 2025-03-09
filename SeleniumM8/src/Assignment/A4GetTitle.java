package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4GetTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		String title;
		title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Zomato")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		driver.get("https://www.swiggy.com/");
		title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Order Food Online from India's Best Food Delivery Service | Swiggy")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		driver.close();
	}
}
