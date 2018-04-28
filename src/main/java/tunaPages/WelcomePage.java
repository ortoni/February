package tunaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class WelcomePage extends ProjectMethods {
	public WelcomePage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.LINK_TEXT,using="Artifact")
	private WebElement eleArtifact;
	
	@FindBy(how=How.LINK_TEXT,using="Project")
	private WebElement eleProject;
	
	@FindBy(how=How.LINK_TEXT,using="Role")
	private WebElement eleRole;
	
	@FindBy(how=How.LINK_TEXT,using="User")
	private WebElement eleUser;

	@FindBy(how=How.LINK_TEXT,using="Config")
	private WebElement eleConfig;
	
	@FindBy(how=How.LINK_TEXT,using="Environment")
	private WebElement ELEeNV;
	
	

	
	public WelcomePage clickEnviroment() {
		click(ELEeNV);
		return new WelcomePage();
	}
	
	/*public Tuna clickArtifact() {
		click(eleArtifact);
		return new WelcomePage();
	}
	public Tuna clickProject() {
		click(eleProject);
		return new WelcomePage();
	}
	public Tuna clickRole() {
		click(eleRole);
		return new WelcomePage();
	}
	public Tuna clickUser() {
		click(eleUser);
		return new WelcomePage();
	}
	public Tuna clickConfig() {
		click(eleConfig);
		return new WelcomePage();
	}*/
	

}
