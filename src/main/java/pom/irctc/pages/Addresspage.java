package pom.irctc.pages;

import wrappers.GenericWrappers;

public class Addresspage extends GenericWrappers{
	
	public Addresspage enterFlatNo(String flatNo) {
		
		enterByXpath(prop.getProperty("Addresspage.enterFlatNo.xpath"), flatNo);
		return this;
	}
	
	public Addresspage enterStreetName(String streetName) {
		
		enterByXpath(prop.getProperty("Addresspage.enterStreetName.xpath"), streetName);
		return this;
	}
	
	public Addresspage enterAreaName(String areaName) {
		
			enterByXpath(prop.getProperty("Addresspage.enterAreaName.xpath"), areaName);
		return this;
	}
	
	public Addresspage enterPinCode(String pinCode) {
			
		enterByXpath(prop.getProperty("Addresspage.enterPinCode.xpath"), pinCode);
		return this;
	}
	
	public Addresspage enterState(String stateName) {
		
		enterByXpath(prop.getProperty("Addresspage.enterState.xpath"), stateName);
		
		return this;
	}
	
	public Addresspage enterCityName(String cityName) {
	
		enterByXpath(prop.getProperty("Addresspage.enterCityName.xpath"), cityName);
		
		return this;
	}
	
	public Addresspage enterPostOfficeName(String postOfficeName) {
		
		enterByXpath(prop.getProperty("Addresspage.enterPostOfficeName.xpath"), postOfficeName);
		return this;
	}
	
	public Addresspage enterPhone(String phoneNo) {
		
		enterByXpath(prop.getProperty("Addresspage.enterPhone.xpath"), phoneNo);
		return this;
	}
	
		public Addresspage REPEATResidentialAddressAsNo() {
		
			clickByXpath(prop.getProperty("Addresspage.REPEATResidentialAddressAsNo.xpath"));
		return this;
	}
		

		public Addresspage pageDownAccess() {
			pageScrollDown();
			return this;
	
	}
	
	public Addresspage enterOfficeFlatNo(String officeFlatNo) {
		enterByXpath(prop.getProperty("Addresspage.enterOfficeFlatNo.xpath"), officeFlatNo);
			return this;
	}
	
	public Addresspage enterOfficeStreetName(String officeStreetName) {
		
		enterByXpath(prop.getProperty("Addresspage.enterOfficeStreetName.xpath"), officeStreetName);
		return this;
	}
	
	public Addresspage enterOfficeAreaName(String officeAreaName) {
		enterByXpath(prop.getProperty("Addresspage.enterOfficeAreaName.xpath"), officeAreaName);
		return this;
	}
	
	public Addresspage clickOnSelectCountry() {
		clickByXpath(prop.getProperty("Addresspage.clickOnSelectCountry.xpath"));
		return this;
	}
	
	public Addresspage selectCountry(String COUNTRY) {
		clickByXpath(prop.getProperty("Addresspage.selectCountry.xpath"));
		return this;
	}
	
	public Addresspage enterOfficePincode(String officePincode) {
		enterByXpath(prop.getProperty("Addresspage.enterOfficePincode.xpath"), officePincode);
		return this;
	}
	
	public Addresspage enterOfficeStateName(String officeStateName) {
		enterByXpath(prop.getProperty("Addresspage.enterOfficeStateName.xpath"), officeStateName);
		
		return this;
	}
	
	 public Addresspage selectOfficeCity(String officeCityName) {
		
		selectVisibileTextByXpath(prop.getProperty("Addresspage.selectOfficeCity.xpath"), officeCityName);
		return this;
	}
	
	
		public Addresspage selectPostOfficename2(String officePostOfficeName) {
		selectVisibileTextByXpath(prop.getProperty("Addresspage.selectPostOfficename2.xpath"), officePostOfficeName);
		return this;
	}
	
	public Addresspage enterOfficePhoneNo(String officePhoneNo) {
	
		enterByXpath(prop.getProperty("Addresspage.enterOfficePhoneNo.xpath"), officePhoneNo);
		
		return this;
	}
	
	
	public Addresspage clickOnTermsAndConditions() {
		
	clickByXpath(prop.getProperty("Addresspage.clickOnTermsAndConditions.xpath"));
	return this;
	}


}
