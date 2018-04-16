package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class LookUpWindow extends ProjectMethods {

	public LookUpWindow(RemoteWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleEnterLeadID;
	
	public LookUpWindow enterLeadID(String data) {
		type(eleEnterLeadID, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	
	public FindLeadsWindow clickFindLeadsButton() {
	clickWithNoSnap(eleFindLeadsButton);
		return new FindLeadsWindow(driver, test);		
	}
	
}
