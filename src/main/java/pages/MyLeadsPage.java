package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {
	
	public MyLeadsPage(RemoteWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Create Lead')]")
	private WebElement eleCreateLeadsLink;
	
	public CreateLeadPage clickCreateLeadsLink() {
	click(eleCreateLeadsLink);
		return new CreateLeadPage(driver, test);		
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Find Leads')]")
	private WebElement eleFindLeadsLink;
	
	public FindLeadsPage clickFindLeadsLink() {
	click(eleFindLeadsLink);
		return new FindLeadsPage(driver, test);		
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Merge Leads']")
	private WebElement eleMergeLeadsLink;
	
	public MergeLeadsPage clickMergeLeadsLink() {
	click(eleMergeLeadsLink);
		return new MergeLeadsPage(driver, test);		
	}

}
