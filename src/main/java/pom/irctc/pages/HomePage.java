package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	   public RegistrationPage clickOnRegister() {
	    	clickByXpath(prop.getProperty("RegistrationPage.clickOnRegister.xpath"));
	    	return new RegistrationPage();
	    }
	    
	    public HomePage mouseHoverOnHolidays() {
	    	mouseHoverByXpath(prop.getProperty("HomePage.mouseHoverOnHolidays.xpath"));
	    	return this;
	    }
	    
	    public HomePage mouseHoverOnStays() {
	    	mouseHoverByXpath(prop.getProperty("HomePage.mouseHoverOnStays.xpath"));
	    	return this;
	    }
	    
	    public AccomodationPage clickOnLounge() {
	    	clickByXpath(prop.getProperty("AccomodationPage.clickOnLounge.xpath"));
	    	return new AccomodationPage();
	    }
}


