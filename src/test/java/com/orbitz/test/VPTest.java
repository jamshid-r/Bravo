package com.orbitz.test;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.orbitz.pages.VacationPackagePage;

public class VPTest extends TestBase {
	
	@Test
	public void VacationPackageTest() {
		VacationPackagePage vpPage = new VacationPackagePage();
		vpPage.vacationPackagesLink.click();
		vpPage.flightHotelCarButton.click();
		String actual = driver.getTitle();
		String expected = "Vacation Packages: Last Minute Travel Deals for Cheap Vacations | Orbitz";
		
//	}
//	@Test
//	public void VacPackageFlightSearchTest() {
//		VacationPackagePage vpPage = new VacationPackagePage();
		
//		for (WebElement element : vpPage.flyingFromOptions) {
//			List<WebElement> listOfResults = element.
//			
//		}
		
//		vpPage.flightFromInput.sendKeys("stl");
//		List<WebElement>flightList = vpPage.flyingFromOptions.getText().toString();
//		System.out.println(flightList);
}

	
	
}
