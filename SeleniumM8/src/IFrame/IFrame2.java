package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9597772097");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//img[@id='youtube_img']")).click();
	}
}
