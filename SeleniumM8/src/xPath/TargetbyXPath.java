package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetbyXPath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();		//	xPath by Attribute
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();	// xPath by text function
		
		driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click(); 	//xPath by partial text function --> used when the text function has space at the end
		
		driver.findElement(By.xpath("//input[contains(@class,'search-box-text')]")).sendKeys("computer");	// xPath by partial Attribute
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		driver.findElement(By.xpath("//img[@ alt='Tricentis Demo Web Shop']")).click();
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click(); 	//xPath by index
	}
}
