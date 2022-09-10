package Script;

import org.testng.annotations.Test;

import POM.Dashboard;
import POM.Login;
import POM.ManageCalculationRule;
import POM.SystemSetup;

public class ManageTimeCalculation extends BaseClass {
	
	
	
	@Test()
	public void Import_CalculationRule() throws InterruptedException {

		Login L = new Login(Driver);
		L.UserLogin();  // Login 
		Dashboard D = new Dashboard(Driver);
		D.SystemSetup(); // click on System Setup 
		SystemSetup SS = new SystemSetup(Driver);
		SS.ManageCalculationRule(); // Click on ManageCalculationRule
		ManageCalculationRule MCR = new ManageCalculationRule(Driver);
		MCR.Import();
		}
	
		

	
	
}
