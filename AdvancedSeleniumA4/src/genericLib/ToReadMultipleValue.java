package genericLib;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadMultipleValue {

	@Test(dataProvider = "data")
	public void logIn(String un, String pwd) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		UtilityMethods um = new UtilityMethods();
		String URL = um.readingTheDataFromPropFile("./testData/data.properties", "url");
		driver.get(URL);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log out']")).click();
		driver.quit();

	}

	@DataProvider(name = "data")
	public String[][] dataSupply() throws EncryptedDocumentException, IOException {
		return UtilityMethods.readMultipleData("./testData/testdata.xlsx", "sheet1");

	}

}
