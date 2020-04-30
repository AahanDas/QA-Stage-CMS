package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PaxelWrappers;

public class TC009_AllShipments extends PaxelWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "All Shipments";
		testDescription = "Check for All Shipments";
		category = "Functional";
		authors = "Automated By DiptiRanjan";
		browserName = "chrome";
		dataSheetName = "TC001";
	}
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd){
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickOnShipment()
		.clickOnAllShipments()
				/*
				 * .clickOnPAgeDropDown() .select100ListPerPage()
				 */
		.clickOnNEXT()
		.clickOnNEXT();
		
		
	}
}