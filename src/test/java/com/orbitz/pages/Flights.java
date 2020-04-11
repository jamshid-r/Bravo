package com.orbitz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.orbitz.utils.ConfigReader;
import com.orbitz.utils.Driver;



public class Flights {
	
	public Flights() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy	(xpath = "//input[@name='username']")
	public WebElement usernameField ;
	
	@FindBy	(xpath = "//input[@name='password']")
	public WebElement passwordField;
	
	@FindBy	(xpath = "//input[@class='button']")
	@CacheLookup // will cache /save the element once we find it and next it is used, it is not going to find it anew
	public WebElement loginButton;
	
//	@FindBy	()
//	public WebElement errorMessage;
	
	
//	public void positiveLogin() {
//		usernameField.sendKeys(ConfigReader.getConfiguration("usrname"));
//		passwordField.sendKeys(ConfigReader.getConfiguration("password"));
//		loginButton.click();
//		
//	}
	
	
	
	// Using "how" and "using" parameters
//	@FindBy	(how = How.NAME , using = "ctl00$MainContent$login_button")
//	public WebElement loginButtons;
	

}
