package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.*;
public class User_Role_Page_objects {

	@FindBy(linkText="Admin")
	public static WebElement adminlink;

	@FindBy(xpath="//span[@class='oxd-topbar-body-nav-tab-item'][1]")
	public static WebElement usermanagementlink;

	@FindBy(linkText="Users")
	public static WebElement userslink;


	@FindBy(xpath="//form[@class='oxd-form']/div/div/div/div/div[2]/input")
	public static WebElement username1;

	@FindBy(xpath="//button[@type='submit']")
	public static WebElement search;

	@FindBy(xpath="//span[@class='oxd-text oxd-text--span']")
	public static WebElement results;
}
	