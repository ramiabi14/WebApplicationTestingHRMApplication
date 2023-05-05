package testCases;

import org.testng.annotations.Test;
import commonFunctions.CommonFunctions;
import pageObjects.Dashboard_page_object;
import pageObjects.LoginPage_Page_objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

public class Test_Pending_Leave_Request extends CommonFunctions {
	
	static Logger logger=Logger.getLogger(Test_Pending_Leave_Request.class);

	public static void login() throws InterruptedException {
		logger.info("Logging in to the application");
		PageFactory.initElements(driver, LoginPage_Page_objects.class);
		LoginPage_Page_objects.username.sendKeys(properties.getProperty("username"));
		LoginPage_Page_objects.password.sendKeys(properties.getProperty("password"));
		//LoginPage_Page_objects.pagetitle.isDisplayed()		;
		LoginPage_Page_objects.submitbutton.click();
	}

	public static void clickonLeaveReqToApprovebutton()
	{
		PageFactory.initElements(driver,Dashboard_page_object.class);
		WebElement dastit=Dashboard_page_object.Daspagetitle;
		String title2=dastit.getText();
		System.out.println("Moved to page" + title2);
		WebElement leavebutton=Dashboard_page_object.leaveRequesttoapprove;		
		System.out.println("leaves to be approved"+leavebutton.getText());
		leavebutton.click();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void verifyPendingLeaveRequests() throws InterruptedException

	{
		//Thread.sleep(5000);--Better use implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login();
		logger.info("Getting the number of leaves to be approved");
		clickonLeaveReqToApprovebutton();

	}
}

