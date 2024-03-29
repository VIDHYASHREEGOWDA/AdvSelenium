package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class toRunHP {

	@Test(groups = "laptop")
	public void HP() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hp.com/in-en/");
		Thread.sleep(3000);
		driver.quit();
	}

}
