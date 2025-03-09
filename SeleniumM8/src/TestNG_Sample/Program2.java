package TestNG_Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program2 {
	@Test(groups = "smoke")
	public void testprogram() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@Test(groups = "integration")
	public void test1() {
		Reporter.log("Integration test case",true);
	}
	@Test(groups = "system")
	public void testdemo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search = driver.findElement(By.xpath("//input[@id='small-schterms']"));
		search.click();
		search.sendKeys("computer");
		
	}
}
