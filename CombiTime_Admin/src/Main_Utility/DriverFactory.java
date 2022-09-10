package Main_Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class DriverFactory {
	

	 WebDriver Driver ; 
	
	
public DriverFactory(WebDriver Driver) {
		
this.Driver = Driver;
}
	
	public void Click(WebElement W) {
		if(W.isDisplayed()) {
		W.click();
		}
		
		else {
			
			W.sendKeys(Keys.PAGE_DOWN);
			
		}
	}
	
	public void SendKey(WebElement W , String Text) {
		W.sendKeys(Text);
	}
	
	public void ValidatePageTitle(String Text) {
	    
		WebElement Title = Driver.findElement(By.xpath("//h3"));
		 SoftAssert SA = new SoftAssert();
		 SA.assertEquals(Title.getText(), Text);

		
	}
	
public void ScrollDown() {
	
	JavascriptExecutor js = (JavascriptExecutor) Driver;
	js.executeScript("window.scrollBy(0,600)", "");
	
}

public void ScrollToElement(WebElement W) {
	JavascriptExecutor js = (JavascriptExecutor) Driver;
	 js.executeScript("arguments[0].scrollIntoView(true)", W);
}

public void Scroll_SubScreen() throws InterruptedException {
	
	EventFiringWebDriver EFD = new EventFiringWebDriver(Driver);
	EFD.executeScript("document.querySelector('mat-dialog-content[class = \"mat-dialog-content\"]').scrollTop = 500");
	Thread.sleep(3000);
}

public void Validate_ToastMessage(String Message) {
	
	WebElement Alert = Driver.findElement(By.xpath("//combitime-notification"));
	System.out.println (Alert.getText());
	//Assert SA = new Assert();
    Assert.assertEquals(Alert.getText(), Message);
	
	

}














}