package editleadpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage() {
		PageFactory.initElements(driver,this);
	}
	
	
	
  @FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeadsLink;
	
	public MyLeads clickLeadsLink() {
		click(eleLeadsLink);
		return new MyLeads();		
	}


}
