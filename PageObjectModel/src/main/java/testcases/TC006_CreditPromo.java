package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PaxelWrappers;

public class TC006_CreditPromo extends PaxelWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "CreditPromo";
		testDescription = "Credit Promo of Paxel CMS";
		category = "Functional";
		authors = "Automated By DiptiRanjan";
		browserName = "chrome";
		dataSheetName = "TC006_CreditPromo";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String password, String customerCode, String creditBalance)
			throws InterruptedException {
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd).clickLogin()
		.clickOnCredit()
		.clickOnPromo()
		.EnterInputPasswordPromo(password)
		.clickOnContinuePromo()
		.searchForCustomerCodePromo(customerCode)
		.hitEnterValueForSearchPromo()
		.clickOnCustomerPromo()
		.enterAddPromoCreditBalance(creditBalance)
		.clickOnSubmitButtonPromo()
		.searchForCustomerCodePromo(customerCode)
		.hitEnterValueForSearchPromo();

	}
}
