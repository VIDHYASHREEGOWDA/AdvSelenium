package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunHershey {

	@Test(groups = "food")
	public void hershey() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hersheyland.com/hersheys");
		Thread.sleep(3000);
		driver.quit();
	}

}
