package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyHome extends LeafTapsWrappers {
	
	public MyHome(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;
		
		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("This is not My home Page", "FAIL");
		}		
	}
	
	public createLead  clickOnCreateLead(){
		clickByLink("Create Lead");
		return new createLead(driver, test);
	}
	

}
