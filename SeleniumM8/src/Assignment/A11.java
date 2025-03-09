package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A11 {
	WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		A11 a = new A11();
		FileInputStream fis = new FileInputStream("C:\\Users\\janakaar\\eclipse java\\SeleniumM8\\data2\\data2.properties");
		Properties p = new Properties();
		p.load(fis);
		String s = p.getProperty("reason");
		String c = "checkin";
		if(s.equals(c)) {
			a.checkin();
		}else {
			a.checkout();
		}
		
	}
	public void checkin() throws InterruptedException, IOException {
//		ChromeOptions opt = new ChromeOptions();
//		opt.setHeadless(true);
//		driver = new ChromeDriver(opt);
		System.out.println("checkin started");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://prod.idms.gdq.amazon.dev/");
		FileInputStream fis = new FileInputStream("C:\\Users\\janakaar\\eclipse java\\SeleniumM8\\data2\\data2.properties");
		Properties p = new Properties();
		p.load(fis);
		System.out.println("Enter your username: ");
		Scanner scanner = new Scanner(System.in);
		String user = scanner.nextLine();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.withMessage(user);
		//wait.until(ExpectedConditions.jsReturnsValue(user));
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(p.getProperty("PIN"));
		driver.findElement(By.xpath("//input[@name='commit']")).click();
//		Thread.sleep(500);
//		System.out.println("press zukey");
		Thread.sleep(25000);
		driver.findElement(By.xpath("//button[contains(@class,'awsui_trigger_hyvsj_3skry_1174')]")).click();
		driver.findElement(By.xpath("//span[text()='Device Library']")).click();
		driver.findElement(By.xpath("//input[@aria-label='your choice']")).sendKeys(p.getProperty("filter"));
		driver.findElement(By.xpath("//span[@data-value='Device Name : ']")).click();
		driver.findElement(By.xpath("//input[@aria-label='your choice']")).sendKeys(p.getProperty("devicename"));
		driver.findElement(By.xpath("//div[@class='awsui_option-content_15o6u_ho89k_282 awsui_option-content_2dmmi_qu62t_6']")).click();
		Thread.sleep(2000);
		
		WebElement dsn = driver.findElement(By.xpath("//a[@class='awsui_link_4c84z_iv0u7_141 awsui_variant-primary_4c84z_iv0u7_245 awsui_font-size-body-m_4c84z_iv0u7_474']"));
		String dsnvalue = dsn.getText();
		System.out.println(dsnvalue);
		
		driver.findElement(By.xpath("//span[text()='Request Device']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(dsnvalue);
		driver.findElement(By.xpath("//span[text()='Validate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-haspopup='listbox'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='awsui_label-content_1p2cx_jbmfe_206'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@aria-haspopup='listbox'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='MAA12']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1");
	}
	public void checkout() throws IOException, InterruptedException {
//		ChromeOptions opt = new ChromeOptions();
//		opt.setHeadless(true);
//		driver = new ChromeDriver(opt);
		System.out.println("checkout started");
		driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://prod.idms.gdq.amazon.dev/");
		FileInputStream fis = new FileInputStream("C:\\Users\\janakaar\\eclipse java\\SeleniumM8\\data2\\data2.properties");
		Properties p = new Properties();
		p.load(fis);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(p.getProperty("PIN"));
		driver.findElement(By.xpath("//input[@name='commit']")).click();
//		Thread.sleep(500);
//		System.out.println("press zukey");
		Thread.sleep(25000);
		driver.findElement(By.xpath("//button[contains(@class,'awsui_trigger_hyvsj_3skry_1174')]")).click();
		driver.findElement(By.xpath("//span[text()='Device Library']")).click();
		driver.findElement(By.xpath("//input[@aria-label='your choice']")).sendKeys(p.getProperty("filter"));
		driver.findElement(By.xpath("//span[@data-value='Device Name : ']")).click();
		driver.findElement(By.xpath("//input[@aria-label='your choice']")).sendKeys(p.getProperty("devicename"));
		driver.findElement(By.xpath("//div[@class='awsui_option-content_15o6u_ho89k_282 awsui_option-content_2dmmi_qu62t_6']")).click();
		Thread.sleep(2000);
		
		WebElement dsn = driver.findElement(By.xpath("//a[@class='awsui_link_4c84z_iv0u7_141 awsui_variant-primary_4c84z_iv0u7_245 awsui_font-size-body-m_4c84z_iv0u7_474']"));
		String dsnvalue = dsn.getText();
		System.out.println(dsnvalue);
		
		driver.findElement(By.xpath("//span[text()='Return Device']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(dsnvalue);
		driver.findElement(By.xpath("//span[text()='Validate']")).click();
		driver.quit();
	}
}
