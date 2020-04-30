package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PaxelWrappers;

public class TC010_PriceTemplates extends PaxelWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Price Template main Page";
		testDescription = "Check for Price Extra Packaging";
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
		.clickOnPriceTemplates()
		.clickOnPriceExtraPackaging()
		.clickOnNEXT()
		.clickOnNEXT();
		
		
		
	}
}