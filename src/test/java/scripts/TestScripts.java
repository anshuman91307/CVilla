package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.HomePage;

public class TestScripts extends BaseTest {
	@Test (enabled = true)
	public void testSortByMyCart() throws InterruptedException {
		// create object of my hone page class
		HomePage p = new HomePage(driver);
		// call the actions
		driver.manage().window().maximize();
		Thread.sleep(3000);
		p.clickSignIn();
		Thread.sleep(3000);
		p.setUserName("raaak1997@gmail.com");
		Thread.sleep(3000);
		p.clickContBTN();
		Thread.sleep(3000);
		p.setPwd("3hPazS");
		Thread.sleep(3000);
		p.clickLogin();
		Thread.sleep(3000);
		p.clickmensWear();
		p.clickKurtas();
		p.clicksortByN();
		Thread.sleep(3000);
		p.clickProduc();
		Thread.sleep(2000);
		p.clickRadBtn();
		Thread.sleep(2000);
		p.setpintxtBox("110016");
		Thread.sleep(2000);
		p.clickchkBox();
		Thread.sleep(2000);
		p.clickaddCart();
		Thread.sleep(2000);
		p.clickmyAcc();
		/*Thread.sleep(2000);
		p.clicklogout();*/
}		
	@Test (enabled = true)
	public void testSortByMyCartPriceLowToHigh() throws InterruptedException {
		// create object of my hone page class
		HomePage p = new HomePage(driver);
		// call the actions
		driver.manage().window().maximize();
		Thread.sleep(3000);
		p.clickSignIn();
		Thread.sleep(3000);
		p.setUserName("raaak1997@gmail.com");
		Thread.sleep(3000);
		p.clickContBTN();
		Thread.sleep(3000);
		p.setPwd("3hPazS");
		Thread.sleep(3000);
		p.clickLogin();
		Thread.sleep(3000);
		p.clickmensWear();
		p.clickKurtas();
		Thread.sleep(2000);
		p.clicksortP();
		Thread.sleep(2000);
		p.clickchProd();
		Thread.sleep(2000);
		p.clickRadiBtn();
		Thread.sleep(2000);
		p.setpintxtBox("110016");
		Thread.sleep(2000);
		p.clickchkBox();
		Thread.sleep(2000);
		p.clickaddCart();
		Thread.sleep(2000);
		p.clickmyAcc();
		
	}
	@Test (enabled = true)
	public void testSortByMyCartPriceHighToLow() throws InterruptedException {
		// create object of my hone page class
		HomePage p = new HomePage(driver);
		// call the actions
		driver.manage().window().maximize();
		Thread.sleep(3000);
		p.clickSignIn();
		Thread.sleep(3000);
		p.setUserName("raaak1997@gmail.com");
		Thread.sleep(3000);
		p.clickContBTN();
		Thread.sleep(3000);
		p.setPwd("3hPazS");
		Thread.sleep(3000);
		p.clickLogin();
		Thread.sleep(3000);
		p.clickmensWear();
		p.clickKurtas();
		Thread.sleep(2000);
		p.clicksortPhl();
		Thread.sleep(2000);
		p.clickchoProd();
		Thread.sleep(2000);
		p.clickRadioBtn();
		Thread.sleep(2000);
		p.setpintxtBox("110016");
		Thread.sleep(2000);
		p.clickchkBox();
		Thread.sleep(2000);
		p.clickaddCart();
		Thread.sleep(2000);
		p.clickmyAcc();
	}
	@Test (enabled = true)
	public void testSortByMyCartPriceDisc() throws InterruptedException {
		// create object of my hone page class
		HomePage p = new HomePage(driver);
		// call the actions
		driver.manage().window().maximize();
		Thread.sleep(3000);
		p.clickSignIn();
		Thread.sleep(3000);
		p.setUserName("raaak1997@gmail.com");
		Thread.sleep(3000);
		p.clickContBTN();
		Thread.sleep(3000);
		p.setPwd("3hPazS");
		Thread.sleep(3000);
		p.clickLogin();
		Thread.sleep(3000);
		p.clickmensWear();
		Thread.sleep(3000);
		p.clickKurtas();
		Thread.sleep(2000);
		p.clicksortDis();
		Thread.sleep(2000);
		p.clickchsProd();
		Thread.sleep(2000);
		p.clickRaBtn();
		Thread.sleep(2000);
		p.setpintxtBox("110016");
		Thread.sleep(2000);
		p.clickchkBox();
		Thread.sleep(2000);
		p.clickaddCart();
		Thread.sleep(2000);
		p.clickmyAcc();
	}
	@Test (enabled = true)
	public void testSortByMyCartAdd() throws InterruptedException {
		// create object of my hone page class
		HomePage p = new HomePage(driver);
		// call the actions
		driver.manage().window().maximize();
		Thread.sleep(3000);
		p.clickSignIn();
		Thread.sleep(3000);
		p.setUserName("raaak1997@gmail.com");
		Thread.sleep(3000);
		p.clickContBTN();
		Thread.sleep(3000);
		p.setPwd("3hPazS");
		Thread.sleep(3000);
		p.clickLogin();
		Thread.sleep(3000);
		p.clickmensWear();
		p.clickKurtas();
		p.clicksortByN();
		Thread.sleep(3000);
		p.clickProduc();
		Thread.sleep(2000);
		p.clickRadBtn();
		Thread.sleep(2000);
		p.setpintxtBox("110016");
		Thread.sleep(2000);
		p.clickchkBox();
		Thread.sleep(2000);
		p.clickaddCart();
		Thread.sleep(2000);
		p.clickAdBtn();
		Thread.sleep(3000);
		p.clickmyAcc();
		
	}
	@Test (enabled = true)
	public void testSortByMyCartPriceLowToHighAdd() throws InterruptedException {
		// create object of my hone page class
		HomePage p = new HomePage(driver);
		// call the actions
		driver.manage().window().maximize();
		Thread.sleep(3000);
		p.clickSignIn();
		Thread.sleep(3000);
		p.setUserName("raaak1997@gmail.com");
		Thread.sleep(3000);
		p.clickContBTN();
		Thread.sleep(3000);
		p.setPwd("3hPazS");
		Thread.sleep(3000);
		p.clickLogin();
		Thread.sleep(3000);
		p.clickmensWear();
		p.clickKurtas();
		Thread.sleep(2000);
		p.clicksortP();
		Thread.sleep(2000);
		p.clickchProd();
		Thread.sleep(2000);
		p.clickRadiBtn();
		Thread.sleep(2000);
		p.setpintxtBox("110016");
		Thread.sleep(2000);
		p.clickchkBox();
		Thread.sleep(2000);
		p.clickaddCart();
		Thread.sleep(2000);
		p.clickAdBtn();
		Thread.sleep(3000);
		p.clickmyAcc();
	}
	@Test (enabled = true)
	public void testSortByMyCartPriceHighToLowAdd() throws InterruptedException {
		// create object of my hone page class
		HomePage p = new HomePage(driver);
		// call the actions
		driver.manage().window().maximize();
		Thread.sleep(3000);
		p.clickSignIn();
		Thread.sleep(3000);
		p.setUserName("raaak1997@gmail.com");
		Thread.sleep(3000);
		p.clickContBTN();
		Thread.sleep(3000);
		p.setPwd("3hPazS");
		Thread.sleep(3000);
		p.clickLogin();
		Thread.sleep(3000);
		p.clickmensWear();
		p.clickKurtas();
		Thread.sleep(2000);
		p.clicksortPhl();
		Thread.sleep(2000);
		p.clickchoProd();
		Thread.sleep(2000);
		p.clickRadioBtn();
		Thread.sleep(2000);
		p.setpintxtBox("110016");
		Thread.sleep(2000);
		p.clickchkBox();
		Thread.sleep(2000);
		p.clickaddCart();
		Thread.sleep(2000);
		p.clickAdBtn();
		Thread.sleep(3000);
		p.clickmyAcc();
	}
	@Test (enabled = true)
	public void testSortByMyCartPriceDiscAdd() throws InterruptedException {
		// create object of my hone page class
		HomePage p = new HomePage(driver);
		// call the actions
		driver.manage().window().maximize();
		Thread.sleep(3000);
		p.clickSignIn();
		Thread.sleep(3000);
		p.setUserName("raaak1997@gmail.com");
		Thread.sleep(3000);
		p.clickContBTN();
		Thread.sleep(3000);
		p.setPwd("3hPazS");
		Thread.sleep(3000);
		p.clickLogin();
		Thread.sleep(3000);
		p.clickmensWear();
		Thread.sleep(3000);
		p.clickKurtas();
		Thread.sleep(2000);
		p.clicksortDis();
		Thread.sleep(2000);
		p.clickchsProd();
		Thread.sleep(2000);
		p.clickRaBtn();
		Thread.sleep(2000);
		p.setpintxtBox("110016");
		Thread.sleep(2000);
		p.clickchkBox();
		Thread.sleep(2000);
		p.clickaddCart();
		Thread.sleep(2000);
		p.clickAdBtn();
		Thread.sleep(3000);
		p.clickmyAcc();
	}
	@Test (enabled = true)
	public void testSortByMyCartAddNav() throws InterruptedException {
		// create object of my hone page class
		HomePage p = new HomePage(driver);
		// call the actions
		driver.manage().window().maximize();
		Thread.sleep(3000);
		p.clickSignIn();
		Thread.sleep(3000);
		p.setUserName("raaak1997@gmail.com");
		Thread.sleep(3000);
		p.clickContBTN();
		Thread.sleep(3000);
		p.setPwd("3hPazS");
		Thread.sleep(3000);
		p.clickLogin();
		Thread.sleep(3000);
		p.clickmensWear();
		Thread.sleep(3000);
		p.clickKurtas();
		Thread.sleep(3000);
		p.clicksortByN();
		Thread.sleep(3000);
		p.clickProduc();
		Thread.sleep(2000);
		p.clickRadBtn();
		Thread.sleep(2000);
		p.setpintxtBox("110016");
		Thread.sleep(2000);
		p.clickchkBox();
		Thread.sleep(2000);
		p.clickaddCart();
		Thread.sleep(2000);
		p.clickAdBtn();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
		p.clickchPro();
		Thread.sleep(2000);
		p.clickRadiBtn();
		Thread.sleep(2000);
		/*p.setpintxtBox("110017");
		Thread.sleep(3000);
		p.clickcheckBox();
		Thread.sleep(2000);*/
		p.clickaddtCart();
		Thread.sleep(2000);
		p.clickAdBtn();
		Thread.sleep(3000);
		p.clickmyAcc();
	}
	@Test (enabled = true)
	public void testSortByMyCartPriceLowToHighAddNav() throws InterruptedException {
		// create object of my hone page class
		HomePage p = new HomePage(driver);
		// call the actions
		driver.manage().window().maximize();
		Thread.sleep(3000);
		p.clickSignIn();
		Thread.sleep(3000);
		p.setUserName("raaak1997@gmail.com");
		Thread.sleep(3000);
		p.clickContBTN();
		Thread.sleep(3000);
		p.setPwd("3hPazS");
		Thread.sleep(3000);
		p.clickLogin();
		Thread.sleep(3000);
		p.clickmensWear();
		p.clickKurtas();
		Thread.sleep(2000);
		p.clicksortP();
		Thread.sleep(2000);
		p.clickchecPro();
		Thread.sleep(2000);
		p.clickRadiBtn();
		Thread.sleep(2000);
		p.setpintxtBox("110016");
		Thread.sleep(2000);
		p.clickchkBox();
		Thread.sleep(2000);
		p.clickaddCart();
		Thread.sleep(2000);
		p.clickAdBtn();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
		/*driver.navigate().back();*/
		Thread.sleep(2000);
		p.clickchekPro();
		Thread.sleep(3000);
		p.clickRaBtn();
		Thread.sleep(2000);
		/*p.setpintxtBox("110017");
		Thread.sleep(3000);
		p.clickcheckBox();
		Thread.sleep(2000);*/
		p.clickaddtCart();
		Thread.sleep(2000);
		p.clickAdBtn();
		Thread.sleep(3000);
		p.clickmyAcc();
	}
}