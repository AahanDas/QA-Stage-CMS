package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class createLead extends LeafTapsWrappers {
	
	public createLead (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;
		
		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Create Lead Page", "FAIL");
		}		
	}
	
	public createLead enterCompanyName(String data) {
		enterById("createLeadForm_companyName", data);
		return this;
	}
	
	public createLead enterFirstName(String data) {
		enterById("createLeadForm_firstName", data);
		return  this;
	}
	
	public createLead enterLastName(String data) {
		enterById("createLeadForm_lastName", data);
		return this;
	}
	
	public ViewLead clickOnCreateLead() {
		clickByClassName("smallSubmit");
		return new ViewLead(driver,  test);
	}
	
}