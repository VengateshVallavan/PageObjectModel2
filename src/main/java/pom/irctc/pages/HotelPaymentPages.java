package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelPaymentPages extends GenericWrappers{
	
	

	public HotelPaymentPages clickOnTermsAndConditions() {
		
		clickByXpath(prop.getProperty("HotelPaymentPages.clickOnTermsAndConditions.xpath"));
		
		return this;
	}
	
	public OTPVerificationPage clickOnMakePayment() {
		
		clickByXpath(prop.getProperty("OTPVerificationPage.clickOnMakePayment.xpath"));
		
		return new OTPVerificationPage();

	}
	
}
