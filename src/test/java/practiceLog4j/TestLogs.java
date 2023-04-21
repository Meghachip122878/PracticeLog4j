package practiceLog4j;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogs {
	
	public static Logger logger = Logger.getLogger(TestLogs.class.getName());
    public static WebDriver driver ;
    public static String screenshotPath;
    public static String screenshotName;
	
	
	@Test
	public void run() throws IOException {
		
	//	sheetName = "error";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		Date d = new Date();
		//System.out.println(d.toString().replace(":", "_").replace(" ", "_"));
		//System.setProperty("current.date",d.toString().replace(":", "_").replace(" ", "_"));
	//	System.setProperty("org.uncommons.reportng.escape-output", "false");
		
        PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		logger.info("This is a information log");
		logger.error("This is an error log");
	//	Assert.fail();
		
		
	}
}


