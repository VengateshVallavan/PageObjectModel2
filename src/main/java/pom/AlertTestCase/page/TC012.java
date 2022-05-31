package pom.AlertTestCase.page;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.Alerts.pages.MainPage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC012";
		testCaseDescription="To verify PromtAlert";
		author="vengatesh";
		category="Functional";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		
	}
		@Test
	
	public void PromptAlert() {
		
			new MainPage()
			.switchToFrame()
			.clickOnTryIt()
			.sendKeysInAlert("vengatesh")
			.getTextFromAlert()
			.acceptTheAlert()
			.verifyText("vengatesh")
			.refreshPage()
			.switchToFrame()
			.clickOnTryIt()
			.sendKeysInAlert("vallavan")
			.getTextFromAlert()
			.dismissTheAlert()
			.verifyText("cancelled")
			.switchDefaultContent()
			.clickOnHome();
		
		
		
		
	}

}
