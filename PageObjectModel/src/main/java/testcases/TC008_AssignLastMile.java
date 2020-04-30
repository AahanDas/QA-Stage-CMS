package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PaxelWrappers;

public class TC008_AssignLastMile extends PaxelWrappers{
	
	@BeforeClass
	public void setValue(){
		testCaseName = "Assign Last Mile";
		testDescription ="Assign Last Mile of Paxel CMS";
		category = "Functional";
		authors = "Automated By DiptiRanjan";
		browserName = "chrome";
		dataSheetName = "TC008_AssignLastMile";
	}	
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String LockerCode, String LMHero){
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickOnAssignments()
		.clickOnAssignmentCourier()
		.clickOnCreateNew()
		.clickOnLastMile()
		.enterValueForSearch(LockerCode)
		.clickOnAssignToLastMile()
		.selectLastmileCourier(LMHero)
		.Selectslots()
		.clickOnAssignButtonLM();

}
}