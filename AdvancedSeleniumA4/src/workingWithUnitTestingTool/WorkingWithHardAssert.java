package workingWithUnitTestingTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithHardAssert {
	String expectedURL = "https://www.bmw.in/en/index.html";
	String expectedModelsURL = "https://www.bmw.in/en/all-models.html";

	@Test
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Reporter.log("User is able to open empty browser", true);
		driver.manage().window().maximize();
		Reporter.log("User is able to maximize browser", true);
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("User is able to open BMW", true);

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);

		Assert.assertEquals(actualURL, expectedURL);
		driver.findElement(By.xpath("//span[text()='Models']")).click();
		String actuaModelslURL = driver.getCurrentUrl();
		System.out.println(actuaModelslURL);

		Assert.assertEquals(actuaModelslURL, expectedModelsURL);
		Thread.sleep(3000);
		driver.quit();
	}
	
}
