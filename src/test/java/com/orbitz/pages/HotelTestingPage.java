package com.orbitz.pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import com.orbitz.utils.Driver;
	public class HotelTestingPage {
		public HotelTestingPage() {
			PageFactory.initElements(Driver.getDriver(), this);
		}
		@FindBy(id = "tab-hotel-tab-hp")
		public WebElement linkHotel;
		@FindBy(id = "hotel-destination-hp-hotel")
		public WebElement goingToInputField;
		@FindBy(id = "hotel-flight-origin-hp-hotel")
		public WebElement flyingFromInputField;
		@FindBy(xpath = "//span[.='Search Hotel + Flight']")
		public WebElement searchHotelFligthButton;
		@FindBy(xpath = "//h1[@class='section-header-main']")
		public WebElement searchHotelText;
	}




















