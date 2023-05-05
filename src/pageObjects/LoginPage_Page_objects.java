package pageObjects;
import org.openqa.selenium.*;
//import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.support.FindBy;

public class LoginPage_Page_objects {
	
	

	@FindBy(xpath="//img[@alt='company-branding']")
	public static WebElement pagetitle;
	@FindBy(xpath= "//input[@name='password']")
	public static WebElement password;
	@FindBy(xpath= "//input[@name='username']")
	public static WebElement username;
	@FindBy(xpath= "//button[@type='submit']")
	public static WebElement submitbutton;
	
	
	
	
	
}
