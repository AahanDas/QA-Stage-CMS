package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PaxelWrappers;

public class TC005_AssignFirstMileAutomated extends PaxelWrappers{
	
	@BeforeClass
	public void setValue(){
		testCaseName = "Assign First Mile";
		testDescription ="Assign First Mile of Paxel CMS";
		category = "Functional";
		authors = "Automated By DiptiRanjan";
		browserName = "chrome";
		dataSheetName = "TC004_AssignFirstMile";
	}	
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String shipmentCode, String status){
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickOnAssignments()
		.clickOnAssignmentCourier()
		.clickOnCreateNew()
		.clickOnAssignToFirstMile()
		.clickOnAssignButton();

}

}