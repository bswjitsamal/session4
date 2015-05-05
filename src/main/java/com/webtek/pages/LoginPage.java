package com.webtek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	private WebDriver driver;
	
	//Creating a constructor
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(how=How.ID, using="email")
	public static WebElement email;
	
	@FindBy(how=How.ID, using="passwd")
	public static WebElement password;
	
	@FindBy(how=How.ID, using="SubmitLogin")
	public static WebElement signin_button;
	

	@FindBy(how=How.ID, using="email_create")
	public static WebElement email_create;

	@FindBy(how=How.ID, using="SubmitCreate")
	public static WebElement submit_create;
	
	@FindBy(how=How.ID, using="email_create")
	public static WebElement emailCreate;
	
	@FindBy(how=How.ID, using="SubmitCreate")
	public static WebElement submitCreate;
	
	
	
}
