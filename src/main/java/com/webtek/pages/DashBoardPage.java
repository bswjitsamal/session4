package com.webtek.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage {
	
	private WebDriver driver;
	
	public DashBoardPage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Dresses")
	public static WebElement mainManu;
	
	@FindBy(how=How.LINK_TEXT,using="Summer Dresses")
	public static WebElement subMenu;

}
