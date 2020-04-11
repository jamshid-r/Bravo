package com.orbitz.test;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.orbitz.pages.FlightPage;
import com.orbitz.pages.Flights;
import com.orbitz.utils.ConfigReader;

public class TransferFundsTest extends TestBase {
	@Test
	public void LoginTest() {
	Flights loginPage = new Flights();
	loginPage.usernameField.sendKeys(ConfigReader.getConfiguration("username"));
	loginPage.passwordField.sendKeys(ConfigReader.getConfiguration("password"));
	loginPage.loginButton.click();
	
	FlightPage aoPage = new FlightPage();
//		aoPage.transferFundsLink.click();
//		aoPage.enterAmountField.sendKeys("1");
//		aoPage.fromAccountField.sendKeys("13344");
//		aoPage.toAccountField.sendKeys("13344");
//		aoPage.transferButton.click();
//		
//	
//		String expected = "Transfer Complete!";
//		String actual = aoPage.transferCompleteMessage.getText();
//		Assert.assertEquals(expected, actual);
//		
		
	
	}

}
