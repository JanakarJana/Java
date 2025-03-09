package Assignment;

//import java.awt.HeadlessException;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.MemberSubstitution.Current;

public class A12 {
	   WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		A12 a = new A12();
		System.out.println("Enter checkin/checkout: ");
		Scanner scanner = new Scanner(System.in);
		String reason = scanner.nextLine();
		reason = reason.toLowerCase();
		String c = "checkin";
		if(reason.equals(c)) {
			a.checkin();
		}else {
			a.checkout();
		}
		
	}
	public void checkin() throws IOException, InterruptedException {
//		ChromeOptions opt = new ChromeOptions();
//		opt.setHeadless(true);
//		driver = new ChromeDriver(opt);
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("headless");
//		opt.setHeadless(false);
//		driver = new ChromeDriver(opt);
		System.out.println("checkin started");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://prod.idms.gdq.amazon.dev/");
//		driver.manage().window().setSize( new Dimension(50,500));
		System.out.println("Enter your username: ");
		Scanner scanner = new Scanner(System.in);
		String user = scanner.nextLine();
		user = user.toLowerCase();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.withMessage(user);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(user);
		System.out.println("Enter your pin: ");
		String pin = scanner.nextLine();
		wait.withMessage(pin);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pin);
		driver.findElement(By.xpath("//input[@name='commit']")).click();
//		System.out.println("Press Zukey");
//		String zukey = scanner.nextLine();
//		wait.withMessage(zukey);
//		Thread.sleep(3000);
//		driver.switchTo().parentFrame();
////		WebElement el = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='otp-field']")));
//		driver.findElement(By.xpath("//input[@id='otp-field']")).sendKeys(zukey);
//		driver.findElement(By.xpath("//input[@id='otp-submit-btn']")).click();
		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(35)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='awsui_child_18582_7onux_145']")));
		driver.findElement(By.xpath("//button[contains(@class,'awsui_trigger_hyvsj_3skry_1174')]")).click();
		driver.findElement(By.xpath("//span[text()='Device Library']")).click();
		driver.findElement(By.xpath("//input[@aria-label='your choice']")).sendKeys("device name");
		driver.findElement(By.xpath("//span[@data-value='Device Name : ']")).click();
		System.out.println("Enter device name :");
		String devicename = scanner.nextLine();
		wait.withMessage(devicename);
		driver.findElement(By.xpath("//input[@aria-label='your choice']")).sendKeys(devicename);
		driver.findElement(By.xpath("//div[@class='awsui_option-content_15o6u_ho89k_282 awsui_option-content_2dmmi_qu62t_6']")).click();
		WebElement dsn = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='awsui_link_4c84z_iv0u7_141 awsui_variant-primary_4c84z_iv0u7_245 awsui_font-size-body-m_4c84z_iv0u7_474']")));
		String dsnvalue = dsn.getText();
		System.out.println("The dsn value of the entered device is "+dsnvalue);
		System.out.println("Enter location :");
		String location = scanner.nextLine();
		wait.withMessage(location);
		location = location.toUpperCase();
		driver.findElement(By.xpath("//span[text()='Request Device']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(dsnvalue);
		driver.findElement(By.xpath("//span[text()='Validate']")).click();
		WebElement listbox = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@aria-haspopup='listbox'])[1]")));
		listbox.click();
		driver.findElement(By.xpath("(//span[@class='awsui_label-content_1p2cx_jbmfe_206'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@aria-haspopup='listbox'])[2]")).click();
		if(location.equals("MAA12")) {
		driver.findElement(By.xpath("//span[text()='MAA12']")).click();
		}else if(location.equals("MAA15")){
			driver.findElement(By.xpath("//span[text()='MAA15']")).click();
		}else if(location.equals("MAA2")) {
			driver.findElement(By.xpath("//span[text()='MAA2']")).click();
		}else if(location.equals("BLR27")) {
			driver.findElement(By.xpath("//span[text()='BLR27']")).click();
		}else if(location.equals("WAS19")) {
			driver.findElement(By.xpath("//span[text()='WAS19']")).click();
		}else {
			System.out.println("Invalid location");
		}
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1");
		driver.findElement(By.xpath("(//span[text()='Request Device'])[5]")).click();
		System.out.println(devicename+" "+"checked in successfully");
		driver.quit();
	}
	public void checkout() throws IOException, InterruptedException {
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("headless");
//		opt.setHeadless(false)
//		driver = new ChromeDriver(opt);
		System.out.println("checkout started");
		driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://prod.idms.gdq.amazon.dev/");
		System.out.println("Enter your username: ");
		Scanner scanner = new Scanner(System.in);
		String user = scanner.nextLine();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.withMessage(user);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(user);
		System.out.println("Enter you pin :");
		String pin = scanner.nextLine();
		wait.withMessage(pin);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pin);
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(35)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='awsui_child_18582_7onux_145']")));
		driver.findElement(By.xpath("//button[contains(@class,'awsui_trigger_hyvsj_3skry_1174')]")).click();
		driver.findElement(By.xpath("//span[text()='Device Library']")).click();
		driver.findElement(By.xpath("//input[@aria-label='your choice']")).sendKeys("device name");
		driver.findElement(By.xpath("//span[@data-value='Device Name : ']")).click();
		System.out.println("Enter device name : ");
		String devicename = scanner.nextLine();
		wait.withMessage(devicename);
		driver.findElement(By.xpath("//input[@aria-label='your choice']")).sendKeys(devicename);
		driver.findElement(By.xpath("//div[@class='awsui_option-content_15o6u_ho89k_282 awsui_option-content_2dmmi_qu62t_6']")).click();
		WebElement dsn = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='awsui_link_4c84z_iv0u7_141 awsui_variant-primary_4c84z_iv0u7_245 awsui_font-size-body-m_4c84z_iv0u7_474']")));
		String dsnvalue = dsn.getText();
		System.out.println("The dsn value of the entered device is "+dsnvalue);
		driver.findElement(By.xpath("//span[text()='Return Device']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(dsnvalue);
		driver.findElement(By.xpath("//span[text()='Validate']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		System.out.println(devicename+" "+"checked out successfully");
		driver.quit();
	}
}
