package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods {
	
	public MergeLeadsPage() {		
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[1]")
	private WebElement eleLookupIcon1;
	
	public FindLeadsWindow clickLookupIcon1() {
	clickWithNoSnap(eleLookupIcon1);
	switchToWindow(1);
		return new FindLeadsWindow();		
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement eleLookupIcon2;
	
	public FindLeadsWindow clickLookupIcon2() {
	clickWithNoSnap(eleLookupIcon2);
	switchToWindow(1);
		return new FindLeadsWindow();		
	}
	@FindBy(how=How.XPATH,using="//a[text()='Merge']")
	private WebElement eleClickMergeButton;
	
	public MyLeadsPage clickMergeButton() {
	clickWithNoSnap(eleClickMergeButton);
	acceptAlert();
		return new MyLeadsPage();		
	}
}
