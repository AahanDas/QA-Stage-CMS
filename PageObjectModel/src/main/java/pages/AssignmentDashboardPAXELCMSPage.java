package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.PaxelWrappers;

public class AssignmentDashboardPAXELCMSPage extends PaxelWrappers {

	public AssignmentDashboardPAXELCMSPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Assignment Dashboard · PAXEL CMS")) {
			reportStep("This is not Assignment Dashboard · PAXEL CMS", "FAIL");
		}
	}

	public AssignCourierPAXELCMSPage clickOnCreateNew() {
		clickByLink("Create New");
		return new AssignCourierPAXELCMSPage(driver, test);
	}

	

}