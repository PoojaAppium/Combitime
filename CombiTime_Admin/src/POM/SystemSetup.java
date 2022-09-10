package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Main_Utility.DriverFactory;

public class SystemSetup {

	
	WebDriver Driver;
	DriverFactory DF ;
	
	
	@FindBy(how=How.XPATH , using = "//a[contains(text(),'Manage calculation rules')]")
	private WebElement ManageCalculationRule;
	
	
	public SystemSetup(WebDriver Driver) {
		
		DF = new DriverFactory(Driver);
		PageFactory.initElements(Driver, this);
		
	}
	
	
	
	public void ManageCalculationRule() {
		DF.ScrollDown();
		DF.Click(ManageCalculationRule);
		DF.ValidatePageTitle("Manage calculation rules");
	}
	
	
}
