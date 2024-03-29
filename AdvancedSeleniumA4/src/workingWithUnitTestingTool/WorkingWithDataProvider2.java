package workingWithUnitTestingTool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider2 {

	@DataProvider(name = "testData")
	public String[][] getData() {

		String[][] data = new String[2][5];
		data[0][0] = "Vidya";
		data[0][1] = "Mysore";
		data[0][2] = "vidyam@gmail.com";
		data[0][3] = "123abc";
		data[0][4] = "123abc";

		data[1][0] = "Vidya";
		data[1][1] = "Mysore";
		data[1][2] = "vidyam@gmail.com";
		data[1][3] = "123abc";
		data[1][4] = "123abc";

		return data;

	}

	@Test(dataProvider = "testData")
	public void dataDemo(String[] regData) {
		System.out.println(regData[0]);
		System.out.println(regData[1]);
		System.out.println(regData[2]);
		System.out.println(regData[3]);
		System.out.println(regData[4]);

	}

}
