package pom.panindia.pages;


import wrappers.GenericWrappers;

public class RegistrationPages extends GenericWrappers{
	
	public RegistrationPages waitTime() {
		waitProperty(1000);
		return this;
	}

	public RegistrationPages selectTitle(String title) {
	
		selectVisibileTextByXpath(prop.getProperty("RegistrationPages.selectTitle.xpath"), title);
	return new RegistrationPages();
}

	public RegistrationPages enterFirstName(String firstName) {
	
		enterByXpath(prop.getProperty("RegistrationPages.enterFirstName"), firstName);
	return this;
}

	public RegistrationPages enterMiddleName(String middleName) {
		
	enterByXpath(prop.getProperty("RegistrationPages.enterMiddleName.xpath"), middleName);
		return this;
}

	public RegistrationPages enterLastName(String lastName) {
	enterByXpath(prop.getProperty("RegistrationPages.enterLastName.xpath"), lastName);
		return this;
}

	public RegistrationPages enterFatherFirstName(String fatherFirstName) {
	enterByXpath(prop.getProperty("RegistrationPages.enterFatherFirstName.xpath"), fatherFirstName);
		return this;
}

	public RegistrationPages enterFatherMiddleName(String fatherMiddleName) {
	enterByXpath(prop.getProperty("RegistrationPages.enterFatherMiddleName.xpath"), fatherMiddleName);
	return this;
}

	public RegistrationPages enterFatherLastName(String fatherLastName) {
	
		enterByXpath(prop.getProperty("RegistrationPages.enterFatherLastName.xpath"), fatherLastName);
	return this;
}

public RegistrationPages enterMobileNo(String mobileNo) {
	enterByXpath(prop.getProperty("RegistrationPages.enterMobileNo.xpath"), mobileNo);
	return this;
}

	public RegistrationPages enterEmailId(String emailId) {
	enterByXpath(prop.getProperty("RegistrationPages.enterEmailId.xpath"), emailId);
	return this;
}

	public RegistrationPages selectSourceOfInCome(String incomeSource) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPages.selectSourceOfInCome.xpath"), incomeSource);
	return this;
}

	public RegistrationPages clickOnOffice() {
	clickByXpath(prop.getProperty("RegistrationPages.clickOnOffice.xpath"));
		return this;
}

	public RegistrationPages enterDOB(String dOB) {
	
		enterByXpath(prop.getProperty("RegistrationPages.enterDOB.xpath"), dOB);
	return this;
}

	public RegistrationPages enterResidenceHouseNo(String houseNo) {
	enterByXpath(prop.getProperty("RegistrationPages.enterResidenceHouseNo.xpath"), houseNo);
	return this;
}

	public RegistrationPages enterResidenceArea(String areaName) {
	enterByXpath(prop.getProperty("RegistrationPages.enterResidenceArea.xpath"), areaName);
	return this;
}

	public RegistrationPages enterResidenceCity(String cityName) {
	
		enterByXpath(prop.getProperty("RegistrationPages.enterResidenceCity.xpath"), cityName);
		return this;
}

public RegistrationPages selectResidenceState(String stateName) {
	
	selectVisibileTextByXpath(prop.getProperty("RegistrationPages.selectResidenceState.xpath"), stateName);
	return this;
}

public RegistrationPages enterResidencePincode(String pincode) {
	enterByXpath(prop.getProperty("RegistrationPages.enterResidencePincode.xpath"), pincode);
	return this;
}

public RegistrationPages enterOfficeName(String officeName) {
	enterByXpath(prop.getProperty("RegistrationPages.enterOfficeName.xpath"), officeName);
	return this;
}

public RegistrationPages enterOfficeHouseNo(String houseNo) {
	enterByXpath(prop.getProperty("RegistrationPages.enterOfficeHouseNo.xpath"), houseNo);
	return this;
}

public RegistrationPages enterOfficeArea(String areaName) {
	enterByXpath(prop.getProperty("RegistrationPages.enterOfficeArea.xpath"), areaName);
	
	return this;
}

public RegistrationPages enterOfficeCity(String cityName) {
	enterByXpath(prop.getProperty("RegistrationPages.enterOfficeCity.xpath"), cityName);
	return this;
}

public RegistrationPages selectOfficeState(String stateName) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPages.selectOfficeState.xpath"), stateName);
	return this;
}

public RegistrationPages enterOfficePincode(String pincode) {
	enterByXpath(prop.getProperty("RegistrationPages.enterOfficePincode.xpath"), pincode);
	return this;
}

public RegistrationPages selectIdentityProof(String idProof) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPages.selectIdentityProof.xpath"), idProof);
	return this;
}

public RegistrationPages selectAddressProof(String addressProof) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPages.selectAddressProof.xpath"), addressProof);
	return this;
}

	public RegistrationPages selectDOBProof(String dOBProof) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPages.selectDOBProof.xpath"), dOBProof);
	return this;
}

	public RegistrationPages selectAdhaarProof(String adhaarProof) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPages.selectAdhaarProof.xpath"), adhaarProof);
	return this;
}

		public RegistrationPages selectOfficeAdhaarProof(String officeAddressProof) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPages.selectOfficeAdhaarProof.xpath"), officeAddressProof);
	return this;
}

	public RegistrationPages clickOnTermsAndConditions() {
	clickByXpath(prop.getProperty("RegistrationPages.clickOnTermsAndConditions.xpath"));
	return this;
	
	}

	public RegistrationPages pageScrollDownAccess() {
		pageScrollDown();
		return this;
	}
	
}
