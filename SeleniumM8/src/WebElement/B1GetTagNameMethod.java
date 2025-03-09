package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1GetTagNameMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> element = driver.findElements(By.tagName("a"));
		
		for(WebElement link:element) {
			//Thread.sleep(1000);
			System.out.println(link.getAttribute("href"));
		}
	}
}
