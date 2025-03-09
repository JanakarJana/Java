package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.navigate().to("https://facebook.com/");
		driver.navigate().to("https://www.flipkart.com/");
		
		String url;
		String title;
		String address;
		driver.navigate().back();
		driver.navigate().back();
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().forward();
		driver.navigate().forward();
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().back();
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().forward();
		title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(1000);
		title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().forward();
		address = driver.getWindowHandle();
		System.out.println(address);
		
		driver.navigate().back();
		address = driver.getWindowHandle();
		System.out.println(address);
	}

}
