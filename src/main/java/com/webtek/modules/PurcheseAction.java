package com.webtek.modules;

import com.webtek.helper.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.webtek.pages.DashBoardPage;
import com.webtek.pages.ProductPage;

public class PurcheseAction {
	private static WebDriver driver;
	
	public static void execuite(){
		
		//Mouse Hover action
		Actions action = new Actions(driver);
		WebElement we = DashBoardPage.mainManu;
		action.moveToElement(we).moveToElement(DashBoardPage.subMenu).click().build().perform();
		
		//Adding a product to a cart
		ProductPage.addToCart.click();
		Reporter.log("Adding a product to cart");
		Log.info("Adding a product to cart");
		
		ProductPage.proceedToCheckOut.click();
		Reporter.log("purchesing the seleted product");
		Log.info("purchesing the seleted product");
		
		ProductPage.proceedToCheckOutInCheckOutPage.click();
		Reporter.log("Final purheseing the seelcted item");
		Log.info("Final purheseing the seelcted item");
		
		
		
		
	}

}
