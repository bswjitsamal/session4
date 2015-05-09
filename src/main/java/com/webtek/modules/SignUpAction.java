package com.webtek.modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.webtek.helper.Log;
import com.webtek.pages.HomePage;
import com.webtek.pages.LoginPage;
import com.webtek.pages.SignUpPage;
import com.webtek.test.SelTestCase;

public class SignUpAction extends SelTestCase {

	/*
	 * static Random rand = new Random(); static String email =
	 * rand.nextInt(999) + "@test.com";
	 */

	public static void execute() throws Exception {

		try {
			HomePage.sign_in.click();
			Reporter.log("Clicking on SignIn link");
			Log.info("Clicking on SignIn link");
		} catch (Exception e) {
			Log.error("SignIn button element is not found");
		}

		try {
			LoginPage.registerNewEmail.sendKeys(email);
			Reporter.log("Entering an email to register");
			Log.info("Entering an email to register");
		} catch (Exception e) {
			Log.error("Register email text box element is not found");
		}
		
		//Asserting the duplicate email id
		if(LoginPage.emailAlreadyRegistered == true){
			Log.info("Email is already registerd");
		}else{
			Log.info("It is a new Email");
		}


		try {
			LoginPage.submitCreate.click();
			Reporter.log("Clicking on Register button");
			Log.info("Clicking on Register button");
		} catch (Exception e) {
			Log.error("Submit button element is not found");
		}

		try {
			SignUpPage.titleMr.click();
			Reporter.log("Clicked on Title radio button");
			Log.info("Clicked on Title radio button");
		} catch (Exception e) {
			Log.error("Title radio button element is not found");
		}

		try {
			SignUpPage.firstName.sendKeys("Biswajit");
			Reporter.log("Enterd first name in the text field");
			Log.info("Enterd first name in the text field");
		} catch (Exception e) {
			Log.error("FirstName text box element is not found");
		}

		try {
			SignUpPage.lastName.sendKeys("Samal");
			Reporter.log("Enterd last name in the text field");
			Log.info("Enterd last name in the text field");
		} catch (Exception e) {
			Log.error("lastName text box element is not found");
		}

		try {
			SignUpPage.password.sendKeys("password");
			Reporter.log("Enterd password in the text field");
			Log.info("Enterd password in the text field");
		} catch (Exception e) {
			Log.error("Password text box element is not found");
		}

		try {
			Select dropDownDays = new Select(SignUpPage.days);
			dropDownDays.selectByValue("5");
			Reporter.log("Selecting days for Date of birth form the Dropdown");
			Log.info("Selecting days for Date of birth form the Dropdown");
		} catch (Exception e) {
			Log.error("Dropdown in DOB for days element is not found");
		}
		
		//Scroll up
		JavascriptExecutor jse = (JavascriptExecutor )driver;
		jse.executeScript("scroll(15, 0)");
		

		try {
			Select dropDownMonths = new Select(SignUpPage.months);
			dropDownMonths.selectByVisibleText("August ");
			Reporter.log("Selecting Months for Date of birth form the Dropdown");
			Log.info("Selecting Months for Date of birth form the Dropdown");
		} catch (Exception e) {
			Log.error("Dropdown in DOB for months element is not found");
		}

		//Scroll up
				JavascriptExecutor jse1 = (JavascriptExecutor )driver;
				jse1.executeScript("scroll(15, 0)");
		
		try {
			Select dropDownYears = new Select(SignUpPage.years);
			dropDownYears.selectByVisibleText("1984  ");
			Reporter.log("Selecting Years for Date of birth form the Dropdown");
			Log.info("Selecting Years for Date of birth form the Dropdown");
		} catch (Exception e) {
			Log.error("Dropdown in DOB for years element is not found");
		}

		
		//Scroll up
				JavascriptExecutor jse2 = (JavascriptExecutor )driver;
				jse2.executeScript("scroll(15, 0)");
		
		try {
			SignUpPage.mycompany.sendKeys("Ubique Systems");
			Reporter.log("Entering company name for shipping details");
			Log.info("Entering company name for shipping details");
		} catch (Exception e) {
			Log.error("Company Text field element is not found");
		}

		try {
			SignUpPage.myAddressField1.sendKeys("Kalikapur");
			Reporter.log("Entering address1 for shipping details");
			Log.info("Entering address1 for shipping details");
		} catch (Exception e) {
			Log.error("Address text field element is not found");
		}

		try {
			SignUpPage.myAddressField2.sendKeys("Kolkata");
			Reporter.log("Entering address2 for shipping details");
			Log.info("Entering address2 for shipping details");
		} catch (Exception e) {
			Log.error("Address(Line 2) text field element is not found");
		}

		try {
			SignUpPage.myCity.sendKeys("Kolkata");
			Reporter.log("Entering city for shipping details");
			Log.info("Entering city for shipping details");
		} catch (Exception e) {
			Log.error("City text field element is not found");
		}

		try {
			Select dropDownState = new Select(SignUpPage.myState);
			dropDownState.selectByVisibleText("Nevada");
			Reporter.log("Entering state for shipping details");
			Log.info("Entering state for shipping details");
		} catch (Exception e) {
			Log.error("State dropdown field is not found");
		}

		try {
			SignUpPage.myPostCode.sendKeys("00000");
			Reporter.log("Entering zip code for shipping details");
			Log.info("Entering zip code for shipping details");
		} catch (Exception e) {
			Log.error("Postal Code text field element is not found");
		}

		try {
			Select dropDownCountry = new Select(SignUpPage.myCountry);
			dropDownCountry.selectByVisibleText("United States");
			Reporter.log("Entering country for shipping details");
			Log.info("Entering country for shipping details");
		} catch (Exception e) {
			Log.error("country dropdown field is not found");
		}

		try {
			SignUpPage.myPhone.sendKeys("9748888983");
			Reporter.log("Entering Mobile Number for shipping details");
			Log.info("Entering Mobile Number for shipping details");
		} catch (Exception e) {
			Log.error("Phone number text box field is not found");
		}

		try {
			SignUpPage.myAliasAddress.sendKeys("Kestapur");
			Reporter.log("Entering alias address for shipping details");
			Log.info("Entering alias address for shipping details");
		} catch (Exception e) {
			Log.error("Alias address text field element is not found");
		}

		try {
			SignUpPage.register.click();
			Reporter.log("Clicking on Register button");
			Log.info("Clicking on Register button");
		} catch (Exception e) {
			Log.error("Register button element is not found");
		}

	}

}
