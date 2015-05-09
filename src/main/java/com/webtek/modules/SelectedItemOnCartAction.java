package com.webtek.modules;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.webtek.helper.Log;
import com.webtek.pages.HomePage;
import com.webtek.test.SelTestCase;

public class SelectedItemOnCartAction extends SelTestCase {

	public SelectedItemOnCartAction(WebDriver driver) {
		this.driver = driver;
	}

	public static void execute() throws Exception {

		try {
			HomePage.clickOnLogo.click();
			Log.info("clickOnLogo element is found");
		} catch (Exception e) {
			Log.info("clickOnLogo element is not found");
			throw (e);
		}

		// Adding ShortSleeveTShirt to cart
		try {
			Actions action = new Actions(driver);
			WebElement selectItem = HomePage.BobyPage.shortSleeveTShirt;
			action.moveToElement(selectItem)
					.moveToElement(HomePage.BobyPage.shortSleeveTShirtAddToCart)
					.click().build().perform();
			Log.info("Selecting a product form home page and moving to detail about the product");
			HomePage.BobyPage.continueShopping.click();
			Log.info("Continue Shopping");
		} catch (Exception e) {
			Log.info("We did not move to product detail page");
			throw (e);
		}

		// Adding Blouse to cart

		try {
			Actions action = new Actions(driver);
			WebElement selectItem = HomePage.BobyPage.blouse;
			action.moveToElement(selectItem)
					.moveToElement(HomePage.BobyPage.blouseAddToCart).click()
					.build().perform();
			Log.info("Selecting a product form home page and moving to detail about the product");
			HomePage.BobyPage.continueShopping.click();
			Log.info("Continue Shopping");
		} catch (Exception e) {
			Log.info("We did not move to product detail page");
			throw (e);
		}

		// Checking the selected item should be on car.

		String selectedProductTitle = HomePage.BobyPage.blouseproducTitle
				.getAttribute("title");
		Log.info("The titiel is " + selectedProductTitle);

	
		for(int i=1;i<n;i++){
			
			String productTitleInCart = HomePage.HeaderPage.productTitleInMiniCart.getAttribute("title");
		}
		String productTitleInCart = HomePage.HeaderPage.productTitleInMiniCart.getAttribute("title");
		
		Log.info("The titiel is " + productTitleInCart);
		
		if (selectedProductTitle.equals(productTitleInCart)) {
			Log.info("product Title Matches");
		} else {
			Log.info("Selected item is not in cart");
		}

	

	}

}
