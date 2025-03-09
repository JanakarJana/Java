package Assignment;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A13 {
	public static void main(String[] args) throws InterruptedException {
		A13 a = new A13();
//		ChromeOptions opt = new ChromeOptions();
//		opt.setHeadless(true);
//		WebDriver driver = new ChromeDriver(opt);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testrail.access-points.amazon.dev/index.php?/runs/overview/52");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//div[@class='single-sign-on']")).click();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press Zukey");
		String zukey = sc.nextLine();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.withMessage(zukey);
		System.out.println("Enter your username: ");
//		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		user = user.toLowerCase();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.withMessage(user);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(user);
		System.out.println("Enter your pin: ");
		String pin = sc.nextLine();	
		wait.withMessage(pin);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pin);
		driver.findElement(By.xpath("//input[@name='commit']")).click();
//		System.out.println("Press Zukey");
//		String zukey = sc.nextLine();
//		wait.withMessage(zukey);
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='otp-field']")).sendKeys(zukey);
		driver.findElement(By.xpath("//input[@id='otp-submit-btn']")).click();
		driver.findElement(By.xpath("(//a[@href='index.php?/projects/overview/52'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Test Runs & Results']")).click();
		driver.findElement(By.xpath("//a[@id='navigation-runs-add']")).click();
		driver.switchTo().activeElement();
		WebElement testsuite = driver.findElement(By.xpath("//select[@class='form-control form-control-full form-select']"));
		Select s = new Select(testsuite);
		s.selectByIndex(1);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Enter the platform: ");
		String platform = sc.nextLine();
		wait.withMessage(platform);
		platform = platform.toLowerCase();
		String android = "android";
		if(platform.equals(android)) {
			a.android();
		}else {
			a.iOS();
		}
	}
	public void android() {
		
	}
	public void iOS() {
		
	}
}
