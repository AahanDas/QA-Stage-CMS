package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.PaxelWrappers;

public class LoginPage extends PaxelWrappers{
	Properties prop;
	public LoginPage(RemoteWebDriver driver, ExtentTest test){
		prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.driver = driver;
		this.test =test;
		
		if(!verifyTitle("Login · PAXEL CMS")){
			reportStep("This is not Login Page", "FAIL");
		}		
	}
	
	public LoginPage enterUserName(String data){
		enterByName("username", data);
		return this;
	}
	
	public LoginPage enterPassword(String data){
		enterByName("password", data);
		return this;
	}
	
	
	
	public MainDashboardPage clickLogin(){
		clickByXpath("//*[@class='submit btn btn-primary pull-right']");
		return new MainDashboardPage(driver, test);		
	}
	
	public LoginPage verifyLoginDetails(String text){
		verifyTextContainsByXpath("//*[@class='form-title']", text);
		return this;
	}

}











