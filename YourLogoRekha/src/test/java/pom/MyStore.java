package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.PageVerification;

public class MyStore extends PageVerification {
	
	public MyStore(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@class='sf-with-ul']")
	private WebElement Women;
	
	@FindBy(xpath="(//span[@class='grower CLOSE']/..)[1]")
	private WebElement Tops;
	
	@FindBy(xpath="//li[@class='last']/../li[1]")
	private WebElement Tshirts;
	
	@FindBy(xpath="//img[@alt='Faded Short Sleeve T-shirts']")
	private WebElement ProductTshirt;
	
	@FindBy(xpath="//button[@class='exclusive']")
	private WebElement AddToCart;
	
	@FindBy(xpath="//span[@class='cross']")
	private WebElement CloseIcon;
	
	@FindBy(xpath="(//span[@class='grower CLOSE']/..)[2]")
	private WebElement Dresses;
	
	@FindBy(xpath="//li[@class='last']/../li[2]")
	private WebElement EvengDresses;
	
	@FindBy(xpath="//img[@alt='Printed Dress']")
	private WebElement ProductDress;
	
	@FindBy(xpath="//b")
	private WebElement Cart;
	
	@FindBy(xpath="//a[@class='button ajax_add_to_cart_button btn btn-default']")
	private WebElement HoverAddToCart;
	
	@FindBy(linkText="Proceed to checkout")
	private WebElement ProceedTocheckout;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement ProceedTochkoutAddress;
	
	@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement ProceedTochkoutShip;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement ProceedTochkoutPopup;
		
	@FindBy(id="cgv")
	private WebElement TermsChkbox;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement PaybyWire;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement ConfirmOrderbtn;
	
	@FindBy(xpath="//a[.='Faded Short Sleeve T-shirts']/../../../td[7]/div/a/i")
	private WebElement deleteicon;
	
	@FindBy(xpath="//h3[@class='page-subheading']/../../../../div[1]/ul/li[7]/a")
	private WebElement DelivAddUpdateicon;
	
	public void WomenClick()
	{
		Women.click();
	}
	
	public void TopsClick()
	{
		Tops.click();
	}
	
	public void TshirtsClick()
	{
		Tshirts.click();
	}
	
	public void ProductClick()
	{
		ProductTshirt.click();
	}

	public void AddToCartClick()
	{
		AddToCart.click();
	}
	
	public void CloseIconClick()
	{
		CloseIcon.click();
	}
	
	public void CartClick()
	{
		Cart.click();
	}
	
	public void DressesClick()
	{
		Dresses.click();
	}
	
	public void EvengDressesClick()
	{
		EvengDresses.click();
	}
	
	public void ProductDressClick()
	{
		ProductDress.click();
	}
	
	public void HoverAddToCartClick()
	{
		HoverAddToCart.click();
	}
	
	public void ProceedTocheckoutClick()
	{
		ProceedTocheckout.click();
	}
	
	public void TermsChkboxClick()
	{
		TermsChkbox.click();
	}
	
	public void PaybyWireClick()
	{
		PaybyWire.click();
	}
	
	public void ConfirmOrderbtnClick()
	{
		ConfirmOrderbtn.click();
	}
	
	public void ProceedTochkoutAddressClick()
	{
		ProceedTochkoutAddress.click();
	}
	
	public void ProceedTochkoutShipClick()
	{
		ProceedTochkoutShip.click();
	}
	
	public void ProceedTochkoutPopupClick()
	{
		ProceedTochkoutPopup.click();
	}
	
	public void deleteiconClick()
	{
		deleteicon.click();		
	}
	
	public void DelivAddUpdateiconClick()
	{
		DelivAddUpdateicon.click();		
	}
}

