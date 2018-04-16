package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleEnterLeadID;
	
	public FindLeadsPage enterLeadID(String data) {
		type(eleEnterLeadID, data);	
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[2]")
	private WebElement eleEnterFirstname;
	
	public FindLeadsPage enterFirstName(String data) {
		type(eleEnterFirstname, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[3]")
	private WebElement eleEnterLastname;
	
	public FindLeadsPage enterLastName(String data) {
		type(eleEnterLastname, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[4]")
	private WebElement eleEnterCompanyname;
	
	public FindLeadsPage enterCompanyName(String data) {
		type(eleEnterCompanyname, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elePhoneTab;
	
	public FindLeadsPage clickPhoneTab() {
	click(elePhoneTab);
		return new FindLeadsPage(driver, test);		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneAreaCode']")
	private WebElement eleEnterPhoneAreaCode;
	
	public FindLeadsPage enterPhoneAreaCode(String data) {
		type(eleEnterPhoneAreaCode, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement eleEnterPhoneNumber;
	
	public FindLeadsPage enterPhoneNumber(String data) {
		type(eleEnterPhoneNumber, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmailTab;
	
	public FindLeadsPage clickEmailTab() {
	click(eleEmailTab);
		return new FindLeadsPage(driver, test);		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	private WebElement eleEnterEmailAddress;
	
	public FindLeadsPage enterEmailAddress(String data) {
		type(eleEnterEmailAddress, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	
	public FindLeadsPage clickFindLeadsButton() {
	click(eleFindLeadsButton);
		return new FindLeadsPage(driver, test);		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleLeadIDLink;
	
	public ViewLeadPage clickLeadIDLink() {
	click(eleLeadIDLink);
		return new ViewLeadPage(driver, test);		
	}
	
	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	private WebElement eleNoRecords;
	
	public FindLeadsPage verifyNoRecords(String data) {
	verifyPartialText(eleNoRecords, data);
		return this;		
	}
}
