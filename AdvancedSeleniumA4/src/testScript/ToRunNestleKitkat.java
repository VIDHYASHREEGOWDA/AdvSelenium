package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunNestleKitkat {

	@Test(groups = "food")
	public void nestleKitkat() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nestle.in/brands/nestlekitkat");
		Thread.sleep(3000);
		driver.quit();
	}

}
