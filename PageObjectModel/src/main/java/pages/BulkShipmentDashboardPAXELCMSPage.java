package pages;

import java.awt.AWTException;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.PaxelWrappers;

public class BulkShipmentDashboardPAXELCMSPage extends PaxelWrappers {

	public BulkShipmentDashboardPAXELCMSPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Bulk Shipment Dashboard · PAXEL CMS")) {
			reportStep("This is not Bulk Shipment Dashboard · PAXEL CMS", "FAIL");
		}
	}
	
	public BulkShipmentDashboardPAXELCMSPage ClickOnChooseDeliveryTime() {
		clickByXpath("(//*[@class='select2-chosen'])[1]");
		return this;
	}
	public BulkShipmentDashboardPAXELCMSPage SelectTime() {
		clickByXpath("//*[@class='select2-results-dept-0 select2-result select2-result-selectable select2-highlighted']");
		return this;
	}
	
	public BulkShipmentDashboardPAXELCMSPage ClickOnChooseDeliveryDate() {
		clickByXpath("//*[@class='btn btn-default hasDatepicker']");
		return this;
	}
	public BulkShipmentDashboardPAXELCMSPage SelectDate() {
		//clickByXpath("//*[@class='ui-state-default ui-state-highlight ui-state-active']");
		clickByXpath("//*[@class='ui-state-default ui-state-hover']");
		return this;
	}
	
	public BulkShipmentDashboardPAXELCMSPage ClickOnUploadCSV() {
		clickById("upload-btn");
		
		return this;
	}
	
	public BulkShipmentDashboardPAXELCMSPage UploadCSV(String path) throws InterruptedException, AWTException {
		UploadFile(path);
		Thread.sleep(10000);
		return this;
	}
	
	
	
}