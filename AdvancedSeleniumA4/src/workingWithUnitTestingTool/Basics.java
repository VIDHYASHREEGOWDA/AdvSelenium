package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basics {

	@Test(invocationCount = 3, threadPoolSize = 4)
	public void run() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercedes-benz.co.in/");
		Thread.sleep(3000);
		driver.quit();
	}

}
