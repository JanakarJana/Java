package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B5GetLocation {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Point axis1 = driver.findElement(By.cssSelector("input[id='email']")).getLocation();
		int x1 = axis1.getX();
		int y1 = axis1.getY();
		System.out.println("username x axis is " +x1);
		System.out.println("username y axis is " +y1);
		
		Point axis2 = driver.findElement(By.cssSelector("input[id='pass']")).getLocation();
		int x2 = axis2.getX();
		int y2 = axis2.getY();
		System.out.println("password x axis is " +x2);
		System.out.println("password y axis is "+y2);
		
		if(x1==x2) {
			System.out.println("Both username and password are aligned in same line");
		}
		else {
			System.out.println("Not aligned properly");
		}
		
	}
}
