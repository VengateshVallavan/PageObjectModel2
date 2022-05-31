package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IRCTCLoginPage extends GenericWrappers{
	
	public IRCTCLoginPage clickOnGuestUserLogin() {
		clickByXpath(prop.getProperty("IRCTCLoginPage.clickOnGuestUserLogin.xpath"));
		return this;
	}
	
	public IRCTCLoginPage enterEmail(String emailId) {
		enterByXpath(prop.getProperty("IRCTCLoginPage.enterEmail.xpath"), emailId);
		return this;
	}
	
	public IRCTCLoginPage enterMobileNo(String mobileNo) {
		enterByXpath(prop.getProperty("IRCTCLoginPage.enterMobileNo.xpath"), mobileNo);
		return this;
	}
	
	public ChooseHotelCityPage clickOnLogin() {
		clickByXpath(prop.getProperty("ChooseHotelCityPage.clickOnLogin.xpath"));
		return new ChooseHotelCityPage();
	}
	
}
