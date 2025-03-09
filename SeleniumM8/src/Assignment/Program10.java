package Assignment;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program10 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://letcode.in/windows");
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		Thread.sleep(2000);
		
		ArrayList<String> address = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(address.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[text()='Click']")).click();
		//driver.close();
	}
}
