package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class PageVerification {
	
	public static WebDriver driver;
	
	public PageVerification(WebDriver driver)
	{
		this.driver = driver;		
	}
	
	public static void VerifyTitle(String eTitle)
	{
		try
		{
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("Title is matching"+eTitle, true);
		}
		catch(Exception e)
		{
		Reporter.log("Title is not matching", true);
		}		
	}
	
	public static void VerifyWebElement(WebElement element)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("WebElement is present"+element, true);
		}
		catch(Exception e)
		{
			Reporter.log("WebElement is not present"+element, true);			
		}
	}


}
