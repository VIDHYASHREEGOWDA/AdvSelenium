package genericLib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromPropertyFile {

	@Test
	public void toOpenDemoWebshop() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		UtilityMethods um = new UtilityMethods();
		String URL = um.readingTheDataFromPropFile("./testData/data.properties", "url");
		driver.get(URL);
		driver.quit();

	}

}
