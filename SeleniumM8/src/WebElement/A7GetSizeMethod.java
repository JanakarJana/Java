package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7GetSizeMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Dimension size = driver.findElement(By.cssSelector("input[id='newsletter-email']")).getSize();
		System.out.println(size);
		int height = size.getHeight();
		System.out.println(height);
		int width = size.getWidth();
		System.out.println(width);
}
}
