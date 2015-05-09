package com.webtek.modules;

import org.testng.Reporter;

import com.webtek.helper.*;
import com.webtek.pages.LogOutPage;

public class SignOutAction {

	public static void execute() throws Exception {
		
		try {
			LogOutPage.signOut.click();
			Reporter.log("Logout form the application");
			Log.info("Logout form the application");
		} catch (Exception e) {
			Log.error("SignOut button element is not found");
			throw (e);
		}
		
		

	}

}
