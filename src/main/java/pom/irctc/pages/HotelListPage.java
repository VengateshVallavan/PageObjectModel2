package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelListPage extends GenericWrappers{
	
	public FirstHotelPage clickOnFirstHotel() {
		clickByExplicitWait(prop.getProperty("FirstHotelPage.clickOnFirstHotel.xpath"), 10);
		return new FirstHotelPage();
		
	}
	
	public HotelListPage waitTime() {
		waitProperty(3000);
		return this;
	}

	

	
}
