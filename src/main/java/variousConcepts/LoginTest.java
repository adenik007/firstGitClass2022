package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		launchBrowser();
		LoginTest();
		tearDown();
		
		launchBrowser();
		negLoginTest();
		tearDown();
	}
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
	
	public static void launchBrowser() {
	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ayuyi\\SeleniumClass\\crm\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		//clear cashe
		driver.manage().deleteAllCookies();
		
		//go to the website
		driver.get("https://techfios.com/billing/?ng=admin/");
		
		//maximize
		driver.manage().window().maximize();
	}
	
	public static void LoginTest() {
		//enter login info
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
	}
	
	public static void negLoginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
			
	}
	
	
	
}
