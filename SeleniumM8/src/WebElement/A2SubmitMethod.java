package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2SubmitMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement a = driver.findElement(By.cssSelector("input[id='small-searchterms']"));
		a.sendKeys("computer");
		a.submit();
		//driver.findElement(By.cssSelector("input[type='submit']")).submit();
}
}
