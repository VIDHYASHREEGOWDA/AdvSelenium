package genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author LENOVO
 */

public class UtilityMethods {

	/**
	 * 
	 * @param path pass the path of the property file
	 * @param key  pass the key from property file
	 * @return String URL
	 * @throws IOException
	 */

	public String readingTheDataFromPropFile(String path, String key) throws IOException {

		File file = new File("./testData/data.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty(key);
		return URL;

	}

	/**
	 * 
	 * @param path
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public String readingTheDataFromExcelSingleValue(String path, String sheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {

		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		String data = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		return data;

	}

	public static String[][] readMultipleData(String path, String sheetName)
			throws EncryptedDocumentException, IOException {

		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		int numOfRows = workbook.getSheet(sheetName).getPhysicalNumberOfRows();
		int numOfClms = workbook.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();

		String[][] data = new String[numOfRows][numOfClms];
		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < numOfClms; j++) {
				data[i][j] = workbook.getSheet("regData").getRow(i).getCell(j).toString();
			}
		}

		return data;

	}

}
