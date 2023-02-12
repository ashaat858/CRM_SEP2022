package variousConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// positive test case
		init();
		loginTest();
		tearDown();
		
		// negative test case
		init();
		negloginTest();
		tearDown();
	}
	
	public static void init () {
		//set up system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Sep22QA_Selenium\\crm\\driver\\chromedriver.exe");
		
		// object to evoke browser
		WebDriver driver = new ChromeDriver();
		
		// delete cookies (clear cashe)
		driver.manage().deleteAllCookies();
		
		// go to website 
		driver.get("https://techfios.com/billing/?ng=admin/");
		
		//maximize page
		driver.manage().window().maximize();
	}
	public static void loginTest () {
		
		// insert username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
		// insert password
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		//click sign in button
		driver.findElement(By.name("login")).click();
		}
		
		public static void negloginTest () {
			
			// insert username
			driver.findElement(By.id("username")).sendKeys("demo@techfios213.com");
			
			// insert password
			driver.findElement(By.id("password")).sendKeys("abc123");
			
			//click sign in button
			driver.findElement(By.name("login")).click();
	}
	public static void tearDown() {
		//close
		driver.close();
	}
}
