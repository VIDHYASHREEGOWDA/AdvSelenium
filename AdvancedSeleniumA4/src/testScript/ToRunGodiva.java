package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunGodiva {

	@Test(groups = "food")
	public void godiva() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.godiva.com/");
		Thread.sleep(3000);
		driver.quit();
	}


}
