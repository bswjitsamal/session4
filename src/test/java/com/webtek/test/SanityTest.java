package com.webtek.test;

import com.webtek.helper.Log;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.webtek.modules.SignInAction;
import com.webtek.modules.SignOutAction;
import com.webtek.modules.SignUpAction;
import com.webtek.pages.HomePage;
import com.webtek.pages.LogOutPage;
import com.webtek.pages.LoginPage;
import com.webtek.pages.SignUpPage;

public class SanityTest extends SelTestCase {

	 @Test(dependsOnMethods ="userSignUp", priority=2)
	public void signUser() {
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, LoginPage.class);
		SignInAction.execute();
		Log.info("SignInAction performed succesfully");
	}

	@Test
	public void userSignUp() {
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, SignUpPage.class);
		PageFactory.initElements(driver, LogOutPage.class);
		SignUpAction.execute();
		SignOutAction.execute();
	}

}
