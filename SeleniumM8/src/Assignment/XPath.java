package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("asdftest1233@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("test123");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).submit();
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']")).click();
		driver.findElement(By.xpath("//a[@href='/productreviews/13\']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("abcd");
		driver.findElement(By.xpath("//textarea[contains(@class,'review')]")).sendKeys("asdfsdadfsadfsdfsdf");
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'button-1 write')]")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.close();
		
	}
}
