package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunMilkybar {

	@Test(groups = "food")
	public void milkybar() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.milkybar.co.uk/products/original");
		Thread.sleep(3000);
		driver.quit();
	}

}
