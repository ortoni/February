package leafTaps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OracleWMS {
	@Test
	public void oracle() {
		ChromeDriver d = new ChromeDriver();
		d.get("https://uat.logfireapps.com/flow_uat/index/");
		d.findElementById("username").sendKeys("Itorizon.Test1");
		d.findElementById("password").sendKeys("Welcome1");
		d.findElementByXPath("//input[@type='submit']");
	}
}
