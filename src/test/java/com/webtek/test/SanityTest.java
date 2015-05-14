package com.webtek.test;

import com.webtek.helper.Log;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.webtek.modules.PurcheseAction;
import com.webtek.modules.SignInAction;
import com.webtek.modules.SignOutAction;
import com.webtek.modules.SignUpAction;
import com.webtek.pages.AddressDetailPage;
import com.webtek.pages.DashBoardPage;
import com.webtek.pages.HomePage;
import com.webtek.pages.LogOutPage;
import com.webtek.pages.LoginPage;
import com.webtek.pages.OrderSummaryPage;
import com.webtek.pages.PaymentMethodPage;
import com.webtek.pages.ProductPage;
import com.webtek.pages.ShippingPage;
import com.webtek.pages.SignUpPage;
import com.webtek.pages.SummaryPage;

public class SanityTest extends SelTestCase {

	@Test(dependsOnMethods = "userSignUp", priority = 2)
	public void signUser() throws InterruptedException {

		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, LoginPage.class);

		try {
			SignInAction.execute();
			Log.info("SignInAction performed succesfully");
		} catch (Exception e) {
			Log.error("SignInAction dose not perform succesfully");
			e.printStackTrace();
		}

	}

	@Test
	public void userSignUp() {

		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, SignUpPage.class);
		PageFactory.initElements(driver, LogOutPage.class);

		try {

			Log.startTestCase("sTestCaseName");
			SignUpAction.execute();

		} catch (Exception e) {
			Log.error("SignUpAction dose not perform successfully");
			e.printStackTrace();
		}

		try {
			SignOutAction.execute();
			Log.info("SignOutAction perform successfully");
		} catch (Exception e) {
			Log.error("SignOutAction dose not perform successfully");
			e.printStackTrace();
		}

	}

	@Test(dependsOnMethods = "signUser", priority = 3)
	public void productCheckOut() throws InterruptedException {

		PageFactory.initElements(driver, DashBoardPage.class);
		PageFactory.initElements(driver, ProductPage.class);
		PageFactory.initElements(driver, SummaryPage.class);
		PageFactory.initElements(driver, AddressDetailPage.class);
		PageFactory.initElements(driver, ShippingPage.class);
		PageFactory.initElements(driver, PaymentMethodPage.class);
		PageFactory.initElements(driver, OrderSummaryPage.class);

		try {

			PurcheseAction.execuite();
			Log.info("PurcheseActio perform successfully");
			//Log.endTestCase("sTestCaseName");

		} catch (Exception e) {
			Log.error("PurcheseAction dose not perform successfully");
		}

	}

}
