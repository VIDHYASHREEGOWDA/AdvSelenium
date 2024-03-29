package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunLenovo {

	@Test(groups = "laptop")
	public void lenovo() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lenovo.com/in");
		Thread.sleep(3000);
		driver.quit();
	}

}
