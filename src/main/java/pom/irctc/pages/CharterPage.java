package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	 
	public EnquiryFormPage clickOnEnquiryForm() {
		
		clickByXpath(prop.getProperty("EnquiryFormPage.clickOnEnquiryForm.xpath"));
		return new EnquiryFormPage();
	
	}
	
		public CharterPage clickOnCloseMenu() {
	    		clickByXpath(prop.getProperty("CharterPage.clickOnCloseMenu.xpath"));
	    	return this;
	    }
	

}
	
