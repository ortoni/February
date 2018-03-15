package editleadpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods {

	
	public ViewLead() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditLink;

	public EditLead clickEditLink() {
		click(eleEditLink);
		return new EditLead();		
	}

	
}
