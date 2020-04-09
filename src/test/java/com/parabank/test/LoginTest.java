package com.parabank.test;

import org.testng.annotations.Test;

import com.parabank.pages.LoginPage;
import com.parabank.utils.ConfigReader;

public class LoginTest extends TestBase {
	
	@Test
	public void LoginTest() {
	LoginPage loginPage = new LoginPage();
	loginPage.usernameField.sendKeys(ConfigReader.getConfiguration("username"));
	loginPage.passwordField.sendKeys(ConfigReader.getConfiguration("password"));
	loginPage.loginButton.click();
	
	
	
	}
}
