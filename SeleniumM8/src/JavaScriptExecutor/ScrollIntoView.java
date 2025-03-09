package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.meesho.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[text()='Download Meesho App Now']")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)",driver.findElement(By.xpath("//div[text()='Women Western Wear']")));
		Thread.sleep(2000);
		WebElement mens = driver.findElement(By.xpath("//strong[text()='Men’s Accessories and Footwear']"));
		WebElement more = driver.findElement(By.xpath("//span[text()='More About Meesho']"));
		js.executeScript("arguments[1].scrollIntoView(false)",mens,more);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)",mens,more);
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,document.body.scrollTop)");
	}
}
