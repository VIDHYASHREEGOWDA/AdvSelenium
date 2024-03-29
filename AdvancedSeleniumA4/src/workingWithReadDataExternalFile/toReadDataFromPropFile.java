package workingWithReadDataExternalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class toReadDataFromPropFile {

	public static void main(String[] args) throws IOException {

		// creates an object for file
		File file = new File("./testData/data.properties");

		// FileInputStream object
		FileInputStream fis = new FileInputStream(file);

		// creates an object for property file
		Properties prop = new Properties();
		prop.load(fis);

		System.out.println(prop.get("url"));
		System.out.println(prop.get("name"));
		System.out.println(prop.get("password"));
		System.out.println(prop.get("place"));
		System.out.println(prop.get("Company"));

	}

}
