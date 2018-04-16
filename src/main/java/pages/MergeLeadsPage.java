package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods {
	
	public MergeLeadsPage(RemoteWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[1]")
	private WebElement eleLookupIcon1;
	
	public FindLeadsWindow clickLookupIcon1() {
	clickWithNoSnap(eleLookupIcon1);
	switchToWindow(1);
		return new FindLeadsWindow(driver, test);		
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement eleLookupIcon2;
	
	public FindLeadsWindow clickLookupIcon2() {
	clickWithNoSnap(eleLookupIcon2);
	switchToWindow(1);
		return new FindLeadsWindow(driver, test);		
	}
	@FindBy(how=How.XPATH,using="//a[text()='Merge']")
	private WebElement eleClickMergeButton;
	
	public MyLeadsPage clickMergeButton() {
	clickWithNoSnap(eleClickMergeButton);
	acceptAlert();
		return new MyLeadsPage(driver, test);		
	}
}
