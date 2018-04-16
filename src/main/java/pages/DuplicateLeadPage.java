package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods {

	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement eleCreateLeadButton;
	
	public ViewLeadPage clickCreateLeadButton() {
	click(eleCreateLeadButton);
		return new ViewLeadPage(driver, test);		
	}
	
	@FindBy(how=How.XPATH,using="//div[text()='Duplicate Lead']")
	private WebElement eleDuplicateText;
	
	public DuplicateLeadPage verifyDuplicateText(String data) {
	verifyPartialText(eleDuplicateText, data);
		return this;		
	}
}
