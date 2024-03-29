package workingWithReadDataExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class toReadDataFromXlSheet {

	public static void main(String[] args) throws IOException {

		// creates an object for file
		File file = new File("./testData/testdata.xlsx");

		// FileInputStream object
		FileInputStream fis = new FileInputStream(file);

		// creates an object for file
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// get the sheet name
		String sheet = workbook.getSheetName(0);
		System.out.println(sheet);

		String url = workbook.getSheet(sheet).getRow(0).getCell(0).getStringCellValue();
		System.out.println(url);
		String url1 = workbook.getSheet(sheet).getRow(1).getCell(0).getStringCellValue();
		System.out.println(url1);
		String username = workbook.getSheet(sheet).getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);

	}

}
