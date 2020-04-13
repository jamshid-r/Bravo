package com.orbitz.test;

import org.testng.annotations.Test;

import com.orbitz.pages.FlightPage;
import com.orbitz.pages.Flights;
import com.orbitz.utils.ConfigReader;

public class LoginTest extends TestBase {
	
	@Test
	public void LoginTest() {
	FlightPage flightPage = new FlightPage();
	flightPage.accountMenuButton.click();
	flightPage.signInButton.click();
	flightPage.signInEmailField.sendKeys(ConfigReader.getConfiguration("email"));
	flightPage.signInPasswordField.sendKeys(ConfigReader.getConfiguration("password"));
	flightPage.signInSubmitButton.click();
	
	
	
	}
}
