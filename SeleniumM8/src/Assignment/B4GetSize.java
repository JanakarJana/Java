package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B4GetSize {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Dimension size1 = driver.findElement(By.cssSelector("input[id='email']")).getSize();
		System.out.println(size1);
		int height = size1.getHeight();
		int width = size1.getWidth();
		
		Dimension size2 = driver.findElement(By.cssSelector("input[id='pass']")).getSize();
		System.out.println(size2);
		int height1 = size2.getHeight();
		int width1 = size2.getWidth();
		
		if((height==height1)&&(width==width1)) {
			System.out.println("Both height and width are same");
		}
		else {
			System.out.println("Height and width are not same");
		}
	}
}
