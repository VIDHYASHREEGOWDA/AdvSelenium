package workingWithUnitTestingTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithSoftAssert2 {

	String expectedURL = "https://demowebshop.tricentis.com/";
	String expectedShoppingCartURL = "https://demowebshop.tricentis.com/cart";
	SoftAssert sf = new SoftAssert();

	@Test
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Reporter.log("User is able to open empty browser", true);
		driver.manage().window().maximize();
		Reporter.log("User is able to maximize browser", true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("User is able to open BMW", true);

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);

		sf.assertEquals(actualURL, expectedURL, "Url is wrong");
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		String actuaShoppingCartlURL = driver.getCurrentUrl();
		System.out.println(actuaShoppingCartlURL);

		sf.assertEquals(actuaShoppingCartlURL, expectedShoppingCartURL);
		Thread.sleep(3000);
		driver.quit();
		sf.assertAll();
	}

}
