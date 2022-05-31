package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To verify IRCTC GSTlogin";
		author="vengatesh";
		category="Regression";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	
	public void HotelsGSTLoginpage(String email,String mobile,String text,String adults,String tittle,String firstname,String lastname,
			String state,String gst,String gstno,String companyname,String companyaddress,String validno) {
		
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNewWindow()
		.clickOnHotelsIcon()
		.switchToNewWindow()
		.clickOnLogin()
		.clickOnGuestUserLogin()
		.enterEmail(email)
		.enterMobileNo(mobile)
		.clickOnLogin()
		.enterCityOrHotelName(text)
		.waitTime()
		.clickOnDestination()
		.clickCheckInDate()
		.waitTime()
		.clickOnmonthandyear()
		.clickOnselectYear()
		.clickOnCheckInYear("2022")
		.waitTime()
		.clickOnCheckInMonth("May")
		.clickOnCheckInDate("10")
		.waitTime()
		.clickCheckOutDate()
		.waitTime()
		.clickOnmonthandyear()
		.clickOnselectYear()
		.waitTime()
		.clickOnCheckOutYear("2022")
		.waitTime()
		.clickOnCheckOutMonth("May")
		.clickOnCheckOutDate("20")
		.clickOnRoomAndGuest()
		.selectGuestAs4()
		.clickOnDone()
		.clickOnFindHotel()
		.waitTime()
	    .clickOnFirstHotel()
		.switchToNewWindow()
		.clickOnContinueToBook()
		.selectTitle(tittle)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.selectState(state)
		.selectGst(gst)
		.enterGstNumber(gstno)
		.enterCompanyName(companyname)
		.enterCompanyAddress(companyaddress)
		.clickContinueForGstYes()
		.verifyTextOfgstNumber(validno);
}
	
	
}
