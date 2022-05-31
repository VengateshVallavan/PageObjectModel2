package pom.panindiatestcases.pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panindia.pages.RegistrationPages;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To verify PAN INDIA Signup for NewUser Registration";
		author="vengatesh";
		category="smoke";
		browserName="chrome";
		url="https://panind.com/india/new_pan/";
		
	}
		@Test
	 public void panindiapage() {
		 new RegistrationPages()
		 .waitTime()
		 .selectTitle("MR.")
		 .enterFirstName("vengatesh")
		 .enterMiddleName("venkat")
		 .enterLastName("raj")
		 .enterFatherFirstName("Govindharaj")
		 .enterFatherMiddleName("rajan")
		 .enterFatherLastName("gopal")
		 .enterMobileNo("7708607829")
		 .enterEmailId("venkatvenkymec@gmail.com")
		 .selectSourceOfInCome("No Income")
		 .clickOnOffice()
		 .enterDOB("10051996")
		 .pageScrollDownAccess()
		 .enterResidenceHouseNo("101")
		 .enterResidenceArea("Vandimedu")
		 .enterResidenceCity("villupuram")
		 .selectResidenceState("Tamil Nadu")
		 .enterResidencePincode("605602")
		 .enterOfficeName("Rialto Enterprizes Private Limited")
		 .enterOfficeHouseNo("53")
		 .enterOfficeArea("Guindy")
		 .enterOfficeCity("Chennai")
		 .selectOfficeState("Tamil Nadu")
		 .enterOfficePincode("600028")
		 .pageScrollDownAccess()
		 .selectIdentityProof("Aadhar Card issued by UIDAI(In Copy)")
		 .selectAddressProof("Aadhar Card issued by UIDAI(In Copy)")
		 .selectDOBProof("Matriculation certificate or mark sheet of recognised board (In Copy)")
		 .selectAdhaarProof("Copy of Aadhaar Card / Letter")
		 .selectOfficeAdhaarProof("Bank statement carrying Office Address")
		 .clickOnTermsAndConditions();
		 
		 
	 }

}
