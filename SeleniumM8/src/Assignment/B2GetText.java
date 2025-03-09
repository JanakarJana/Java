package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B2GetText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("asdftest1233@gmail.com");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("test123");
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		WebElement text = driver.findElement(By.cssSelector("a[class='account']"));
		text.getText();
		System.out.println(text);
		
}
}
