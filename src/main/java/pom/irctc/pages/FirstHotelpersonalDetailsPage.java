package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FirstHotelpersonalDetailsPage extends GenericWrappers{
	
	public FirstHotelpersonalDetailsPage selectTitle(String title) {
		selectVisibileTextByXpath(prop.getProperty("FirstHotelpersonalDetailsPage.selectTitle.xpath"), title);
		return this;
	}
	
	public FirstHotelpersonalDetailsPage enterFirstName(String firstName) {
		enterByXpath(prop.getProperty("FirstHotelpersonalDetailsPage.enterFirstName.xpath"), firstName);
		return this;
	}
	
	public FirstHotelpersonalDetailsPage enterLastName(String lastName) {
		enterByXpath(prop.getProperty("FirstHotelpersonalDetailsPage.enterLastName.xpath"), lastName);
		return this;
	}
	
	public FirstHotelpersonalDetailsPage selectState(String stateName) {
		selectVisibileTextByXpath(prop.getProperty("FirstHotelpersonalDetailsPage.selectState.xpath"), stateName);
		return this;
	}
	

	
	public FirstHotelpersonalDetailsPage selectGst(String gst) {
		selectVisibileTextByXpath(prop.getProperty("FirstHotelpersonalDetailsPage.selectGst.xpath"), gst);
		return this;
	}
	
	public FirstHotelpersonalDetailsPage getHotelName() {
		getTextByXpath(prop.getProperty("FirstHotelpersonalDetailsPage.getHotelName.xpath"));
		return this;
	}
	
	public FirstHotelpersonalDetailsPage getHotelPrice() {
		getTextByXpath(prop.getProperty("FirstHotelpersonalDetailsPage.getHotelPrice.xpath"));
		return this;
	}
	
	public HotelPaymentPages clickOnContinueForGstNo() {
		clickByXpath(prop.getProperty("HotelPaymentPages.clickOnContinueForGstNo.xpath"));
		return new HotelPaymentPages();
	}
	
	public FirstHotelpersonalDetailsPage enterGstNumber(String gstNo) {
		enterByXpath(prop.getProperty("FirstHotelpersonalDetailsPage.enterGstNumber.xpath"), gstNo);
		return this;
	}
	
	public FirstHotelpersonalDetailsPage enterCompanyName(String companyName) {
		enterByXpath(prop.getProperty("FirstHotelpersonalDetailsPage.enterCompanyName.xpath"), companyName);
		return this;
	}
	
	public FirstHotelpersonalDetailsPage enterCompanyAddress(String companyAddress) {
		enterByXpath(prop.getProperty("FirstHotelpersonalDetailsPage.enterCompanyAddress.xpath"), companyAddress);
		return this;
	}
	public FirstHotelpersonalDetailsPage clickContinueForGstYes() {
		clickByExplicitWait(prop.getProperty("FirstHotelpersonalDetailsPage.clickContinueForGstYes.xpath"),10);
		return this;
	
	}
	public FirstHotelpersonalDetailsPage verifyTextOfgstNumber(String text) {
		verifyTextContainsByXpath(prop.getProperty("FirstHotelpersonalDetailsPage.verifyTextOfgstNumber.xpath"), text);
		return this;
	}

	public FirstHotelpersonalDetailsPage clickOnGuestUserLogin() {
		clickByXpath(prop.getProperty("FirstHotelpersonalDetailsPage.clickOnGuestUserLogin.xpath"));
		return this;
	}
	
}
