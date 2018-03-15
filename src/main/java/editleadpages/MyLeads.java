package editleadpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	
	public MyLeads() {
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadsLink;
	
	public  FindLeads clickFindLeadsLink() {
		click(eleFindLeadsLink);
		return new FindLeads();

	
	}
}
