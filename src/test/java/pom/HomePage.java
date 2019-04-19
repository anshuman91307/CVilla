package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="loginLogoutResponse")
	private WebElement signIn;
	@FindBy(id="emailId")
	private WebElement userTxtBox;
	@FindBy(id="continueBtn")
	private WebElement contBTN;
	@FindBy(id="js-password")
	private WebElement pwdtxtBox;
	@FindBy(id="loginCheck")
	private WebElement loginBtn;
  	@FindBy(partialLinkText="MEN'S")
	private WebElement mensWear;
	@FindBy(partialLinkText=" Kurtas")
	private WebElement Kurtas;
	@FindBy(id="sortByNone")
	private WebElement sortByN;
	@FindBy(xpath="//img[@title='Craftsvilla Pastel Blue Color Cotton Long Sleeves Kurtas']")
	private WebElement Produc;
	@FindBy(id="size_38")
	private WebElement radBtn;
	@FindBy(id="pincode_value")
	private WebElement pintxtBox;
	@FindBy(id="submitpincode")
	private WebElement chkBox;
	@FindBy(id="addtocart")
	private WebElement addCart;
	@FindBy(id="cart-header-login")
	private WebElement myAcc;
	@FindBy(xpath="//i[@class='icon logout']")
	private WebElement logout;
	// for test case CV_02
	@FindBy(xpath ="//span[contains(@id,'ASC')]")
	private WebElement sortByP;
	@FindBy(xpath="//img[@title='Craftsvilla Maroon Color Cotton Silk Solid Kurta']")
	private WebElement chProd;
	@FindBy(id="size_36")
	private WebElement radiBtn;
	//for test case CV_03
	@FindBy(id="discountedPriceOrder_DESC")
	private WebElement sortByPhl;
	@FindBy(xpath="//img[@alt='Craftsvilla White Color Cotton Long Sleeves Kurtas']")
	private WebElement choProd;
	@FindBy(id="size_38")
	private WebElement radioBtn;
	//for test case CV_04
	@FindBy(xpath="//span[contains(@class,'active')]")
	private WebElement sortByDis;
	@FindBy(xpath="//img[@title='Craftsvilla Blue Color Cotton Long Sleeves Kurtas']")
	private WebElement chsProd;
	@FindBy(id="size_38")
	private WebElement raBtn;
	//for test case CV_05
	@FindBy(xpath="//span[contains(@class,'sprites-image plus-blue js-plus ')]")
	private WebElement addBtn;
	// for test case CV_06 - same as #5
	
	// for test case CV_07 - same as #5
	// for test case CV_08 - same as #5
	// for test Case CV_09 
	@FindBy(xpath="//img[@title='Craftsvilla Pale Brown Color Cotton Long Sleeves Kurtas']")
	private WebElement chPro;
	@FindBy(id="submitpincode")
	private WebElement checkBox;
	@FindBy(id="addtocart")
	private WebElement addtCart;
	//for test case CV_10
	@FindBy(xpath="//img[@title='Craftsvilla Maroon Color Cotton Silk Solid Kurta']")
	private WebElement checPro;
	@FindBy(xpath="//img[@alt='Craftsvilla Bluish White Color Cotton Silk Solid Kurta']")
	private WebElement chekPro;
		
//remaining methods already written above earlier. call actions in scripts
	// utilization process. enter values
	public void clickSignIn () {
		signIn.click();
	}
	public void setUserName (String un) {
		userTxtBox.sendKeys(un);
	}
	public void clickContBTN() {
		contBTN.click();
	}
	public void setPwd(String pwd) {
		pwdtxtBox.sendKeys(pwd);
	}	
	public void clickLogin() {
		loginBtn.click();
	}
	public void clickmensWear () {
		mensWear.click ();
	}
	public void clickKurtas () {
		Kurtas.click ();
	}
	public void clicksortByN () {
		sortByN.click ();
	}
	public void clickProduc () {
		Produc.click();
	}
	public void clickRadBtn () {
		radBtn.click();
	}
	public void setpintxtBox (String pc) {
		pintxtBox.sendKeys(pc);
	}
	public void clickchkBox () {
		chkBox.click();
	}
	public void clickaddCart () {
		addCart.click();
	}
	public void clickmyAcc () {
		myAcc.click();
	}
	public void clicksortP () {
		sortByP.click();
	}
	public void clickchProd () {
		chProd.click();
	}
	public void clickRadiBtn () {
		radiBtn.click();
	}
	public void clicksortPhl () {
		sortByPhl.click();
	}
	public void clickchoProd () {
		choProd.click();
	}
	public void clickRadioBtn () {
		radioBtn.click();
	}
	public void clicksortDis () {
		sortByDis.click();
	}
	public void clickchsProd () {
		chsProd.click();
	}
	public void clickRaBtn () {
		raBtn.click();
	}
	public void clickAdBtn () {
		addBtn.click();
	}
	public void clickchPro () {
		chPro.click();
	}
	public void clickcheckBox() {
		checkBox.click();
	}
	public void clickaddtCart () {
		addtCart.click();
	}
	public void clicklogout () {
		logout.click();
	}
	public void clickchecPro () {
		checPro.click();
	}
	public void clickchekPro () {
		chekPro.click();
	}
}