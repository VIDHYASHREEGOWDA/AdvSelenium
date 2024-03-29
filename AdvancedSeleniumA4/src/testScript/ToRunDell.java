package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunDell {

	@Test(groups = "laptop")
	public void dell() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dell.com/en-in");
		Thread.sleep(3000);
		driver.quit();
	}

}
