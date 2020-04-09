package com.parabank.test;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.parabank.pages.AccountOverviewPage;
import com.parabank.pages.LoginPage;
import com.parabank.utils.ConfigReader;

public class TransferFundsTest extends TestBase {
	@Test
	public void LoginTest() {
	LoginPage loginPage = new LoginPage();
	loginPage.usernameField.sendKeys(ConfigReader.getConfiguration("username"));
	loginPage.passwordField.sendKeys(ConfigReader.getConfiguration("password"));
	loginPage.loginButton.click();
	
	AccountOverviewPage aoPage = new AccountOverviewPage();
		aoPage.transferFundsLink.click();
		aoPage.enterAmountField.sendKeys("1");
		aoPage.fromAccountField.sendKeys("13344");
		aoPage.toAccountField.sendKeys("13344");
		aoPage.transferButton.click();
		
	
		String expected = "Transfer Complete!";
		String actual = aoPage.transferCompleteMessage.getText();
		Assert.assertEquals(expected, actual);
		
		
	
	}

}
