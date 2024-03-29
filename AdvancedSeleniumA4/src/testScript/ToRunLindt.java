package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToRunLindt {

	@Test(groups = "food")
	public void lindt() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chocolate.lindt.com/lindt-lindor-assorted-truffles-600g");
		Thread.sleep(3000);
		driver.quit();
	}

}
