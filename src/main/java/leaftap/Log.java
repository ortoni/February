package leaftap;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log {
	@Test
	public void anontherLogin() {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username1").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

	}

}
