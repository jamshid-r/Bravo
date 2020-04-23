package com.orbitz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.orbitz.utils.Driver;

public class HotelPage {

	public HotelPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "tab-hotel-tab-hp")
	public WebElement linkHotel;

	@FindBy(id = "hotel-destination-hp-hotel")
	public WebElement goingToInputField;

	@FindBy(id = "hotel-flight-origin-hp-hotel")
	public WebElement flyingFromInputField;
	
	
	@FindBy(id = "hotel-checkin-hp-hotel")
	public WebElement checkInDate;
	
	@FindBy(id = "hotel-checkout-hp-hotel")
	public WebElement checkOutDateBox;

	@FindBy(xpath = "//*[@id=\"gcw-hotel-form-hlp\"]/div[7]/label/button")
	public WebElement searchHotelFligthButton;

}
