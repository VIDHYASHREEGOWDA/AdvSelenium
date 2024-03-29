package workingWithUnitTestingTool;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListenersDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "Test case is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "Test case is success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + "Test case is fail");
		LocalDateTime systemTime = LocalDateTime.now();
		System.out.println(systemTime);
		String scrnShotName = systemTime.toString().replace(":", "-");

		TakesScreenshot tks = (TakesScreenshot) DemoWebShop.driver;
		File src = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorShots/" + scrnShotName + ".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
