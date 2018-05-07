package sms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ApiWhatsApp2 extends ApiWhastsAppBuilder{
	RemoteWebDriver driver;
	WebDriverWait wait;
	String msg = "WhatsApp Api Check";
	//public String url = "https://api.whatsapp.com/send?phone=";
	@Test(/*dataProvider = "whatsAppApi"*/)
	public void postJob(/*String phoneNumber*/) throws InterruptedException{
		String phoneNumber ="919962457576";
		String phoneNumber1 ="917845186305";
		driver = new ChromeDriver();
		driver.get("https://faq.whatsapp.com/en/android/26000030/");
		driver.get("https://faq.whatsapp.com/en/android/26000030/");
	}

	public void waitAndClick(WebElement element) {
		wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public void waituntiDisappear(WebElement element) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	public void waitUnitiVisible(WebElement element) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
