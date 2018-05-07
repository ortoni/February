package sms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class ApiWhastsAppBuilder{
	RemoteWebDriver driver;
	WebDriverWait wait;
	public String dataSheetName = "data";

	@AfterSuite
	public void quit() {
		// logout and quit
		WebElement menuIcon = driver.findElementByXPath("//span[@data-icon='menu']/*[1]");
		WebElement logOut = driver.findElementByXPath("//div[text()='Log out']");
		try {
			waitAndClick(menuIcon);
			waitAndClick(logOut);
		} catch (Exception e) {
			System.out.println("Not Logged out");
		}
		driver.quit();
	}
	@BeforeSuite
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	}
	public void waitAndClick(WebElement element) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public void waituntiDisappear(WebElement element) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	public void waitUnitiVisible(WebElement element) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitTillAlertDiasable() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

	}
	
	@DataProvider(name="whatsAppApi")
	public  Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);		
	}	

}
