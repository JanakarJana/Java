package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://dhtmlgoodies.com/");
		driver.findElement(By.xpath("//a[text()='Drag and drop']")).click();
		driver.findElement(By.xpath("//a[text()='Demo 3']")).click();
		String address = driver.getWindowHandle();
		driver.switchTo().window(address);
		
		WebElement capital1 = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement capital2 = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement capital3 = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement capital4 = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement capital5 = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement capital6 = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement capital7 = driver.findElement(By.xpath("//div[@id='box7']"));
		
		WebElement country1 = driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement country2 = driver.findElement(By.xpath("//div[@id='box102']"));
		WebElement country3 = driver.findElement(By.xpath("//div[@id='box103']"));
		WebElement country4 = driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement country5 = driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement country6 = driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement country7 = driver.findElement(By.xpath("//div[@id='box107']"));
		
		Actions a= new Actions(driver);
		a.dragAndDrop(capital1, country1).perform();
		a.dragAndDrop(capital2, country2).perform();
		a.dragAndDrop(capital3, country3).perform();
		a.dragAndDrop(capital4, country4).perform();
		a.dragAndDrop(capital5, country5).perform();
		a.dragAndDrop(capital6, country6).perform();
		a.dragAndDrop(capital7, country7).perform();
	}
}
