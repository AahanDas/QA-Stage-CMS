package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PaxelWrappers;

public class TC005_CreditTopUp extends PaxelWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "CreditTopUp";
		testDescription = "Credit Top-Up of Paxel CMS";
		category = "Functional";
		authors = "Automated By DiptiRanjan";
		browserName = "chrome";
		dataSheetName = "TC005_CreditTopUp";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String password, String customerCode, String TopUp) throws InterruptedException {
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickOnCredit()
		.clickOnTopup()
		.EnterInputPassword(password)
		.clickOnContinue()
		.searchForCustomerCode(customerCode)
		.hitEnterValueForSearch()
		.clickOnTopupCreditcustomer()
		.enterTopUpValue(TopUp)
		.clickSubmitButton()
		.searchForCustomerCode(customerCode)
		.hitEnterValueForSearch();

	}

}
