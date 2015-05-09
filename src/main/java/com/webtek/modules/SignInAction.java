package com.webtek.modules;

import org.testng.Reporter;
import com.webtek.helper.Log;
import com.webtek.pages.HomePage;
import com.webtek.pages.LoginPage;
import com.webtek.test.SelTestCase;

public class SignInAction extends SelTestCase {

	public static void execute() throws Exception {
		
		try {
			HomePage.sign_in.click();
			Reporter.log("Click action is perfromed on My Account link");
			Log.info("Click action is perfromed on My Account link");

		} catch (Exception e) {
			Log.error("SignIn button element is not found");
			throw (e);

		}

		try {
			LoginPage.enterEmail.sendKeys(email);
			Reporter.log(" entered in UserName text box");
			Log.info(" entered in UserName text box");
		} catch (Exception e) {
			Log.error("Email text box element is not found");
			throw (e);

		}

		try {
			LoginPage.enterPassword.sendKeys("password");
			Reporter.log(" entered in Password text box");
			Log.info(" entered in Password text box");
		} catch (Exception e) {
			Log.error("Password text box element is no found");
			throw (e);

		}

		try {
			LoginPage.signin_button.click();
			Reporter.log("Click action is performed on Submit button");
			Log.info("Click action is performed on Submit button");
			Thread.sleep(1000);
		} catch (Exception e) {
			Log.error("SignIn Button element is not found");
			throw (e);

		}
		
		
		if(LoginPage.invalidLoginAlert == true){
			Log.info("We have entered wrong credential");
			
		}else{
			Log.info("Login successfully");
		}

	}

}
