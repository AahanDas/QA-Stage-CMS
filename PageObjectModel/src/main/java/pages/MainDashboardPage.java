package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.PaxelWrappers;

public class MainDashboardPage extends PaxelWrappers {

	public MainDashboardPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Main Dashboard · PAXEL CMS")) {
			reportStep("This is not Main Dashboard · PAXEL CMS", "FAIL");
		}
	}

	public MainDashboardPage clickOnUsernameDropDown() {
		clickByXpath("//*[@class='username']");
		return this;
	}

	public LoginPage clickOnLogOut() {
		clickByLink("Log Out");
		return new LoginPage(driver, test);
	}

	public MainDashboardPage clickOnShipment() {
		clickByXpathElementNotGettingClicked("//*[@id='nav']/li[13]");
		// clickByXpath("(//*[@class='arrow fa fa-angle-left'])[7]");
		// clickByLink("Shipment");
		return this;
	}

	public ShipmentsListPAXELCMSPage clickOnAllShipments() {
		// clickByLink("All Shipments");
		clickByXpathElementNotGettingClicked("(//a[contains(@href, '/admin/shipment/read')])[1]");
		// clickByXpath("(//a[contains(@href, '/admin/shipment/read')])[1]");
		return new ShipmentsListPAXELCMSPage(driver, test);
	}
	
	public MainDashboardPage clickOnPriceTemplates() {
		clickByXpathElementNotGettingClicked("//*[@id='nav']/li[16]");
		return this;
	}
	
	
	public MainDashboardPage clickOnPriceExtraPackaging() {
		clickByXpathElementNotGettingClicked("//*[@id='nav']/li[16]/ul/li[3]");
		return this;
	}
	
	public MainDashboardPage clickOnNEXT() {
		clickByXpathElementNotGettingClicked("//*[@id='table-price-template_next']");
		return this;
	}
	

	public MainDashboardPage clickOnLostandFound(String data) {
		clickByLink("Lost and Found");
		return this;
	}

	public BulkShipmentDashboardPAXELCMSPage clickOnBulkShipment() {
		clickByLink("Bulk Shipment");
		return new BulkShipmentDashboardPAXELCMSPage(driver, test);
	}

	public MainDashboardPage clickOnAssignments() {
		// clickByLink("Assignments");
		clickByXpathElementNotGettingClicked("//*[text()[contains(.,'Assignments')]]");
		return this;
	}

	public AssignmentDashboardPAXELCMSPage clickOnAssignmentCourier() {
		clickByLink("Assignment Courier");
		return new AssignmentDashboardPAXELCMSPage(driver, test);
	}
	
	public AssignmentFeederDashboardPAXELCMS clickOnAssignmentFeeder() {
		clickByLink("Assignment Feeder");
		return new AssignmentFeederDashboardPAXELCMS(driver, test);
	}
	

	public MainDashboardPage clickOnCredit() {
		clickByXpathElementNotGettingClicked("(//*[text()[contains(.,'Credit')]])[1]");
		// clickByLink("Credit");
		return this;
	}

	public MainDashboardPage clickOnTopup() {

		clickByLink("Top-up");
		return this;
	}

	public MainDashboardPage EnterInputPassword(String data) {

		enterByXpath("//*[@name='pass']", data);
		return this;
	}

	public CreditPagePAXELCMS clickOnContinue() {

		clickById("submit-auth");
		return new CreditPagePAXELCMS(driver, test);
	}

	public MainDashboardPage clickOnPromo() {

		clickByLink("Promo");
		return this;
	}

	public MainDashboardPage EnterInputPasswordPromo(String data) {

		enterByXpath("//*[@name='pass']", data);
		return this;
	}

	public CreditPagePAXELCMS clickOnContinuePromo() {

		clickById("submit-auth");
		return new CreditPagePAXELCMS(driver, test);
	}

}
