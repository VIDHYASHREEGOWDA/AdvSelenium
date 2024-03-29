package workingWithUnitTestingTool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {

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
	public void dataDemo(String FirstName, String LastName, String emailId, String pwd, String cnfmPwd) {
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(emailId);
		System.out.println(pwd);
		System.out.println(cnfmPwd);

	}

}
