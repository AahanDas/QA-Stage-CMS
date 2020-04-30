package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.PaxelWrappers;

public class AssignmentFeederDashboardPAXELCMS extends PaxelWrappers {

	public AssignmentFeederDashboardPAXELCMS(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Assignment Feeder Dashboard · PAXEL CMS")) {
			reportStep("This is not Assignment Feeder Dashboard · PAXEL CMS", "FAIL");
		}
	}
	
	
	public AssignmentFeederDashboardPAXELCMS clicOnAssignAll() {
		
		clickById("assign-all-feeder");
		return this;
	}
}