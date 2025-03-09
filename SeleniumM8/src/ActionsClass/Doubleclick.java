package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions a = new Actions(driver);
		a.doubleClick(button).perform();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		a.contextClick(rightclickbutton).perform();			// right click
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		a.contextClick(rightclickbutton).click(copy).perform();
		alt.accept();
	}
}
