package pom.FormC.pages;

import wrappers.GenericWrappers;

public class FormCHomePage extends GenericWrappers {
	
	
	public FormCRegistrationPage clickOnSignupRegitration() {
		clickByXpath(prop.getProperty("FormCRegistrationPage.clickOnSignupRegitration.xpath"));
		
		return new FormCRegistrationPage();
		
	}

}
