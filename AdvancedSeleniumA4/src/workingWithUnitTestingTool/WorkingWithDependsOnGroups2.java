package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorkingWithDependsOnGroups2 {

	@Test(groups = "cabs")
	public void ola() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olacabs.com/");
		Thread.sleep(3000);
		driver.quit();
	}

	@Test(groups = "cabs")
	public void uber() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.uber.com/in/en/");
		Thread.sleep(3000);
		driver.quit();
	}

	@Test(groups = "cabs")
	public void rapido() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rapido.bike/");
		Thread.sleep(3000);
		driver.quit();
	}
}
