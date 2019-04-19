package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
// Use Explicit wait for page verification call a constructor
	public static WebDriver driver; 
	public BasePage (WebDriver driver) {
		this.driver=driver;
		// both local and global variable is same above
		
	}
	public static void verifyTitle(String eTitle) {
		try {
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is Matching"+eTitle,true);
		}
		catch (Exception e) {
			Reporter.log("Title is not matching", true);
		}
		// do element verification
	}
	public static void verifyElementPResent(WebElement element){
		try {
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present"+element,true );
		}
		catch(Exception e) {
			Reporter.log("Element is not present", true);
		}
		
	}
	
}
