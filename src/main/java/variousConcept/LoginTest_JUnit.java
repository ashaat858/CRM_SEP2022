package variousConcept;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_JUnit {
	WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}

	@Before
	public void init() {
		System.out.println("init");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Sep22QA_Selenium\\crm\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

	@Test
	public void loginTest() {
		/// ?????
		System.out.println("login test");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}

	@Test
	public void negloginTest() {
		System.out.println("negative login test");
		driver.findElement(By.id("username")).sendKeys("demo@techfios213.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}

	@After
	public void tearDown() {
		System.out.println("teardown");
		driver.close();
	}

}
