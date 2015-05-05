package com.webtek.test;

import java.io.File;
import com.webtek.helper.Excelutils;
import com.webtek.helper.Log;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.webtek.modules.PurcheseAction;
import com.webtek.modules.SignInAction;
import com.webtek.modules.SignOutAction;
import com.webtek.modules.SignUpAction;
import com.webtek.pages.HomePage;
import com.webtek.pages.LogOutPage;
import com.webtek.pages.LoginPage;
import com.webtek.pages.ProductPage;
import com.webtek.pages.SignUpPage;

public class SanityTest extends SelTestCase {

	@Test(dependsOnMethods = "userSignUp", priority = 2)
	public void signUser() throws InterruptedException {
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, LoginPage.class);
		SignInAction.execute();
		Log.info("SignInAction performed succesfully");
	}

	@Test( dataProvider = "SignUpUser")
	public void userSignUp(String email, String firstName, String lastName,
			String password, String myfirstname, String mylastname,
			String mycompany, String myAddressField1, String myAddressField2,
			String myCity, String myPostCode, String myPhone,
			String myAliasAddress) {
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, SignUpPage.class);
		PageFactory.initElements(driver, LogOutPage.class);
		SignUpAction.execute(email, firstName, lastName, password, myfirstname,
				mylastname, mycompany, myAddressField1, myAddressField2,
				myCity, myPostCode, myPhone, myAliasAddress);
		SignOutAction.execute();
	}

	@DataProvider(name = "SignUpUser")
	public Object[][] getNewCompanyData() throws Exception {
		System.out.println(new File(".").getAbsolutePath());
		Object[][] cellData = Excelutils.getInstance().readData("C:\\Users\\Biswajit\\Downloads\\session4-master\\session4-master\\src\\test\\java\\SignUp.xls", 0);
		System.out.println("MMMMMM : " + cellData);
		return cellData;
	}
	
	@Test(dependsOnMethods = "signUser", priority = 3)
	public void productCheckOut() {
		PageFactory.initElements(driver, ProductPage.class);
		PurcheseAction.execuite();
	}

}
