package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PaxelWrappers;

public class TC007_AssignFeeder extends PaxelWrappers{
	
	@BeforeClass
	public void setValue(){
		testCaseName = "Assign Feeder ";
		testDescription ="Login and Assign Feeder";
		category = "Functional";
		authors = "Automated By DiptiRanjan";
		browserName = "chrome";
		dataSheetName = "TC007_AssignFeeder";
	}	
	
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd){
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickOnAssignments()
		.clickOnAssignmentFeeder()
		.clicOnAssignAll();

}
}
