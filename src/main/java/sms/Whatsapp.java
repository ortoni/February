package sms;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Whatsapp {
	String groupName = "996225 1412";
	String msg = "test";
	String path = "H:\\a.jpg";
	@Test
	public void watsap() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		LocalFileDetector detect = new LocalFileDetector();
		try {
			WebElement logo = driver.findElementByXPath("//span[@data-icon='logo']");
			wait.until(ExpectedConditions.invisibilityOf(logo));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("return !!window.jQuery && window.jQuery.active == 0");
		WebElement search = driver.findElementById("input-chatlist-search");
		wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys(groupName);/*, Keys.ENTER, msg, Keys.ENTER);*/
		WebElement searchResult = driver.findElementByXPath("(//span[@title='+91 "+groupName+"'])[1]");
		searchResult.click();
		driver.switchTo().activeElement().sendKeys(msg, Keys.ENTER);		
		driver.findElementByXPath("//span[@data-icon='clip']").click();
		WebElement uploadFile = driver.findElementByXPath("(//input[@type='file'])[1]");
		File f = detect.getLocalFile(path);
		((RemoteWebElement)uploadFile).setFileDetector(detect);
		uploadFile.sendKeys(f.getAbsolutePath());
		wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath("//span[text()='Add a caption�']"))).sendKeys("test");
		driver.findElementByXPath("//span[@data-icon='send-light']").click();
		try {
			WebElement uploadText = driver.
					findElementByXPath("(//div[@class='pluggable-input-body copyable-text selectable-text'])[1]");
			uploadText.sendKeys("test",Keys.ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}





	}

}