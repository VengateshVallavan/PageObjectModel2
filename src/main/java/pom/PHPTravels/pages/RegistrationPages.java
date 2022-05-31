package pom.PHPTravels.pages;

import wrappers.GenericWrappers;

public class RegistrationPages extends GenericWrappers{
	
	public RegistrationPages enterFirstName(String firstName) {
		enterByXpath(prop.getProperty("RegistrationPages.enterFirstName.xpath"), firstName);
		return this;
	}
	
	public RegistrationPages enterLastName(String lastName) {
		enterByXpath(prop.getProperty("RegistrationPages.enterLastName.xpath"), lastName);
		return this;
	}
	
	public RegistrationPages enterEmailId(String emailId) {
		enterByXpath(prop.getProperty("RegistrationPages.enterEmailId.xpath"), emailId);
		return this;
	}
	
	public RegistrationPages clickOnCountryCode() {
		clickByXpath(prop.getProperty("RegistrationPages.clickOnCountryCode.xpath"));
		return this;
	}
	
	public RegistrationPages selectCountryCode(String code) {
		clickByXpath(prop.getProperty("RegistrationPages.selectCountryCode.xpath"));
		return this;
	}
	
	public RegistrationPages enterPhoneNo(String phoneNo) {
		
		enterByXpath(prop.getProperty("RegistrationPages.enterPhoneNo.xpath"), phoneNo);
		return this;
	}
	
	public RegistrationPages enterCompanyName(String companyName) {
		enterByXpath(prop.getProperty("RegistrationPages.enterCompanyName.xpath"), companyName);
		return this;
	}
	
	public RegistrationPages enterStreetAddress(String streetAddress) {
		enterByXpath(prop.getProperty("RegistrationPages.enterStreetAddress.xpath"), streetAddress);
		return this;
	}
	
	public RegistrationPages enterStreetAddress2(String streetAddress) {
		enterByXpath(prop.getProperty("RegistrationPages.enterStreetAddress2.xpath"), streetAddress);
		return this;
	}
	
	public RegistrationPages enterCity(String cityName) {
		enterByXpath(prop.getProperty("RegistrationPages.enterCity.xpath"), cityName);
		return this;
	}
	
	public RegistrationPages enterState(String stateName) {
		enterByXpath(prop.getProperty("RegistrationPages.enterState.xpath"), stateName);
		return this;
	}
	
	public RegistrationPages enterPostCode(String postCode) {
		
		enterByXpath(prop.getProperty("RegistrationPages.enterPostCode.xpath"), postCode);
		return this;
	}
	
	public RegistrationPages tabAccess() {
		tabKey();
		return this;
	}
	
	public RegistrationPages selectCountry(String countryName) {
		
		selectVisibileTextByXpath(prop.getProperty("RegistrationPages.selectCountry.xpath"), countryName);
		return this;
	}
	
	public RegistrationPages enterMobileNo(String mobileNo) {
		enterByXpath(prop.getProperty("RegistrationPages.enterMobileNo.xpath"), mobileNo);
		return this;
	}
	
	public RegistrationPages enterPassword(String password) {
		enterByXpath(prop.getProperty("RegistrationPages.enterPassword.xpath"), password);
		return this;
	}
	
	public RegistrationPages enterConfirmPassword(String password) {
		enterByXpath(prop.getProperty("RegistrationPages.enterConfirmPassword.xpath"), password);
		return this;
	}
	
	public GeneratePasswordPage clickOnGeneratePassword() {
		clickByXpath(prop.getProperty("GeneratePasswordPage.clickOnGeneratePassword.xpath"));
		return new GeneratePasswordPage();
	}
	
	public RegistrationPages clickOnReceiveEmails() {
		
		clickByXpath(prop.getProperty("RegistrationPages.clickOnReceiveEmails.xpath"));
		return this;
	}
	
	
}
	

	