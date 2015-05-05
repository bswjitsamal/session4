package com.webtek.modules;

import com.webtek.helper.Log;

import org.testng.Reporter;

import com.webtek.pages.HomePage;
import com.webtek.pages.LoginPage;
import com.webtek.test.SelTestCase;

public class SignInAction extends SelTestCase{

	public static void execute() {

		HomePage.sign_in.click();
		Reporter.log("Click action is perfromed on My Account link");
		Log.info("Click action is perfromed on My Account link");
		
		LoginPage.email.sendKeys(email);
		Reporter.log(" entered in UserName text box");
		Log.info(" entered in UserName text box");

		LoginPage.password.sendKeys("password");
		Reporter.log(" entered in Password text box");
		Log.info(" entered in Password text box");

		LoginPage.signin_button.click();
		Reporter.log("Click action is performed on Submit button");
		Log.info("Click action is performed on Submit button");
		

	}

}
