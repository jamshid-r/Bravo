package com.orbitz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.orbitz.utils.ConfigReader;
import com.orbitz.utils.Driver;

public class FlightPage {
	
	
	public FlightPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	
	@FindBy	(id = "header-account-menu")
	public WebElement accountMenuButton ;
	
	@FindBy	(id = "header-account-signin-button")
	public WebElement signInButton ;
	
	@FindBy	(id = "gss-signin-email")
	public WebElement signInEmailField ;
	
	@FindBy	(id = "gss-signin-password")
	public WebElement signInPasswordField ;
	
	@FindBy	(id = "gss-signin-submit")
	public WebElement signInSubmitButton;
	
}
