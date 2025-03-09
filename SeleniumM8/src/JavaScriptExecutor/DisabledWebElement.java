package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledWebElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");
		boolean a;
		WebElement disabledelement = driver.findElement(By.xpath("//input[@class='form-control']"));
		a = disabledelement.isEnabled();
		System.out.println(a);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('disabled')", disabledelement);
		a= disabledelement.isEnabled();
		System.out.println(a);
		disabledelement.sendKeys("java");
		
	}
}
