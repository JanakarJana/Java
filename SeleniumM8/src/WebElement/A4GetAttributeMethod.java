package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4GetAttributeMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String attribute = driver.findElement(By.cssSelector("input[id='small-searchterms']")).getAttribute("value");
		System.out.println(attribute);
	}
}
