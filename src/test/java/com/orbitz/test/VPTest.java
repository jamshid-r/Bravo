package com.orbitz.test;



import static org.testng.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orbitz.pages.VacationPackagePage;


public class VPTest extends TestBase {
	String actual;
	String expected;
//	@BeforeTest
//	@Test(alwaysRun = true)
//	public void VacationPackageTest() throws InterruptedException {
//		VacationPackagePage vpPage = new VacationPackagePage();
//		vpPage.vacationPackagesLink.click();
//		vpPage.flightHotelCarButton.click();
//		 actual = driver.getTitle();
//		 expected = "Vacation Packages: Last Minute Travel Deals for Cheap Vacations | Orbitz";
//		 Assert.assertEquals(actual, expected);
//	}
	@Test
	public void VacPackageFlightSearchTest() throws InterruptedException {
		VacationPackagePage vpPage = new VacationPackagePage();
		vpPage.vacationPackagesLink.click();
		vpPage.flightHotelCarButton.click();
		
		
//		for (WebElement element : vpPage.flyingFromOptions) {
//			List<WebElement> listOfResults = element.
//			
//		}
		//driver.manage().timeouts().wait(3000);
		vpPage.flightFromInput.sendKeys("stl");
		Thread.sleep(1500);
		vpPage.flightFromInput.sendKeys("" + Keys.ARROW_DOWN + Keys.ENTER);
		
		vpPage.flightToInput.sendKeys("atl");
		Thread.sleep(3000);
		vpPage.flightToInput.sendKeys("" + Keys.ARROW_DOWN+Keys.ARROW_DOWN+ Keys.ENTER);
		Thread.sleep(1500);

		vpPage.flightDepartDateInput.sendKeys("05/15/2020");
		vpPage.flightReturnDateInput.sendKeys(""+Keys.CONTROL+'a'+Keys.BACK_SPACE);
		Thread.sleep(1500);

		vpPage.flightReturnDateInput.sendKeys("05/18/2020");
		
		vpPage.roomCountDropdown.click();
		
		actual = vpPage.roomCountDropdown.getAttribute("value");
		expected = "1";
		Assert.assertEquals(actual, expected);
		
		vpPage.adultsCountDropdown.click();
		actual = vpPage.adultsCountDropdown.getAttribute("value");
		expected = "2";
		Assert.assertEquals(actual, expected);
		vpPage.adultsCountDropdown.sendKeys(""+Keys.ARROW_UP+Keys.ENTER);
		
		vpPage.childrenCountDropdown.click();
		actual = vpPage.childrenCountDropdown.getAttribute("value");
		expected = "0";
		Assert.assertEquals(actual, expected);
		
		vpPage.directFlightOnlyCheckbox.click();
		boolean boxIsChecked = vpPage.directFlightOnlyCheckbox.isSelected();
		if (boxIsChecked) {
			vpPage.directFlightOnlyCheckbox.click();
			
		}
		vpPage.partialHotelBookingCheckbox.click();
		 boxIsChecked = vpPage.partialHotelBookingCheckbox.isSelected();
		if (boxIsChecked=true) {
			vpPage.partialHotelBookingCheckbox.click();
			
		}
		//vpPage.bookTogetherAndSaveText.isDisplayed();
		
		vpPage.searchButton.click();
		
		
		
//		Assert.assertTrue(driver.getTitle().contains("Hotel Search Results"));

		
		
}

	
	
}
