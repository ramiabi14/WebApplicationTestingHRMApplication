package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_page_object {
	
	@FindBy(xpath="//*[@class='orangehrm-todo-list']/child::div[1]/p[@class='oxd-text oxd-text--p']")
	public static WebElement leaveRequesttoapprove;
	

	


	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	public static WebElement Daspagetitle;
	
	
	

}
