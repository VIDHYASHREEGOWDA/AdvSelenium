package workingWithReadDataExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toOpenDemoWebshop {

	public static void main(String[] args) throws IOException, InterruptedException {
		File file = new File("./testData/data.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = prop.getProperty("url");
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log out']")).click();
		driver.quit();

	}

}
