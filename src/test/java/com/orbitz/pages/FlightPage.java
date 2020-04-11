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
	
//	@FindBy()
//	public WebElement ;
//	
	
	
}
