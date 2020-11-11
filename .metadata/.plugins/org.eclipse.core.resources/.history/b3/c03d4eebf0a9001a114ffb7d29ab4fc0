package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.GenericUtils;
import generic.PageVerification;
import pom.ActCreationPage;
import pom.HomePage;
import pom.MyStore;

public class TestScripts extends BaseTest
{
	@Test(enabled=false)
	public void AccountCreation() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage homep = new HomePage(driver);
		ActCreationPage Actp = new ActCreationPage(driver);
		PageVerification.VerifyTitle("My Store");
		homep.SignInClick();
		PageVerification.VerifyTitle("Login - My Store");
		//PageVerification.VerifyWebElement(driver.findElement(By.xpath("//input[@id='email_create']")));
		homep.setEmail("TestRekha12@gmail.com");
		homep.CreateActClick();		
		PageVerification.VerifyTitle("Login - My Store");
		Actp.MrsClick();
		Actp.setfName("TestReks");
		Actp.setlName("Thar");
		Actp.chkEmail();
		Actp.setpwd("Test123456");
		Actp.setAddress("100 testaddress");
		Actp.setCity("Edison");
		GenericUtils.gSelectByVisibleText(driver.findElement(By.id("id_state")), "New Jersey");
		Actp.setzipcode("08837");
		Actp.chkCountry();
		Actp.setmobphone("2324344344");
		Actp.chkAliasAddress();
		Actp.registerClick();
	}
	
	@Test(enabled=false)
	public void SignIn() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage homep = new HomePage(driver);
		PageVerification.VerifyTitle("My Store");
		homep.SignInClick();
		PageVerification.VerifyTitle("Login - My Store");
		homep.setEmailSignIn("pandiarajan.rekha@gmail.com");
		homep.setPwd("Test123");
		homep.SubmitClick();
		PageVerification.VerifyTitle("My account - My Store");	
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//a[@class='account']")));
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//a[@class='logout']")));
		homep.SignOutClick();
		PageVerification.VerifyTitle("Login - My Store");
	}
		
	@Test(enabled=false)
	public void AddToCart()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage homep = new HomePage(driver);
		PageVerification.VerifyTitle("My Store");
		homep.SignInClick();
		PageVerification.VerifyTitle("Login - My Store");
		homep.setEmailSignIn("pandiarajan.rekha@gmail.com");
		homep.setPwd("Test123");
		homep.SubmitClick();
		MyStore mystorep = new MyStore(driver);
		mystorep.WomenClick();
		mystorep.TopsClick();
		mystorep.TshirtsClick();
		mystorep.ProductClick();
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")));
		mystorep.AddToCartClick();
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")));
		mystorep.CloseIconClick();
		mystorep.CartClick();
		PageVerification.VerifyTitle("Order - My Store");
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")));
	}
	
	@Test(enabled=false)
	public void AddToCart1() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HomePage homep = new HomePage(driver);
		PageVerification.VerifyTitle("My Store");
		homep.SignInClick();
		PageVerification.VerifyTitle("Login - My Store");
		homep.setEmailSignIn("pandiarajan.rekha@gmail.com");
		homep.setPwd("Test123");
		homep.SubmitClick();
		MyStore mystorep = new MyStore(driver);
		mystorep.WomenClick();
		Thread.sleep(2000);
		mystorep.DressesClick();
		mystorep.EvengDressesClick();
		GenericUtils.hover(driver, driver.findElement(By.xpath("//img[@alt='Printed Dress']")));
		mystorep.HoverAddToCartClick();
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//img[@alt='Printed Dress']")));
		mystorep.CloseIconClick();
		mystorep.CartClick();
		PageVerification.VerifyTitle("Order - My Store");
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//img[@alt='Printed Dress']")));
	
	}
	
	@Test(enabled=false)
	public void ProceedToCheckOut() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HomePage homep = new HomePage(driver);
		PageVerification.VerifyTitle("My Store");
		homep.SignInClick();
		PageVerification.VerifyTitle("Login - My Store");
		homep.setEmailSignIn("pandiarajan.rekha@gmail.com");
		homep.setPwd("Test123");
		homep.SubmitClick();
		MyStore mystorep = new MyStore(driver);	
		mystorep.WomenClick();
		GenericUtils.hover(driver, driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")));
		mystorep.HoverAddToCartClick();
		mystorep.CloseIconClick();
		mystorep.CartClick();
		mystorep.ProceedTocheckoutClick();
		Thread.sleep(2000);
		mystorep.ProceedTochkoutAddressClick();
		mystorep.TermsChkboxClick();
		mystorep.ProceedTochkoutShipClick();
		mystorep.PaybyWireClick();
		mystorep.ConfirmOrderbtnClick();
		PageVerification.VerifyTitle("Order confirmation - My Store");		
	}
	
	@Test(enabled=false)
	public void ShoppingCartDelete()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HomePage homep = new HomePage(driver);
		PageVerification.VerifyTitle("My Store");
		homep.SignInClick();
		PageVerification.VerifyTitle("Login - My Store");
		homep.setEmailSignIn("pandiarajan.rekha@gmail.com");
		homep.setPwd("Test123");
		homep.SubmitClick();
		MyStore mystorep = new MyStore(driver);	
		mystorep.WomenClick();
		mystorep.ProductClick();
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")));
		mystorep.AddToCartClick();
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")));
		mystorep.ProceedTochkoutPopupClick();
		mystorep.deleteiconClick();
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")));			
	}
	
	@Test(enabled=false)
	public void AddressUpdate()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HomePage homep = new HomePage(driver);
		PageVerification.VerifyTitle("My Store");
		homep.SignInClick();
		PageVerification.VerifyTitle("Login - My Store");
		homep.setEmailSignIn("pandiarajan.rekha@gmail.com");
		homep.setPwd("Test123");
		homep.SubmitClick();
		MyStore mystorep = new MyStore(driver);	
		mystorep.WomenClick();
		mystorep.ProductClick();
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")));
		mystorep.AddToCartClick();
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")));
		mystorep.ProceedTochkoutPopupClick();
		mystorep.ProceedTocheckoutClick();
		mystorep.DelivAddUpdateiconClick();
		ActCreationPage Actp = new ActCreationPage(driver);
		Actp.setmobphone("2324344344");
		Actp.registerUpdateClick();
		PageVerification.VerifyTitle("Order - My Store");			
	}
	
	@Test
	public void SignInDuringCheckout()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		MyStore mystorep = new MyStore(driver);	
		mystorep.WomenClick();
		mystorep.ProductClick();
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")));
		mystorep.AddToCartClick();
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")));
		mystorep.ProceedTochkoutPopupClick();
		mystorep.ProceedTocheckoutClick();
		HomePage homep = new HomePage(driver);
		homep.setEmailSignIn("pandiarajan.rekha@gmail.com");
		homep.setPwd("Test123");
		homep.SubmitClick();		
		PageVerification.VerifyWebElement(driver.findElement(By.xpath("//a[@class='account']")));
		PageVerification.VerifyTitle("Order - My Store");
	}
}
