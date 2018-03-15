package editleadpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{

	
	public FindLeads() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public FindLeads enterFirstName(String data) {
		//WebElement elePassword = locateElement("createLeadForm_firstName");
		type(eleFirstName, data);
		return this;
	}
	
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elefindsLeadsButton;
	
	public FindLeads clickfindsLeadsButton(){
		click(elefindsLeadsButton);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='linktext'])[4]")
	private WebElement elefirstLeadId;
	
	public ViewLead clickfirstLeadId() {
		click(elefirstLeadId);
		return new ViewLead();		
	}
	
	
	}

