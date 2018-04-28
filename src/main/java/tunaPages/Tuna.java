package tunaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Tuna extends ProjectMethods {

	public Tuna() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="j_username")
	private WebElement eleEmail;

	@FindBy(how=How.ID,using="j_password")
	private WebElement elePassword;

	@FindBy(how=How.XPATH,using="//span[text()='Sign In']")
	private WebElement eleSingIn;
	
	

	public Tuna enterEmail(String data) {
		type(eleEmail, data);
		return this;
	}

	public Tuna enterPassword(String data) {
		type(elePassword, data);
		return this;
	}
	
	public WelcomePage clickSignIn() {
		click(eleSingIn);
		return new WelcomePage();
	}





}

