package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To verify IRCTC SaloonMandatory";
		author="vengatesh";
		category="Regression";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	
	public void saloonmandatoryform(String name,String organization,String address,String mobile,String emailid,String request,
			String originstation,String destinationstation,String durationperiod,String details,String count1,String count2,
			String purpose,String service){
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNewWindow()
		.clickOnMenu()
		.clickOnCharter()
		.clickOnCloseMenu()
		.clickOnEnquiryForm()
		.enterNameOfApplicant(name)
		.enterNameOfOrganisation(organization)
		.enterAddress(address)
		.enterMobileNo(mobile)
		.enterEmail(emailid)
		.selectRequestForSaloonCharter()
		.enterOriginatingStation(originstation)
		.enterDestinationStation(destinationstation)
		.clickOnDateOfDeparture()
		.selectDepartureYear("2022")
		.clickOnDepartureMonth()
		.clickOnDepartureDate("10")
		.clickOnDateOfArrival()
		.selectArrivalYear("2022")
		.clickOnArrivalMonth()
		.clickOnArrivalDate("20")
		.enterDurationOfTour(durationperiod)
		.enterNumberAndTypeOfCoaches(details)
		.enterNoOfPassengers(count1)
		.enterPurposeOfCharter(purpose)
		.enterAdditionalServicesRequired(service)
		.clickOnSubmit();
		
		
		
		
		
		
		
		
	}

}
