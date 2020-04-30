package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.PaxelWrappers;

public class ShipmentsListPAXELCMSPage extends PaxelWrappers {
	
	public ShipmentsListPAXELCMSPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;
		
		if(!verifyTitle("Shipments List · PAXEL CMS")){
			reportStep("This is not Shipments List · PAXEL CMS", "FAIL");
		}		
	}
	
	public ShipmentsListPAXELCMSPage enterValueForSearch(String data) {
		enterByXpath("//*[@type='search']", data);
		return this;
	}
	public ShipmentsListPAXELCMSPage hitEnterValueForSearch() {
		hitEnterByXpath("//*[@type='search']");
		return this;
	}
	
	public ShipmentsListPAXELCMSPage clickOnRequestPickup() {
		clickByLink("Request Pickup");
		return this;
	}
	
	public ShipmentsListPAXELCMSPage clickTraceShipmentCloseButton() {
		clickByXpath("//*[@class='btn btn-default']");
		return this;
	}
	
	public ShipmentsListPAXELCMSPage clickOnShipmentCodeHL() {
		clickByXpath("( //*[@href='javascript:void(0);'])[13]");
		return this;
	}

	public ShipmentsListPAXELCMSPage clickOnPAgeDropDown() {
		
		clickByXpathElementNotGettingClicked("//*[@id='s2id_autogen2']/a/span[2]");
		return this;
		
	}
	public ShipmentsListPAXELCMSPage select100ListPerPage() {
		clickByXpathElementNotGettingClicked("//*[@id='select2-drop']/ul/li[4]");
		return this;
		
	}
	public ShipmentsListPAXELCMSPage clickOnNEXT() {
		clickByXpathElementNotGettingClicked("//*[@id='table-shipment_next']");
		return this;
		
	}
	
	
	
	
	
	

}
