package pom.facebooktestcases.pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebooksignup.pages.FacebookHomepage;
import wrappers.ProjectWrappers;

public class TC006 extends  ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To verify Facebook Signup for NewUser Registration";
		author="vengatesh";
		category="smoke";
		browserName="chrome";
		url="https://www.facebook.com/";
		sheetName="TC006";
	}
		@Test(dataProvider="fetchData")
		public void FacebookSignupPage(String firstname,String lastname,String emailID,String confirmemailID,String pwd,String day,String month,
				String year,String Gender) {
			new FacebookHomepage()
			.clickOnCreateNewAccount()
			.waitTime()
			.EnterOnFirstName(firstname)
			.EnterOnSurname(lastname)
			.EnteronEmailId(emailID)
			.EnterOnCONFIRMEmailID(confirmemailID)
			.RegisterPassword(pwd)
			.SelectBirthDate(day)
			.SelectBirthMonth(month)
			.SelectBirthYear(year)
			.ClickOnGender(Gender);
		}
		
	}


