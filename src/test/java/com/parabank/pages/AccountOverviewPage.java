package com.parabank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.parabank.utils.ConfigReader;
import com.parabank.utils.Driver;

public class AccountOverviewPage {
	
	
	public AccountOverviewPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(linkText = "Transfer Funds")
	public WebElement transferFundsLink;
	
	@FindBy(id = "amount")
	public WebElement enterAmountField;
	
	@FindBy(id = "fromAccountId")
	public WebElement fromAccountField;
	
	@FindBy(id = "toAccountId")
	public WebElement toAccountField;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	public WebElement transferButton;
	
	@FindBy(linkText = "Transfer Complete!")
	public WebElement transferCompleteMessage;
	
	
	
}
