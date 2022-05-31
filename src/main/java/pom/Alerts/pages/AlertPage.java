package pom.Alerts.pages;

import wrappers.GenericWrappers;

public class AlertPage extends GenericWrappers{
	
	public AlertPage getTextFromAlert() {
		getAlertText();
		return this;
	}
	
	public MainPage acceptTheAlert() {
		acceptAlert();
		return new MainPage();
	}
	
	public MainPage dismissTheAlert() {
		dismissAlert();
		return new MainPage();
	}
	
	public AlertPage sendKeysInAlert(String text) {
		sendKeysToAlert(text);
		return this;
	}

	public AlertPage GetTextInAlearts() {
		getAlertText();
		return this;
		
	}
}
