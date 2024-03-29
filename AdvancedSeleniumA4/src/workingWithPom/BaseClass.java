package workingWithPom;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public WebDriver driver;
	String actualURL = "https://demowebshop.tricentis.com/";

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am before suite");
		Reporter.log("Data base connection starts", true);
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am after suite");
		Reporter.log("Data base connection stops", true);
	}

	// @BeforeTest
	@BeforeClass
	public void browserSetUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("User is able to open empty browser", true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("User is able to open DemoWebshop", true);
		String url = driver.getCurrentUrl();
		if (url.equals(actualURL)) {
			Reporter.log("User is able to land on Demo Webshop home page, true");
		} else {
			Reporter.log("User is not able to open DemoWebshop");
		}
		Thread.sleep(6000);
	}

	// AfterTest
	@AfterClass
	public void toQuitBrowser() {
		driver.quit();
		Reporter.log("User is able to open DemoWebshop", true);
	}

}
