package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAction {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement computer = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		WebElement notebook = driver.findElement(By.xpath("//a[contains(text(),'Notebooks')]"));
		Actions a = new Actions(driver);
		a.moveToElement(computer).pause(Duration.ofSeconds(5)).moveToElement(notebook).pause(Duration.ofSeconds(3)).click().perform();
	}
}
