package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Main_Utility.DriverFactory;

public class Login {

	DriverFactory DF;
	Dashboard D;
	WebDriver Driver;
	
	@FindBy(how=How.XPATH , using = "//button[@type ='submit']")
	private WebElement Continue;
	@FindBy(how=How.ID , using = "email")
	private WebElement UN;
	@FindBy(how=How.ID , using = "password")
	private WebElement Password;
	@FindBy(how=How.ID , using = "login-button")
	private WebElement Submit;
	
	public Login(WebDriver driver) {
        D = new Dashboard(driver);
		DF = new DriverFactory(driver);
	PageFactory.initElements(driver, this);
	}
	
	public void UserLogin() throws InterruptedException {
	
	DF.Click(Continue);
	DF.SendKey(UN, "pooja.dwivedi+001@codinova.com");
	DF.SendKey(Password, "System123#");
	DF.Click(Submit);
	Thread.sleep(9000);
	DF.ValidatePageTitle("Dashboard");
	
	
	
		
	}
	
}
