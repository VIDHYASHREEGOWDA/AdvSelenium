package workingWithReadDataExternalFile;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toReadDataForDemoWebshop {

	// method to read the data from Excel //
	public static String getSheet(String excelLocation, String sheetName, int r, int c) throws Throwable {

		// creates an object for file
		File file = new File("./testData/testdata.properties");

		// FileInputStream object
		FileInputStream fis = new FileInputStream(file);

		// creates an object for file
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// get the sheet name
		String sheet = workbook.getSheetName(0);
		System.out.println(sheet);

		return sheet;
	}

	public static void main(String[] args) throws Throwable {

		// creates an object for file
		File file = new File("./testData/testdata.xlsx");

		// FileInputStream object
		FileInputStream fis = new FileInputStream(file);

		// creates an object for file
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// get the sheet name
		String sheet = workbook.getSheetName(0);
		System.out.println(sheet);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = workbook.getSheet(sheet).getRow(0).getCell(0).getStringCellValue();
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(getSheet("/testData/testdata.xlsx", "data", 0, 0));
		driver.findElement(By.id("Password")).sendKeys(getSheet("/testData/testdata.xlsx", "data", 1, 0));
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log out']")).click();
		driver.quit();

	}

}
