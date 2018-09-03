package sms;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ApiWhatsApp extends ApiWhastsAppBuilder {
	@Test(dataProvider = "whatsAppApi")
	public void postJob(String phoneNumber, String msg) throws InterruptedException {
		driver.get("https://api.whatsapp.com/send?phone=91" + phoneNumber + "&text=" + msg);
		System.out.println(phoneNumber);

		// To navigate to next contact
		try {
			Thread.sleep(250);
			waitTillAlertDiasable();
		} catch (Exception e) {
		}
		// Click on SEND Link
		try {
			Thread.sleep(100);
			WebElement send = driver.findElementByLinkText("SEND");
			waitAndClick(send);
		} catch (Exception e1) {
		}
		// Disabled for performance 
		// If number is not available in WhatsApp!
		/*try {
			WebElement numberNotAvail = driver.findElementByXPath(
					"//div[text()='Phone number shared via url is invalid.']/following::div[1]/div");
			waitAndClick(numberNotAvail);
		} catch (Exception e2) {
		}*/
		try {
			WebElement sendButton = driver.findElementByXPath("//span[@data-icon='send']/..");
			waitAndClick(sendButton);
		} catch (Exception e) {
		}
	}

}
