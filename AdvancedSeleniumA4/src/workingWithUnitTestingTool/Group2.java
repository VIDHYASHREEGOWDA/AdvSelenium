package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Group2 {

	@Test(groups = "movie", dependsOnGroups = "cabs")
	public void movie() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(3000);
		driver.quit();
	}

}
