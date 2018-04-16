package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsWindow extends ProjectMethods {
	
	public FindLeadsWindow(RemoteWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleEnterWinLeadID;
	
	public FindLeadsWindow enterWinLeadID(String data) {
		type(eleEnterWinLeadID, data);	
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleWindowIcon;
	public FindLeadsWindow clickwindowHandling() {
		clickWithNoSnap(eleWindowIcon);
			return this;		
		}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleWinLeadIDLink;
	
	public MergeLeadsPage clickWinLeadIDLink()  {
		clickWithNoSnap(eleWinLeadIDLink);
		switchToWindow(0);
		return new MergeLeadsPage(driver, test);		
	}
	
}
