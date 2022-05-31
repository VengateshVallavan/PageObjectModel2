package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OTPVerificationPage extends GenericWrappers{
	


	public OTPVerificationPage clickOnVerify() {
		clickByXpath(prop.getProperty("OTPVerificationPage.clickOnVerify.xpath"));
		return this;
	}
	
	public OTPVerificationPage verifyOtpRequiredText(String text) {
		verifyTextContainsByXpath(prop.getProperty("OTPVerificationPage.verifyOtpRequiredText.xpath"), text);
		return this;
	}

	
}
