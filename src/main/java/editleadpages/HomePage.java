package editleadpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	public HomePage(RemoteWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement elecrmSfaLink;

	public MyHomePage clickcrmSfaLink() {
		click(elecrmSfaLink);
		return new MyHomePage();		
	}


	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Welcome')]]")
	private WebElement eleLoggedName;

	public HomePage verifyLoggedName(String data) {
		verifyPartialText(eleLoggedName, data);
		return this;		
	}

	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogout;
	
	public HomePage clickLogout() {
		click(eleLogout);
		return this;	
	}
	





}
