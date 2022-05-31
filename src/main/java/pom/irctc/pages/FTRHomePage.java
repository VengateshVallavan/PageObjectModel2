package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRHomePage extends GenericWrappers {
	
	
    public FTRHomePage switchToNewWindow() {
   	 switchToLastWindow();
   	 return new FTRHomePage();
    }
    public FTRHomePage clickOnMenu() {
		clickByXpath(prop.getProperty("FTRHomePage.clickOnMenu.xpath"));
		return this;
    }
    
    public FTRRegistrationpage clickOnNewUserSignUP() {
	 clickByXpath(prop.getProperty("FTRRegistrationpage.clickOnNewUserSignUP.xpath"));
	 return new FTRRegistrationpage();
    }



}
