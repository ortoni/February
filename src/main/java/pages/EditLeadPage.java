package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {
	
	public EditLeadPage(RemoteWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='updateLeadForm_companyName']")
	private WebElement eleClearCompanyName;
	
	public EditLeadPage ClearCompanyName(String data) {
		type(eleClearCompanyName,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='updateLeadForm_companyName']")
	private WebElement eleTypeCompanyName;
	
	public EditLeadPage enterTypeCompanyName(String data) {
		type(eleTypeCompanyName, data);
		return this;
	}

	@FindBy(how=How.XPATH,using="(//input[@class='smallSubmit'])[1]")
	private WebElement eleUpdateButton;
	
	public ViewLeadPage clickUpdateButton() {
	click(eleUpdateButton);
		return new ViewLeadPage(driver, test);		
	}
	
}
