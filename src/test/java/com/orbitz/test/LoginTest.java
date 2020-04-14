package com.orbitz.test;

import org.testng.annotations.Test;

import com.orbitz.pages.FlightsPage;
import com.orbitz.utils.ConfigReader;

public class LoginTest extends TestBase {
	
	@Test
	public void LoginTest() {
	FlightsPage flightsPage = new FlightsPage();
	flightsPage.accountMenuButton.click();
	flightsPage.signInButton.click();
	flightsPage.signInEmailField.sendKeys(ConfigReader.getConfiguration("email"));
	flightsPage.signInPasswordField.sendKeys(ConfigReader.getConfiguration("password"));
	flightsPage.signInSubmitButton.click();
	
	
	
	}
}
