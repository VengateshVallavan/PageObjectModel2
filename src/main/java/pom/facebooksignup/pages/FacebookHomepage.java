package pom.facebooksignup.pages;

import wrappers.GenericWrappers;

public class FacebookHomepage extends GenericWrappers {
	
	public FacebookSignupPage clickOnCreateNewAccount() {
		clickByXpath(prop.getProperty("FacebookHomepage.createnewaccount.xpath"));
		
		return new FacebookSignupPage();
		 
	}
	
		
	
	
		
	}


