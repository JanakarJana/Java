package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1CssSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("abcd");
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("efg");
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("asdftest1233@gmail.com");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("test123");
		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("test123");
		driver.findElement(By.cssSelector("input[id='register-button']")).click();					//registration completed
		
		driver.findElement(By.cssSelector("a[class='ico-logout']")).click();			//logout
		
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();				//login
		
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("asdftest1233@gmail.com");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("test123");
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();		// successfully logged in
	}
}
