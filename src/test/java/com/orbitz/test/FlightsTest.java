package com.orbitz.test;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.orbitz.pages.FlightPage;
import com.orbitz.utils.BrowserUtilities;
import com.orbitz.utils.Driver;

public class FlightsTest extends TestBase {

	FlightPage flightPage = new FlightPage();

	@Test
	public void verifyFlightsLinkIsClicable() throws InterruptedException {
		
		Thread.sleep(7000);
		flightPage.linkFlight.click();
		
	}
	
	@Test
	public void verifySearchFlightsText () throws InterruptedException {
		
		String searchFliogthActual = flightPage.searchFlightsText.getText();
		// System.out.println("Status title :" + searchFliogthActual);
		String searchFliogthExpected = "Search Flights";
		Assert.assertEquals(searchFliogthExpected, searchFliogthActual);
		Thread.sleep(4000);
	
	}

	@Test
	public void verifyInfoFlyingFromInputField() throws InterruptedException {
		
		BrowserUtilities.waitForVisibility(By.id("flight-origin-flp"), 4);
		flightPage.flyingFromInput.sendKeys("Sac");
		Thread.sleep(3000);
		flightPage.flyingFromInput.sendKeys("" + Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ENTER);
		
	}
	
	@Test
	public void verifyInfoFlyingToInputField() throws InterruptedException {
		
		flightPage.flyingToInput.sendKeys("Wash");
		Thread.sleep(3000);
		flightPage.flyingToInput.sendKeys("" + Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ENTER);

		
	}

	@Test
	public void testDAtePicker() throws Exception {
		
		flightPage.flightDepartDate.sendKeys("05/15/2020");
		
		flightPage.flightReturningDate.sendKeys("" + Keys.CONTROL + 'a' + Keys.BACK_SPACE);
		Thread.sleep(1500);
		flightPage.flightReturningDate.sendKeys("05/18/2020");
	}

	@Test
	public void testAdultsDropDown() throws Exception {
		
		Select drpAdults = new Select(Driver.getDriver().findElement(By.id("flight-adults-flp")));
		drpAdults.selectByIndex(2);
	}

	@Test
	public void testChildrenDropDown() throws Exception {
		
		Select drpchildren = new Select(Driver.getDriver().findElement(By.id("flight-children-flp")));
		drpchildren.selectByValue("0");
	}

	@Test
	public void verifyAddCarCheckBoxSelectable() throws Exception {
		
		WebElement option1 = Driver.getDriver().findElement(By.id("flight-add-car-checkbox-flp"));
		option1.click();

		if (option1.isSelected()) {
			System.out.println("Checkbox is Toggled On");

		} else {
			System.out.println("Checkbox is Toggled Off");
		}
	}

	@Test
	public void verifyDirectFlightsMessageDisplayed () throws InterruptedException {
		
		boolean directFlightsMessage = flightPage.directFlightsText.isDisplayed();
		System.out.println("Status message :" + directFlightsMessage);
		Assert.assertTrue(directFlightsMessage);
		System.out.println("Direct Flights Message is displayed on Search Flights page");
	}

	
	@Test
	public void verifySearchFlightCarButtonClicable() throws InterruptedException {
		
		Thread.sleep(5000);
		flightPage.searchFligthCarButton.click();
		Thread.sleep(7000);
	}

}
