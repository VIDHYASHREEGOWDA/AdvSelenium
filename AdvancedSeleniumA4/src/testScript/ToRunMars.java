package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunMars {

	@Test(groups = "food")
	public void mars() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mars.com/our-brands/mars-snacking");
		Thread.sleep(3000);
		driver.quit();
	}

}
