package com.webtek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SummaryPage {
	
	private WebDriver driver;
	
	public SummaryPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(how=How.CSS,using=".button.btn.btn-default.standard-checkout.button-medium>span")
	public static WebElement proceedToCheckOutInSummaryPage;

}
