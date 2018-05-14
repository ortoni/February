package sms;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ApiWhatsApp extends ApiWhastsAppBuilder {

	String msg = "WhatsApp API Check";

	@Test(dataProvider = "whatsAppApi")
	public void postJob(String phoneNumber) throws InterruptedException {
		driver.get("https://api.whatsapp.com/send?phone=" + phoneNumber + "&text=" + msg);

		// If number is not available in WhatsApp!
		try {
			WebElement numberNotAvail = driver.findElementByXPath(
					"//div[text()='Phone number shared via url is invalid.']/following::div[1]/div");
			waitAndClick(numberNotAvail);
		} catch (Exception e2) {
		}
		try {
			Thread.sleep(250);
			waitTillAlertDiasable();

		} catch (Exception e) {

		}
		// Click on SEND Link
		try {
			Thread.sleep(250);
			WebElement send = driver.findElementByLinkText("SEND");
			waitAndClick(send);
		} catch (Exception e1) {

		}
		// To use WhatsApp on your computer: Scanning Required
		try {
			WebElement scan = driver.findElementByXPath("//div[text()='To use WhatsApp on your computer:']");
			waituntiDisappear(scan);
		} catch (Exception e) {

		}
		try {
			WebElement sendButton = driver.findElementByXPath("//button[@class='_2lkdt']");
			waitAndClick(sendButton);
		} catch (Exception e) {

		}
	}

}
