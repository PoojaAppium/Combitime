package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Main_Utility.DriverFactory;

public class Dashboard {
	
	WebDriver Driver;
	DriverFactory DF ;

	
	@FindBy(how=How.XPATH , using = "//span[contains(text(),'System setup  ')]")
	private WebElement SystemSetup;
	
	
	public Dashboard(WebDriver Driver) {

		DF = new DriverFactory(Driver);
		PageFactory.initElements(Driver, this);
		
	}
	
	public void SystemSetup() {
		DF.Click(SystemSetup);
		DF.ValidatePageTitle("System setup");
	}
	
	
}
