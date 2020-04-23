package com.orbitz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orbitz.utils.Driver;

public class FlightPage {

	public FlightPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "primary-header-flight")
	public WebElement linkFlight;

	@FindBy(xpath = "//h1[.=' Search Flights ']")
	public WebElement searchFlightsText;

	@FindBy(id = "flight-origin-flp")
	public WebElement flyingFromInput;

	@FindBy(id = "flight-destination-flp")
	public WebElement flyingToInput;

	@FindBy(id = "flight-departing-flp")
	public WebElement flightDepartDate;

	@FindBy(id = "flight-returning-flp")
	public WebElement flightReturningDate;

	@FindBy(xpath = "//span[.='Direct flights only']")
	public WebElement directFlightsText;

	@FindBy(xpath = "//*[@id=\"gcw-flights-form-flp\"]/div[8]/label/button")
	public WebElement searchFligthCarButton;

	@FindBy(id = "flight-add-car-checkbox-flp")
	public WebElement addCarCheckBox;

}
