package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To verify IRCTC OTPlogin";
		author="vengatesh";
		category="Regression";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	
	public void HotelsOTPLoginpage(String emailid,String mobile,String text,String room,String adults,String tittle,String firstname,
			String lastname,String state,String gst,String ambossidor,String amount,String otp) {
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
		.enterEmail(emailid)
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
		.clickOnFirstHotel()
		.switchToNewWindow()
		.clickOnContinueToBook()
		.selectTitle(tittle)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.selectState(state)
		.selectGst(gst)
		.getHotelName()
		.getHotelPrice()
		.clickOnContinueForGstNo()
		.clickOnTermsAndConditions()
		.clickOnMakePayment()
		.clickOnVerify()
		.verifyOtpRequiredText(otp);
		
		
		
		
	
	}

}
