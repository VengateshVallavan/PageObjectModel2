package pom.AlertTestCase.page;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.Alerts.pages.MainPage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="To verify ConfirmationAlert";
		author="vengatesh";
		category="Functional";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		
	}
		@Test
	public void ConfirmationAlert() {
		new MainPage()
		.switchToFrame()
		.clickOnTryIt()
		.getTextFromAlert()
		.acceptTheAlert()
		.verifyPrintedText("You pressed OK!")
		.refreshPage()
		.switchToFrame()
		.clickOnTryIt()
		.dismissTheAlert()
		.verifyPrintedText("You pressed Cancel!")
		.switchDefaultContent()
		.clickOnHome();
		
	}

}
