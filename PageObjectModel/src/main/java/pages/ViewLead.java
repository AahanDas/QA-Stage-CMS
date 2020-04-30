package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLead extends  LeafTapsWrappers{
	
public ViewLead(RemoteWebDriver driver, ExtentTest test) {
	this.driver = driver;
	this.test =test;
	if(!verifyTitle("View Lead | opentaps CRM")) {
		reportStep("This is not My View Lead Page", "FAIL");
	}
}



}
