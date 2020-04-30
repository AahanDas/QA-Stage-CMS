package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PaxelWrappers;

public class TC002_AssignFirstMile extends PaxelWrappers{
	
	@BeforeClass
	public void setValue(){
		testCaseName = "Assign First Mile";
		testDescription ="Login and Assign First Mile";
		category = "Functional";
		authors = "Automated By DiptiRanjan";
		browserName = "chrome";
		dataSheetName = "TC002_AssignFM";
	}	
	
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String shipmentCode){
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickOnShipment()
		.clickOnAllShipments()
		.enterValueForSearch(shipmentCode)
		.hitEnterValueForSearch()
		.clickOnRequestPickup()
		.clickTraceShipmentCloseButton();
	}
}