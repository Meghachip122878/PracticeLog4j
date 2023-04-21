package listeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import practiceLog4j.TestLogs;

public class CustomListeners extends TestLogs implements ITestListener{
	String screenshotPath = "";

	public void onTestStart(ITestResult result) {
	
		
	}

	public void onTestSuccess(ITestResult result) {
	
		
	}

	public void onTestFailure(ITestResult result) {

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("Capturing screenshot");
		Reporter.log("<a target = \"_blank\"href=\"C:\\Users\\malama\\Desktop\\Error.jpg\">Screenshot</a>");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d1 = new Date();
		screenshotName = d1.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		try {
			FileUtils.copyFile(scrFile,
					new File(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\" + screenshotPath));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			FileUtils.copyFile(scrFile,
					new File(".\\reports\\" + screenshotName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.fail("Test clearly failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {

		
	}

}
