package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PersonalDetailsPages extends GenericWrappers{



	public PersonalDetailsPages enterFirstName(String firstName) {
		enterByXpath(prop.getProperty("PersonalDetailsPages.enterFirstName.xpath"), firstName);
		return this;
	}
	
	public PersonalDetailsPages enterMiddleName(String middleName) {
		enterByXpath(prop.getProperty("PersonalDetailsPages.enterMiddleName.xpath"), middleName);
		return this;
	}
	
	public PersonalDetailsPages enterLastName(String lastName) {
		enterByXpath(prop.getProperty("PersonalDetailsPages.enterLastName.xpath"), lastName);
		return this;
	}
	
	public PersonalDetailsPages clickOnSelectOccupation() {
		clickByXpath(prop.getProperty("PersonalDetailsPages.clickOnSelectOccupation.xpath"));
		return this;
	}
	
	public PersonalDetailsPages clickToChooseSelectOccupation(String occupation) {
		clickByXpath(prop.getProperty("PersonalDetailsPages.clickToChooseSelectOccupation.xpath"),occupation);
		return this;
	}
	
	public PersonalDetailsPages clickOnDOB() {
		clickByXpath(prop.getProperty("PersonalDetailsPages.clickOnDOB.xpath"));
		return this;
	}
	
	public PersonalDetailsPages selectMonth(String month) {
		selectVisibileTextByXpath(prop.getProperty("PersonalDetailsPages.selectMonth.xpath"), month);
		return this;
	}
	
	public PersonalDetailsPages selectYear(String year) {
		selectVisibileTextByXpath(prop.getProperty("PersonalDetailsPages.selectYear.xpath"), year);
		return this;
	}
	
	public PersonalDetailsPages clickOnDate(String date) {
		clickByXpath(prop.getProperty("PersonalDetailsPages.clickOnDate.xpath"));
		return this;
	}
	
	public PersonalDetailsPages clickOnMartialStatus(String martialStatus) {
		clickByXpath(prop.getProperty("PersonalDetailsPages.clickOnMartialStatus.xpath"),martialStatus);
		return this;
	}
	
	public PersonalDetailsPages selectCountry(String country) {
		selectVisibileTextByXpath(prop.getProperty("PersonalDetailsPages.selectCountry.xpath"), country);
		return this;
	}
	
	public PersonalDetailsPages clickOnGender(String gender) {
		clickByXpath(prop.getProperty("PersonalDetailsPages.clickOnGender.xpath"),gender);
		return this;
	}
	
	public PersonalDetailsPages enterEmail(String email) {
		enterByXpath(prop.getProperty("PersonalDetailsPages.enterEmail.xpath"), email);
		return this;
	}
	
	public PersonalDetailsPages enterISD(String isd) {
		enterByXpath(prop.getProperty("PersonalDetailsPages.enterISD.xpath"), isd);
		return this;
	}
	
	public PersonalDetailsPages enterMobile(String mobile) {
		enterByXpath(prop.getProperty("PersonalDetailsPages.enterMobile.xpath"), mobile);
		return this;
	}
	
	public PersonalDetailsPages selectNationality(String nationality) {
		selectVisibileTextByXpath(prop.getProperty("PersonalDetailsPages.selectNationality.xpath"), nationality);
		return this;
	}
	
	public Addresspage clickOnContinue() {
		clickByXpath(prop.getProperty("Addresspage.clickOnContinue.xpath"));
		return new Addresspage();
	}
	}
