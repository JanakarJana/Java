package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		Actions a = new Actions(driver);
		WebElement MobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement LaptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement MobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement LaptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		WebElement MobileAccessories = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
		WebElement LaptopAccessories = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
		
		a.clickAndHold(MobileCharger).release(MobileAccessories).perform();
		a.clickAndHold(LaptopCharger).release(LaptopAccessories).perform();
		a.clickAndHold(MobileCover).release(MobileAccessories).perform();
		a.clickAndHold(LaptopCover).release(LaptopAccessories).perform();
		
	}
}
