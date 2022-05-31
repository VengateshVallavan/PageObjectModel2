
package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify IRCTC  NewUser Registration";
		author="vengatesh";
		category="Regression";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		sheetName="TC001";
		
	}
	@Test(dataProvider="fetchData")
		
	public void RegistrationPage(String username,String userpwd,String confirmpwd,String secQuestion,String firstname,String middlename,
			String lastname,String SelectOccupation,String dob,String emailID,String mobile,String address1,String address2,
			String address3,String pincode,String state,String phoneNumber,String OfficeFlatNo,String OfficeStreetName,String OfficePhoneNO) {
		
		new CovidAlertPage()
		.clickOnOK()
		.clickOnRegister()
		.waitTime()
		.enterUserName(username)
		.enterPassword(userpwd)
		.enterConfirmPassword(confirmpwd)
		.clickOnPreferredLanguage()
		.clickOnChooseLanguage()
		.clickOnSecurityQuestion()
		.clickOnChooseSecurityQuestion(secQuestion)
		.enterSecurityAnswer("Heaven")
		.clickOnContinue()
		.enterFirstName(firstname)
		.enterMiddleName(middlename)
		.enterLastName(lastname)
		.clickOnSelectOccupation()
		.clickToChooseSelectOccupation(SelectOccupation)
		.clickOnDOB()
		.selectMonth("May")
		.selectYear("1996")
		.clickOnDate("10")
		.selectCountry("India")
		.clickOnGender("Male")
		.enterEmail(emailID)
		.selectNationality("India")
		.clickOnContinue()
		.enterFlatNo(address1)
		.enterStreetName(address2)
		.enterAreaName(address3)
		.enterPinCode(pincode)
		.enterState(state)
		.enterCityName("villupuram")
		.enterPostOfficeName("Villupuram H.O")
		.enterPhone(phoneNumber)
		.REPEATResidentialAddressAsNo()
		.enterOfficeFlatNo(OfficeFlatNo)
		.enterOfficeStreetName(OfficeStreetName)
		.enterOfficeAreaName("vandimedu")
		.clickOnSelectCountry()
		.selectCountry("India")
		.enterOfficePincode("605602")
		.enterOfficeStateName("Tamil nadu")
		.enterCityName("Villupuram")
		.enterPostOfficeName("Villupuram H.O")
		.pageDownAccess()
		.enterOfficePhoneNo("9942376262")
		.clickOnTermsAndConditions();
		
		
		
		
	}

}
