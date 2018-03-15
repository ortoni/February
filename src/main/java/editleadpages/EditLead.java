package editleadpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods {
	
	public EditLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCompanyName;
	
	
	public EditLead enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@value = 'Update']")
	private WebElement eleupdateButton;
	
	
	public ViewLead enterupdateButton(String data) {
		type(eleupdateButton, data);
		return new ViewLead();
	}
	
	
	
	
	
	}

