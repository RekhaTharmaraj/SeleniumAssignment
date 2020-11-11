package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.PageVerification;

public class ActCreationPage extends PageVerification 
{

	public ActCreationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@id='uniform-id_gender2']")
	private WebElement Mrs;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	private WebElement fName;
	
	@FindBy(id="customer_lastname")
	private WebElement lName;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement pwd;
	
	@FindBy(id="address1")
	private WebElement address;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="postcode")
	private WebElement zipcode;
	
	@FindBy(id="id_country")
	private WebElement country;
	
	@FindBy(id="phone_mobile")
	private WebElement mobPhone;	
		
	@FindBy(id="alias")
	private WebElement AliasAddress;
	
	@FindBy(id="submitAccount")
	private WebElement register;
	
	@FindBy(id="submitAddress")
	private WebElement registerUpdate;
	
	public void MrsClick()
	{
		Mrs.click();
	}
	
	public void setfName(String fn)
	{
		fName.sendKeys(fn);
	}
	
	public void setlName(String ln)
	{
		lName.sendKeys(ln);
	}
	
	public void chkEmail()
	{
		if(email.getText()!=null)
			Reporter.log("Email field has value", true );
		else
			Reporter.log("Email field is empty", true );
	}
	
	public void setpwd(String pd)
	{
		pwd.sendKeys(pd);
	}

	public void setAddress(String add)
	{
		address.sendKeys(add);
	}
	
	public void setCity(String cty)
	{
		city.sendKeys(cty);
	}
	
	
	public void setzipcode(String zc)
	{
		zipcode.sendKeys(zc);
	}
	
	public void setmobphone(String mp)
	{
		mobPhone.clear();
		mobPhone.sendKeys(mp);
	}
	
	public void chkAliasAddress()
	{
		if(AliasAddress.getText()!=null)
			Reporter.log("AliasAddress field has value", true );
		else
			Reporter.log("AliasAddress field is empty", true );
	}
	
	public void chkCountry()
	{
		if(country.isSelected())
			Reporter.log("Country field is selected", true );
		else
			Reporter.log("country field is not selected", true );			
	}
	public void registerClick()
	{
		register.click();
	}
	
	public void registerUpdateClick()
	{
		registerUpdate.click();
	}
}
