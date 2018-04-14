package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {
	
	public ViewLeadPage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//span[@id='viewLead_companyName_sp']")
	private WebElement eleViewCompanyName;
	
	public ViewLeadPage verifyViewCompanyName(String data) {
	verifyPartialText(eleViewCompanyName, data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//span[@id='viewLead_firstName_sp']")
	private WebElement eleViewFirstName;
	
	public ViewLeadPage verifyViewFirstName(String data) {
	verifyPartialText(eleViewFirstName, data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Delete']")
	private WebElement eleDeleteButton;
	
	public MyLeadsPage clickDeleteButton() {
	click(eleDeleteButton);
		return new MyLeadsPage();		
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	private WebElement eleEditButton;
	
	public EditLeadPage clickEditButton() {
	click(eleEditButton);
		return new EditLeadPage();		
	}
	@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']")
	private WebElement eleDuplicateButton;
	
	public DuplicateLeadPage clickDuplicateButton() {
	click(eleDuplicateButton);
		return new DuplicateLeadPage();		
	}
	
}
