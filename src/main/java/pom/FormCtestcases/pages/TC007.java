package pom.FormCtestcases.pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.FormC.pages.FormCHomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers  {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify FORM-C for NewUser Registration";
		author="vengatesh";
		category="smoke";
		browserName="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		
	}
		@Test
	public void FormCPage() {
		new FormCHomePage()
		.clickOnSignupRegitration()
		.enterUserId("venkatyash96")
		.enterPassword("Vallavan@96")
		.enterConfirmPassword("Vallavan@96")
		.selectSecurityQuestion("What is the name of your favorite book?")
		.enterSecurityAnswer("che-Guevera")
		.enterName("vallavan")
		.selectGender("Male")
		.enterDOB("10/05/1996")
		.enterDesignation("ticketcollector")
		.enterEmailId("venkatvenkymec@gmail.com")
		.enterMobile("7708607829")
		.enterPhoneNo("255355")
		.selectNationality("INDIA")
		.enterHotelName("leBeachINN")
		.enterCapacity("20")
		.enterAddress("no.101")
		.selectState("TAMIL NADU")
		.waitTime()
		.selectCity("KARUR")
		.selectAccomodationType("Guest House")
		.selectAccomodationGrade("Five Star")
		.enterHotelEmailId("LEBEACHINN@gmail.com")
		.enterHotelMobileNo("9942376262")
		.enterPhoneNo("255355")
		.waitTime()
		.enterSecondOwnerName("karuna")
		.enterSecondOwnerAddress("chennai")
		.selectSecondOwnerState("TAMIL NADU")
		.waitTime()
		.selectSecondOwnerDistrict("SALEM")
		.enterSecondOwnerEmailId("yuvan90@gmail.com")
		.enterSecondOwnerPhoneNo("9942376263")
		.clickOnAdd()
		.waitTime()
		.enterThirdOwnerName("sanjay")
		.enterThirdOwnerAddress("chennai")
		.selectThirdOwnerState("TAMIL NADU")
		.waitTime()
		.selectThirdOwnerDistrict("VILLUPURAM")
		.enterThirdOwnerEmailId("vallavan1020@gmail.com")
		.enterThirdOwnerPhoneNo("7708607829")
		.clickOnAdd();
		}
		
		
	}


