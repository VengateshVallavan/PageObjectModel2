
package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	public RegistrationPage enterUserName(String userName) {
		
		enterByXpath(prop.getProperty("RegistrationPage.enterUserName.xpath"), userName);
		return this;
	}
	
	public RegistrationPage enterPassword(String password) {
		
		enterByXpath(prop.getProperty("RegistrationPage.enterPassword.xpath"), password);
		return this;
	}
	
	public RegistrationPage enterConfirmPassword(String confirmPassword) {
		enterByXpath(prop.getProperty("RegistrationPage.enterConfirmPassword.xpath"), confirmPassword);
		return this;
	}
	public  RegistrationPage waitTime() {
		waitProperty(2000);
		return this;
	}
	
	public RegistrationPage clickOnPreferredLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.clickOnPreferredLanguage.xpath"));
		return this;
	}
	
	public RegistrationPage clickOnChooseLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.clickOnChooseLanguage.xpath"));
		return this;
	}
	
	public RegistrationPage clickOnSecurityQuestion() {
		clickByXpath(prop.getProperty("RegistrationPage.clickOnSecurityQuestion.xpath"));
		return this;
	}
	
	public RegistrationPage clickOnChooseSecurityQuestion(String securityQuestion) {
		clickByXpath(prop.getProperty("RegistrationPage.clickOnChooseSecurityQuestion.xpath"),securityQuestion);
		return this;
	}
	public RegistrationPage pageDownAccess() {
		pageScrollDown();
		return this;
	}
	
	public RegistrationPage enterSecurityAnswer(String securityAnswer) {
		enterByXpath(prop.getProperty("RegistrationPage.enterSecurityAnswer.xpath"), securityAnswer);
		return this;
	}
	
	public PersonalDetailsPages clickOnContinue() {
		clickByXpath(prop.getProperty("PersonalDetailsPages.clickOnContinue.xpath"));
		return new PersonalDetailsPages();
	
	}
}
