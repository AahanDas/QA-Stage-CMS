package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.PaxelWrappers;

public class AssignCourierPAXELCMSPage extends PaxelWrappers {

	public AssignCourierPAXELCMSPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Assign Courier · PAXEL CMS")) {
			reportStep("This is not Assign Courier · PAXEL CMS", "FAIL");
		}
	}

	public AssignCourierPAXELCMSPage enterShipmentCodeInSearch(String shipmentCode) {
		enterByXpath("//*[@type='search']", shipmentCode);
		return this;
	}

	public AssignCourierPAXELCMSPage hitEnterValueForSearch() {
		hitEnterByXpath("//*[@type='search']");
		return this;
	}

	public AssignCourierPAXELCMSPage clickOnAssignToFirstMile() {
		clickByLink("Assign to Firstmile");
		return this;
	}
//FM clickOnAssignButton
	public AssignCourierPAXELCMSPage clickOnAssignButton() {
		clickByXpath("(//*[@class='fa fa-plus'])[1]");
		return this;
	}

	public AssignCourierPAXELCMSPage clickOnShipment() {
		clickByXpathElementNotGettingClicked("(//*[text()[contains(.,'Shipment')]])[2]");
		return this;
	}

	public AssignCourierPAXELCMSPage clickOnAllShipments() {
		clickByXpathElementNotGettingClicked("//*[text()[contains(.,'All Shipments')]]");
		return this;
	}

	public AssignCourierPAXELCMSPage clickOnShowDetail() {
		clickByXpath("(//*[text()[contains(.,'Show detail')]])[1]");
		return this;
	}

	public AssignCourierPAXELCMSPage traceShipmentStatus(String status) {
		verifyTextByXpath("(//*[text()[contains(.,'Shipment assigned to courier Firstmile')]])[2]", status);
		return this;

	}

	// Click on Lastmile
	public AssignCourierPAXELCMSPage clickOnLastMile() {
		clickByLink("Lastmile");
		return this;

	}

	// Search For Locker Code--> Enter value in Search

	public AssignCourierPAXELCMSPage enterValueForSearch(String data) {

		enterByXpath("(//*[@type='search'])[2]", data);
		hitEnterByXpath("(//*[@type='search'])[2]");
		return this;

	}

	/*public AssignCourierPAXELCMSPage hitEnterForSearch() {
		hitEnterByXpath("(//*[@type='search'])[2]");
		return this;
	}*/

	public AssignCourierPAXELCMSPage clickOnAssignToLastMile() {
		clickByLink("Assign to Lastmile");
		return this;
	}

	// Search for Lastmile courier

	public AssignCourierPAXELCMSPage selectLastmileCourier(String data) {
		
		
		//selectVisibileTextById("select2-drop-mask", data);

		//clickById("select2-drop-mask");
		clickByXpath("(//*[@class='select2-chosen'])[4]");

		enterByXpath("(//*[@type='text'])[8]", data);
		clickByXpath("//*[@class='select2-result-label']");

		//clickByLink("Assign to Lastmile");
		return this;
	}
	
	
	

	// Select slots

	public AssignCourierPAXELCMSPage Selectslots() {
		clickByXpath("(//*[@class='slot_checkboxes'])[1]");
		return this;
	}
	//click on assign
	public AssignCourierPAXELCMSPage clickOnAssignButtonLM() {
		
		clickById("assign-lastmile");
		return this;
	}
	
	
	
	

}
