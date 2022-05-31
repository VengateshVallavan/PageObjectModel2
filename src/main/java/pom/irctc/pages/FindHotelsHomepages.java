package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FindHotelsHomepages extends GenericWrappers{
	

	public FindHotelsHomepages switchToNewWindow() {
		switchToLastWindow();
		return this;
	}
	public IRCTCLoginPage clickOnLogin() {
		clickByXpath(prop.getProperty("IRCTCLoginPage.clickOnLogin.xpath"));
		return new IRCTCLoginPage();
	}
	
}
