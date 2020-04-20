package com.orbitz.test;


	import java.util.List;
	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;
	import com.orbitz.pages.HotelTestingPage;
	import com.orbitz.utils.BrowserUtilities;
	import com.orbitz.utils.Driver;
	public class HotelTest extends TestBase {
		HotelTestingPage hotelPage = new HotelTestingPage();
//		@Test
//		public void verifyHotelLink() {
//			
//			@BeforeMethod // Subclass's @Before methods will be executed after supercalsses' methods have finished executing
		@Test
		public void verifySearchHotelsPageIsDisplated() throws InterruptedException {
			//Driver.getDriver().get("http://www.orbitz.com");
			String loginTitleActual = Driver.getDriver().getTitle();
			String loginTitleExpected = "Orbitz Flights, Cheap Vacations, Rental Cars & Hotel Deals";
			// Asserts that two Strings are equal. If they are not, an AssertionError will display
			Assert.assertEquals(loginTitleActual, loginTitleExpected);
			System.out.println("Assert passed");
			Thread.sleep(8000);
		}
		@Test
	public void verifyHotelLinkIsClicable() throws InterruptedException {
			Thread.sleep(7000);
			hotelPage.linkHotel.click();
		}
		@Test
		public void verifyInfoGoingToInputField() throws InterruptedException {
			BrowserUtilities.waitForVisibility(By.id("hotel-destination-hp-hotel"), 4);
			hotelPage.goingToInputField.sendKeys("Sac");
			Thread.sleep(3000);
			hotelPage.goingToInputField.sendKeys("" + Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ENTER);
		}
		@Test
		public void testDAtePicker() throws Exception {
			Thread.sleep(7000);
			WebElement checkInDate = Driver.getDriver().findElement(By.id("hotel-checkin-hp-hotel"));
			checkInDate.sendKeys("09/25/2020");
			WebElement checkOutDateBox = Driver.getDriver().findElement(By.id("hotel-checkout-hp-hotel"));
			checkOutDateBox.sendKeys(Keys.TAB);
			Thread.sleep(4000);
//			checkOutDateBox.click();
//			System.out.println("Cliking on check out");
//			Thread.sleep(4000);
//			checkOutDateBox.clear();
//			System.out.println("Clearing check out");
//			Thread.sleep(4000);
			checkOutDateBox.sendKeys("09/29/2020");
		}
		@Test
		public void testRoomDropDown() throws Exception {
			Select drpRoom = new Select(Driver.getDriver().findElement(By.id("hotel-rooms-hp-hotel")));
			drpRoom.selectByVisibleText("1");
		}
		@Test
		public void testAdultsDropDown() throws Exception {
			Select drpAdults = new Select(Driver.getDriver().findElement(By.id("hotel-1-adults-hp-hotel")));
			drpAdults.selectByIndex(2);
		}
		@Test
		public void testChildrenDropDown() throws Exception {
			Select drpchildren = new Select(Driver.getDriver().findElement(By.id("hotel-1-children-hp-hotel")));
			drpchildren.selectByValue("0");
		}
		@Test
		public void verifyAddFlightCheckBoxSelectable() throws Exception {
			WebElement checkBox = Driver.getDriver().findElement(By.id("hotel-add-flight-checkbox-hp-hotel"));
			checkBox.click();
		}
		@Test
		public void verifyInfoFlyingFromInputField() throws InterruptedException {
			hotelPage.flyingFromInputField.sendKeys("Wash");
			Thread.sleep(3000);
			hotelPage.flyingFromInputField.sendKeys("" + Keys.ARROW_DOWN + Keys.ARROW_DOWN + Keys.ENTER);
			hotelPage.flyingFromInputField.sendKeys(Keys.ENTER);
		}
		@Test
		public void verifySearchHotelFlightButtonClicable() throws InterruptedException {
			Thread.sleep(5000);
			// hotelPage.searchHotelFligthButton.click();
		}
	}


