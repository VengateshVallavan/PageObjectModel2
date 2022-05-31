package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To verify IRCTC  FTR Registration";
		author="vengatesh";
		category="Regression";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	
	public void  FTRRegistrationpage(String userid,String pwd,String repwd,String securityQuestion,
			String securityAnswer,String month,String year,String Gender,String martialstatus,String emailID, String Occupation,
			String firstname,String middlename,String lastname,String natinality,String flat,String street,
			String area,String country,String mobile,String pincode,String city,String state) {
		
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToNewWindow()
		.clickOnMenu()
		.clickOnBookYourTrainOrCoach()
		.switchToNewWindow()
		.clickOnNewUserSignUP()
		.enterUserId(userid)
		.enterPassword(pwd)
		.enterConfirmPassword(repwd)
		.selectSecurityQuestion(securityQuestion)
		.enterSecurityAnswer(securityAnswer)
		.clickOnDOB()
		.selectMonth(month)
		.selectYear(year)
		.clickOnDate("10")
		.clickOnGender(Gender)
		.clickOnMartialStatus(martialstatus)
		.enterEmailId(emailID)
		.selectOccupation(Occupation)
		.enterFirstName(firstname)
		.enterMiddleName(middlename)
		.enterLastName(lastname)
		.selectNationality(natinality)
		.enterFlatNo(flat)
		.enterStreet(street)
		.enterArea(area)
		.pageDownAccess()
		.selectCountry(country)
		.enterMobileNo(mobile)
		.enterPincode(pincode)
		.pressTabKeyForCityAndState()
		.selectPostOffice("Villupuram H.O")
		.clickCommunicationAddressAsNo()
		.enterOfficeFlatNo("100")
		.enterOfficeStreet("rajamaninagar")
		.enterOfficeAreaName("vandimedu")
		.selectOfficeCountry("India")
		.enterOfficeMobileNo("9942376262")
		.enterOfficePincode("605602")
		.pressTabKeyForCityAndState()
		.selectOfficePostOffice("Villupuram H.O");
	}
		
		
		
			
}
	


