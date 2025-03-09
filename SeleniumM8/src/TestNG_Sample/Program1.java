package TestNG_Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program1 {
	@Test
	public void testcase() {
		Reporter.log("test case pass",true);
	}
	@Test(groups = "smoke")
	public void testcase1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	}
	@Test
	public void demo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		search.click();
		search.sendKeys("Computer");
	}
}
