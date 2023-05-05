package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {
	
	public static WebDriver driver=null;

	public static Properties properties=null;

	//Design pattern-PAtrick design pattern
	Logger logger=Logger.getLogger(CommonFunctions.class);
	public Properties loadPropertyFile() throws IOException
	{
		FileInputStream fileinputstream=new FileInputStream("config.properties");
		properties=new Properties();
		properties.load(fileinputstream);
		return properties;

	}

	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void launchBrowser() throws IOException
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Orange HRM test Begins");
		logger.info("Loading the property file");
		loadPropertyFile();
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		String driverlocation=properties.getProperty("DriverLocation");

		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverlocation);
			logger.info("Launching Chrome");
		//	logger.info("Launching chrome Browser ");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", driverlocation);
			logger.info("Launching Firefox");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		logger.info("Navigating to Application");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	@AfterSuite
	 public void tearDown()
	 {
		logger.info("Execution done,closing the Browser");
		driver.quit();
	 }

}
