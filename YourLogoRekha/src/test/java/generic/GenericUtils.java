package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class GenericUtils extends BaseTest {
	
	public static void hover(WebDriver driver, WebElement element)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();	
	}
	
	public static void gSelectByVisibleText(WebElement element, String val)
	{
		Select select = new Select(element);
		select.selectByVisibleText(val);
	}
	
	public static void textDisplayed(WebElement element)
	{
		if(element.getText() != null)
		{
			Reporter.log("Text field has value", true );
		}
		else 
		{
			Reporter.log("Text field is Empty", true );
		}
	}

}
