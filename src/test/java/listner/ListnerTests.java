package listner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
//import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerTests implements ITestListener
{

	public void onFinish(ITestContext context) {
		Reporter.log("test fiished", true);
		}

	public void onStart(ITestContext context) {
		Reporter.log("test started", true);

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("test failed", true);

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("test failed with timeout", true);

	}

	public void onTestFailure(ITestResult result)
	{
		TakesScreenshot pht=(TakesScreenshot) DemoListner.driver;
		File photo=pht.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(photo, new File("./screenphoto/"+"photo.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("test skipped", true);

	}

	public void onTestStart(ITestResult result) {
		Reporter.log("test started", true);

	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("test success", true);

	}
}
