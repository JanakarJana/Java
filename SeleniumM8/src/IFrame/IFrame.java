package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/janakaar/Downloads/iframe%20(1).html");
		//driver.switchTo().frame(0);				// by index
		//driver.switchTo().frame("FR1");				// by id
		driver.switchTo().frame(driver.findElement(By.xpath("//iFrame[@id='FR1']")));		//by web element
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computer");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		driver.navigate().back();
	}
}
