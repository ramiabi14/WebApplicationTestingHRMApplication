package testCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.User_Role_Page_objects;
import testCases.Test_Pending_Leave_Request;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.*;
public class Test_User_Role extends CommonFunctions{

	Logger logger=Logger.getLogger(Test_User_Role.class);


	@Test
	public void checkUserRole() throws InterruptedException {
		logger.info("Logging into the application");
		//Test_Pending_Leave_Request.login();
		PageFactory.initElements(driver, User_Role_Page_objects.class);
		logger.info("Navigating to Admin page");
		User_Role_Page_objects.adminlink.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		logger.info("Navigating to User Management page");
		User_Role_Page_objects.usermanagementlink.click();
		logger.info("Navigating to Users page");
		User_Role_Page_objects.userslink.click();
		User_Role_Page_objects.username1.sendKeys("Admin");
		Thread.sleep(2000);
		User_Role_Page_objects.search.click();
		logger.info("Results displayed as per search criteria");
		String resulttext=User_Role_Page_objects.results.getText();
		System.out.println("Result Dispalyed is " + resulttext);
		logger.info("End of Test case Test_User_Role");

	}
}
