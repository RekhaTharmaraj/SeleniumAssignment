package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.PageVerification;

public class HomePage extends PageVerification{

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;

	@FindBy(xpath="//input[@id='email_create']")
	private WebElement EmailCreate;
	
	@FindBy(id="SubmitCreate")
	private WebElement createAct;	
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement pwd;
	
	@FindBy(id="SubmitLogin")
	private WebElement submit;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement SignOut;
	
	public void SignInClick()
	{
		signin.click();
	}
	
	public void setEmail(String str)
	{
		EmailCreate.sendKeys(str);
	}
	
	public void CreateActClick()
	{
		createAct.click();
	}
	
	public void setEmailSignIn(String em)
	{
		email.sendKeys(em);
	}
	
	public void setPwd(String pd)
	{
		pwd.sendKeys(pd);
	}
	
	public void SubmitClick()
	{
		submit.click();
	}
	
	public void SignOutClick()
	{
		SignOut.click();
	}
}
