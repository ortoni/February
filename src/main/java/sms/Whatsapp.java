package sms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Whatsapp {
	String groupName = "Hari Iyer";
	String msg = "Chill da";
	@Test
	public void watsap() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement logo = driver.findElementByXPath("//span[@data-icon='logo']");
		wait.until(ExpectedConditions.invisibilityOf(logo));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("return !!window.jQuery && window.jQuery.active == 0");
		WebElement search = driver.findElementById("input-chatlist-search");
		wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys(groupName, Keys.ENTER, msg, Keys.ENTER);
		
		
		


	}

}
