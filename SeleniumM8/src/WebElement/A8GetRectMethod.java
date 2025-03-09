package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class A8GetRectMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Rectangle username = driver.findElement(By.cssSelector("input[id='email']")).getRect();
		System.out.println(username.getHeight());
		System.out.println(username.getWidth());
		System.out.println(username.getX());
		System.out.println(username.getY());
		
		boolean element = driver.findElement(By.cssSelector("input[id='email']")).isDisplayed();
		System.out.println(element);
		
		boolean login = driver.findElement(By.cssSelector("button[name='login']")).isEnabled();
		System.out.println(login);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(("https://demowebshop.tricentis.com/"));
		boolean select = driver.findElement(By.cssSelector("input[id='pollanswers-1']")).isSelected();
		System.out.println(select);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoapp.skillrary.com/");
		WebElement textbox = driver.findElement(By.cssSelector("input[class='form-control']"));
		boolean box = textbox.isEnabled();
		System.out.println(box);
		
	}
}
