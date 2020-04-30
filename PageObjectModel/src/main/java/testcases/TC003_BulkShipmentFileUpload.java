package testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.PaxelWrappers;

public class TC003_BulkShipmentFileUpload extends PaxelWrappers{
	
	@BeforeClass
	public void setValue(){
		testCaseName = "BulkShipmentFileUpload";
		testDescription ="BulkShipmentFileUpload of Paxel CMS";
		category = "Functional";
		authors = "Automated By DiptiRanjan";
		browserName = "chrome";
		dataSheetName = "TC003_BulkShipment";
	}	
	
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String path){
		try {
			new LoginPage(driver, test)
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogin()
			.clickOnShipment()
			.clickOnBulkShipment()
			.ClickOnChooseDeliveryTime()
			.SelectTime()
			.ClickOnChooseDeliveryDate()
			.SelectDate()
			.ClickOnUploadCSV()
			.UploadCSV(path);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}