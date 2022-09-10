package Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

public	WebDriver Driver;

	@BeforeMethod()
	public void Setup() {
		
		
		System.setProperty("webdriver.chrome.driver" , ".\\Driver\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.navigate().to("https://combitimedevapp.z16.web.core.windows.net/login");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	//@AfterMethod()
	//public void CloseWindow(){
	//	Driver.quit();
	//}
	
}
