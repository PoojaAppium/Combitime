package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Main_Utility.DriverFactory;

public class ManageCalculationRule {

	WebDriver Driver;
	DriverFactory DF ;
	SystemSetup SS;
	
	@FindBy(how=How.XPATH , using = "//button[@class = 'mat-focus-indicator mat-button mat-button-base action-btn ng-star-inserted']")
	private WebElement Import_Button;
	
	//IMPORT SCREEN 
	@FindBy(how=How.XPATH , using = "//span[@class = 'trigger-text text-ellipsis placeholder']")
	private WebElement RuleID;
	@FindBy(how=How.XPATH , using = "//span[contains(text(), ' ZenegyTime - RuleSet ')]")
	private WebElement ZenegyTime;
	@FindBy(how=How.XPATH , using = "//input[@name = 'newRule']")
	private WebElement NewRuleID;
	@FindBy(how=How.XPATH , using = "//input[@name = 'newRuleDescription']")
	private WebElement Description;
	@FindBy(how=How.XPATH , using = "//span[contains(text(), ' Import rule ')]")
	private WebElement Submit;
	@FindBy(how=How.CSS , using = "mat-dialog-content[class = 'mat-dialog-content']")
	private WebElement ImportSubScreen;
	
	
	public ManageCalculationRule(WebDriver Driver) {
	
		SS = new SystemSetup(Driver);
		DF = new DriverFactory(Driver);
		PageFactory.initElements(Driver, this);
		
	}
	
	public void Import() throws InterruptedException {
		
		DF.Click(Import_Button);
		Thread.sleep(2000);
		DF.Click(RuleID);
		DF.Click(ZenegyTime);
		Thread.sleep(2000);
		DF.Scroll_SubScreen();
		DF.SendKey(NewRuleID, "1st Auto");
		DF.SendKey(Description, "Auto Test");
		DF.Click(Submit);
		Thread.sleep(2000);
		DF.Validate_ToastMessage("Calculation rule imported successfully");
		
		
	}
	

	
}
