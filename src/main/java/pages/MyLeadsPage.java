package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {
	
	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Create Lead')]")
	private WebElement eleCreateLeadsLink;
	
	public CreateLeadPage clickCreateLeadsLink() {
	click(eleCreateLeadsLink);
		return new CreateLeadPage();		
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Find Leads')]")
	private WebElement eleFindLeadsLink;
	
	public FindLeadsPage clickFindLeadsLink() {
	click(eleFindLeadsLink);
		return new FindLeadsPage();		
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Merge Leads']")
	private WebElement eleMergeLeadsLink;
	
	public MergeLeadsPage clickMergeLeadsLink() {
	click(eleMergeLeadsLink);
		return new MergeLeadsPage();		
	}

}
