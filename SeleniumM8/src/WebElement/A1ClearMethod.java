package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search = driver.findElement(By.cssSelector("input[id='small-searchterms']"));
		
		search.sendKeys("computer");
		Thread.sleep(2000);
		search.clear();
		Thread.sleep(2000);
		search.sendKeys("mobiles");
	}
}
