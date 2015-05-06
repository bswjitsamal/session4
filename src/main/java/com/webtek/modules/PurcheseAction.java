package com.webtek.modules;

import com.webtek.helper.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.webtek.pages.AddressDetailPage;
import com.webtek.pages.OrderSummaryPage;
import com.webtek.pages.PaymentMethodPage;
import com.webtek.pages.ShippingPage;
import com.webtek.pages.DashBoardPage;
import com.webtek.pages.ProductPage;
import com.webtek.pages.SummaryPage;
import com.webtek.test.SelTestCase;

public class PurcheseAction extends SelTestCase {

	// public static WebDriver driver;

	public static void execuite() throws InterruptedException {

		// Mouse Hover action
		Log.info("Moving to product listing page by clicking on the submenu");

		Actions action = new Actions(driver);
		WebElement mainMenu = DashBoardPage.mainManu;
		action.moveToElement(mainMenu).moveToElement(DashBoardPage.subMenu)
				.click().build().perform();

		// Scroll down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,350)");

		// Adding a product to a cart
		Actions action1 = new Actions(driver);
		WebElement mainMenu1 = ProductPage.selecitngProduct;
		action1.moveToElement(mainMenu1).moveToElement(ProductPage.addToCart)
				.click().build().perform();

		ProductPage.addToCart.click();
		Reporter.log("Adding a product to cart");
		Log.info("Adding a product to cart");

		ProductPage.proceedToCheckOut.click();
		Reporter.log("purchesing the seleted product");
		Log.info("purchesing the seleted product");

		SummaryPage.proceedToCheckOutInSummaryPage.click();
		Reporter.log("proceedToCheckOutInSummaryPage");
		Log.info("proceedToCheckOutInSummaryPage");
		
		AddressDetailPage.proceedToCheckOutInAddressDetailPage.click();
		Reporter.log("proceedToCheckOutInAddressDetailPage");
		Log.info("proceedToCheckOutInAddressDetailPage");
		
		
		ShippingPage.agreeTermsOfServices.click();
		ShippingPage.proceedTOCheckOutConfirmShippingPage.click();
		Reporter.log("proceedTOCheckOutConfirmShippingPage");
		Log.info("proceedTOCheckOutConfirmShippingPage");
		
		PaymentMethodPage.payByCheque.click();
		Reporter.log("payByCheque");
		Log.info("payByCheque");
		
		OrderSummaryPage.iConfirmMyOrder.click();
		Reporter.log("iConfirmMyOrder");
		Log.info("iConfirmMyOrder");

	}

}
