package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.PaxelWrappers;

public class CreditPagePAXELCMS extends PaxelWrappers {

	public CreditPagePAXELCMS(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		/*
		 * if (!verifyTitle("Credit Page · PAXEL CMS")) {
		 * reportStep("This is not Credit Page · PAXEL CMS", "FAIL"); }
		 */
	}

	public CreditPagePAXELCMS searchForCustomerCode(String data) {

		enterByXpath("//*[@type='search']", data);
		return this;
	}

	public CreditPagePAXELCMS hitEnterValueForSearch() {
		hitEnterByXpath("//*[@type='search']");
		return this;
	}

	public CreditPagePAXELCMS clickOnTopupCreditcustomer() {

		clickByXpath("//*[@class='btn btn-info btn-sm']");
		return this;
	}

	public CreditPagePAXELCMS enterTopUpValue(String data) {

		enterByXpath("//*[@name='add_balance']", data);
		return this;
	}

	public CreditPagePAXELCMS clickSubmitButton() throws InterruptedException {

		clickById("topup-submit");
		Thread.sleep(3000);
		return this;
	}

	public CreditPagePAXELCMS StoreCurrentBalanceBeforeCredit() {
		String str1 = driver.findElement(By.xpath("//*[@class='sorting_1']")).getText();
		return this;
	}

	public CreditPagePAXELCMS StoreCurrentBalanceAfterCredit() {
		String str2 = driver.findElement(By.xpath("//*[@class='sorting_1']")).getText();

		return this;
	}

	public CreditPagePAXELCMS clickOnCustomerPromo() {

		clickByXpath("//*[@class='btn btn-info btn-sm']");
		return this;
	}

	public CreditPagePAXELCMS enterAddPromoCreditBalance(String data) {

		enterByXpath("//*[@name='add_balance']", data);
		return this;
	}

	public CreditPagePAXELCMS clickOnSubmitButtonPromo() throws InterruptedException {

		clickById("topup-submit");
		Thread.sleep(3000);
		return this;
	}
	
	public CreditPagePAXELCMS searchForCustomerCodePromo(String data) {

		enterByXpath("//*[@type='search']", data);
		return this;	
	}

	public CreditPagePAXELCMS hitEnterValueForSearchPromo() {
		hitEnterByXpath("//*[@type='search']");
		return this;
	}

}
